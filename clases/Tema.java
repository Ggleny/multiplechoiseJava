package clases;

import java.util.ArrayList;

public class Tema {
	private String nombre;
	private String descripcion;
	private ArrayList <Pregunta> preguntas;
	
	
	public Tema(String nombre) {
		//super();
		this.nombre = nombre;
	}
	
	public void AgregarPregunta(Pregunta pregunta){
		preguntas.add(pregunta);
		
	}		

}
