package banco;
import java.util.Arrays;
public class CuentaAhorro {
		private double tasaInteresAnual;
	    private String[] beneficios;

	    public CuentaAhorro(double tasaInteresAnual, String[] beneficios) {
	        this.tasaInteresAnual = tasaInteresAnual;
	        this.beneficios = beneficios;
	    }

	    public double getTasaInteresAnual() {
	        return tasaInteresAnual;
	    }

	    public void setTasaInteresAnual(double tasaInteresAnual) {
	        this.tasaInteresAnual = tasaInteresAnual;
	    }

	    public String[] getBeneficios() {
	        return beneficios;
	    }

	    public void setBeneficios(String[] beneficios) {
	        this.beneficios = beneficios;
	    }

	    public double getCuentaAhorro() {
	        
	        return 0.0;
	    }

	    public String toString() {
	        return "Tasa de Interés Anual: " + tasaInteresAnual + "%\nBeneficios: " + Arrays.toString(beneficios);
	    }
	}
		    
		

	

