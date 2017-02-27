package edu.nju.hw.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.nju.hw.model.Vip;


public interface VipService {

	boolean isRegistered(int uid);

	boolean canId7Use(String id);

	void addVip(String phone, String bc, String ic, int uid, String id);

	Vip getVipInfo(int id);

	void recharge(String vid, double money, double bankBalance, double balance);

	void changePandB(String vid, String phone, String bankCard);

	void deleteVip(String vid);

	void addMyOrder(String vid, String hid, String myStartDate, String myEndDate, String myBed, double myTotalPrice,
			int roomNum, String name, String haddress, String hlevel, String hname, String hphone, String now);

	void updateBPX(String vid, double balance, int point, int xp);

	//hw�˻���Ǯ
	void updateHW(double myTotalPrice);

	double getHW(int i);

	void rechargeP(String vid, int money, int point, double balance);

	void updateDDL(String ddl, String vid);

	List getMyOrders(String vid);

	Vip getVipInfoByVid(String vid);

	void updateOrderCancel(int oid, String nowTime);

	void updateFinance(String vid, double double2);

	void updateVipFinance(String vid, double price, String remark, String nowTime);

}
