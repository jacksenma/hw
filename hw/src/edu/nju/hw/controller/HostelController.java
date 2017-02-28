package edu.nju.hw.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import edu.nju.hw.model.Hed;
import edu.nju.hw.model.Hostel;
import edu.nju.hw.model.Order;
import edu.nju.hw.model.OrderHostel;
import edu.nju.hw.service.HostelService;
import edu.nju.hw.service.UserService;
import edu.nju.hw.service.VipService;

@Controller
//@RequestMapping("/hostel")
public class HostelController {
	
	@Autowired
	private HostelService hostelService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private VipService vipService;
	
//	@RequestMapping("/hregister")
//	public String register(HttpServletRequest request,@ModelAttribute Test test, BindingResult bindResult,Model model){
//		System.out.println("lalaal");
//		System.out.println(request.getAttribute("image[0]"));
//		System.out.println("path:"+request.getServletContext().getRealPath("WebContent/WEB-INF/img"));
//		
//		MultipartFile file=test.getImg();
//		System.out.println(file);
//		if(null!=file){
//			String filename=file.getOriginalFilename();
//			System.out.println("filename:"+filename);
//			System.out.println("path:"+request.getServletContext().getRealPath("img"));
//			File imgFile=new File(request.getServletContext().getRealPath("img"),filename);
//			try {
//				file.transferTo(imgFile);
//			} catch (IllegalStateException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		model.addAttribute("test", test);
//		return "test";
//	}
	
//	@RequestMapping("/HostelRegister")
//	public String HostelRegister(){
//		return "hregister";
//	}
	
	@RequestMapping("/hregister")
	public String register(@RequestParam("file")MultipartFile file,
            HttpServletRequest request, HttpServletResponse response) throws IllegalStateException, IOException{
		System.out.println("test");
		System.out.println(file);
		
		String name=request.getParameter("hname");
		String phone=request.getParameter("phone");
		String level=request.getParameter("level");
		String bankCard=request.getParameter("bankCard");
		String province=request.getParameter("province");
		String city=request.getParameter("city");
		String district=request.getParameter("district");
		if(hostelService.isExisted(name,phone,level,bankCard,province,city,district)){
			return "hmessage";
		}
		
		if(!file.isEmpty()){
			String path=null;// 文件路径
			String type=null;// 文件类型
			String fileName=file.getOriginalFilename();// 文件原名称
		    String realPath=request.getSession().getServletContext().getRealPath("/");
			                     // 自定义的文件名称
			String trueFileName=String.valueOf(System.currentTimeMillis())+fileName;
			                     // 设置存放图片文件的路径
//			path=realPath+/*System.getProperty("file.separator")+*/trueFileName;
//			path="D:/j2ee/hw/WebContent/WEB-INF/img/"+trueFileName;
			path="C:/Users/user/Desktop/新建文件夹 (2)/hw/WebContent/WEB-INF/img/"+trueFileName;
			System.out.println("存放图片文件的路径:"+path);
//			file.transferTo(new File(path));
			file.transferTo(new File(path));
//			System.out.println("D:/j2ee/hw/img/"+trueFileName);
			
			String RelativePath="./img/"+trueFileName;
			
//			hostelService.register(name,phone,level,bankCard,province,city,district,path);
			hostelService.register(name,phone,level,bankCard,province,city,district,RelativePath);
			System.out.println("跳转到等待审核界面");
			
        }
		return "hmessage";
		
	}
	
	@RequestMapping("/hostelPass")
	public void hostelPass(HttpServletRequest request, HttpServletResponse response) throws IOException{
		    //系统自动分配7位识别码
		System.out.println("pass");
			String id=giveId7ToHostel();
			System.out.println(id);
			//初始密码等于id
			String password=id;
			String name=request.getParameter("name");
			String phone=request.getParameter("phone");
			String level=request.getParameter("level");
			String bankCard=request.getParameter("bankCard");
			String province=request.getParameter("province");
			String city=request.getParameter("city");
			String district=request.getParameter("district");
			hostelService.addNewHostel(name,phone,level,bankCard,province,city,district,id,password);
			userService.register(id,password,2);
			PrintWriter out;
			out = response.getWriter();
			out.write("ok");
            out.close();
		}
	
	
	public String giveId7ToHostel(){
		System.out.println("id7");
		String id="h";
		
		for (int i=0;i<6;i++){
			id+=(int)(Math.random()*10);
		}
		if(hostelService.canId7Use(id)==true&&userService.isUser(id)==false)
			return id;
		else
			giveId7ToHostel();
		return id;
		
		
	}
	
