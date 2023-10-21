package banco;

public class CuentaFree {
	private boolean numIlimitadoRetiro;

    public CuentaFree(boolean numIlimitadoRetiro) {
        this.numIlimitadoRetiro = numIlimitadoRetiro;
    }
    public boolean getNumIlimitadoRetiros() {
        return numIlimitadoRetiro;
    }
    public void setNumIlimitadoRetiro(boolean numIlimitado) {
        this.numIlimitadoRetiro = numIlimitado;
    }
    public String toString() {
        return "CuentaFree [numIlimitadoRetiro=" + numIlimitadoRetiro + "]";
    }
}


