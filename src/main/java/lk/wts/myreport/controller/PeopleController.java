package lk.wts.myreport.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import lk.wts.myreport.model.PeopleVO;
import lk.wts.myreport.service.AbstractService;
import lk.wts.myreport.service.PeopleService;
import net.sf.json.JsonConfig;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;






@RequestMapping(value = "/people")
@Controller

//In this String (data type) always mention Primery key data type
public class PeopleController  extends AbstractController<PeopleVO, String>  {
	Logger logger = Logger.getLogger(PeopleController.class);
	@Autowired
	PeopleService peopleService;
	
	@Override
	public Logger getLogger() {
		// TODO Auto-generated method stub
		return logger;
	}

	@Override
	public AbstractService<PeopleVO> getService() {
		// TODO Auto-generated method stub
		return peopleService;
	}

	@Override
	public JsonConfig getConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getControllerName() {
		// TODO Auto-generated method stub
		return "people";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@Transactional
	public void addpeople(
			
			//@RequestParam String first_name, @RequestParam String last_name  use to selected parameter list
			//@ModelAttribute use to get all value
			HttpServletResponse httpservletResponse,@ModelAttribute PeopleVO peopleVO) {
		try{
			
			
			peopleService.add(peopleVO);
		} catch (Exception e) {
			getLogger().error(e.getMessage());
			writeJsonString(httpservletResponse,
					"{\"Data\":\"" + e.getMessage() + "\",\"success\":false}");

		}
	}


}
