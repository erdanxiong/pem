package com.pem.controller.pem_bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pem.entity.Pem_bank;
import com.pem.service.Pem_bankService;

@Controller
@RequestMapping(value = "/pem_bank")
public class Pem_bankController {

	public static final String common = "pem_bank";
	@Autowired
	private Pem_bankService pem_banService;

	@RequestMapping(value = "/index")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView(common + "/index");
		return view;
	}

	@RequestMapping(value = "/getAll")
	@ResponseBody
	public List<Pem_bank> getAll() {
		List<Pem_bank> banks = pem_banService.getAll();
		return banks;
	}
	@RequestMapping(value="/add")
	public ModelAndView add(){
		ModelAndView   view  =  new ModelAndView(common+"/add");
		return view;
	}
	
	@RequestMapping(value = "/addPem_bank")
	@ResponseBody
	public String addPem_bank(Pem_bank bank) {
		try {
			pem_banService.addBank(bank);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
			return "error";
		}
		return "success";
	}
}
