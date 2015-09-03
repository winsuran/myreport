package lk.wts.myreport.service;

import lk.wts.myreport.dao.CommonDAO;
import lk.wts.myreport.dao.PeopleDAO;
import lk.wts.myreport.model.PeopleVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class PeopleService extends AbstractService<PeopleVO> {

	@Autowired
	PeopleDAO peopleDAO;

	
	@Override
	public CommonDAO<PeopleVO> getDAO() {
		return peopleDAO;
	}

}
