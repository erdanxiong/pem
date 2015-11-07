package com.pem.controller.consume_detail;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pem.entity.Consume_detail;
import com.pem.service.Consume_detailService;
import com.pem.util.DateUtil;

@Controller
@RequestMapping(value = "/consume_detail")
public class Consume_detailController {
	public static final String commonFolder = "consume_detail";
	private ReentrantLock lock = new ReentrantLock();
	Logger logger = Logger.getLogger(Consume_detailController.class);

	public Consume_detailController() {
		logger.info("初始化");
	}

	@Autowired
	private Consume_detailService consume_detailService;

	@RequestMapping(value = "/index")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView(commonFolder + "/index");
		return view;
	}

	@RequestMapping(value = "/getAll")
	public void getAll(String page, String rows, HttpServletResponse response)
			throws Exception {
		int currentPage = Integer.parseInt(page);
		int pageSize = Integer.parseInt(rows);
		int begin = (currentPage - 1) * pageSize;
		JSONObject jsons = new JSONObject();
		List<Consume_detail> all = null;
		lock.lock();
		try {
			all = consume_detailService.getAll(begin, pageSize);
			for(Consume_detail  consume_detail :all){
				consume_detail.setTime(DateUtil.changeDate(consume_detail.getComsume_date()));
			}
			int count = consume_detailService.getCount();
			
			jsons.accumulate("total", count);// total代表一共有多少数据
			jsons.accumulate("rows", all);// row是代表显示的页的数据
		} catch (Exception e) {
			throw new Exception("系统异常");
		} finally {
			lock.unlock();
		}
		response.setCharacterEncoding("utf-8");
		response.getWriter().write(jsons.toString());
	}
	
	@RequestMapping(value="/add")
	public ModelAndView  addView(){
		ModelAndView  addView   =  new ModelAndView(commonFolder + "/add");
		return   addView;
	}
	
	@RequestMapping(value="/addConsume_detail")
	@ResponseBody
	public String addConsume_detail(Consume_detail  consume_detail , HttpServletRequest  request){
		String localAddr = request.getLocalAddr();
		consume_detail.setRecord_id(localAddr);
		consume_detailService.add(consume_detail);
		return "success";
	}
	
}
