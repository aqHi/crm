package com.aqhi.service;

import java.util.List;

import com.aqhi.model.UUserRole;

public interface UUserRoleService {
	List<UUserRole> selectUserRolesByUid(Long uid);
}
