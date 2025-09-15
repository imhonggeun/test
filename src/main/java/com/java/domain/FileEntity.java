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
@Table(name="file")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class FileEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="no", nullable = true)
	private long no;
	
	@Column(name="service", nullable= true)
	private int service;
	
	@Column(name="origin", nullable= true)
	private String origin;
	
	@Column(name="name", nullable= true)
	private String name;
	
	@Column(name="ext", nullable= true)
	private String ext;
	
	@Column(name="mediaType", nullable= true)
	private String mediaType;
	
	@Column(name="attachPath", nullable= true)
	private String attachPath;
	
	@Column(name="useYn", nullable= true)
	private String useYn;
	
	@Column(name="regUserNo", nullable= true)
	private long regUserNo;
	
	@CreationTimestamp
	@Column(name="regDate", nullable= true)
	private LocalDateTime regDate;
	
	@Column(name="modUserNo", nullable= true)
	private long modUserNo;
	
	@UpdateTimestamp
	@Column(name="modDate", nullable= true)
	private LocalDateTime modDate;

}
