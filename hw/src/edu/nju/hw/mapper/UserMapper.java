package edu.nju.hw.mapper;

import java.util.List;

import edu.nju.hw.model.User;

public interface UserMapper {
	List<User> findAllUser();
	public User selectUserByID(int id);
	public List selectUsers(String name);
	public User selectUserByName(String name);
	public void addUser(User user);
	public User selectUserByNP(String name,String psd);
	public void updateUser(User user);
	public void deleteUser(int id);
	void setUserRole1(int uid);
	void updateUserCancelVip(int uid);
}
