package com.github.sullis.dropwizard.helloworld.api;

import java.util.Date;

public class Message {
	private String text;
	private Date timestamp = new Date();

	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getText() {
		return text;
	}

	public void setText(String s) {
		text = s;
	}

}
