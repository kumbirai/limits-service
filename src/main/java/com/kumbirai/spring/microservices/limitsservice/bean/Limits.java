/*
 Copyright (c) 2021

 All rights reserved.
 */
package com.kumbirai.spring.microservices.limitsservice.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p><b>Purpose:</b><br>
 * <br>
 *
 * <p><b>Title:</b> Limits<br>
 * <br>
 *
 * @author Kumbirai 'Coach' Mundangepfupfu<br>
 * @version 1.0<br>
 *
 * <b>Revision:</b>
 * <br>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Limits
{
    private int minimum;
    private int maximum;
}
