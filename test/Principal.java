package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import gui.InitFrame;
import gui.QuestionFrame;
import utilidades.Utilidades;

public class Principal {
	
	public static void main(String[] args) {
		ArrayList<Tema> temas = new ArrayList<>();
		List<Object> tpreg = Utilidades.LeerArchivoCSV("T:/IOO/files/preguntas.csv");

		/*Cargo Temas*/
		List<Object> taux = Utilidades.LeerArchivoCSV("T:/IOO/files/temas.csv");
		Tema tsave;
		
		for (Object object : taux) {
			String nombreTema = ((ArrayList<String>)object).get(0);
			tsave = new Tema(nombreTema,((ArrayList<String>)object).get(1));
			for (Object preg : tpreg) {
				ArrayList<String> p = ((ArrayList<String>)preg);
				String temaDePregunta = p.get(0);
				//System.out.println("NOMBRE TEMA:"+nombreTema+" = "+temaDePregunta);
				if(nombreTema.equals(temaDePregunta)){
					
					tsave.AgregarPregunta( new Pregunta(p.get(1), Boolean.valueOf(p.get(2)), Integer.valueOf(p.get(3))) );
				}
			}
			temas.add(tsave);
		}
		
		InitFrame v = new InitFrame(temas);
		v.setVisible(true);
		v.pack();
	}

//	
//	private Map<String,Object> dtoTema(Tema tema){
//		Map<String,Object> dto = new LinkedHashMap<>();
//		dto.put("tema", tema.getNombre());
//		dto.put("descripcion", tema.getDescripcion());
//		dto.put("preguntas", tema.getPreguntas().stream().map(p->dtoPregunta(p)).collect(Collectors.toList()));
//		return dto;
//	}
//
//	private Map<String,Object> dtoPregunta(Pregunta pregunta){
//		Map<String,Object> dto = new LinkedHashMap<>();
//		dto.put("pregunta", pregunta.getPregunta());
//		dto.put("respuesta", pregunta.getRespuesta());
//		dto.put("puntaje", pregunta.getPuntaje());
//		return dto;
//	}
}
