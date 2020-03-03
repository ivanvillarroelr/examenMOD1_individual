package junit.test.cases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import principal.Electrodomestico;

/**
 * <p> Test para revisar los metodos importantes de la clase Electrodomestico</p>
 * @author ivillarroelr
 *
 */
class testElectrodomestico {
	
	/**
	 * <p> Permite revisar si el precio final evaluado del metodo corresponde al evaluado por humano </p>
	 */

	@Test
	void pruebaPrecioFinal() {
		
		/*
		 * PrecioBase: 150
		 * Color: "RoJo"
		 * consumoEnergetico: 'B'
		 * peso: 40
		 */
		
		/*
		 * 150+(por consumo B)80+(por peso 40) 50 = 280
		 */
		
		Electrodomestico elec = new Electrodomestico(150, "RoJo", 'B',40);
		
		assertEquals(280,elec.precioFinal());
		
	}
	
	
	/** 
	 * <p> Permite evaluar si el color evaluado por el metodo equivale al evaluado por humano </p>
	 */
	@Test
	
	void pruebaColor1() {
		
		/*
		 * PrecioBase: 150
		 * Color: "RoJo"
		 * consumoEnergetico: 'B'
		 * peso: 40
		 */
		
		/*
		 * Por color "RoJo" deberia dar "ROJO"
		 */
		
		Electrodomestico elec = new Electrodomestico(150, "RoJo", 'B',40);
		
		assertEquals("ROJO", elec.getColor());
		

		
	}

	/** 
	 * <p> Permite evaluar si el color evaluado por el metodo equivale al evaluado por humano </p>
	 */
	@Test
	
	void pruebaColor2() {
		
		/*
		 * PrecioBase: 150
		 * Color: "RoJo"
		 * consumoEnergetico: 'B'
		 * peso: 40
		 */
		
		/*
		 * Por color "Fuccia" deberia dar "BLANCO"
		 */
		
		Electrodomestico elec2 = new Electrodomestico(150, "Fuccia", 'B',40);
		
		assertEquals("BLANCO", elec2.getColor());
		
	}
}
