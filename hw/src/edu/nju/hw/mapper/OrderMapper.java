package edu.nju.hw.mapper;

public interface OrderMapper {

	void addOrder(String vid, String hid, String myStartDate, String myEndDate, String myBed, double myTotalPrice,
			int roomNum, String name);

}
