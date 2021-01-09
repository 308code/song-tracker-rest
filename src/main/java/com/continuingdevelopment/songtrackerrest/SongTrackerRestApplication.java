package com.continuingdevelopment.songtrackerrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SongTrackerRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SongTrackerRestApplication.class, args);
    }

}
