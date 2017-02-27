package edu.nju.hw.service;

import java.util.List;

import edu.nju.hw.model.Hostel;

public interface HostelService {
	public boolean isExisted(String name,String phone,String level,String bankCard,String province,
			String city,String district);
	
	public void register(String name,String phone,String level,String bankCard,String province,
			String city,String district,String imgUrl);
	
	public Hostel getHostelInfo(String id);
	
	public List getAllHostelsUnsettled();
	public boolean canId7Use(String id);

	public void addNewHostel(String name, String phone, String level, String bankCard, String province, String city,
			String district, String id, String password);

	public void deleteHostel(String name, String phone, String level, String bankCard, String province, String city,
			String district);

	public void addHostelChange(String name, String phone, String level, String bankCard, String province, String city,
			String district, String relativePath, String hid, String psd, String state);

	public boolean canChange(String hid);

	public void setState2(String hid);

	public List getAllHostelsChange();

	public Hostel getHostelChangeInfo(String id);

	public void changeHostel(String name, String phone, String level, String bankCard, String province, String city,
			String district, String imgUrl, String id);

	public void deleteHostelChange(String id);

	public void setState1(String id);

	public void addPlan(String hid, String startDate, String endDate, String bed, String num, double price);

	public void enterHostel(String hid, String enterDate, String name, String idCard, String bed, String num);

	public void leaveHostel(String hid, String name, String idCard, String leaveDate, String identity, String mode,
			double total);

	//�ж�Ҫ�Ǽ������Ϣ��ס���Ƿ�Ǽǹ��������δ�Ǽ������Ϣ
	public boolean findEnterUser(String hid, String name, String idCard);

	public void updateHostelBankBalance(String hid, double bankBalance);

	public List searchHostels(String province, String city, String district, String startDate, String endDate,
			double p1, double p2, String level, String key);

	public void updatePlanBedNum(int num, String hid, String planStartDate, String planEndDate, String myBed,
			int planNum, double planPrice);

	
	
}