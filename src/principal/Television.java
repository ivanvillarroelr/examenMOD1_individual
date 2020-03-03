package principal;

/**
 * <p> Clase hija que hereda de electrodomestico, permite instanciar un objeto tipo Television</p>
 * @author ivillarroelr
 *
 */

public class Television extends Electrodomestico{
	
	/*
	 * Constantes
	 */
	
	/**
	 * @param RESOLUCION_BASE constante de clase para instanciar objetos por defecto
	 * @param SINTONIZADOR_TDT_BASE constante de clase para instanciar objetos por defecto
	 */
	
	
	final int RESOLUCION_BASE = 20;
	final boolean SINTONIZADOR_TDT_BASE = false;
	
	/*
	 * Variables de instancia 
	 */
	
	/**
	 * @param resolucion variable de instancia que permite alojar el valor de resolucion del objeto definido por el usuario
	 * @param sintonizadorTDT variable de instancia qeue permite indicar si es verdadero o falso que posea el sintonizadorTDT
	 */
	int resolucion;
	boolean sintonizadorTDT;
	
	/*
	 * Constructores
	 */
	/**
	 * <p> Constructor por defecto, que asume los atributos por defecto almacenados en las constantes</p>
	 */
	public Television() {
		super();
		this.resolucion = this.RESOLUCION_BASE;
		this.sintonizadorTDT = this.SINTONIZADOR_TDT_BASE;
	}
	/**
	 * <p> Constructor parametrizado parcial que permite instanciar el objeto con los atributos y metodos de la superclase considerando algunos por defecto</p>
	 * @param precioBase variable que recibe el precio base definido por usuario
	 * @param peso variable que recibe el peso definido por usuario
	 */
	public Television(int precioBase, int peso) {
		super(precioBase, peso);
		this.resolucion = this.RESOLUCION_BASE;
		this.sintonizadorTDT = this.SINTONIZADOR_TDT_BASE;
	}
	
	/**
	 * <p>Constructor parametrizado que permite instanciar el objeto con los atributos y metodos de la superclase</p>
	 * @param resolucion Variable que recibe el valor de resolucion definido por el usuario
	 * @param sintonizadorTDT Variable que recibe el valor de sintonizadorTDT definido por el usuario
	 * @param precioBase variable que recibe el precio base definido por usuario
	 * @param color variable que recibe el color definido por usuario
	 * @param consumoEnergetico variable que recibe el consumo energetico definido por usuario
	 * @param peso variable que recibe el peso definido por usuario
	 */
	public Television(int resolucion, boolean sintonizadorTDT, int precioBase, String color, char consumoEnergetico, int peso) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	/*
	 * Metodos de clase
	 */
	
	/**
	 * <p> Metodo que sobrescribe el metodo preciofinal de la superclase, anadiendo la funcionalidad 
	 * de agregar precio dependiendo de la la resolucion y la presencia de sintonizadorTDT </p>
	 */
	
	@Override
	public int precioFinal() {
		int precio = super.precioFinal();
		
		if(this.resolucion>40) {
			precio *= 1.3;
		}
		if(this.sintonizadorTDT) {
			precio += 50;
		}
		
		return precio;
	}
	
	
	/*
	 * Getters
	 */
	
	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
}
