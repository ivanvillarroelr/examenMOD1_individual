package junit.test.cases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import principal.Electrodomestico;
import principal.Lavadora;
import principal.Television;

/**
 * <p> Test para revisar los metodos importantes de la clase Television</p>
 * @author ivillarroelr
 *
 */
class testTelevision {

	/**
	 * <p> Permite revisar si el precio final evaluado del metodo corresponde al evaluado por humano </p>
	 */
	@Test
	void pruebaPrecioFinal() {

		/*
		 * resolucion: 30
		 * sintonizadorTDT: true
		 * PrecioBase: 555
		 * Color: "blanco"
		 * consumoEnergetico: 'C'
		 * peso: 100
		 */
		
		/*
		 * 555+(por consumo C)60+(por peso 100) 100 + 50 por sintonizadorTDT = 765
		 */
		
		Electrodomestico elec = new Television(30, true, 555, "blanco", 'C', 100);
		
		assertEquals(765,elec.precioFinal());
		
	}
	
	/** 
	 * <p> Permite evaluar si el color evaluado por el metodo equivale al evaluado por humano </p>
	 */
	@Test
	
	void pruebaColor1() {
		
		/*
		 * resolucion: 30
		 * sintonizadorTDT: true
		 * PrecioBase: 555
		 * Color: "blanco"
		 * consumoEnergetico: 'C'
		 * peso: 100
		 */
		
		
		
		Electrodomestico elec = new Television(30, true, 555, "azul", 'C', 100);
		
		/*
		 * Por color "azul" deberia dar "AZUL"
		 */
		
		assertEquals("AZUL", elec.getColor());
		

		
	}

	/** 
	 * <p> Permite evaluar si el color evaluado por el metodo equivale al evaluado por humano </p>
	 */
	@Test
	
	void pruebaColor2() {
		
		/*
		 * resolucion: 30
		 * sintonizadorTDT: true
		 * PrecioBase: 555
		 * Color: "blanco"
		 * consumoEnergetico: 'C'
		 * peso: 100
		 */
		
		
		
		Electrodomestico elec2 = new Television(30, true, 555, "platinado", 'C', 100);
		
		/*
		 * Por color "platinado" deberia dar "BLANCO"
		 */
		
		assertEquals("BLANCO", elec2.getColor());
		
	}

}
