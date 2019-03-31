package com.springrest.demo.entity;

import java.util.Date;

public class StudentErrorResponse {

	private int status;
	private String message;
	private long timestamp;

	public StudentErrorResponse() {
		super();
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long l) {
		this.timestamp = l;
	}

}
