package edu.nju.hw.mapper;

import java.util.List;

public interface PlanMapper {

	void addPlan(String hid, String startDate, String endDate, String bed, String num, double price);
	public List selectAllHostels(String province, String city, String district, String startDate, String endDate,
			double p1, double p2, String level, String key);
	void updatePlanBedNum(int num, String hid, String planStartDate, String planEndDate, String myBed, int planNum,
			double planPrice);
}