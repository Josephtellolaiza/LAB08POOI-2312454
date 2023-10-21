package banco;

public class CuentaCorriente {
	private double tasalnteresAnual = 0.02;
    private final double COMISION_FIJA = 2.0;
    private int maxRetiro;


    public CuentaCorriente(int maxRetiro) {
        this.maxRetiro = maxRetiro;
    }

    public int getMaxRetiro() {
        return maxRetiro;
    }

    public void setMaxRetiro(int maxRetiro) {
        this.maxRetiro = maxRetiro;
    }

    private double calcularComision(double monto) {
        return monto * COMISION_FIJA / 100;
    }

    public void realizarRetiro(double monto) {
        if (monto <= maxRetiro) {
            double comision = calcularComision(monto);
            double totalRetiro = monto + comision;
            System.out.println("Retiro exitoso. Monto: " + monto + ", Comisión: " + comision);
        } else {
            System.out.println("Error: El monto de retiro supera el límite permitido.");
        }
    }

    public String toString() {
        return "CuentaCorriente{" +
                "tasalnteresAnual=" + tasalnteresAnual +
                ", COMISION_FIJA=" + COMISION_FIJA +
                ", maxRetiro=" + maxRetiro +
                '}';
       }	
	}

