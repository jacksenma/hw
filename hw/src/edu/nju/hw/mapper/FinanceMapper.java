package edu.nju.hw.mapper;

import java.util.List;

import edu.nju.hw.model.Finance;
import edu.nju.hw.model.VipFinance;

public interface FinanceMapper {
	public Finance getFinanceByDate(String date,String roleId);

	public void insertFinance(String vid, double double2, String date);

	public void updateFinance(String vid, double double2, String date);

	public void insertVipFinance(String vid, double price, String time, String remark, int state);

	public List getFinanceByRoleId(String id);

	public List<VipFinance> findVipFinanceByDate();
}
