package com.jing.emperor.common.exception;

/**
 * 行政区划业务异常
 * @author liangjun
 */
public class EmporerOrgException extends Exception{

	private static final long serialVersionUID = 6092962294553649429L;

	public EmporerOrgException() {
		super();
	}

	public EmporerOrgException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public EmporerOrgException(String message, Throwable cause) {
		super(message, cause);
	}

	public EmporerOrgException(String message) {
		super(message);
	}

	public EmporerOrgException(Throwable cause) {
		super(cause);
	}
	
	

}
