package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.PhonebookDAOInter;
import dao.PhonebookVO;

@Service
public class MainService {
	@Autowired
	PhonebookDAOInter dao;
	public List<PhonebookVO> getList() {
		
		return dao.getList();
	}
	public int insert(PhonebookVO pb) {
		return dao.insert(pb);
	}
	public int update(PhonebookVO pb) {
		
		return dao.update(pb);
	}
	public int delete(int idx) {
		return dao.delete(idx);
	}
	public List<PhonebookVO> find(String search) {

		return dao.find(search);
	}
	public PhonebookVO findOne(int idx) {
		
		return dao.findOne(idx);
	}
}
