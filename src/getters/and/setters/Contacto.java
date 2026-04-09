package getters.and.setters;

public class Contacto {

	
	private String nombre;
	private String telefono;
	private String email;
	
	public Contacto(String nombre, String telefono, String email) {
		this.nombre = nombre;
		setTelefono(telefono);
		setEmail(email);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		if (telefono != null && telefono.matches("\\d{8}")) {
            this.telefono = telefono;
        } else {
            this.telefono = "00000000";
            System.out.println("teléfono invalido");
        }
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            this.email = "invalido@correo.com";
            System.out.println("email invalido");
        }
        }
    
	
	 public void mostrarContacto() {
	        System.out.println("nombre: " + nombre +
	                " | teléfono: " + telefono +
	                " | email: " + email);
	    }
	}
	
	
	
	
	
	

