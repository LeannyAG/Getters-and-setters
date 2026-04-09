package getters.and.setters;

public class CuentaBancaria {

	private String titular;
	private double saldo;
	private int pin;
	
	public CuentaBancaria(String titular, double saldo, int pin) {
		this.titular = titular;
		this.saldo = saldo;
		this.pin = pin;
		
		
	}
	
	public void retirar(double monto, int pinIngresado) {
		if(pinIngresado == pin) {
			if(monto <= saldo) {
				saldo -= monto;
				System.out.println("retiro exitoso");
			}else {
				System.out.println("saldo insuficiente");
			}
		}else {
			System.out.println("PIN incorrecto ");
		}
	}
	
	
	
	public void mostrar() {
		System.out.println("titular: " + titular +
				          "|saldo : " + saldo );
				         
		                    
	}
	
	
}
