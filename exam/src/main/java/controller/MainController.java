package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.PhonebookVO;
import service.MainService;

@Controller
public class MainController {
	
	@Autowired
	MainService service;
	
	@RequestMapping("/index")
	public ModelAndView index() {
		
		return getList();
	}
	
	
	@RequestMapping("/getlist")
	public ModelAndView getList() {
		ModelAndView mv = new ModelAndView();
		List<PhonebookVO> list = service.getList();
		mv.addObject("list",list);
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/find")
	public ModelAndView find(String search) {
		ModelAndView mv = new ModelAndView();
		List<PhonebookVO> list = service.find(search);
		mv.addObject("list",list);
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/findone")
	public ModelAndView findOne(int idx) {
		ModelAndView mv = new ModelAndView();
		PhonebookVO pb = service.findOne(idx);
		mv.addObject("one",pb);
		mv.setViewName("index");

		return 	mv;
	}
	
	@RequestMapping("/insert")
	public ModelAndView insert(PhonebookVO pb) {
		ModelAndView mv = new ModelAndView();
		service.insert(pb);
		mv.setViewName("index");
		getList();
		return 	getList();
	}
	@RequestMapping("/update")
	public ModelAndView update(PhonebookVO pb) {
		ModelAndView mv = new ModelAndView();
		int result = service.update(pb);
		mv.setViewName("index");
		getList();
		return getList();
	}
	@RequestMapping("/delete")
	public ModelAndView delete(int idx) {
		ModelAndView mv = new ModelAndView();
		int result = service.delete(idx);
		mv.setViewName("index");
		getList();
		return getList();
	}
}
