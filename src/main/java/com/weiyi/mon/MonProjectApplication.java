package com.weiyi.mon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class MonProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonProjectApplication.class, args);
	}

}
