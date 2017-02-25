package edu.nju.hw.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.nju.hw.model.Hostel;
import edu.nju.hw.model.User;

@Controller
public class ForwardController {

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
	
	//�û�����
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
	public String fuorderCancel(){
		return "uorderCancel";
	}
	
	@RequestMapping("/fustatistics")
	public String fustatistics(){
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
	
	
	
	
	
//	@RequestMapping("/fvipCancel")
//	public String vipCancel(){
//		return "vipCancel";
//	}
}
