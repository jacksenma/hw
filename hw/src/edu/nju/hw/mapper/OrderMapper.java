package edu.nju.hw.mapper;

import java.util.List;

public interface OrderMapper {

	void addOrder(String vid, String hid, String myStartDate, String myEndDate, String myBed, double myTotalPrice,
			int roomNum, String name, String haddress, String hlevel, String hname, String hphone, String now);

	public List getMyOrders(String vid);

	void updateOrderCancel(int oid, String nowTime);

}