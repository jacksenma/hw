package edu.nju.hw.model;

public class Hcheck {
	private int id;
	private String hid;
	private String date;
	private int orderNum;
	private int cancelNum;
	private int enterNum;
	private int leaveNum;
	
	public int getId(){
		return id;
	}
	
	public String getDate(){
		return date;
	}
	
	public int getOrderNum(){
		return orderNum;
	}
	
	public int getCancelNum(){
		return cancelNum;
	}
	
	public int getEnterNum(){
		return enterNum;
	}
	
	public int getLeaveNum(){
		return leaveNum;
	}
}
