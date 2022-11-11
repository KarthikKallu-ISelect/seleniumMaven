package com.iselect.tests;

import java.io.File;

import org.testng.annotations.Test;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppiumCode {

	
	String appiumServerPath="C:\\Users\\karthikreddy.kallu\\AppData\\Local\\Programs\\Appium Server GUI\\resources\\app\\node_modules\\appium\\build\\lib\\main.js";
	String nodeExe="C:\\Program Files\\nodejs\\node.exe";
	AppiumDriverLocalService service;
	int portno=4723;
	@Test
	public void startServer()
	{
		 service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingDriverExecutable(new File(nodeExe))
				 .withAppiumJS(new File(appiumServerPath)).withIPAddress("127.0.0.1").withArgument(GeneralServerFlag.BASEPATH,"/wd/hub/")
				 .usingPort(portno));
		 service.start();
	}
}
