package excepciones;

public class ElementNotAllowedException extends NullPointerException{
	
	public ElementNotAllowedException(String msg)  {
		
		super("[TU SUPEREXCEPTION]: " + msg);
		
	}

}
