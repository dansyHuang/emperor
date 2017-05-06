package com.jing.emperor.common.exception;

/**
 * 行政区划业务异常
 * @author liangjun
 */
public class EmporerUserException extends Exception{

	private static final long serialVersionUID = 6092962294553649429L;

	public EmporerUserException() {
		super();
	}

	public EmporerUserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public EmporerUserException(String message, Throwable cause) {
		super(message, cause);
	}

	public EmporerUserException(String message) {
		super(message);
	}

	public EmporerUserException(Throwable cause) {
		super(cause);
	}
	
	

}
