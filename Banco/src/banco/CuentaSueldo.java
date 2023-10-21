package banco;

public class CuentaSueldo {
	private String nombreEmpresa;

    public CuentaSueldo(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    public String toString() {
        return "CuentaSueldo{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                '}';
    }
}

}
