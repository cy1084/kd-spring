package com.game.team1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan
@ServletComponentScan
public class HcyTeam1Application {

	public static void main(String[] args) {
		SpringApplication.run(HcyTeam1Application.class, args);
	}

}
