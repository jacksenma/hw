 package edu.nju.hw.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.nju.hw.model.User;
import edu.nju.hw.service.UserService;

@Controller
//@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/findAllUser")
	public String findAllUser(HttpServletRequest request){
		System.out.println("sd");
		List<User> listUser =  userService.findAllUser();
		request.setAttribute("listUser", listUser);
		return "/allUser";
	}
	
	@RequestMapping("/uregister")
	public void register(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		System.out.println("uregister");
		String name=request.getParameter("uname");
		String psd=request.getParameter("upsd");
		System.out.println(name+" register "+psd);
		userService.register(name, psd, 0);
//		context.getRequestDispatcher("/index.jsp").forward(
//				request, response);
//		RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
//		rd.forward(request, response);
//		response.sendRedirect("c.jsp");
		Cookie cookie1 = new Cookie("registerName",name);
		cookie1.setPath("/");
		response.addCookie(cookie1);
		response.sendRedirect("/hw/index.jsp");
//		return "redirect:/user/welcome";
		
	}
	
	@RequestMapping("/uregisterAjax")
	public void registerAjax(HttpServletRequest request,HttpServletResponse response){
		System.out.println("uregisterAjax");
		PrintWriter out;
		String name=request.getParameter("uname");
//		String psd=request.getParameter("upsd");
//		System.out.println(name+" registerAjax "+psd);
		if(userService.isUser(name)){
			try {
			out = response.getWriter();
			out.write("yes");
            out.close();
            
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	
	
//	@RequestMapping("/login")
//	public String login(HttpServletRequest request,HttpServletResponse response,HttpSession session){
//		System.out.println("login");
//		String name=request.getParameter("loginName");
//		String psd=request.getParameter("loginPsd");
//		System.out.println(name+" login "+psd);
//		User user=userService.getUserInfo(name,psd);
//		System.out.println(user);
////		request.setAttribute("user", user);
////		System.out.println(user.getId()+user.getName());
////		model.addAttribute("user",user);
//		session.setAttribute("userInfo",user);
//		if(user.getRole()==0)
//			return "umain";
//		else if(user.getRole()==1)
//			return "hmain";
//		else
//			return "amain";
//		
//	}
//	
//	@RequestMapping("/loginAjax")
//	public void loginAjax(HttpServletRequest request,HttpServletResponse response){
//		System.out.println("loginAjax");
//		PrintWriter out;
//		String name=request.getParameter("loginName");
//		String psd=request.getParameter("loginPsd");
//		System.out.println(name+" loginAjax "+psd);
//		if(userService.canLogin(name,psd)==false){
//			try {
//			out = response.getWriter();
//			out.write("no");
//            out.close();
//            
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		}
//	}
	
//	@RequestMapping("/UserRegister")
//	public String UserRegister(){
//		return "uregister";
//	}
	
//	@RequestMapping("/welcome")
//	public void welcome(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
//		RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
//		rd.forward(request, response);
//	}
	
}
