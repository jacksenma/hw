package edu.nju.hw.model;

public class Order {
	private String vid;
	private String hid;
	private String startDate;
	private String endDate;
	private String bed;
	private String name;
	private int num;//房间数
	private double price;//总价
	
	
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
	public double price(){
		return price;
	}
	public String name(){
		return name;
	}
	
	
}
