package com.example;

import com.example.dao.PlayerMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlayerMapper mapper;

	public static void main(String[] args) {
	  SpringApplication.run(DemoApplication.class, args);
	}

	public void run(String...args) throws Exception{

	    mapper.findPlayersByMatchId(1267).forEach(t -> {
	        logger.info(t.getPlayerName());
        });
    }
}
