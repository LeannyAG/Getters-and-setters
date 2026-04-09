package getters.and.setters;

public class Factura {

	private int codigoFactura;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    
    
    public Factura(int codigoFactura, String descripcion, int cantidad, double precioUnitario) {
        this.codigoFactura = codigoFactura;
        this.descripcion = descripcion;
        setCantidad(cantidad);
        setPrecioUnitario(precioUnitario);
    }



	public int getCodigoFactura() {
		return codigoFactura;
	}



	public void setCodigoFactura(int codigoFactura) {
		this.codigoFactura = codigoFactura;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 1;
            System.out.println("cantidad invalida");
        }
    }



	public double getPrecioUnitario() {
		return precioUnitario;
	}



	public void setPrecioUnitario(double precioUnitario) {
		 if (precioUnitario > 0) {
	            this.precioUnitario = precioUnitario;
	        } else {
	            this.precioUnitario = 0;
	            System.out.println("precio inavlido");
	        }
	    }

	public double calcularTotal() {
        return cantidad * precioUnitario;
	}
	
	 public void mostrarFactura() {
	        System.out.println("codigo: " + codigoFactura +
	                " | descripcion: " + descripcion +
	                " | cantidad: " + cantidad +
	                " | precio unitario: " + precioUnitario +
	                " | total: " + calcularTotal());
	    }
	
	
	
	
}
