package com.pem.controller.pem_wage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pem.dao.Pem_WageMapping;
import com.pem.entity.Pem_Wage;

@Controller
@RequestMapping(value = "/pem_wage")
public class Pem_WageController {
	public static final String common = "pem_wage";

	@Autowired
	private Pem_WageMapping pem_wageMapping;

	@RequestMapping(value = "/index")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView(common + "/index");
		return view;
	}
	
	@RequestMapping(value="/getAll")
	@ResponseBody
	public List<Pem_Wage> getAll(){
		List<Pem_Wage>  pem_Wages = pem_wageMapping.getAll();
		return  pem_Wages;
	}
	
	public String add(Pem_Wage  wage){
		pem_wageMapping.add(wage);
		return "success";
	}

}
