package edu.nju.hw.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
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

import edu.nju.hw.model.Hostel;
import edu.nju.hw.model.OrderHostel;
import edu.nju.hw.service.HostelService;
import edu.nju.hw.service.UserService;

@Controller
//@RequestMapping("/hostel")
public class HostelController {
	
	@Autowired
	private HostelService hostelService;
	
	@Autowired
	private UserService userService;
	
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
			String path=null;// �ļ�·��
			String type=null;// �ļ�����
			String fileName=file.getOriginalFilename();// �ļ�ԭ����
		    String realPath=request.getSession().getServletContext().getRealPath("/");
			                     // �Զ�����ļ�����
			String trueFileName=String.valueOf(System.currentTimeMillis())+fileName;
			                     // ���ô��ͼƬ�ļ���·��
//			path=realPath+/*System.getProperty("file.separator")+*/trueFileName;
//			path="D:/j2ee/hw/WebContent/WEB-INF/img/"+trueFileName;
			path="C:/Users/user/Desktop/�½��ļ��� (2)/hw/WebContent/WEB-INF/img/"+trueFileName;
			System.out.println("���ͼƬ�ļ���·��:"+path);
//			file.transferTo(new File(path));
			file.transferTo(new File(path));
//			System.out.println("D:/j2ee/hw/img/"+trueFileName);
			
			String RelativePath="./img/"+trueFileName;
			
//			hostelService.register(name,phone,level,bankCard,province,city,district,path);
			hostelService.register(name,phone,level,bankCard,province,city,district,RelativePath);
			System.out.println("��ת���ȴ���˽���");
			
        }
		return "hmessage";
		
	}
	
	@RequestMapping("/hostelPass")
	public void hostelPass(HttpServletRequest request, HttpServletResponse response) throws IOException{
		    //ϵͳ�Զ�����7λʶ����
		System.out.println("pass");
			String id=giveId7ToHostel();
			System.out.println(id);
			//��ʼ�������id
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
			String path=null;// �ļ�·��
			String type=null;// �ļ�����
			String fileName=file.getOriginalFilename();// �ļ�ԭ����
			System.out.println(fileName==null);
			System.out.println("name:"+fileName);
			System.out.println("!!");
		    String realPath=request.getSession().getServletContext().getRealPath("/");
			                     // �Զ�����ļ�����
			String trueFileName=String.valueOf(System.currentTimeMillis())+fileName;
			                     // ���ô��ͼƬ�ļ���·��
//			path=realPath+/*System.getProperty("file.separator")+*/trueFileName;
			path="D:/j2ee/hw/WebContent/WEB-INF/img/"+trueFileName;
			System.out.println("���ͼƬ�ļ���·��:"+path);
//			file.transferTo(new File(path));
			file.transferTo(new File(path));
//			System.out.println("D:/j2ee/hw/img/"+trueFileName);
			
		    RelativePath="./img/"+trueFileName;
			System.out.println(RelativePath);
//			hostelService.register(name,phone,level,bankCard,province,city,district,path);
//			hostelService.register(name,phone,level,bankCard,province,city,district,RelativePath);
//			System.out.println("��ת���ȴ���˽���");
			
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
		    //ϵͳ�Զ�����7λʶ����
		System.out.println("plan++");
			String startDate=request.getParameter("startDate");
			String endDate=request.getParameter("endDate");
			String bed=request.getParameter("bed");
			double price=Double.parseDouble(request.getParameter("price"));
			String num=request.getParameter("num");
			String hid=request.getParameter("hid");
			System.out.println("hid:"+hid);
			
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//�������ڸ�ʽ
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
	
	
	//���Ǽ�
	
	@RequestMapping("/henter")
	public void henter(HttpServletRequest request,HttpServletResponse response) throws IOException{
		System.out.println("enter");
		
		String name=request.getParameter("uname");
		String enterDate=request.getParameter("enterDate");
		String idCard=request.getParameter("idCard");
		String bed=request.getParameter("bed");
		String num=request.getParameter("num");
		String hid=request.getParameter("hid");
		hostelService.enterHostel(hid,enterDate,name,idCard,bed,num);
		PrintWriter out;
        out = response.getWriter();
        out.write("ok");
        out.close();
		}
	
	//���Ǽ�
	@RequestMapping("/hleave")
	public void hleave(HttpServletRequest request,HttpServletResponse response) throws IOException{
		System.out.println("leave");
		
		String name=request.getParameter("uname");
		String leaveDate=request.getParameter("leaveDate");
		String idCard=request.getParameter("idCard");
		String identity=request.getParameter("identity");
		String mode=request.getParameter("mode");
		String hid=request.getParameter("hid");
		String t=request.getParameter("total");
		double total=0;
		if(t!="")
			total=Double.parseDouble(t);
		PrintWriter out;
		if(hostelService.findEnterUser(hid,name,idCard)){
			//��¼���
			hostelService.leaveHostel(hid,name,idCard,leaveDate,identity,mode,total);
			//�ֽ�֧������ջ���п��ϴ�Ǯ
			double bb=hostelService.getHostelInfo(hid).getBankBalance();
			double bankBalance=bb+total;
			hostelService.updateHostelBankBalance(hid,bankBalance);
			out = response.getWriter();
	        out.write("ok");
	        out.close();
		}else{
			out = response.getWriter();
	        out.write("no");
	        out.close();
		}
		
//		System.out.println("a"+total+"a");
//		System.out.println(Double.parseDouble());
//		double total=0;
//		hostelService.enterHostel(hid,enterDate,name,idCard,bed,num);
		
        
		}
	
	
	
	//��������������ջ
	@RequestMapping("/searchHostel")
	public String searchHostel(HttpServletRequest request,HttpServletResponse response,HttpSession session){
		String province=request.getParameter("province");
		String city=request.getParameter("city");
		String district=request.getParameter("district");
//		String level=null;
//		if(request.getParameter("level").equals("����")==false){
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
		if(price.equals("150����")){
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
		else if(price.equals("450����")){
			p1=450;
			p2=10000;
			System.out.println("450����");
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

}