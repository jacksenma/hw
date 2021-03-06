package edu.nju.hw.model;

public class Order {
	private String vid;
	private String hid;
	private String startDate;
	private String endDate;
	private String bed;
	private int id;
	private String name;
	private int num;//房间数
	private double price;//总价
	private String hname;//客栈名城
	private String haddress;//客站地址
	private String hphone;//联系电话
	private String hlevel;//客栈星级
	private String orderDate;
	private String cancelDate;
	private String enterDate;
	private String leaveDate;
	private int state;
	
	public String getVid(){
		return vid;
	}
	public String getHid(){
		return hid;
	}
	public String getStartDate(){
		return startDate;
	}
	public String getEndDate(){
		return endDate;
	}
	public String getBed(){
		return bed;
	}
	public int getNum(){
		return num;
	}
	public double getPrice(){
		return price;
	}
	public String getHname(){
		return hname;
	}
	public String getHaddress(){
		return haddress;
	}
	public String getHphone(){
		return hphone;
	}
	public String getHlevel(){
		return hlevel;
	}
	public String getName(){
		return name;
	}
	public int getId(){
		return id;
	}
	public String getOrderDate(){
		return orderDate;
	}
	public String getCancelDate(){
		return cancelDate;
	}
	public String getEnterDate(){
		return enterDate;
	}
	public String getLeaveDate(){
		return leaveDate;
	}
	public int getState(){
		return state;
	}
}
