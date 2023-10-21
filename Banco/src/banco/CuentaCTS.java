package banco;

public class CuentaCTS {
	    private double tasalnteresAnual = 0.07; 
	    private double puntos;

	    public CuentaCTS(double puntos) {
	        this.puntos = puntos;
	    }

	    public double getPuntos() {
	        return puntos;
	    }

	    public void setPuntos(double puntos) {
	        this.puntos = puntos;
	    }

	    public double calcularIntereses() {
	        return puntos * tasalnteresAnual;
	    }
	    public String toString() {
	        return "Cuenta CTS - Puntos: " + puntos + ", Intereses acumulados: " + calcularIntereses();
	    }
	}

	


