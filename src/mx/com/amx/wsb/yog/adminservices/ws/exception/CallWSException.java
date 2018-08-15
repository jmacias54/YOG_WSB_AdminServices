/**
 * 
 */
package mx.com.amx.wsb.yog.adminservices.ws.exception;

/**
 * @author Jesus A. Macias Benitez
 *
 */
public class CallWSException extends Exception {

	private static final long serialVersionUID = 1L;

	public CallWSException() {
		super();
	}

	public CallWSException(String message, Throwable cause) {
		super(message, cause);
	}

	public CallWSException(String message) {
		super(message);
	}

	public CallWSException(Throwable cause) {
		super(cause);
	}

}
