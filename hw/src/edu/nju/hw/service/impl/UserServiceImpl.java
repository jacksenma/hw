package edu.nju.hw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.nju.hw.mapper.UserMapper;
import edu.nju.hw.mapper.VipMapper;
import edu.nju.hw.model.User;
import edu.nju.hw.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Resource
	public UserMapper userMapper;
	
	@Resource
	public VipMapper vipMapper;
	
	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		List<User> findAllUser = userMapper.findAllUser();
		return findAllUser;
	}
	@Override
	public boolean isUser(String name) {
		// TODO Auto-generated method stub
//		System.out.println("isUser");
		if(userMapper.selectUserByName(name)==null)
			return false;
		else
			return true;
	}
	@Override
	public void register(String name, String psd,int role) {
		// TODO Auto-generated method stub
		User user=new User();
		user.setName(name);
		user.setPassword(psd);
		user.setRole(role);
		userMapper.addUser(user);
		
	}
	@Override
	public boolean canLogin(String name, String psd) {
		// TODO Auto-generated method stub
		System.out.println(userMapper.selectUserByNP(name, psd));
		if(userMapper.selectUserByNP(name, psd)==null)
			return false;
		else
			return true;
	}
	@Override
	public User getUserInfo(String name, String psd) {
		// TODO Auto-generated method stub
		System.out.println("userInfo:"+name+psd);
		System.out.println(userMapper.selectUserByNP(name, psd));
		return userMapper.selectUserByNP(name, psd);
	}
	@Override
	public void setVip(int uid) {
		// TODO Auto-generated method stub
		userMapper.setUserRole1(uid);
	}
	@Override
	public void cancelVip(int uid) {
		// TODO Auto-generated method stub
		userMapper.updateUserCancelVip(uid);
	}
	@Override
	public boolean isVip(String vid, String psd) {
		// TODO Auto-generated method stub
//		vipMapper.selectVipById(vid).getUid();
		User u=userMapper.selectUserByID(vipMapper.selectVipById(vid).getUid());
		if(u.getPassword().equals(psd)&&u.role==1)
			return true;
		else
			return false;
	}

}
