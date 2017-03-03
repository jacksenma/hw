package edu.nju.hw.mapper;

import java.util.List;

import edu.nju.hw.model.Hed;
import edu.nju.hw.model.Hostel;

public interface HostelMapper {
	public Hostel selectHostelByAll(String name, String phone, String level, String bankCard, String province, String city,String district);
	public void addHostel(String name, String phone, String level, String bankCard, String province, String city,
			String district, String imgUrl);
	public Hostel selectHostelById(String id);
	public List selectHostelsState0(); 
	public void addNewHostel(String name, String phone, String level, String bankCard, String province, String city,String district,String id,String password);
	public void deleteHostelByAll(String name, String phone, String level, String bankCard, String province,
			String city, String district);
	public void addHostelChange(String name, String phone, String level, String bankCard, String province, String city,
			String district, String relativePath, String hid, String psd, String state);
	public Hostel selectHostelChangeById(String hid);
	public void setState2(String hid);
	public List getAllHostelsChange();
	public void updateHostelChange(String name, String phone, String level, String bankCard, String province,
			String city, String district, String imgUrl, String id);
	public void deleteHostelChangeById(String id);
	public void setState1(String id);
	public void addEnter(String hid, String enterDate, String name, String idCard, String bed, String num, String orderDate);
	public void addLeave(String hid, String name, String idCard, String leaveDate, String identity, String mode,
			double total, String orderDate);
	public Hed getEnterUser(String hid, String name, String idCard);
	
	//更新客栈的银行卡钱
	public void updateBankBlanceById(String hid, double bankBalance);
	
	
	//分页查找客栈(需要从num处往后查numPerpage个记录)
	public List findAllHostelsByPage(int startNum,int numPerPage);
	public int getSumOfHostel();
	
	
}
