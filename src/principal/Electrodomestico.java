package principal;

/**
 * <p> Clase Electrodomestico que permite heredar a clases hijas metodos y atributos de este tipo 
 * de objeto </p>
 * @author ivillarroelr
 *
 */
public class Electrodomestico {
	
	/*
	 * Constantes 
	 */
	
	/**
	 * @param PRECIO_BASE Constante precio base 
	 * @param PESO_BASE Constante peso base 
	 * @param CONSUMO_ENERGETICO_BASE Constante consumo energetico base
	 * @param COLOR_BASE Constante de color base para el objeto
	 */
	
	final int PRECIO_BASE = 100000;
	final int PESO_BASE = 5;
	final char CONSUMO_ENERGETICO_BASE = 'F';
	final String COLOR_BASE = "BLANCO";
	
	/*
	 * Variables de instancia
	 */
	
	/**
	 * @param precioBase variable de instancia que recibe el precio base definido por usuario
	 * @param color variable de instancia que recibe el color definido por usuario
	 * @param consumoEnergetico variable de instancia que recibe el consumo energetico definido por usuario
	 * @param peso variable de instancia que recibe el peso definido por usuario
	 */
	
	int precioBase;
	String color;
	char consumoEnergetico;
	int peso;
	

	/**
	 * <p> Constructor por defecto, que asume los atributos por defecto almacenados en las constantes</p>
	 */
	public Electrodomestico() {
		this.color = this.COLOR_BASE;
		this.consumoEnergetico = this.CONSUMO_ENERGETICO_BASE;
		this.precioBase = this.PRECIO_BASE;
		this.peso = this.PESO_BASE;	
	}
	
	/**
	 * <p> Constructor parametrizado parcial que recibe valores de precioBase y peso y asume los demas por defecto</p>
	 * @param precioBase variable que recibe el precio base definido por usuario
	 * @param peso variable que recibe el peso definido por usuario
	 */
	public Electrodomestico(int precioBase, int peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = this.COLOR_BASE;
		this.consumoEnergetico = this.CONSUMO_ENERGETICO_BASE;
	}
	
	/**
	 * <p> Constructor parametrizado que permite evaluar dentro de si, si el color ingresado por usuario
	 * Equivale a los predefinidos dentro del metodo comprobarColor y si el consumo energetico equivale
	 * a los predefinidos dentro del metodo comprobarConsumoEnergetico</p>
	 * 
	 * @param precioBase variable que recibe el precio base definido por usuario
	 * @param color variable que recibe el color definido por usuario
	 * @param consumoEnergetico variable que recibe el consumo energetico definido por usuario
	 * @param peso variable que recibe el peso definido por usuario
	 */

	public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
		super();
		this.precioBase = precioBase;
		this.color = comprobarColor(color).toUpperCase();
		this.consumoEnergetico = Character.toString(comprobarConsumoEnergetico(consumoEnergetico)).toUpperCase().charAt(0);
		this.peso = peso;
	}
	
	/*
	 * Metodos de clase
	 */
	
	/**
	 * <p> Metodo que permite evaluar si el consumo energetico ingresado por usuario equivale a los predefinidos aqui, 
	 * ya sea A, B, C, D, E, F. De lo contrario se asignara el por defecto en las constantes de la clase </p>
	 * @param letra variable que referencia el consumo energeticos
	 * @return el valor que correspondera finalmente al consumo energetico del objeto
	 */
	
	private char comprobarConsumoEnergetico(char letra) {
		
		String letraAux = Character.toString(letra).toUpperCase();
		if(letraAux.equals("A") | letraAux.equals("B") |
		   letraAux.equals("C") | letraAux.equals("D") |
		   letraAux.equals("E") | letraAux.equals("F")) {
			
			return letra;
			
		}
		else {
			return this.CONSUMO_ENERGETICO_BASE;
		}
	}
	
	/**
	 * <p>Permite evaluar si el color ingresado equivale a los definidos para el objeto, Blanco, Negro, Rojo, Azul
	 * de lo contrario, asignara el color definido en las constantes de la clase. </p>
	 * @param color Corresponde a la variable de color definida por el usuario al momento de ejecutar el constructor
	 * @return el color final que se asignara a la variable de instancia para el objeto
	 */
	
	private String comprobarColor(String color) {
		
		String colorAux = color.toUpperCase();
		if(colorAux.equals("BLANCO") | colorAux.equals("NEGRO") |
		   colorAux.equals("ROJO") | colorAux.equals("AZUL")) {
			
			return color;
		}
		
		else {
			
			return this.COLOR_BASE;
			
		}
	}
	
	/**
	 * <p> Metodo que calcula el precio final, considerando el precioBase y sumandole precio dependiendo del 
	 * consumo energetico y del peso del objeto. </p>
	 * @return el precio final del objeto
	 */
	public int precioFinal() {
		int precio = this.precioBase;
		switch(this.consumoEnergetico) {
		case 'A': precio += 100; break;
		case 'B': precio += 80; break;
		case 'C': precio += 60; break;
		case 'D': precio += 50; break;
		case 'E': precio += 30; break;
		case 'F': precio += 10; break;
		default: precio += 100; break;
		}
		
		if(this.peso<19 & this.peso>0) {
			precio += 10;
		}
		else if(this.peso<49 & this.peso>20) {
			precio += 50;
		}
		else if(this.peso<79 & this.peso>50) {
			precio += 80;
		}
		else if(this.peso>80) {
			precio += 100;
		}
		return precio;
	}
	
	/*
	 * Getters
	 */
	
	public int getPRECIO_BASE() {
		return PRECIO_BASE;
	}

	public int getPESO_BASE() {
		return PESO_BASE;
	}

	public char getCONSUMO_ENERGETICO_BASE() {
		return CONSUMO_ENERGETICO_BASE;
	}

	public String getCOLOR_BASE() {
		return COLOR_BASE;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}


	
	
	

}
