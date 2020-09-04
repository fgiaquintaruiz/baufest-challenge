package com.baufest.ingreso.arrays;

import com.baufest.ingreso.sorting.Jugador;
import com.baufest.ingreso.sorting.Sorting;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArraysTest {
	
	@Test
	public void test() {

		List<String> peliculas = new ArrayList<String>();
		peliculas.add("La invasión de los usurpadores de cuerpos");
		peliculas.add("El día que paralizaron la Tierra");
		peliculas.add("Alien");
		peliculas.add("El Enigma de Otro Mundo");
		peliculas.add("El arribo");
		CicloDeCharlas ciclo = new CicloDeCharlas("Visitantes", new Date(2020, 8, 22), peliculas);
		System.out.println(ciclo.toString());
	}

	@Test
	public void testBisiesto() {

		List<String> peliculas = new ArrayList<String>();
		peliculas.add("La invasión de los usurpadores de cuerpos");
		peliculas.add("El día que paralizaron la Tierra");
		peliculas.add("Alien");
		peliculas.add("El Enigma de Otro Mundo");
		peliculas.add("El arribo");
		CicloDeCharlas ciclo = new CicloDeCharlas("Visitantes", new Date(2020, 1, 24), peliculas);
		System.out.println(ciclo.toString());
	}

	@Test
	public void testBisiestoConEspectadores() {

		List<String> peliculas = new ArrayList<String>();
		peliculas.add("La invasión de los usurpadores de cuerpos");
		peliculas.add("El día que paralizaron la Tierra");
		peliculas.add("Alien");
		peliculas.add("El Enigma de Otro Mundo");
		peliculas.add("El arribo");
		CicloDeCharlas ciclo = new CicloDeCharlas("Visitantes", new Date(2020, 1, 24), peliculas);
		ciclo.registrarEspectador(1, "Fabio");
		ciclo.registrarEspectador(1, "Fabio");
		ciclo.registrarEspectador(1, "Fabio");
		ciclo.registrarEspectador(1, "Cesar");
		ciclo.registrarEspectador(1, "Cesar");
		ciclo.registrarEspectador(2, "Cesar");
		ciclo.registrarEspectador(3, "Cesar");
		System.out.println(ciclo.toString());
	}




}
