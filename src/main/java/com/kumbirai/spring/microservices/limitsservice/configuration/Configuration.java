/*
 Copyright (c) 2021

 All rights reserved.
 */
package com.kumbirai.spring.microservices.limitsservice.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * <p><b>Purpose:</b><br>
 * <br>
 *
 * <p><b>Title:</b> Configuration<br>
 * <br>
 *
 * @author Kumbirai 'Coach' Mundangepfupfu<br>
 * @version 1.0<br>
 *
 * <b>Revision:</b>
 * <br>
 */
@Component
@ConfigurationProperties("limits-service")
@Data
public class Configuration
{
    private int minimum;
    private int maximum;
}
