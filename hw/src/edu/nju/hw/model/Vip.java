package edu.nju.hw.model;

public class Vip {
	private String id;//7λʶ����
	private int uid;//�û���id
	private String bankCard;
	private int state;//״̬
	private int level;//�ȼ�
	private double balance;//��Ա�����
	private double bankBalance;//���п�����ʼĬ��6��
	private int point;//��Ա����
	private String phone;
	private String idCard;
	private int xp;//����ֵ���ﵽһ���ȼ���������
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
