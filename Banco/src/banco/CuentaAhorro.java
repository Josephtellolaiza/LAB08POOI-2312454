package banco;

import java.util.List;
import java.util.ArrayList;

public class CuentaAhorro extends CuentaBancaria
{
	private double tasaInteresAnual = 0.03;
    private List<String> beneficios = new ArrayList<String>();
    


    public CuentaAhorro(String numCuenta, String descripcion, String cuentaCCI, Cliente cliente,
			double tasaInteresAnual, List<String> beneficios) 
    {
		super(numCuenta, descripcion, cuentaCCI, cliente);
		this.tasaInteresAnual = tasaInteresAnual;
		this.beneficios = beneficios;
	}
    
	public void calcularInteresMensual()
	{
		double interesMensual;
		double saldoDisponible;
		double tasaInteresAnual;
		
		saldoDisponible = getSaldoDisponible();
		tasaInteresAnual = this.tasaInteresAnual;
		
		interesMensual = (saldoDisponible * tasaInteresAnual) / 12;
		saldoDisponible += interesMensual;
		this.setSaldoDisponible(saldoDisponible);
	}
	
    public List<String> getBeneficios() 
    {
		return beneficios;
	}

	public void setBeneficios(List<String> beneficios) 
	{
		this.beneficios = beneficios;
	}

	@Override
	public String toString() {
		return "CuentaAhorro [tasaInteresAnual=" + tasaInteresAnual + ", beneficios=" + beneficios + "]";
	}
}
		    
		

	

