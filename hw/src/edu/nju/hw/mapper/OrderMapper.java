package edu.nju.hw.mapper;

import java.util.List;

import edu.nju.hw.model.Order;

public interface OrderMapper {

	void addOrder(String vid, String hid, String myStartDate, String myEndDate, String myBed, double myTotalPrice,
			int roomNum, String name, String haddress, String hlevel, String hname, String hphone, String now);

	public List getMyOrders(String vid);

	void updateOrderCancel(int oid, String nowTime);

	public List getOrderByVidAndHid(String vid, String hid, int state);

	public void updateOrderState(String vipId, String hid, String orderDate, int origin_state, int now_state);

}
