package edu.nju.hw.model;

public class Finance {
	private int id;
	private String date;
	private double money;//两位小数
	private String roleId;
	private String remark;
	
	public int getId(){
		return id;
	}
	
	public String getDate(){
		return date;
	}
	
	public double getMoney(){
		return money;
	}
	
	public String getRoleId(){
		return roleId;
	}
	public String getRemark(){
		return remark;
	}
}
