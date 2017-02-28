package edu.nju.hw.service;

import java.util.List;

import edu.nju.hw.model.User;

public interface UserService {
	List<User> findAllUser();
	public boolean isUser(String name);
	public void register(String name,String psd,int role);
	public boolean canLogin(String name,String psd);
	public User getUserInfo(String name,String psd);
	void setVip(int uid);
	void cancelVip(int uid);
	boolean isVip(String vid, String psd);
}
