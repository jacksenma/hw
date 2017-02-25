package edu.nju.hw.model;

public class Plan {
	private String hid;
	private String startDate;
	private String endDate;
	private String bed;
	private int num;
	private double price;
	
	public String getHid(){
		return hid;
	}
	public void setHid(String hid){
		this.hid=hid;
	}
	
	public String getStartDate(){
		return startDate;
	}
	public void setStartDate(String startDate){
		this.startDate=startDate;
	}
	
	public String getEndDate(){
		return endDate;
	}
	public void setEndDate(String endDate){
		this.endDate=endDate;
	}
	
	public String getBed(){
		return bed;
	}
	public void setBed(String bed){
		this.bed=bed;
	}
	
	public int getNum(){
		return num;
	}
	public void setNum(int num){
		this.num=num;
	}
	
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
}
