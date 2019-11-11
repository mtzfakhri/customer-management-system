package com.cms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cms.dataaccess.dao.GenericDao;
import com.cms.service.CMSService;

@SpringBootApplication
public class Executive{
	private static final Logger LOGGER = LoggerFactory.getLogger(Executive.class);

 
	public static void main(String[] args) {
		LOGGER.info("Starting logging");
		SpringApplication.run(Executive.class, args);
	}

}
