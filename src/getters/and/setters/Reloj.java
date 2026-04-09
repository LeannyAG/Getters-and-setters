package getters.and.setters;

public class Reloj {

	 private int hora;
	    private int minuto;
	    private int segundo;

	    
	    public Reloj(int hora, int minuto, int segundo) {
	        setHora(hora);
	        setMinuto(minuto);
	        setSegundo(segundo);
	    }

	  
	    public void setHora(int hora) {
	        if (hora >= 0 && hora <= 23) {
	            this.hora = hora;
	        } else {
	            this.hora = 0;
	            System.out.println("hora invalida");
	        }
	    }

	    public void setMinuto(int minuto) {
	        if (minuto >= 0 && minuto <= 59) {
	            this.minuto = minuto;
	        } else {
	            this.minuto = 0;
	            System.out.println("minuto invalido");
	        }
	    }

	    public void setSegundo(int segundo) {
	        if (segundo >= 0 && segundo <= 59) {
	            this.segundo = segundo;
	        } else {
	            this.segundo = 0;
	            System.out.println("segundo invalido");
	        }
	    }

	    
	    public String mostrarHora() {
	        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
	    }
	}