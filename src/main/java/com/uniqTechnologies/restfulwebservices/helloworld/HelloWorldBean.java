package com.uniqTechnologies.restfulwebservices.helloworld;

public class HelloWorldBean {

	private String message;

	public HelloWorldBean(String message) {
		super();
		this.message = message;
	}

	// By default setter and getter will be present bcz the auto bean to json
	// conversion will be happened
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

}
