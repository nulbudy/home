 package com.demo.exceptions;

/**
 * 
 * @author Autogenerated by Headstart
 * @version 1.0
 *
 */
public class DaoException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3892116817542890495L;
	private String errCode;


	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}


	public DaoException(Exception e)
	{
		super(e.getMessage(),e);
	}
	
/**
 * 
 * @param string
 * @param guimasaage
 */
	public DaoException(String errCode)
    {
      
        this.errCode = errCode;
    
    }
}