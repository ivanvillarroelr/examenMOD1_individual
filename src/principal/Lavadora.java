package principal;

/**
 * <p> Clase hija que hereda de electrodomestico, permite instanciar un objeto tipo Lavadora</p>
 * @author ivillarroelr
 *
 */

public class Lavadora extends Electrodomestico{
	
	/**
	 * @param CARGA_BASE constante de clase para instanciar objetos por defecto
	 */
	
	final int CARGA_BASE = 5;
	
	/**
	 * @param carga Variable de instancia que recibe el valor de carga declarado por el usuario
	 */
	int carga;

	

	/**
	 * <p> Constructor por defecto, que asume los atributos por defecto almacenados en las constantes</p>
	 */
	public Lavadora() {
		super();
		this.carga = this.CARGA_BASE;
	}
	
	/**
	 * <p> Constructor parametrizado parcial que permite instanciar el objeto con los atributos y metodos de la superclase considerando algunos por defecto</p>
	 * @param precioBase variable que recibe el precio base definido por usuario
	 * @param peso variable que recibe el peso definido por usuario
	 */
	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		this.carga = this.CARGA_BASE;
	}
	
	/**
	 * <p>Constructor parametrizado que permite instanciar el objeto con los atributos y metodos de la superclase</p>
	 * @param carga Variable definida por el usuario que declara la carga del objeto
	 * @param precioBase variable que recibe el precio base definido por usuario
	 * @param color variable que recibe el color definido por usuario
	 * @param consumoEnergetico variable que recibe el consumo energetico definido por usuario
	 * @param peso variable que recibe el peso definido por usuario
	 */
	public Lavadora(int carga,int precioBase, String color, char consumoEnergetico, int peso) {
		super(precioBase,color,consumoEnergetico,peso);
		this.carga = carga;
	}
	/**
	 * <p> Metodo que sobrescribe el metodo preciofinal de la superclase, anadiendo la funcionalidad 
	 * de agregar precio dependiendo de la carga </p>
	 */
	@Override 
	public int precioFinal() {
		int precio=super.precioFinal();
		
		if(this.carga>30) {
			precio+=50;
		}
		return precio;
	}
	

	public int getCarga() {
		return carga;
	}
	
	
}
