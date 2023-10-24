package banco;

public class CuentaCTS extends CuentaBancaria 
{
	    private double tasalnteresAnual = 0.07; 
	    private double puntos;
	    
	    public CuentaCTS(String numCuenta, String descripcion, String cuentaCCI, Cliente cliente, double puntos) 
	    {
			super(numCuenta, descripcion, cuentaCCI, cliente);
			this.puntos = puntos;
		}
	    
		public void calcularInteresMensual()
		{
			double interesMensual;
			double saldoDisponible;
			double tasaInteresAnual;
			
			saldoDisponible = getSaldoDisponible();
			tasaInteresAnual = this.tasalnteresAnual;
			
			interesMensual = (saldoDisponible * tasaInteresAnual) / 12;
			saldoDisponible += interesMensual;
			this.setSaldoDisponible(saldoDisponible);
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

		@Override
		public String toString() {
			return "CuentaCTS [tasalnteresAnual=" + tasalnteresAnual + ", puntos=" + puntos + "]";
		}	    
	}

	


