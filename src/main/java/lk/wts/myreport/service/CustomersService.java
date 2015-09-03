package lk.wts.myreport.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lk.wts.myreport.dao.CommonDAO;
import lk.wts.myreport.dao.CustomersDAO;
import lk.wts.myreport.model.CustomersVO;
import lk.wts.myreport.model.PeopleVO;

@Component

public class CustomersService extends AbstractService<CustomersVO> {
	
	@Autowired
	CustomersDAO customersDAO;
	
	@Override
	public CommonDAO<CustomersVO> getDAO() {
		return customersDAO;
	}

	
	

}
