package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableBatchProcessing //배치 기능 활성화
@SpringBootApplication
public class BatchApplication {
	
	public static void main(String[] args) {
//		Logger log = LoggerFactory.getLogger(BatchApplication.class);
//        log.trace(">>>>> This is BactchApplication start -- trace" );
//        log.debug(">>>>> This is BactchApplication start -- debug" );
//        log.info (">>>>> This is BactchApplication start -- info"  );
//        log.warn (">>>>> This is BactchApplication start -- warn"  );
//        log.error(">>>>> This is BactchApplication start -- error" );
		SpringApplication.run(BatchApplication.class, args);
	}

}
