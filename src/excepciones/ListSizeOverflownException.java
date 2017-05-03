package excepciones;

public class ListSizeOverflownException extends RuntimeException {
	
	public ListSizeOverflownException(String msg)  {
		
		super("[TU SUPEREXCEPTION]: " + msg);
		
	}

}
