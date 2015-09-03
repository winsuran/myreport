package lk.wts.myreport.dao;

import lk.wts.myreport.model.PeopleVO;

import org.springframework.stereotype.Component;




@Component
public class PeopleDAO extends CommonDAO<PeopleVO>  {

	public PeopleDAO() {
		super(PeopleVO.class);
	
	}
	

}
