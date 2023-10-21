package banco;

public class CuentaBancaria 
{
	private String numeroCuenta;
	private String descripcionCuenta;
	private String cuentaCCI;
	private double saldoDisponible = 0;
	//private MovimientosCuenta movimientos = new MovimientoCuenta();
	private String estado;
	
	public CuentaBancaria(String numCuenta, String descripcion, String cuentaCCI/*, Cliente cliente*/) 
	{
		this.numeroCuenta = numeroCuenta;
		this.descripcionCuenta = descripcionCuenta;
		this.cuentaCCI = cuentaCCI;
	}
 
	public void calcularInteresMensual()
	{}

	public String getNumeroCuenta() 
	{
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) 
	{
		this.numeroCuenta = numeroCuenta;
	}

	public String getDescripcionCuenta() 
	{
		return descripcionCuenta;
	}

	public void setDescripcionCuenta(String descripcionCuenta) {
		
		this.descripcionCuenta = descripcionCuenta;
	}

	public String getCuentaCCI() 
	{
		return cuentaCCI;
	}

	public void setCuentaCCI(String cuentaCCI) 
	{
		this.cuentaCCI = cuentaCCI;
	}

	public double getSaldoDisponible() 
	{
		return saldoDisponible;
	}

	public void setSaldoDisponible(double saldoDisponible) 
	{
		this.saldoDisponible = saldoDisponible;
	}

	/*public MovimientosCuenta[]()
	{
		return movimientos;
	}*/
	
	@Override
	public String toString() 
	{
		return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", descripcionCuenta=" + descripcionCuenta
				+ ", cuentaCCI=" + cuentaCCI + ", saldoDisponible=" + saldoDisponible + ", estado=" + estado + "]";
	}
}
