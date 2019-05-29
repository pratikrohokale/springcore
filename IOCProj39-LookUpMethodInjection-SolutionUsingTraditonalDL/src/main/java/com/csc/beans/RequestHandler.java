package com.csc.beans;

public class RequestHandler {

	private static int count = 0;

	public RequestHandler() {
		count++;
		System.out.println("RequestHandler:0-param constructor--->Count::" + count);
	}

	public void processing(String data) {
		System.out.println("processing request with data " + data);
	}
}
