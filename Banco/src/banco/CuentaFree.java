package banco;

import java.util.List;

public class CuentaFree extends CuentaAhorro
{
	private boolean numIlimitadoRetiro;

    public CuentaFree(String numCuenta, String descripcion, String cuentaCCI, Cliente cliente, double tasaInteresAnual,
			List<String> beneficios, boolean numIlimitadoRetiro) 
    {
		super(numCuenta, descripcion, cuentaCCI, cliente, tasaInteresAnual, beneficios);
		this.numIlimitadoRetiro = numIlimitadoRetiro;
	}
    
	public boolean getNumIlimitadoRetiros() 
	{
        return numIlimitadoRetiro;
    }
	
    public void setNumIlimitadoRetiro(boolean numIlimitado) 
    {
        this.numIlimitadoRetiro = numIlimitado;
    }

	@Override
	public String toString() 
	{
		return "CuentaFree [numIlimitadoRetiro=" + numIlimitadoRetiro + "]";
	}
}


