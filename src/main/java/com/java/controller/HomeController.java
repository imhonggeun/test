package com.java.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.service.FileService;
import com.java.service.RoleUserService;

@Controller
public class HomeController {
	
	@Autowired//회원관리
	private RoleUserService roleUserService;
	
	@Autowired
	private FileService fileService;
  
  @GetMapping("/")
  public String home() {
    return "index";
  }
  
  @ResponseBody
  @GetMapping("/role-user/total") //전체 인원 수
  public Map<String, Object> userTotal(){
	  return roleUserService.userTotal();
  }
  
  @ResponseBody
  @GetMapping("/file/total") //전체 파일 수
  public Map<String, Object> fileTotal(){
	  return fileService.fileTotal();
  }

}
