package com.jing.emperor.common.exception;

/**
 * 车辆业务异常
 * @author liangjun
 */
public class EmporerCarException extends Exception{

	private static final long serialVersionUID = 6092962294553649429L;

	public EmporerCarException() {
		super();
	}

	public EmporerCarException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public EmporerCarException(String message, Throwable cause) {
		super(message, cause);
	}

	public EmporerCarException(String message) {
		super(message);
	}

	public EmporerCarException(Throwable cause) {
		super(cause);
	}
	
	

}
