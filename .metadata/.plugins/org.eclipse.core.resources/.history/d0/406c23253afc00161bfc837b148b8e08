package edu.nju.hw.mapper;

import edu.nju.hw.model.Vip;

public interface VipMapper {
	public Vip selectVipByUid(int uid);

	public Vip selectVipById(String id);

	public void addVip(String phone, String bc, String ic, int uid, String id);

	public void updateVipByVid(double vipBalance, double vipBankBalance, String vid);

	public void updateVipPandBByVid(String phone, String bankCard, String vid);

	public void deleteVipByVid(String vid);

	public void updateBPX(String vid, double balance, int point, int xp);

	public void updateHW(double myTotalPrice);

	public double selectHWBalanceById(int i);

	public void updateVipPByVid(double vipBalance, double vipPoint, String vid);

	public void updateDDL(String ddl, String vid);
}
