package lk.wts.myreport.dao;

import org.springframework.stereotype.Component;

import lk.wts.myreport.model.CustomersVO;


@Component

public class CustomersDAO extends CommonDAO<CustomersVO>{
	
	public CustomersDAO() {
		super(CustomersVO.class);
	
	}
	
	

}
