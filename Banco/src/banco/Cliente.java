package banco;

import java.util.List;
import java.util.ArrayList;

public class Cliente {

	private String idCliente;
	private String nombre;
	private String apellido;
	private String direccion;
	private int telefono;
	private int dni;
	private List<CuentaBancaria> cuentas = new ArrayList<CuentaBancaria>();
	private List<EventoBancario> eventosBancarios = new ArrayList<EventoBancario>();
	
	public Cliente(String idCliente, String nombre, String apellido, String direccion, int telefono, int dni)
	{	
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.dni = dni;
	}

	public String getIdCliente() 
	{
		return idCliente;
	}
	
	public void setIdCliente(String idCliente) 
	{
		this.idCliente = idCliente;
	}
	
	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public String getApellido() 
	{
		return apellido;
	}
	
	public void setApellido(String apellido) 
	{
		this.apellido = apellido;
	}
	
	public String getDireccion() 
	{
		return direccion;
	}
	
	public void setDireccion(String direccion) 
	{
		this.direccion = direccion;
	}
	
	public int getTelefono() 
	{
		return telefono;
	}
	
	public void setTelefono(int telefono) 
	{
		this.telefono = telefono;
	}
	
	public int getDni() 
	{
		return dni;
	}
	
	public void setDni(int dni) 
	{
		this.dni = dni;
	}

	public List<CuentaBancaria> getCuentas() 
	{
		return cuentas;
	}

	public void setCuentas(List<CuentaBancaria> cuentas) 
	{
		this.cuentas = cuentas;
	}

	
	public List<EventoBancario> getEventosBancarios() 
	{
		return eventosBancarios;
	}

	public void setEventosBancarios(List<EventoBancario> eventosBancarios) 
	{
		this.eventosBancarios = eventosBancarios;
	}

	@Override
	public String toString() 
	{
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion="
				+ direccion + ", telefono=" + telefono + ", dni=" + dni + ", cuentas=" + cuentas + ", eventosBancarios="
				+ eventosBancarios + "]";
	}

	
	
}
