package com.pem.controller.pem_bank_running_water;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pem.entity.Pem_Bank_Running_Water;
import com.pem.service.Pem_Bank_Running_WaterService;

@Controller
@RequestMapping(value = "/bank_runing_water")
public class Pem_Bank_Runing_WaterController {
	public static final String common = "bank_running_water";
	
	@Autowired
	private Pem_Bank_Running_WaterService    bank_running_waterService;
	
	@RequestMapping(value="/index")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView(common + "/index");
		return view;
	}
	
	@RequestMapping(value="/getAll")
	@ResponseBody
	public List<Pem_Bank_Running_Water> getAll(){
		List<Pem_Bank_Running_Water>  running_Waters = bank_running_waterService.getAll();
		return  running_Waters;
	}
	
	@RequestMapping(value="/add")
	@ResponseBody
	public String add(Pem_Bank_Running_Water  bank_running_water ){
		bank_running_waterService.add(bank_running_water);
		return "success";
	}
}
