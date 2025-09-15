package com.java.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.repository.FileRepository;

@Service
public class FileServiceImp implements FileService{
	
	@Autowired
	private FileRepository fileRepository;
	
	@Override
	public Map<String, Object> fileTotal() {
		Map<String, Object> result = new HashMap<>();
		long count = fileRepository.count();
		result.put("fileTotal", count);
		return result;
	}

}
