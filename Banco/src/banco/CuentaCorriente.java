package banco;

public class CuentaCorriente extends CuentaBancaria 
{
	private double tasalnteresAnual = 0.02;
    private final static double COMISION_FIJA = 2.0;
    private int maxRetiro;

    public CuentaCorriente(String numCuenta, String descripcion, String cuentaCCI, Cliente cliente, int maxRetiro) 
    {
		super(numCuenta, descripcion, cuentaCCI, cliente);;
		this.maxRetiro = maxRetiro;
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
	}
    
	public int getMaxRetiro() 
	{
        return maxRetiro;
    }

    public void setMaxRetiro(int maxRetiro) 
    {
        this.maxRetiro = maxRetiro;
    }

	@Override
	public String toString() 
	{
		return "CuentaCorriente [tasalnteresAnual=" + tasalnteresAnual + ", maxRetiro=" + maxRetiro + "]";
	}
}

