package com.skumar.struts2.action;

public class HelloWorldAction {
	private String message;

	// all struts logic here
	public String execute() {
		setMessage("Hello World!!");
		return "SUCCESS";

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
