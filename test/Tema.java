package test;

import java.util.ArrayList;

public class Tema {
	private String nombre;
	private String descripcion;
	private ArrayList <Pregunta> preguntas;
	
	public Tema(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.preguntas = new ArrayList<>();
	}
	
	public void AgregarPregunta(Pregunta pregunta){
		preguntas.add(pregunta);		
	}

	public void ObtenerPregunta(int index){
		preguntas.get(index);		
	}

	public String getNombre(){
		return nombre;
	}
	
	public String getDescripcion(){
		return descripcion;
	}
	
	public ArrayList<Pregunta> getPreguntas(){
		return preguntas;
	}
	
	public void mostrarPreguntas(){
		System.out.println(this.getNombre());
		
		for(Pregunta p: preguntas){
			System.out.println(p.getPregunta() + '\t' + p.getRespuesta() + '\t' + p.getPuntaje());
		}
	}

}