package com.aqhi.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aqhi.mapper.UUserRoleMapper;
import com.aqhi.model.UUserRole;
import com.aqhi.service.UUserRoleService;

@Service("userRoleService")
public class UUserRoleServiceImpl implements UUserRoleService {
	
	@Resource
	UUserRoleMapper userRoleMapper;

	@Override
	public List<UUserRole> selectUserRolesByUid(Long uid) {
		
		System.out.println("------selectUserRolesByUid");
		return userRoleMapper.selectUserRolesByUid(uid) ;
	}

}
