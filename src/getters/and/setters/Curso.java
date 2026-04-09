package getters.and.setters;

public class Curso {

	private String nombreCurso;
	private double  nota1;
	private double nota2;
	private double nota3;
	
	public Curso(String nombreCurso, int nota1, int nota2, int nota3) {
		this.nombreCurso = nombreCurso;
		setNota1(nota1);
		setNota2(nota2);
		setNota3(nota3);
		
		
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	
	public void setNota1() {
		if(nota1 >= 0 && nota1 <= 100) {
			this.nota1 = nota1;
		}else {
			this.nota1 = 0;
			System.out.println("nota1 inavlida");
		}
	}
	
	public void setNota2() {
		if(nota2 >= 0 && nota2 <= 100) {
			this.nota2 = nota2;
		}else {
			this.nota2 = 0;
			System.out.println("nota2 inavalida ");
		}
	}
	
	public void setNota3() {
		if(nota3 <= 0 && nota3 >= 100) {
			this.nota3 = nota3;
		}else {
			this.nota3 = 0;
			System.out.println("nota3 invalida ");
		}
	}
	
	public double promedio() {
		return(nota1 + nota2 + nota3)/3;
	}
	
	public String estado() {
		if(promedio() >= 61) {
			return "aprobado";
		}else {
			return "reprobado";
		}
	}
	
	public void mostrar() {
		
		System.out.println("curso: " + nombreCurso +
				           "|promedio: " + promedio()+
				           "|estado: " + estado());
		
	}
	
	
	
	
	
}
