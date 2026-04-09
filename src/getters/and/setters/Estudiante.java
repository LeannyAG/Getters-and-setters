package getters.and.setters;

public class Estudiante {

	private int carnet;
	private String nombre;
	private double promedio;
	
	
	public Estudiante(int carnet, String nombre, double promedio) {
		this.carnet = carnet;
		this.nombre = nombre;
		setPromedio(promedio);
	}


	public int getCarnet() {
		return carnet;
	}


	public void setCarnet(int carnet) {
		this.carnet = carnet;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPromedio() {
		return promedio;
	}


	

	public void setPromedio(double promedio) {
		if(promedio >= 0 && promedio <= 100) {
			this.promedio = promedio;
		}else {
			this.promedio = 0;
			System.out.println("promedio invalido ");
		}
	}
	
	public boolean esBecado() {
		return promedio >= 85;
		
	}
	
	
	public void mostrar() {
        System.out.println("carnet: " + carnet +
                " | nombre: " + nombre +
                " | promedio: " + promedio +
                " | becado: " + (esBecado() ? "si" : "no"));
    }
	
}
