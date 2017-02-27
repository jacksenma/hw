package edu.nju.hw.mapper;

import java.util.List;

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
	public void addEnter(String hid, String enterDate, String name, String idCard, String bed, String num);
	public void addLeave(String hid, String name, String idCard, String leaveDate, String identity, String mode,
			double total);
	public String getEnterUser(String hid, String name, String idCard);
	
	//���¿�ջ�����п�Ǯ
	public void updateBankBlanceById(String hid, double bankBalance);
	
	
	//����Ǽ�
	
	
}