package edu.nju.hw.model;

public class OrderHostel {
	private String hid;
	private String startDate;
	private String endDate;
	private String bed;
	private int num;
	private double price;
	
	private String name;
	private String password;
	private String id;//7位识别码
	private String province;
	private String city;
	private String district;
	private String phone;
	private String bankCard;
	private String level;
//	private MultipartFile img;
	private String imgUrl;
	private int state;//0表示待审核，1表示审核通过（审核不通过的直接从数据库中删去）
	private double bankBalance;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}
	
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id=id;
	}
	
	public String getProvince(){
		return province;
	}
	public void setProvince(String province){
		this.province=province;
	}
	
	public String getCity(){
		return city;
	}
	public void setCity(String city){
		this.city=city;
	}
	
	public String getDistrict(){
		return district;
	}
	public void setDistrict(String district){
		this.district=district;
	}
	
	public String getPhone(){
		return phone;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	
	public String getBankCard(){
		return bankCard;
	}
	public void setBankCard(String bankcard){
		this.bankCard=bankcard;
	}
	
	public String getImgUrl(){
		return imgUrl;
	}
	public void setImgUrl(String imgUrl){
		this.imgUrl=imgUrl;
	}
	
	public String getLevel(){
		return level;
	}
	public void setLevel(String level){
		this.level=level;
	}
	
	public int getState(){
		return state;
	}
	public void setState(int state){
		this.state=state;
	}
	
	public double getBankBalance(){
		return bankBalance;
	}
	public void setBankBalance(double bankBalance){
		this.bankBalance=bankBalance;
	}
	
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
