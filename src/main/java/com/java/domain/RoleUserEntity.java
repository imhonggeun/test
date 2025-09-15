package com.java.domain;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="role_user")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class RoleUserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "no")
	private long no;
	
	@Column(name = "roleNo" , nullable = true)
	private long roleNo;
	
	@Column(name = "userNo" , nullable = true)
	private long userNo;
	
	@Column(name = "useYn" , nullable = true)
	private String useYn;
	
	@Column(name = "regUserNo" , nullable = false)
	private long regUserNo;
	
	@CreationTimestamp
	@Column(name = "regDate" , nullable = true)
	private LocalDateTime regDate;
	
	@Column(name = "modUserNo" , nullable = false)
	private long modUserNo;
	
	@UpdateTimestamp
	@Column(name = "modDate" , nullable = false)
	private LocalDateTime modDate;
	
}
