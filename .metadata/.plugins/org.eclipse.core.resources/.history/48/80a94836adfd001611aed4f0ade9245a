package edu.nju.hw.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.nju.hw.model.Hostel;
import edu.nju.hw.model.Order;
import edu.nju.hw.model.Vip;
import edu.nju.hw.service.VipService;

@Controller
public class ForwardController {
	
	@Autowired
	private VipService vipService;

	@RequestMapping("/fasettleHostel")
	public String settle1(){
		return "amain";
	}
	
	@RequestMapping("/fasettleChange")
	public String settle2(){
		return "asettleChange";
	}
	@RequestMapping("/fhplan")
	public String hplan(){
		return "hplan";
	}
	
	@RequestMapping("/fapay")
	public String apay(){
		return "apay";
	}
	
	@RequestMapping("/fastatistics")
	public String astatistics(){
		return "astatistics";
	}
	
	
	@RequestMapping("/fhchange")
	public String hchange(HttpServletRequest request,HttpServletResponse response,HttpSession session){
		
		if(((Hostel) session.getAttribute("hostelInfo")).getState()!=2)
			return "hchange";
		else{
			return "hNotChange";
		}
	}
	
	@RequestMapping("/fhenter")
	public String henter(){
		return "hmain";
	}
	
	@RequestMapping("/fhleave")
	public String hleave(){
		return "hleave";
	}
	
	@RequestMapping("/fhstatistics")
	public String hstatistics(){
		return "hstatistics";
	}
	
	//用户界面
	@RequestMapping("/fvipRegister")
	public String vipRegister(){
		return "vipRegister";
	}
	
	@RequestMapping("/fvipRecharge")
	public String vipRecharge(){
		return "vipRecharge";
	}
	
	@RequestMapping("/fvipChange")
	public String vipChange(){
		return "vipChange";
	}
	
	@RequestMapping("/fuorder")
	public String uorder(){
		return "umain";
	}
	
	@RequestMapping("/fuorderCancel")
	public String fuorderCancel(HttpSession session){
		List<Order> myOrders=new ArrayList<Order>();
		myOrders=vipService.getMyOrders(((Vip)session.getAttribute("vipInfo")).getId());
		session.setAttribute("myOrdersInfo", myOrders);
		return "uorderCancel";
	}
	
	@RequestMapping("/fustatistics")
	public String fustatistics(HttpServletRequest request,HttpServletResponse response,HttpSession session){
		Vip  v=(Vip)session.getAttribute("vipInfo");
		List<Order> myOrders=new ArrayList<Order>();
		myOrders=vipService.getMyOrders(v.getId());
		System.out.println(myOrders.get(0).getHlevel());
		session.setAttribute("orderTimeLine", myOrders);
		return "ustatistics";
	}
	
	@RequestMapping("/hostelRegister")
	public String hostelRegister(){
		return "hregister";
	}
	
	@RequestMapping("/userRegister")
	public String userRegister(){
		return "uregister";
	}
	
	
	@RequestMapping("/fnew")
	public String fnew(){
		return "NewFile";
	}
	
	
	
	
	
//	@RequestMapping("/fvipCancel")
//	public String vipCancel(){
//		return "vipCancel";
//	}
}
