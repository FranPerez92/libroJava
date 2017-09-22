package com.ipartek.formacion.javalibro.xml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class ConvertirTXTaXML_FranPerez {

	static final String PATH_FICHERO_TXTAXML = "data\\txtaXML.txt";
	static final String PATH_FICHERO_XMLDETXT = "data\\XMLdeTxt.xml";

	public static void main(String[] args) {

		ArrayList resultados = cargarTxt();
		crearXml(resultados);

	}

	private static ArrayList cargarTxt() {
		
		FileReader fr = null;
		BufferedReader br = null;
		ArrayList campos = new ArrayList();

		try {

			fr = new FileReader(PATH_FICHERO_TXTAXML);
			br = new BufferedReader(fr);

			String linea = "";

			int i = 0;
			while ((linea = br.readLine()) != null) {
				campos.add(linea);
				i++;
			}

			return campos;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// cerrar recursos abiertos
		}
		return null;

	}

	private static void crearXml(ArrayList<String> resultados) {

		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();

			// root element
			Element rootElement = doc.createElement("personas");
			doc.appendChild(rootElement);

			// tipo element
			for (int i = 0; i < resultados.size(); i++) {
				String persona = (String) resultados.get(i);
				Element tipo = doc.createElement("persona");
				tipo.appendChild(doc.createTextNode(persona));
				rootElement.appendChild(tipo);
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

}