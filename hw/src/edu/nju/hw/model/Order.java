package edu.nju.hw.model;

public class Order {
	private String vid;
	private String hid;
	private String startDate;
	private String endDate;
	private String bed;
	private int id;
	private String name;
	private int num;//������
	private double price;//�ܼ�
	private String hname;//��ջ����
	private String haddress;//��վ��ַ
	private String hphone;//��ϵ�绰
	private String hlevel;//��ջ�Ǽ�
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