import java.io.IOException;

public class LecturaArchivoException extends IOException {
	public LecturaArchivoException(String mensaje) {
		super(mensaje);//invoca al constructor de la clase padre;Y notificar acerca de este error;
	}
}
