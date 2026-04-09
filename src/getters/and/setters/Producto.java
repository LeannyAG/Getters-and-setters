package getters.and.setters;

public class Producto {

	private int codigo;
	private String nombre;
	private double precio;
	private int stock;
	
	public Producto(int codigo, String nombre, double precio, int stock) {
		this.codigo = codigo;
		this.nombre = nombre;
		setPrecio(precio);
		setStock(stock);
	}

	public void setPrecio(double precio) {
		if(precio > 0) {
			this.precio = precio;
		}else {
			this.precio = 0;
			System.out.println("precio invalido ");
		}
	}
	
	public void setStock(int stock) {
		if(stock >= 0) {
			this.stock = stock;
		}else {
			this.stock = 0;
			System.out.println("stock invalido ");
		}
	}
	
	
	public void vender(int cantidad) {
		if( cantidad <= stock) {
			stock -= cantidad;
			System.out.println("compra realizada ");
		}else {
			System.out.println("no hay suficiente stock");
		}
	}
	
	public void mostrar() {
		System.out.println("codigo: " + codigo +
				          "|nombre: " + nombre +
				          "|precio: " + precio +
				          "|stock: " + stock );
		
		                    
	}
	
	
}
