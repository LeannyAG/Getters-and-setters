package getters.and.setters;

public class Persona {

		private String nombre;
		private String apellido;
		private int edad;
		
		public Persona(String nombre, String apellido, int edad) {
		     this.nombre = nombre;
		     this.apellido = apellido;
		     setEdad(edad);
		     
		     

	}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public int getEdad() {
			return edad;
			
		}

		public void setEdad(int edad) {
			if(edad >= 0) {
				this.edad = edad;
			}else {
				this.edad = 0;
				System.out.println("edad invalida, se asigna un 0");
			}
			
		}
		
		public void mostrar() {
			System.out.println("nombre: " + nombre +
					           "||apellido: " + apellido +
					            "||edad: " + edad);
		}
	}

	
	
	
	