	@RequestMapping("/hostelNotPass")
	public void hosteNotlPass(HttpServletRequest request, HttpServletResponse response) throws IOException{
		    
			System.out.println("notPass");
			String name=request.getParameter("name");
			String phone=request.getParameter("phone");
			String level=request.getParameter("level");
			String bankCard=request.getParameter("bankCard");
			String province=request.getParameter("province");
			String city=request.getParameter("city");
			String district=request.getParameter("district");
			hostelService.deleteHostel(name,phone,level,bankCard,province,city,district);
			PrintWriter out;
			out = response.getWriter();
			out.write("delete");
            out.close();
		}
	
	
	@RequestMapping("/hchange")
	public String hchange(@RequestParam("file")MultipartFile file,
            HttpServletRequest request, HttpServletResponse response) throws IllegalStateException, IOException{
//		System.out.println("hchange");
//		System.out.println(file);
//		System.out.println("hchange");
//		System.out.println(file.isEmpty());
		String hid=request.getParameter("hid");
		if(hostelService.canChange(hid)==false)
			return "hNotChange";
		String name=request.getParameter("hname");
		String phone=request.getParameter("phone");
		String level=request.getParameter("level");
		String bankCard=request.getParameter("bankCard");
		String province=request.getParameter("province");
		String city=request.getParameter("city");
		String district=request.getParameter("district");
		String psd=request.getParameter("psd");
		String state=request.getParameter("state");
//		if(hostelService.isExisted(name,phone,level,bankCard,province,city,district)){
//			return "hmessage";
//		}
//		
		String RelativePath="";
		if(!file.isEmpty()){
			String path=null;// 文件路径
			String type=null;// 文件类型
			String fileName=file.getOriginalFilename();// 文件原名称
			System.out.println(fileName==null);
			System.out.println("name:"+fileName);
			System.out.println("!!");
		    String realPath=request.getSession().getServletContext().getRealPath("/");
			                     // 自定义的文件名称
			String trueFileName=String.valueOf(System.currentTimeMillis())+fileName;
			                     // 设置存放图片文件的路径
//			path=realPath+/*System.getProperty("file.separator")+*/trueFileName;
			path="D:/j2ee/hw/WebContent/WEB-INF/img/"+trueFileName;
			System.out.println("存放图片文件的路径:"+path);
//			file.transferTo(new File(path));
			file.transferTo(new File(path));
//			System.out.println("D:/j2ee/hw/img/"+trueFileName);
			
		    RelativePath="./img/"+trueFileName;
			System.out.println(RelativePath);
//			hostelService.register(name,phone,level,bankCard,province,city,district,path);
//			hostelService.register(name,phone,level,bankCard,province,city,district,RelativePath);
//			System.out.println("跳转到等待审核界面");
			
        }else{
        	RelativePath=request.getParameter("imgUrl");
        	System.out.println(RelativePath);
        }
		hostelService.addHostelChange(name,phone,level,bankCard,province,city,district,RelativePath,hid,psd,state);
		hostelService.setState2(hid);
		return "hNotChange";
		
	}
	
	@RequestMapping("/hostelChangePass")
	public void hostelChangePass(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String id=request.getParameter("id");
		System.out.println(id);
		Hostel c=hostelService.getHostelChangeInfo(id);
		hostelService.changeHostel(c.getName(),c.getPhone(),c.getLevel(),c.getBankCard(),c.getProvince(),
				c.getCity(),c.getDistrict(),c.getImgUrl(),id);
		PrintWriter out;
		out = response.getWriter();
		out.write("ok");
        out.close();
		
	}
	
	@RequestMapping("/hostelChangeNotPass")
	public void hostelChangeNotPass(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String id=request.getParameter("id");
		System.out.println(id);
		hostelService.deleteHostelChange(id);
		hostelService.setState1(id);
		PrintWriter out;
		out = response.getWriter();
		out.write("delete");
        out.close();
		
	}
	
