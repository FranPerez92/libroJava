package com.ipartek.formacion.javalibro.xml;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.ipartek.formacion.javalibro.pojo.Cancion;

/**
 * Ejercicio para aprender a leer o parsear un documento .XML
 * @author ur00
 *
 */
public class LeerPeliculasXML {

	static final String PELICULAS_XML = "data\\peliculas.xml";
	static ArrayList<Cancion> peliculas = null;
	
	public static void main(String[] args) {
	
		peliculas = new ArrayList<Cancion>();
		
		System.out.println("Listado Peliculas");
		System.out.println("---------------------------------");
		
		//parsear el fichero XML
		try {
			File file = new File(PELICULAS_XML);
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = factory.newDocumentBuilder();
	        Document doc = dBuilder.parse(file);	        
	        doc.getDocumentElement().normalize();
	        //System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

	        NodeList nPeliculas = doc.getElementsByTagName("pelicula");
	        Cancion c = null;
	        Element element = null;
	        for ( int i=0; i < nPeliculas.getLength() ; i++ ) {	        
	        	
	        	element = (Element)nPeliculas.item(i);
	        		        	
	        	String tipo = String.valueOf(element.getAttribute("tipo"));
	        	String anyo = String.valueOf(element.getAttribute("año"));
	        	String titulo = element.getElementsByTagName("titulo")
	                    				.item(0)
	                    				.getTextContent();
	        	String guionista = element.getElementsByTagName("guionista")
        				.item(0)
        				.getTextContent();
	        	String productor = element.getElementsByTagName("productor")
        				.item(0)
        				.getTextContent();
	        	
	        	c = new Cancion(titulo, guionista, productor, tipo, anyo);
	        	peliculas.add(c);
	        	
	        }
	        
	        
	        
		}catch (Exception e) {
			e.printStackTrace();
		}  
         
		
		//mostrar Cancion por pantalla
		for(Cancion c : peliculas) {
			System.out.println("Pelicula " + c.getId());
			System.out.println("    Titulo: " + c.getNombre());
			System.out.println("    Guionista: " + c.getArtista());
			System.out.println("    Productor: " + c.getDuracion());
			System.out.println("    Tipo: " + c.getTipo());
			System.out.println("    Año: " + c.getAnyo());
			System.out.println("");			
		}
		
		

	}

}