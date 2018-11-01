package test;

public class Pregunta {
	private String pregunta;
	private boolean respuesta;
	private int puntaje;
	
	public Pregunta(String pregunta, Boolean respuesta, int puntaje) {
		this.pregunta = pregunta;
		this.respuesta = respuesta;
		this.puntaje = puntaje;
	}

	public String getPregunta(){
		return pregunta;
	}

	public boolean getRespuesta(){
		return respuesta;
	}

	public int getPuntaje(){
		return puntaje;
	}

}
