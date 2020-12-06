package com.congandelly.hotalkbackend.mapper.user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.congandelly.hotalkbackend.model.user.UserMaster;

@Mapper
public interface UserMasterMapper {
	
	public List<UserMaster> selectAll();
	
	public UserMaster selectOne(String userId);
	
	public void insertUser(String userId);
	
	public void updateUser(String userId);
	
	public void deleteUser(String user_id);
	
}
