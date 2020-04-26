package com.xcx.common.junit;
/**
 * 
 * @ClassName: AssertException 
 * @Description:断言异常类
 * @author: 徐春喜
 * @date: 2020年4月26日 下午7:34:24
 */
public class AssertException extends RuntimeException{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public AssertException(String message) {
		super();
		this.message = message;
	}
	public AssertException() {
		super();
	}
	
}
