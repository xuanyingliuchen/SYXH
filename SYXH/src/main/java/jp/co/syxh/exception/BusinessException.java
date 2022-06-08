/*
 * @诗屿星河
 */
package jp.co.syxh.exception;

/**
 * 业务异常.<br>
 * 
 * @author M
 */
public class BusinessException extends Exception {
	//异常信息
	private String message;
	
	//构造方法
	public BusinessException() {
		super();
	}
	public BusinessException(String message) {
		super(message);
	}
}
