package com.java.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FileDTO {
	private long no;
	private int service;
	private String origin;
	private String name;
	private String ext;
	private String mediaType;
	private String attachPath;
	private String useYn;
	private long regUserNo;
	private LocalDateTime regDate;
	private long modUserNo;
	private LocalDateTime modDate;
}
