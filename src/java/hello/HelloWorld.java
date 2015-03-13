/**
 *  File: HelloWorld.java
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
package hello;

import org.joda.time.LocalTime;

/**
 * @author agupta
 *
 */
public class HelloWorld {

	/**
	 * 
	 */
	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();
	    System.out.println("The current local time is: " + currentTime);

	    Greeter greeter = new Greeter();
	    System.out.println(greeter.sayHello());

	}

}
