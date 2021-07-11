/*
 Copyright (c) 2021

 All rights reserved.
 */
package com.kumbirai.spring.microservices.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * <p><b>Purpose:</b><br>
 * <br>
 *
 * <p><b>Title:</b> Configuration<br>
 * <br>
 *
 * @author Kumbirai 'Coach' Mundangepfupfu<br>
 * @date 26 May 2021<br>
 * @version 1.0<br>
 *
 * <b>Revision:</b>
 * <br>
 *					
 */
@Component
@ConfigurationProperties("limits-service")
@Data
public class Configuration
{
	private int minimum;
	private int maximum;
}