	@RequestMapping("/hplan")
	public void hplan(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException{
		    //系统自动分配7位识别码
		System.out.println("plan++");
			String startDate=request.getParameter("startDate");
			String endDate=request.getParameter("endDate");
			String bed=request.getParameter("bed");
			double price=Double.parseDouble(request.getParameter("price"));
			String num=request.getParameter("num");
			String hid=request.getParameter("hid");
			System.out.println("hid:"+hid);
			
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
			Date dt1 = df.parse(startDate);
            Date dt2 = df.parse(df.format(new Date()));
            PrintWriter out;
            out = response.getWriter();
            if (dt1.getTime() < dt2.getTime()) {
    			out.write("dateWrong");
                out.close();
            }else{
            	out.write("ok");
                out.close();
                hostelService.addPlan(hid,startDate,endDate,bed,num,price);
            }
			
		}
	
	
	//入店登记
	
	@RequestMapping("/henter")
	public void henter(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException{
		System.out.println("enter");
		
		String name=request.getParameter("uname");
		String enterDate=getNowTime();
		String vipId=request.getParameter("vipId");
		String bed=request.getParameter("bed");
		String num=request.getParameter("num");
		String hid=request.getParameter("hid");
		Hostel h=(Hostel)session.getAttribute("hostelInfo");
		String haddress=h.getProvince()+h.getCity()+h.getDistrict();
		String hname=h.getName();
		//增加住店登记
		hostelService.enterHostel(hid,enterDate,name,vipId,bed,num);
		//将订单状态改为state2(入住)
		vipService.updateOrderState(vipId,hid,1,2);
		//增加会员记录
		vipService.updateVipFinance(vipId, 0, "入住了位于"+haddress+"的"+hname, enterDate, 2);
		PrintWriter out;
        out = response.getWriter();
        out.write("ok");
        out.close();
		}
	
	@RequestMapping("/henterAjax")
	public void henterAjax(HttpServletRequest request,HttpServletResponse response) throws IOException{
		System.out.println("enterAjax");
		
		String vid=request.getParameter("vid");
		String psd=request.getParameter("psd");
		PrintWriter out;
		out = response.getWriter();
		//检查会员真实性
		if(userService.isVip(vid,psd)==false){
			out.write("noVip");
			out.close();
			return;
		}
			 
		//提取预订信息
		String hid=request.getParameter("hid");
		Order o=(Order)vipService.getOrderByVidAndHid(vid,hid,1);
		if(o==null){
			out.write("noOrder");
			out.close();
			return;
		}else{
			String name=o.getName();
			String bed=o.getBed();
			int num=o.getNum();
			out.write(name+"@"+bed+"@"+num);
			out.close();
			return;
		}

		
        
       
        
		}
	
	
	@RequestMapping("/henterNotVip")
	public void henterNotVip(HttpServletRequest request,HttpServletResponse response) throws IOException{
		System.out.println("enterNotVip");
		
		String name=request.getParameter("nuname");
		String enterDate=getNowTime();
		String idCard=request.getParameter("nidCard");
		String bed=request.getParameter("nbed");
		String num=request.getParameter("nnum");
		String hid=request.getParameter("nhid");
		System.out.println("hid==="+hid);
		//增加住店登记
		hostelService.enterHostel(hid,enterDate,name,idCard,bed,num);
		
		
		PrintWriter out;
        out = response.getWriter();
        out.write("ok");
        out.close();
		}
	//离店登记(会员)
	@RequestMapping("/hleave")
	public void hleave(HttpServletRequest request,HttpServletResponse response,HttpSession session){
		String name=request.getParameter("uname");
		String leaveDate=getNowTime();
		String vipId=request.getParameter("vipId");
		String bed=request.getParameter("bed");
		String num=request.getParameter("num");
		String hid=request.getParameter("hid");
		
		//增加离店记录
		Order o=(Order)vipService.getOrderByVidAndHid(vipId,hid,2);
		hostelService.leaveHostel(hid,name,vipId,leaveDate,"会员","会员卡",o.getPrice());
		
		//将订单状态改为state3(退房)
		vipService.updateOrderState(vipId,hid,2,3);
		//增加会员记录
		Hostel h=(Hostel)session.getAttribute("hostelInfo");
		String haddress=h.getProvince()+h.getCity()+h.getDistrict();
		String hname=h.getName();
		vipService.updateVipFinance(vipId, 0, "从位于"+haddress+"的"+hname+"退房", leaveDate, 3);
	}
	
	
	@RequestMapping("/hleaveAjax")
	public void hleaveAjax(HttpServletRequest request,HttpServletResponse response) throws IOException{
		System.out.println("leaveAjax");
		
		String name=request.getParameter("nuname");
		String idCard=request.getParameter("nidCard");
		String hid=request.getParameter("hid");
		System.out.println(name+idCard+hid);
		PrintWriter out;
		out = response.getWriter();
		//检查住店信息
		Hed hed=hostelService.findEnterUser(hid,name,idCard);
		System.out.println(hed==null);
		if(hed==null){
			out.write("no");
			out.close();
			return;
		}
		String bed=hed.getBed();
		String num=hed.getNum();
		double singlePrice=(double)hostelService.getSinglePrice(hid,bed);
		System.out.println(singlePrice+"单价");
		String startDate=hed.getEnterDate();
		int days=getDayDistance(startDate, getNowTime());
		double total=singlePrice*days;
		out.write(total+"@"+bed+"@"+num);
		out.close();
		return;
//			 
//		//提取预订信息
//		String hid=request.getParameter("hid");
//		Order o=(Order)vipService.getOrderByVidAndHid(vid,hid,1);
//		if(o==null){
//			out.write("noOrder");
//			out.close();
//			return;
//		}else{
//			String name=o.getName();
//			String bed=o.getBed();
//			int num=o.getNum();
//			out.write(name+"@"+bed+"@"+num);
//			out.close();
//			return;
//		}
	}
	
	//离店登记(非会员)
	@RequestMapping("/hleaveNotVip")
	public void hleaveNotVip(HttpServletRequest request,HttpServletResponse response) throws IOException{
		System.out.println("leave");
		
		String name=request.getParameter("nuname");
		String leaveDate=getNowTime();
		String idCard=request.getParameter("nidCard");
		String bed=request.getParameter("nbed");
		String num=request.getParameter("nnum");
		String hid=request.getParameter("nhid");
		String t=request.getParameter("total");
		double total=Double.parseDouble(t);
		PrintWriter out;
		if(hostelService.findEnterUser(hid,name,idCard)!=null){
			//记录离店
			hostelService.leaveHostel(hid,name,idCard,leaveDate,"非会员","现金",total);
			//现金支付给客栈银行卡上打钱
			double bb=hostelService.getHostelInfo(hid).getBankBalance();
			double bankBalance=bb+total;
			hostelService.updateHostelBankBalance(hid,bankBalance);
			//客栈财务记录
			vipService.updateFinance(hid, total);
			
			out = response.getWriter();
	        out.write("ok");
	        out.close();
		}else{
			out = response.getWriter();
	        out.write("no");
	        out.close();
		}
		}
	
	
	
	
	
	//根据条件搜索客栈
	@RequestMapping("/searchHostel")
	public String searchHostel(HttpServletRequest request,HttpServletResponse response,HttpSession session){
		String province=request.getParameter("province");
		String city=request.getParameter("city");
		String district=request.getParameter("district");
//		String level=null;
//		if(request.getParameter("level").equals("不限")==false){
			String level=request.getParameter("level");
//		}
		String startDate=request.getParameter("startDate");
		String endDate=request.getParameter("endDate");
		String price=request.getParameter("price");
		session.setAttribute("province", province);
		session.setAttribute("city", city);
		session.setAttribute("district", district);
		session.setAttribute("level", level);
		session.setAttribute("startDate", startDate);
		session.setAttribute("endDate", endDate);
		session.setAttribute("price", price);
		
		
		double p1,p2;
		if(price.equals("150以下")){
			p1=0;
			p2=150;
		}
		else if(price.equals("150-300")){
			p1=150;
			p2=300;
		}
		else if(price.equals("301-450")){
			p1=301;
			p2=450;
		}
		else if(price.equals("450以上")){
			p1=450;
			p2=10000;
			System.out.println("450以上");
		}
		else{
			p1=0;
			p2=10000;
		}
			
//		double price=Double.parseDouble(request.getParameter("price"));
		System.out.println("this level:"+level);
		String key=request.getParameter("key");
		if(key=="")
			key="";
		session.setAttribute("key", key);
		List<OrderHostel> os=new ArrayList<OrderHostel>();
		os=hostelService.searchHostels(province,city,district,startDate,endDate,p1,p2,level,key);
		session.setAttribute("OrderHostelInfo", os);
		
//		List<Hostel> os=new ArrayList<Hostel>();
//		os=hostelService.searchHostels(province,city,district,startDate,endDate,p1,p2,level,key);
//		session.setAttribute("OrderHostelInfo", os);
		
//		System.out.println("size:"+hs.size());
//		for(int i=0;i<hs.size();i++)
//			System.out.println(hs.get(i).getHid()+"  "+hs.get(i).getPrice());
		
//		hostelService.searchHostels(province,city,district,startDate,endDate,price,key);
		return "umain";
		
	}
	
	
	public static String getNowTime(){
		 Date d = new Date();
	     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	     System.out.println("当前时间：" + sdf.format(d));
	     return sdf.format(d);
	}
	
	public static int getDayDistance(String str1,String str2){
		 DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	        Date one;  
	        Date two;  
	        long days=0;  
	        try {  
	            one = df.parse(str1);  
	            two = df.parse(str2);  
	            long time1 = one.getTime();  
	            long time2 = two.getTime();  
	            long diff ;  
	            if(time1<time2) {  
	                diff = time2 - time1;  
	            } else {  
	                diff = time1 - time2;  
	            }  
	            days = diff / (1000 * 60 * 60 * 24);  
	        } catch (ParseException e) {  
	            e.printStackTrace();  
	        }  
	        System.out.println((int)days);
	        return (int)days;
	}
	

}
