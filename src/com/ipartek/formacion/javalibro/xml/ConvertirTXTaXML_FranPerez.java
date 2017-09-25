package com.ipartek.formacion.javalibro.xml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.ipartek.formacion.javalibro.colecciones.CargarPersonas;
import com.ipartek.formacion.javalibro.excepciones.PersonaException;
import com.ipartek.formacion.javalibro.pojo.Persona;

public class ConvertirTXTaXML_FranPerez {

	static final String PATH_FICHERO_TXTAXML = "data\\txtaXML.txt";
	static final String PATH_FICHERO_XMLDETXT = "data\\XMLdeTxt.xml";
	
	static final int NUM_CAMPOS_LINEA = 7;
	static final int CAMPOS_NOMBRE = 0;
	static final int CAMPOS_APE1 = 1;
	static final int CAMPOS_APE2 = 2;
	static final int CAMPOS_EDAD = 3;
	static final int CAMPOS_MAIL = 4;
	static final int CAMPOS_DNI = 5;
	static final int CAMPOS_ROL = 6;

	public static void main(String[] args) {

		HashMap<String, Persona> resultados = cargarTxt();
		crearXml(resultados);

	}

	private static HashMap<String, Persona> cargarTxt() {
		
		FileReader fr = null;
		BufferedReader br = null;
		String[] campos;
		Persona p = null;
		HashMap<String, Persona> mapa = new HashMap<String, Persona>();

		try {

			fr = new FileReader(PATH_FICHERO_TXTAXML);
			br = new BufferedReader(fr);

			String linea = "";

			String[] campos1;
			while ((linea = br.readLine()) != null) {

				campos1 = linea.split(",");
				if (campos1.length == NUM_CAMPOS_LINEA) {
					try {
						p = mapeoLinea(campos1);
						mapa.put(p.getDni(), p);
					} catch (Exception e) {
					}
				}
			}

			br.close();
			return mapa;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// cerrar recursos abiertos
		}
		return null;

	}

	private static void crearXml(HashMap<String, Persona> resultados) {

		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();

			// root element
			Element rootElement = doc.createElement("personas");
			doc.appendChild(rootElement);
			
			Element tipo;
			Collection listado = resultados.values();
			
			Iterator it = listado.iterator();
			
			// tipo element
			while(it.hasNext()) {
				Element personaEle = doc.createElement("persona");
				Persona persona = (Persona) it.next();
				tipo = doc.createElement("nombre");
				tipo.appendChild(doc.createTextNode(persona.getNombre()));
				personaEle.appendChild(tipo);
				tipo = doc.createElement("apellido1");
				tipo.appendChild(doc.createTextNode(persona.getApellido1()));
				personaEle.appendChild(tipo);
				tipo = doc.createElement("apellido2");
				tipo.appendChild(doc.createTextNode(persona.getApellido2()));
				personaEle.appendChild(tipo);
				tipo = doc.createElement("edad");
				tipo.appendChild(doc.createTextNode(Integer.toString(persona.getEdad())));
				personaEle.appendChild(tipo);
				tipo = doc.createElement("email");
				tipo.appendChild(doc.createTextNode(persona.getEmail()));
				personaEle.appendChild(tipo);
				tipo = doc.createElement("dni");
				tipo.appendChild(doc.createTextNode(persona.getDni()));
				personaEle.appendChild(tipo);
				tipo = doc.createElement("rol");
				tipo.appendChild(doc.createTextNode(persona.getRol()));
				personaEle.appendChild(tipo);
				rootElement.appendChild(personaEle);
			}
			
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(PATH_FICHERO_XMLDETXT));
			transformer.transform(source, result);

			// Output to console for testing
			StreamResult consoleResult = new StreamResult(System.out);
			transformer.transform(source, consoleResult);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	private static Persona mapeoLinea(String[] campos) throws NumberFormatException, PersonaException {
		
		Persona p = new Persona(campos[CAMPOS_NOMBRE], campos[CAMPOS_APE1], campos[CAMPOS_APE2], campos[CAMPOS_MAIL],
				campos[CAMPOS_DNI], campos[CAMPOS_ROL], Integer.parseInt(campos[CAMPOS_EDAD]));
		return p;
	}

}
