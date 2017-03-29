package org.seckill.exception;

public class SeckillCloseException extends RuntimeException {

	public SeckillCloseException() {
		super();
	}

	public SeckillCloseException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SeckillCloseException(String message, Throwable cause) {
		super(message, cause);
	}

	public SeckillCloseException(String message) {
		super(message);
	}

	public SeckillCloseException(Throwable cause) {
		super(cause);
	}

}
