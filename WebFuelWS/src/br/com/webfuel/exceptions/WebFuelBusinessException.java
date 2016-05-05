package br.com.webfuel.exceptions;

public class WebFuelBusinessException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2689410247153590007L;

	public WebFuelBusinessException(String message) {
        super("This operation throws a business ERROR:\n" +message);
    }
}
