package com.skumar.struts2.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/User")
@ResultPath(value = "/")
public class HelloWorldAction extends ActionSupport {
	private String message;

	@Action(value = "/helloworld", results = { @Result(name = "success", location = "helloworld.jsp") })
	public String execute() {
		setMessage("Hello World!!");
		return "success";

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
