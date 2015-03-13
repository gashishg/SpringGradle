/**
 *  File: Application.java
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

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

/**
 * @author agupta
 *
 */
@Configuration
@ComponentScan
public class Application {	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				Application.class);
		MessagePrinter printer = context.getBean(MessagePrinter.class);
		printer.printMessage();

	}

	@Bean
	MessageService mockMessageService() {
		return new MessageService() {
			public String getMessage() {
				return "Hello World!";
			}
		};
	}

}
