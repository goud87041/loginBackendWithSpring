package com.login.jdbcConnectivity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.servletComponentScan;

@SpringBootApplication
@servletComponentScan
public class JdbcConnectivityApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(JdbcConnectivityApplication.class, args);
	}

}
