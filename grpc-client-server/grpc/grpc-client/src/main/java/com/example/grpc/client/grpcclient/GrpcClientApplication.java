package com.example.grpc.client.grpcclient;
import org.apache.logging.log4j.LogManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class GrpcClientApplication {
	public static final Logger logger = (Logger) LogManager.getLogger(GrpcClientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GrpcClientApplication.class, args);
	}

}
