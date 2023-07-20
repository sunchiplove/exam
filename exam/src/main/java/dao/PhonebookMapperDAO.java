package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mapper.PhonebookMapper;

@Repository
public class PhonebookMapperDAO implements PhonebookDAOInter{
	@Autowired
	PhonebookMapper mapper;
	@Override
	public int insert(PhonebookVO pb) {
		
		return mapper.insert(pb);
	}
	@Override
	public List<PhonebookVO> getList() {
		
		return mapper.getList();
	}
	@Override
	public List<PhonebookVO> find(String search) {
		
		return mapper.find(search);
	}
	@Override
	public PhonebookVO findOne(int idx) {
		// TODO Auto-generated method stub
		return mapper.findOne(idx);
	}
	@Override
	public int update(PhonebookVO pb) {
		// TODO Auto-generated method stub
		return mapper.update(pb);
	}
	@Override
	public int delete(int idx) {
		// TODO Auto-generated method stub
		return mapper.delete(idx);
	}

}
