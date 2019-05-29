package com.csc.listner;

import java.time.Duration;
import java.time.LocalTime;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class IOCContainerMonitoringListener implements ApplicationListener<ApplicationEvent> {

	private LocalTime start = null, end = null;

	@Override
	public void onApplicationEvent(ApplicationEvent ae) {
		if (ae.toString().indexOf("RefreshedEvent") != -1) {
			System.out.println("IOCcontainer is started at::" + LocalTime.now());
			start = LocalTime.now();
		} else if (ae.toString().indexOf("ClosedEvent") != -1) {
			System.out.println("IOCcontainer is stopped at::" + LocalTime.now());
			end = LocalTime.now();
			System.out.println("IOC container was running for " + Duration.between(start, end).getNano() + " ns.");
		}
	}

}
