package getters.and.setters;

public class Termometro {


	private double  celsius;
	


	public void setCelsius(double temperatura) {
		if(temperatura >= -273.15 ) {
		this.celsius = temperatura;
	}else {
		this.celsius = -273.15;
		System.out.println("temperatura invalida ");
	}
	
	}


	public double getCelsius() {
		return celsius;
		
	}
		
	public double getFahrenheit() {
		return(celsius * 9 / 5) + 32;
	}
	
	public void mostrar() {
		System.out.println("Celsius: " + celsius +
                " | Fahrenheit: " + getFahrenheit());
    }
	
	
	
	}
