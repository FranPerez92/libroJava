package com.ipartek.formacion.javalibro.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Nos conectaremos a una web para descargar el codigo fuente
 * https://www.example.com/
 * 
 * @author Administrador
 *
 */
public class ConectarPaginaWeb {

	public static void main(String[] args) {

		final String PAGINA_WEB = "https://www.example.com/";

		try {
			URL url = new URL(PAGINA_WEB);
			URLConnection con = url.openConnection();

			InputStreamReader isr = new InputStreamReader(con.getInputStream());
			BufferedReader br = new BufferedReader(isr);

			String linea = "";
			/*
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);

			}
			*/

			/*
			 * while ((linea = br.readLine()) != null) {
			 * 
			 * // conseguir h1 if (linea.indexOf("<h1>") != -1) { System.out.println(linea);
			 * } }
			 */

			while ((linea = br.readLine()) != null) {

				if (linea.indexOf("<a") != -1) {
					String[] lineaSeparada = linea.split("\"");
					System.out.println(lineaSeparada[1]);
				}
			}
			
			URL url2 = new URL("http://www.iana.org/domains/example");
			URLConnection co = url2.openConnection();
			co.connect();
			
			InputStreamReader isr2 = new InputStreamReader(co.getInputStream());
			BufferedReader br2 = new BufferedReader(isr2);
			
			while ((linea = br2.readLine()) != null) {

				System.out.println(linea);
				
			}

		} catch (MalformedURLException e) {
			System.out.println("URL mal escrita");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("No podemos establecer conexion");
			e.printStackTrace();
		}
	}

}
