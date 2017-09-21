package com.ipartek.formacion.javalibro.xml;

/**
 * Ejercicio para convertir txt a xml
 * 
 * Estructura del xml:
 * 
 * <personas>
 * 	<persona>
 * 		<nombre>
 * 		<apellido1>
 * 		<apellido2>		
 * 		<edad>
 * 		<email>
 * 		<rol>
 * 
 * @author Administrador
 *
 */

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;

public class EscribirPersonasXML {

	public static void main(String[] args) {

		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();

			// crear nodo raiz
			Element rootElement = doc.createElement("personas");
			doc.appendChild(rootElement);
			
			//un arraylist<Persona> a partir de un fichero de texto
			
			//un bucle para todas las personas
			
			//añadir elementos persona al nodo raiz
			Element ePersona = doc.createElement("persona");
				Element eNombre = doc.createElement("nombre");
				eNombre.setTextContent("Ted");
			
				ePersona.appendChild(eNombre);
			rootElement.appendChild(ePersona);
			
			//guardar el fichero
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("data\\personas.xml"));
			transformer.transform(source, result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
