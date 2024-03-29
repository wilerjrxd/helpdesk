package com.wilerjr.helpdesk.api.response;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.wilerjr.helpdesk.api.entity.User;

public class Response<T> {

	private T data;
	private List<String> errors;
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	public T getDataOptional() {
		return data;
	}
	public void setDataOptional(Optional<User> user) {
		this.data = (T) user;
	}
	
	public List<String> getErrors() {
		if (this.errors == null) {
			this.errors = new ArrayList<String>();
		}
		return errors;
	}
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	
	
	
}
