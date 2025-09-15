package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.domain.RoleUserEntity;

public interface RoleUserRepository extends JpaRepository<RoleUserEntity, Long> {
	long countByRoleNo(Long roleNo);// 권한별 가입 수
}
