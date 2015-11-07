package com.pem.controller.pem_take_money;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pem.entity.Pem_Take_Money;
import com.pem.service.Pem_Take_MoneyService;

@Controller
@RequestMapping(value = "/moneyController")
public class Pem_Take_MoneyController {
	public static final String common = "pem_take_money";
	
	@Autowired
	private Pem_Take_MoneyService pem_Take_MoenyService;

	@RequestMapping(value = "/index")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView(common + "/index");
		return view;
	}
	@RequestMapping(value="/add")
	public ModelAndView  add(){
		ModelAndView view =  new ModelAndView(common+"/add");
		return view;
	}

	@RequestMapping(value = "getAll")
	@ResponseBody
	public List<Pem_Take_Money> getAll() {
		List<Pem_Take_Money> take_Moneys  = pem_Take_MoenyService.getAll();
		return   take_Moneys;
	}
	
	@RequestMapping(value="/addtake_money")
	@ResponseBody
	public String  add(Pem_Take_Money   take_Money){
		pem_Take_MoenyService.add(take_Money);
		return "success";
	}
}
