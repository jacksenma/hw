package edu.nju.hw.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.nju.hw.mapper.OrderMapper;
import edu.nju.hw.mapper.VipMapper;
import edu.nju.hw.model.Vip;
import edu.nju.hw.service.VipService;

@Service
@Transactional
public class VipServiceImpl implements VipService {

	@Resource
	public VipMapper vipMapper;
	
	@Resource
	public OrderMapper orderMapper;

	@Override
	public boolean isRegistered(int uid) {
		// TODO Auto-generated method stub
		if(vipMapper.selectVipByUid(uid)==null)
			return false;
		else
			return true;
	}

	@Override
	public boolean canId7Use(String id) {
		// TODO Auto-generated method stub
		if(vipMapper.selectVipById(id)==null)
			return true;
		else
			return false;
	}

	@Override
	public void addVip(String phone, String bc, String ic, int uid, String id) {
		// TODO Auto-generated method stub
		vipMapper.addVip(phone,bc,ic,uid,id);
	}

	@Override
	public Vip getVipInfo(int id) {
		// TODO Auto-generated method stub
		return vipMapper.selectVipByUid(id);
	}


	@Override
	public void recharge(String vid, double money, double bankBalance, double balance) {
		// TODO Auto-generated method stub
		double vipBalance=money+balance;
		double vipBankBalance=bankBalance-money;
		vipMapper.updateVipByVid(vipBalance,vipBankBalance,vid);
	}

	
	@Override
	public void rechargeP(String vid, int money, int point, double balance) {
		// TODO Auto-generated method stub
		double vipBalance=money+balance;
		double vipPoint=point-money;
		vipMapper.updateVipPByVid(vipBalance,vipPoint,vid);
	}
	
	@Override
	public void changePandB(String vid, String phone, String bankCard) {
		// TODO Auto-generated method stub
		vipMapper.updateVipPandBByVid(phone,bankCard,vid);
	}

	@Override
	public void deleteVip(String vid) {
		// TODO Auto-generated method stub
		vipMapper.deleteVipByVid(vid);
	}

	@Override
	public void addMyOrder(String vid, String hid, String myStartDate, String myEndDate, String myBed,
			double myTotalPrice, int roomNum,String name) {
		// TODO Auto-generated method stub
		orderMapper.addOrder(vid,hid,myStartDate,myEndDate,myBed,myTotalPrice,roomNum,name);
	}

	@Override
	public void updateBPX(String vid, double balance, int point, int xp) {
		// TODO Auto-generated method stub
		vipMapper.updateBPX(vid,balance,point,xp);
	}

	@Override
	public void updateHW(double myTotalPrice) {
		// TODO Auto-generated method stub
		vipMapper.updateHW(myTotalPrice);
	}

	@Override
	public double getHW(int i) {
		// TODO Auto-generated method stub
		return vipMapper.selectHWBalanceById(i);
	}

	@Override
	public void updateDDL(String ddl, String vid) {
		// TODO Auto-generated method stub
		vipMapper.updateDDL(ddl,vid);
	}

	
}
