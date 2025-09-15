package com.java.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.repository.RoleUserRepository;

@Service
public class RoleUserServiceImp implements RoleUserService{

	@Autowired
	private RoleUserRepository roleUserRepository;
	
	@Override //전체인원 수
	public Map<String, Object> userTotal() {
        Map<String, Object> result = new HashMap<>();
        long count = roleUserRepository.count(); // 전체 row 수
        result.put("totalUserCount", count);
        return result;
	}

}
