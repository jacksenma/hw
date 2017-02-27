package edu.nju.hw.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.nju.hw.model.Order;
import edu.nju.hw.model.User;
import edu.nju.hw.model.Vip;
import edu.nju.hw.service.HostelService;
import edu.nju.hw.service.UserService;
import edu.nju.hw.service.VipService;

@Controller
//@RequestMapping("/vip")
public class VipController {
	
	@Autowired
	private VipService vipService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private HostelService hostelService;
	
	
	
	@RequestMapping("/vregister")
	public void vipRegister(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException{
		PrintWriter out;
//		String phone=request.getParameter("phone");
//		System.out.println(phone);
//		String bc=request.getParameter("bankCard");
//		System.out.println(bc);
//		String ic=request.getParameter("idCard");
//		System.out.println(ic);
		int uid=Integer.parseInt(request.getParameter("uid"));
//		String uid
//		System.out.println(uid);
//		System.out.println(phone+"  "+bc+"  "+ic+" "+uid);
		if(vipService.isRegistered(uid)==false){
//			String id=giveId7ToVip();
//			vipService.addVip(phone,bc,ic,uid,id);
//			//���û���role���1
//			userService.setVip(uid);
//			
//			//role=1
//			User user=(User) session.getAttribute("userInfo");
//			user.setRole(1);
//			session.setAttribute("userInfo",user);
			out = response.getWriter();
			out.write("ok");
            out.close();
		}else{
			out = response.getWriter();
			out.write("no");
            out.close();
		}
	}
	
	public String giveId7ToVip(){
		System.out.println("vipid7");
		String id="v";
		
		for (int i=0;i<6;i++){
			id+=(int)(Math.random()*10);
		}
		if(vipService.canId7Use(id))
			return id;
		else
			giveId7ToVip();
		return id;
	}
	
	//��Աע���߼�
	@RequestMapping("/vregisterTrue")
	public String vipRegisterTrue(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException{
		System.out.println("vipTrue");
		String phone=request.getParameter("phone");
		String bc=request.getParameter("bankCard");
		String ic=request.getParameter("idCard");
		int uid=Integer.parseInt(request.getParameter("uid"));
		String id=giveId7ToVip();
		vipService.addVip(phone,bc,ic,uid,id);
			//���û���role���1
		userService.setVip(uid);
			
			//role=1
		User user=(User) session.getAttribute("userInfo");
		user.setRole(1);
		session.setAttribute("userInfo",user);
		
		Vip vip=vipService.getVipInfo(user.getId());
		session.setAttribute("vipInfo",vip);
		return "vipRecharge";
	}
	
	//������ֵ
	@RequestMapping("/vrecharge")
	public String vipRechargeAjax(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException{
		System.out.println("vipRecharge");
		
		double money=Double.parseDouble(request.getParameter("money"));
		String vid=request.getParameter("vid");
		int uid=Integer.parseInt(request.getParameter("uid"));
		Vip vip=vipService.getVipInfo(uid);
		double bankBalance=vip.getBankBalance();
		double balance=vip.getBalance();
		vip.setBalance(balance+money);
		vip.setBankBalance(bankBalance-money);
		vip.setState(1);
		session.setAttribute("vipInfo", vip);
		vipService.recharge(vid,money,bankBalance,balance);
		//����ddl
		updateDDL(vid);
		
		//����hw�˻�
		double b=(double)vipService.getHW(1);
		vipService.updateHW(money+b);
		return "vipRecharge";
	}
	
	//���ֳ�ֵ
	@RequestMapping("/vrechargep")
	public String vipRechargeP(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException{
		System.out.println("vipRechargePoint");
		
		int money=Integer.parseInt(request.getParameter("moneyp"));
		String vid=request.getParameter("vidp");
		int uid=Integer.parseInt(request.getParameter("uidp"));
		Vip vip=vipService.getVipInfo(uid);
		int point=vip.getPoint();
		double balance=vip.getBalance();
		vip.setBalance(balance+money);
		vip.setPoint(point-money);
		vip.setState(1);
		session.setAttribute("vipInfo", vip);
		vipService.rechargeP(vid,money,point,balance);
		//����ddl
		updateDDL(vid);
		return "vipRecharge";
	}
	
	public void updateDDL(String vid){
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Calendar canlandar = Calendar.getInstance();
		canlandar.setTime(date);
		canlandar.add(Calendar.YEAR, +1);
		String ddl=df.format(canlandar.getTime()).toString();
		System.out.println("ddl="+ddl);
		vipService.updateDDL(ddl,vid);
	}
	
	
	
	@RequestMapping("/vchange")
	public String vipChange(HttpServletRequest request,HttpSession session){
		System.out.println("vipChange");
		String vid=request.getParameter("vid");
		String phone=request.getParameter("phone");
		String bankCard=request.getParameter("bc");
		
//		if(vipService)
		vipService.changePandB(vid,phone,bankCard);
		Vip vip=(Vip)session.getAttribute("vipInfo");
		vip.setPhone(phone);
		vip.setBankCard(bankCard);
		session.setAttribute("vipInfo", vip);
		return "vipChange";
		
	}
	
	@RequestMapping("/vipCancel")
	public String vipCancel(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException{
		String vid=request.getParameter("vid");
		int uid=Integer.parseInt(request.getParameter("uid"));
		System.out.println("vid:"+vid);
		//step1:��vip�����Ƴ�����
		vipService.deleteVip(vid);
		//step2:��user��state��Ϊ0
		userService.cancelVip(uid);
		//step3:�ص���¼���棬���µ�½
		response.sendRedirect("/hw/index.jsp");
		return null;
		
	}
	
	
	//Ԥ��
	@RequestMapping("/preOrder")
	public String preOrder(HttpServletRequest request,HttpServletResponse response,HttpSession session){
		String preHid=request.getParameter("preHid");
		session.setAttribute("preHid", preHid);
		
		String preStartDate=request.getParameter("preStartDate");
		session.setAttribute("preStartDate", preStartDate);

		String preEndDate=request.getParameter("preEndDate");
		session.setAttribute("preEndDate", preEndDate);
		
		String preBed=request.getParameter("preBed");
		session.setAttribute("preBed", preBed);
		
		double prePrice=Double.parseDouble(request.getParameter("prePrice"));
		session.setAttribute("prePrice", prePrice);
		
		int preNum=Integer.parseInt(request.getParameter("preNum"));
		session.setAttribute("preNum", preNum);
		
		String planStartDate=request.getParameter("planStartDate");
		session.setAttribute("planStartDate", planStartDate);

		String planEndDate=request.getParameter("planEndDate");
		session.setAttribute("planEndDate", planEndDate);
		
		String preHname=request.getParameter("preHname");
		session.setAttribute("preHname", preHname);
		
		String preAddress=request.getParameter("preAddress");
		session.setAttribute("preAddress", preAddress);
		
		String preLevel=request.getParameter("preLevel");
		session.setAttribute("preLevel", preLevel);
		
		String prePhone=request.getParameter("prePhone");
		session.setAttribute("prePhone", prePhone);
		
		
		
		
		return "preOrder";
		
		
	}
	
	
	@RequestMapping("/myOrder")
	public String myOrder(HttpServletRequest request,HttpServletResponse response,HttpSession session){
		Vip me=(Vip)session.getAttribute("vipInfo");
		String name=request.getParameter("name");
		String myStartDate=request.getParameter("myStartDate");
		String myEndDate=request.getParameter("myEndDate");
		String myBed=request.getParameter("myBed");
		double myTotalPrice=Double.parseDouble(request.getParameter("myTotalPrice"));
		int roomNum=Integer.parseInt(request.getParameter("roomNum"));
		int myPoint=Integer.parseInt(request.getParameter("myPoint"));
		String haddress=request.getParameter("haddress");
		String hlevel=request.getParameter("hlevel");
		String hname=request.getParameter("hname");
		String hphone=request.getParameter("hphone");
		
		//step1:����һ��Ԥ����¼
		String vid=me.getId();
		String hid=(String) session.getAttribute("preHid");
		String now=getNowTime();
		vipService.addMyOrder(vid,hid,myStartDate,myEndDate,myBed,myTotalPrice,roomNum,name,haddress,hlevel,hname,hphone,now);
		
		//step2:��Ա��Ǯ���ӻ���,�Ӿ���ֵ
		double balance=me.getBalance()-myTotalPrice;
		int point=me.getPoint()+myPoint;
		int xp=me.getXp()+point;
		vipService.updateBPX(vid,balance,point,xp);
		//step3:hw�˻��ϼ�Ǯ
		double b=(double)vipService.getHW(1);
		vipService.updateHW(myTotalPrice+b);
		//step4:planʣ�෿�����仯
		String planStartDate=(String) session.getAttribute("planStartDate");
		System.out.println(planStartDate);
		String planEndDate=(String) session.getAttribute("planEndDate");
		System.out.println(planEndDate);
		int planNum=(int) session.getAttribute("preNum");
		System.out.println(planNum);
		double planPrice=(double) session.getAttribute("prePrice");
		System.out.println(planPrice);
		int num=planNum-roomNum;
		System.out.println(num);
		System.out.println(myBed);
		hostelService.updatePlanBedNum(num,hid,planStartDate,planEndDate,myBed,planNum,planPrice);
		session.setAttribute("preNum", num);
//		vipService.addMyOrder(me.get)
		
		//�õ�Ԥ����Ϣ�����ҵ�Ԥ������
		List<Order> myOrders=new ArrayList<Order>();
		myOrders=vipService.getMyOrders(vid);
		session.setAttribute("myOrdersInfo", myOrders);
		return "uorderCancel";
		
		
	}
	
	@RequestMapping("/orderCancel")
	public String orderCancel(HttpServletRequest request,HttpServletResponse response,HttpSession session){
		System.out.println("ordercancel");
		
		// �۳����֣�����ֵ���˻�80%�����
		String vid=request.getParameter("vid");
		double price=Double.parseDouble(request.getParameter("cancelPrice"));
		System.out.println("price:"+price);
		int point=(int)(price/10);
		int xp=point;
		Vip v=vipService.getVipInfoByVid(vid);
		int c=0;//������ֺ����Ĳ�ֵ
		if(v.getPoint()>=point)
			point=v.getPoint()-point;
		else{
			c=point-v.getPoint();
			point=0;
		}
		double balance=v.getBalance()+(getDouble2((price*0.8)))-c;
		xp=v.getXp()-xp;
		vipService.updateBPX(vid, balance, point, xp);
		//hw�˺���Ǯ
		double myTotalPrice=vipService.getHW(1);
		myTotalPrice=myTotalPrice-getDouble2((price*0.8));
		vipService.updateHW(myTotalPrice);
		
		//����state=0(ȡ��״̬),����ȡ��ʱ��
		int oid=Integer.parseInt(request.getParameter("oid"));
		vipService.updateOrderCancel(oid,getNowTime());
		
		//hw�˺Ž���¼�仯(ͬһ��ı仯�ϲ�)
		vipService.updateFinance(vid,getDouble2(price*0.8));
		
		
		
		
		//���Ѽ�¼����һ��
		return null;
		
	}
	
	public static String getNowTime(){
		 Date d = new Date();
	     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	     System.out.println("��ǰʱ�䣺" + sdf.format(d));
	     return sdf.format(d);
	}
	
	public static String getNowDate(){
		 Date d = new Date();
	     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	     System.out.println("��ǰ���ڣ�" + sdf.format(d));
	     return sdf.format(d);
	}
	public static double getDouble2(double d){
		DecimalFormat df = new DecimalFormat("0.00");
		double dd=d;
		double db = Double.parseDouble(df.format(dd));
		System.out.println("double:"+db);
		return db;
	}
	
	
}