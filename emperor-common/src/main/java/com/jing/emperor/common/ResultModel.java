package com.jing.emperor.common;

import java.io.Serializable;

/**
 * 返回结果包装，无分页
 * @author liangjun
 *
 */
public class ResultModel<T> implements Serializable {

	private static final long serialVersionUID = 6425447893977072805L;
	
	private T value;
	
	private String errorMsg;
	
	private boolean succces=true;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public boolean isSuccces() {
		return succces;
	}

	public void setSuccces(boolean succces) {
		this.succces = succces;
	}

}
