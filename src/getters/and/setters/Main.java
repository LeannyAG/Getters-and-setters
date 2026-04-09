package getters.and.setters;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            ejercicio1();
            ejercicio2();
            ejercicio3();
             ejercicio4();
            ejercicio5();
            ejercicio6();
            ejercicio7();
            ejercicio8();
            ejercicio9();
            ejercicio10();
	}   
	
	
            public static void ejercicio1() {
            	
            	System.out.println("-----PERSONA----");
            	
            	Persona per1 = new Persona("Rodrigo", "Sanchinel", -15);
            	Persona per2 = new Persona("Josefina", "Martinez", 35);
            	Persona per3 = new Persona("Claudia", "Rodriguez", 22);
            	
            	
            	
            	per1.mostrar();
            	per2.mostrar();
            	per3.mostrar();
            	
            	System.out.println();
            }
	
	public static void ejercicio2() {
	
		System.out.println("----PRODUCTO------");
		
		Producto prod = new Producto( 1," laptop HP", 5800 , 10);
		
		prod.mostrar();
		prod.vender(5);
		prod.mostrar();
		
		System.out.println();
	}
	
	public static void ejercicio3() {
		
		System.out.println("----CUENTA CON PIN---- ");
		
		CuentaBancaria c = new CuentaBancaria("maricela ", 1000, 276);  
		
		c.retirar(200, 276);
		c.retirar(200, 123);
		
		c.mostrar();
		
		System.out.println();
		
	}
	
	public static void ejercicio4() {
		
		System.out.println("----CURSO Y CALIFICACIONES---- ");
		
		Curso cur1 = new Curso ("matematica ", 60 , 61 ,55);
		cur1.mostrar();
		
		Curso cur2 = new Curso("quimica", 70, 100, 90);
		cur2.mostrar();
		
		
		System.out.println();
	}
	
	
	public static void ejercicio5() {
		
		System.out.println("----CURSO Y CALIFICACIONES---- ");
		
		Estudiante e1 = new Estudiante (101 , "jose ", 120);
		Estudiante e2 = new Estudiante (102 , "manuela ", 80);
		Estudiante e3 = new Estudiante (103 , "luis ", 95);
		
		e1.mostrar();
		e2.mostrar();
		e3.mostrar();
		
		
		System.out.println();
	}
	
	public static void ejercicio6() {
		
		System.out.println("----TERMOMETRO---- ");
		
		Termometro ter1 = new Termometro();
		ter1.setCelsius(25);
		ter1.mostrar();
		
		Termometro ter2 = new Termometro();
		ter2.setCelsius(-300);
		ter2.mostrar();
		
		System.out.println();
				
	}
	
	public static void ejercicio7() {
		
		System.out.println("----RELOJ---- ");
		
		Reloj r1 = new Reloj(10, 5, 9);
		System.out.println(r1.mostrarHora());
		
		
		Reloj r2 = new Reloj(26, 80, -5);
		System.out.println(r2.mostrarHora());
		
		System.out.println();
	}
	
	public static void ejercicio8() {
		
		System.out.println("----CONTACTO CON TELEFONO ---- ");
		
	    Contacto c1 = new Contacto("ana", "12345678", "ana@gmail.com");
	    c1.mostrarContacto();

	    Contacto c2 = new Contacto("luis", "1234", "luisgmail.com"); 
	    c2.mostrarContacto();
	    
	    
		System.out.println();
		
	}
	
public static void ejercicio9() {
		
		System.out.println("----JUEGO CON PUNTAJE MAXIMO ---- ");
		
		 Jugador j = new Jugador("marcela", 50);
		    j.mostrar();

		    j.actualizarPuntaje(80); 
		    j.mostrar();

		    j.actualizarPuntaje(30); 
		    j.mostrar();

		    j.actualizarPuntaje(-10); 
		    j.mostrar();
		}
	
public static void ejercicio10() {
	
	System.out.println("----FACTURA CON TOTAL ---- ");
	
	Factura f1 = new Factura(1, "teclado", 2, 150);
    f1.mostrarFactura();

    Factura f2 = new Factura(2, "mouse", -3, -50); 
    f2.mostrarFactura();
}

}
