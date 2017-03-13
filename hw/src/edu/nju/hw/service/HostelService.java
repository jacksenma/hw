package edu.nju.hw.service;

import java.util.List;

import edu.nju.hw.model.Finance;
import edu.nju.hw.model.Hcheck;
import edu.nju.hw.model.Hed;
import edu.nju.hw.model.Hostel;
import edu.nju.hw.model.Page;

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

	public void enterHostel(String hid, String enterDate, String name, String idCard, String bed, String num, String orderDate);

	public void leaveHostel(String hid, String name, String idCard, String leaveDate, String identity, String mode,
			double total, String orderDate);

	//判断要登记离店信息的住客是否登记过入店且尚未登记离店信息
	public Hed findEnterUser(String hid, String name, String idCard);

	public void updateHostelBankBalance(String hid, double bankBalance);

	public List searchHostels(String province, String city, String district, String startDate, String endDate,
			double p1, double p2, String level, String key, int pageId);

	public void updatePlanBedNum(int num, String hid, String planStartDate, String planEndDate, String myBed,
			int planNum, double planPrice);

	public long getSinglePrice(String hid, String bed);

	public void backPlanNum(int num, String hid, String bed);

	//更新客栈当日预定房间数
	public void updateOrderNum(String hid, String nowDate, int roomNum);
	
	//更新客栈当日取消预订房间数
	public void updateCancelNum(String hid, String nowDate, int rootNum);

	//更新客栈当日入住房间数
	public void updateEnterNum(String hid, String nowDate, int roomNum);
	
	//更新客栈当日退房房间数
	public void updateLeaveNum(String hid, String nowDate, int roomNum);

	public List getHcheck(String hid);

	public List getHFinance(String hid);
	
	//分页查找hostel
	public Page<Hostel> findAllHostelsByPage(int currentPageId,int numPerPage);

	public int getTotalPage();

	public int searchHostelsPageNum(String province, String city, String district, String startDate, String endDate,
			double p1, double p2, String level, String key);

	public boolean adminPay();

	
	
}
