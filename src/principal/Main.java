package principal;

import principal.Electrodomestico;
import principal.Lavadora;
import principal.Television;

/**
 * <p> Se genera un arreglo de Electrodomesticos, Se instancian 10 objetos Electrodomesticos 
 * (Superclase Electrodomestico, Lavadoras, Televisiones) y se agregan al arreglo
 * Posterior a ello se recorre este, rescatando por cada objeto su precio final. 
 * Se calculan los precios totales por tipo de objeto  </p>
 * 
 * @author ivillarroelr
 *
 */

public class Main {
	
	public static void main(String[] args) {
		
		/**
		 * @param arreglo Arreglo de 10 objetos tipo Electrodomestico
		 */
		
		Electrodomestico[] arreglo = new Electrodomestico[10];
		
		arreglo[0] = new Lavadora(10,500,"rojo",'D',150);
		arreglo[1] = new Television(30, true, 555, "blanco", 'C', 100);
		arreglo[2] = new Electrodomestico(150, "RoJo", 'B',40);
		arreglo[3] = new Lavadora(12,350,"azul",'F',130);
		arreglo[4] = new Television(35, false, 666, "azulado", 'F', 120);
		arreglo[5] = new Electrodomestico(140, "AzUL", 'C',50);
		arreglo[6] = new Lavadora(11,400,"verde",'G',120);
		arreglo[7] = new Television(44, true, 777, "amarillo", 'A', 130);
		arreglo[8] = new Electrodomestico(130, "AmAriLlo", 'D',60);
		arreglo[9] = new Lavadora(17,550,"morado",'H',190);
		
		System.out.println("EJEMPLOS DE LAVADORAS: ");
		for(int i=0; i<arreglo.length;i++) {
			
			if(arreglo[i] instanceof Lavadora) {
				System.out.println("Indice: "+i+" el precio final del objeto es: "+arreglo[i].precioFinal());
			}
		}
		
		System.out.println("\nEJEMPLOS DE TELEVISORES: ");
		for(int i=0; i<arreglo.length;i++) {
			
			if(arreglo[i] instanceof Television) {
				System.out.println("Indice: "+i+" el precio final del objeto es: "+arreglo[i].precioFinal());
			}
		}
		
		System.out.println("\nEJEMPLOS DE SUPERCLASE ELECTRODOMESTICOS: ");
		for(int i=0; i<arreglo.length;i++) {
			
			if(arreglo[i] instanceof Electrodomestico & !(arreglo[i] instanceof Lavadora) & !(arreglo[i] instanceof Television)) {
				System.out.println("Indice: "+i+" el precio final del objeto es: "+arreglo[i].precioFinal());
			}
		}
		
		/**
		 * @param precioFinalLavadoras Permite acumular el precio de las lavadoras
		 * @param precioFinalTelevisores Permite acumular el precio de los televisores
		 * @param precioFinalElectrodomesticos Permite acumular el precio de los objetos de superclase Electrodomesticos
		 */
		
		int precioFinalLavadoras = 0;
		int precioFinalTelevisores = 0;
		int precioFinalElectrodomesticos = 0;
		
		for(int i=0; i<arreglo.length;i++) {
			
			if(arreglo[i] instanceof Lavadora) {
				
				precioFinalLavadoras += arreglo[i].precioFinal();
				
			}
		}
		
		System.out.println("\n \nPrecio total de lavadoras: "+precioFinalLavadoras);
		
		
		for(int i=0; i<arreglo.length;i++) {
			
			if(arreglo[i] instanceof Television) {
				
				precioFinalTelevisores += arreglo[i].precioFinal();
				
			}
		}
		
		System.out.println("Precio total de televisores: "+precioFinalTelevisores);
		
		
		for(int i=0; i<arreglo.length;i++) {
			
			if(arreglo[i] instanceof Electrodomestico & !(arreglo[i] instanceof Lavadora) & !(arreglo[i] instanceof Television)) {
				
				precioFinalElectrodomesticos += arreglo[i].precioFinal();
				
			}
		}
		
		System.out.println("Precio total de electrodomesticos generales(superclase): "+precioFinalElectrodomesticos);
		
		System.out.println("Sumatoria de precios: "+(int)(precioFinalLavadoras+precioFinalTelevisores+precioFinalElectrodomesticos));
	}
}
