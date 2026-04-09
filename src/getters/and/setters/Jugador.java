package getters.and.setters;

public class Jugador {

	
	private String nombre;
    private int puntajeActual;
    private int puntajeMaximo;

    
    public Jugador(String nombre, int puntajeActual) {
        this.nombre = nombre;
        setPuntajeActual(puntajeActual);
        this.puntajeMaximo = this.puntajeActual; 
    }


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPuntajeActual() {
		return puntajeActual;
	}


	public void setPuntajeActual(int puntajeActual) {
	        if (puntajeActual >= 0) {
	            this.puntajeActual = puntajeActual;
	        } else {
	            this.puntajeActual = 0;
	            System.out.println("Puntaje inválido");
	        }
	    }

	public void actualizarPuntaje(int nuevoPuntaje) {
        setPuntajeActual(nuevoPuntaje);

        if (nuevoPuntaje > puntajeMaximo) {
            puntajeMaximo = nuevoPuntaje;
        }
    }

	public int getPuntajeMaximo() {
		return puntajeMaximo;
	}


	public void setPuntajeMaximo(int puntajeMaximo) {
		this.puntajeMaximo = puntajeMaximo;
	}
	
	
	public void mostrar() {
        System.out.println("Nombre: " + nombre +
                " | Puntaje Actual: " + puntajeActual +
                " | Puntaje Máximo: " + puntajeMaximo);
    }
}
	
	
	
	

