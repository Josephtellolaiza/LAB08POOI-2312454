package banco;

import java.util.List;
import java.util.ArrayList;

public abstract class CuentaBancaria 
{
	private String numeroCuenta;
	private String descripcionCuenta;
	private String cuentaCCI;
	private double saldoDisponible = 0;
	private List<MovimientoCuenta> movimientos = new ArrayList<MovimientoCuenta>();
	private String estado;
	
	public CuentaBancaria(String numCuenta, String descripcion, String cuentaCCI, Cliente cliente) 
	{
		this.numeroCuenta = numCuenta;
		this.descripcionCuenta = descripcion;
		this.cuentaCCI = cuentaCCI;
	}
 
	public abstract void calcularInteresMensual();

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

	public List<MovimientoCuenta> getMovimientos() 
	{
		return movimientos;
	}

	@Override
	public String toString() 
	{
		return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", descripcionCuenta=" + descripcionCuenta
				+ ", cuentaCCI=" + cuentaCCI + ", saldoDisponible=" + saldoDisponible + ", movimientos=" + movimientos
				+ ", estado=" + estado + "]";
	}
}
