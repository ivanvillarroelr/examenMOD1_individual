package junit.test.cases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import principal.Electrodomestico;
import principal.Lavadora;

/**
 * <p> Test para revisar los metodos importantes de la clase Lavadora</p>
 * @author ivillarroelr
 *
 */
class testLavadora {

	/**
	 * <p> Permite revisar si el precio final evaluado del metodo corresponde al evaluado por humano </p>
	 */
	@Test
	void pruebaPrecioFinal() {
		
		/*
		 * carga: 10
		 * PrecioBase: 500
		 * Color: "rojo"
		 * consumoEnergetico: 'D'
		 * peso: 150
		 */
		
		/*
		 * 500+(por consumo D)50+(por peso 40) 100 + 50 por peso de lavadora = 700
		 */
		
		Electrodomestico elec = new Lavadora(10,500,"rojo",'D',150);
		
		assertEquals(700,elec.precioFinal());
		
	}
	
	/** 
	 * <p> Permite evaluar si el color evaluado por el metodo equivale al evaluado por humano </p>
	 */
	@Test
	
	void pruebaColor1() {
		
		/*
		 * carga: 10
		 * PrecioBase: 500
		 * Color: "rojo"
		 * consumoEnergetico: 'D'
		 * peso: 150
		 */
		
		
		Electrodomestico elec = new Lavadora(10,500,"rojo",'D',150);
		
		/*
		 * Por color "rojo" deberia dar "ROJO"
		 */
		
		assertEquals("ROJO", elec.getColor());
		

		
	}

	/** 
	 * <p> Permite evaluar si el color evaluado por el metodo equivale al evaluado por humano </p>
	 */
	@Test
	
	void pruebaColor2() {
		
		/*
		 * carga: 10
		 * PrecioBase: 500
		 * Color: "rojo"
		 * consumoEnergetico: 'D'
		 * peso: 150
		 */
		
		
		Electrodomestico elec2 = new Lavadora(10,500,"magenta",'D',150);
		
		/*
		 * Por color "magenta" deberia dar "BLANCO"
		 */
		
		assertEquals("BLANCO", elec2.getColor());
		
	}
}

