package edu.nju.hw.model;

public class Vip {
	private String id;//7位识别码
	private int uid;//用户的id
	private String bankCard;
	private int state;//状态
	private int level;//等级
	private double balance;//会员卡余额
	private double bankBalance;//银行卡余额（初始默认6万）
	private int point;//会员积分
	private String phone;
	private String idCard;
	private int xp;//经验值，达到一定等级可以升级
	private String ddl;
	
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id=id;
	}
	
	public int getUid(){
		return uid;
	}
	public void setUid(int uid){
		this.uid=uid;
	}
	
	public String getBankCard(){
		return bankCard;
	}
	public void setBankCard(String bankCard){
		this.bankCard=bankCard;
	}
	
	public int getState(){
		return state;
	}
	public void setState(int state){
		this.state=state;
	}
	
	public int getLevel(){
		return level;
	}
	public void setLevel(int level){
		this.level=level;
	}
	
	public double getBalance(){
		return balance;
	}
	public void setBalance(double banlance){
		this.balance=banlance;
	}
	
	public double getBankBalance(){
		return bankBalance;
	}
	public void setBankBalance(double bankBanlance){
		this.bankBalance=bankBanlance;
	}
	
	public int getPoint(){
		return point;
	}
	public void setPoint(int point){
		this.point=point;
	}
	
	public String getIdCard(){
		return idCard;
	}
	public void setIdCard(String idCard){
		this.idCard=idCard;
	}
	
	public String getPhone(){
		return phone;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	
	public int getXp(){
		return xp;
	}
	public void setXp(int xp){
		this.xp=xp;
	}
	
	public String getDDL(){
		return ddl;
	}
	public void setDDL(String ddl){
		this.ddl=ddl;
	}
}
