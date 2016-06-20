package com.department.serviceName.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.department.serviceName.util.FileUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class ServiceDao {
	@Autowired
	private FileUtil fileUtil;
	
	public void checkFileUtil() {
		if (fileUtil == null) {
			log.error("FileUtil is null");
		} else {
			log.info(fileUtil.toString());
		}
	}
}
