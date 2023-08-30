package com.game.team1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class HcyTeam1Application {

	public static void main(String[] args) {
		SpringApplication.run(HcyTeam1Application.class, args);
	}

}
