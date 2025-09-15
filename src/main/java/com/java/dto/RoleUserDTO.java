package com.java.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoleUserDTO {

	private long no;
	private long roleNo;
	private long userNo;
	private String useYn;
	private long regUserNo;
	private LocalDateTime regDate;
	private long modUserNo;
	private LocalDateTime modDate;

}
