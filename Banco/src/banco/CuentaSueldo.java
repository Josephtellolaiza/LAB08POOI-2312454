package banco;

import java.util.List;

public class CuentaSueldo  extends CuentaAhorro
{
	private String nombreEmpresa;

    
    public CuentaSueldo(String numCuenta, String descripcion, String cuentaCCI, Cliente cliente,
			double tasaInteresAnual, List<String> beneficios, String nombreEmpresa) 
    {
		super(numCuenta, descripcion, cuentaCCI, cliente, tasaInteresAnual, beneficios);
		this.nombreEmpresa = nombreEmpresa;
	}
    
	public String getNombreEmpresa() 
	{
        return nombreEmpresa;
    }
	
    public void setNombreEmpresa(String nombreEmpresa) 
    {
        this.nombreEmpresa = nombreEmpresa;
    }

	@Override
	public String toString() 
	{
		return "CuentaSueldo [nombreEmpresa=" + nombreEmpresa + "]";
	}
}