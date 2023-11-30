package com.example.GatewaySer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class GatewaySerApplication {
	public static void main(String[] args) {

		SpringApplication.run(GatewaySerApplication.class, args);
	}
}
