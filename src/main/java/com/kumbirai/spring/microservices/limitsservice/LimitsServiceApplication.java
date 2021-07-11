package com.kumbirai.spring.microservices.limitsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.kumbirai.rest.webservices.exception.CustomizedResponseEntityExceptionHandler;

@SpringBootApplication
@Import(
{ CustomizedResponseEntityExceptionHandler.class })
public class LimitsServiceApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(LimitsServiceApplication.class, args);
	}
}
