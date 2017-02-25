package edu.nju.hw.service;

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
			int roomNum, String name);

	void updateBPX(String vid, double balance, int point, int xp);

	//hw�˻���Ǯ
	void updateHW(double myTotalPrice);

	double getHW(int i);

	void rechargeP(String vid, int money, int point, double balance);

	void updateDDL(String ddl, String vid);

}
