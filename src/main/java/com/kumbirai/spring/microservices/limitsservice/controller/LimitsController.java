/*
 Copyright (c) 2021

 All rights reserved.
 */
package com.kumbirai.spring.microservices.limitsservice.controller;

import com.kumbirai.spring.microservices.limitsservice.bean.Limits;
import com.kumbirai.spring.microservices.limitsservice.configuration.Configuration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p><b>Purpose:</b><br>
 * <br>
 *
 * <p><b>Title:</b> LimitsController<br>
 * <br>
 *
 * @author Kumbirai 'Coach' Mundangepfupfu<br>
 * @version 1.0<br>
 *
 * <b>Revision:</b>
 * <br>
 * @date 26 May 2021<br>
 */
@RestController
public class LimitsController
{
    private static final Logger LOGGER = LogManager.getLogger(LimitsController.class.getName());

    @Autowired
    private Configuration configuration;

    /**
     * Constructor:
     */
    public LimitsController()
    {
        super();
        LOGGER.trace("LimitsController.CONSTRUCTOR");
    }

    /**
     * Purpose:<br>
     * <br>
     * retrieveLimits<br>
     * <br>
     *
     * @return<br> <br>
     */
    @GetMapping("/limits")
    public Limits retrieveLimits()
    {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
