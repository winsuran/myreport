package lk.wts.myreport.controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lk.wts.myreport.model.CustomersVO;
import lk.wts.myreport.model.PeopleVO;
import lk.wts.myreport.service.AbstractService;
import lk.wts.myreport.service.CustomersService;
import net.sf.json.JsonConfig;

@RequestMapping(value="/customers")
@Controller

public class CustomersController extends AbstractController<CustomersVO, String>{
	Logger logger = Logger.getLogger(CustomersController.class);
	
	@Autowired
	CustomersService customersService;
	
	@Override
	public Logger getLogger() {
		// TODO Auto-generated method stub
		return logger;
	}

	@Override
	public AbstractService<CustomersVO> getService() {
		// TODO Auto-generated method stub
		return customersService;
	}

	@Override
	public JsonConfig getConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getControllerName() {
		// TODO Auto-generated method stub
		return "customers";
	}
	
	@RequestMapping(value = "/regis", method = RequestMethod.GET)
	@Transactional
	public void getSalesOderidFromStyle(
			HttpServletResponse httpservletResponse,@ModelAttribute CustomersVO customersVO) {
		try{
			/*CustomersVO customersVO=new CustomersVO();
			customersVO.setEmail("ssddssdss@fdf");
			customersVO.setFirst_name("dsdAjith");
			customersVO.setLast_name("hhhEEfccEsfd");
			customersVO.setPassword("45545fg");
			customersVO.setGender("DzhsDfDfd");
			customersVO.setAddress("zDhsfDDfd");
			customersVO.setCity("zDsDDhfd");
			customersVO.setCountry("DzhsfDDfd");
			customersVO.setTelephone(0715655);
			customersVO.setMobile(0714556);*/
			
			customersService.add(customersVO);
		} catch (Exception e) {
			getLogger().error(e.getMessage());
			

		}
	}


	
	
	
	
}
