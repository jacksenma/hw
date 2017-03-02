package edu.nju.hw.mapper;

import java.util.List;

import edu.nju.hw.model.Hcheck;

public interface HcheckMapper {

	Hcheck getHcheck(String hid, String nowDate);
	
	List getAllHcheckByHid(String hid);

	void insertOrderNum(String hid, String nowDate, int rootNum);

	void updateOrderNum(String hid, String nowDate,int rootNum);

	void insertCancelNum(String hid, String nowDate, int rootNum);

	void updateCancelNum(String hid, String nowDate, int rootNum);

	void insertEnterNum(String hid, String nowDate, int rootNum);

	void updateEnterNum(String hid, String nowDate, int rootNum);
	
	void insertLeaveNum(String hid, String nowDate, int rootNum);

	void updateLeaveNum(String hid, String nowDate, int rootNum);
	
}