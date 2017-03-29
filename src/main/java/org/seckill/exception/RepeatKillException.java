package org.seckill.exception;

/**
 * 重复秒杀异常
 * @author Administrator
 *
 */
public class RepeatKillException extends RuntimeException{

	public RepeatKillException() {
		super();
	}

	public RepeatKillException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public RepeatKillException(String message, Throwable cause) {
		super(message, cause);
	}

	public RepeatKillException(String message) {
		super(message);
	}

	public RepeatKillException(Throwable cause) {
		super(cause);
	}

}
