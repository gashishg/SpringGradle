/**
 *  File: MessagePrinter.java
 ********************************************************************************
 *  Date        Author                  Changes
 ********************************************************************************
 *  Mar 12, 2015    agupta			         Created
 ********************************************************************************
 * Copyright (c) 2002 Synapse Group, Inc.
 * 5 High Ridge Park, Stamford, Connecticut, 06905-1325, U.S.A.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Synapse Group, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the licence agreement you entered
 * into with Synapse Group, Inc.
 */
package java.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author agupta
 *
 */

@Component
public class MessagePrinter {

    final private MessageService service;

    @Autowired
    public MessagePrinter(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}