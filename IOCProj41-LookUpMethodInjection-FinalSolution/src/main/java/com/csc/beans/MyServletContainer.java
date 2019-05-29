package com.csc.beans;

public abstract class MyServletContainer {

	public abstract RequestHandler getHandler();

	public MyServletContainer() {
		System.out.println("MyServletContainer:0-param  constructor");
	}

	
	public void handleRequest(String data) {
		RequestHandler handler = null;
		handler = getHandler();
		System.out.println("MyServletCotainer is ready to handle the request");
		handler.processing(data);

	}

}
