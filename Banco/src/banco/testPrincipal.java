package banco;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class testPrincipal
{
	public static void main(String[] args) 
	{
		// Lista de beneficios de la Cuenta Ahorro
		
		List<String> beneficiosCuentaAhorro = new ArrayList<String>();
		String beneficio1CA = new String();
		String beneficio2CA = new String();
		String beneficio3CA = new String();
		
		beneficio1CA = "Podras recibir tu sueldo y otros ingresos.";
		beneficio2CA = "Con tu tarjeta de débito puedes hacer compras online o presencialmente.";
		beneficio3CA = "Transferir fondos a otras cuentas de personas o empresa.";
		
		beneficiosCuentaAhorro.add(beneficio1CA);
		beneficiosCuentaAhorro.add(beneficio2CA);
		beneficiosCuentaAhorro.add(beneficio3CA);
		
		// Lista de beneficios de la Cuenta Sueldo
		
		List<String> beneficiosCuentaSueldo = new ArrayList<String>();
		String beneficio1CS = new String();
		String beneficio2CS = new String();
		String beneficio3CS = new String();
		String beneficio4CS = new String();
		String beneficio5CS = new String();
		
		beneficio1CS = "Descuentos exclusivos en tiendas de ropa.";
		beneficio2CS = "Descuentos exclusivos en restaurantes.";
		beneficio3CS = "Descuentos exclusivos en gimnasios.";
		beneficio4CS = "Descuentos exclusivos en conciertos.";
		beneficio5CS = "Descuentos exclusivos en hoteles y vuelos.";
		
		beneficiosCuentaSueldo.add(beneficio1CS);
		beneficiosCuentaSueldo.add(beneficio2CS);
		beneficiosCuentaSueldo.add(beneficio3CS);
		beneficiosCuentaSueldo.add(beneficio4CS);
		beneficiosCuentaSueldo.add(beneficio5CS);
		
		// Lista de beneficios de la Cuenta Free
		
		List<String> beneficiosCuentaFree = new ArrayList<String>();
		String beneficio1CF = new String();
		String beneficio2CF = new String();
		String beneficio3CF = new String();
		
		beneficio1CF = "Descuentos exclusivos en teatros.";
		beneficio2CF = "Descuentos exclusivos en restaurantes.";
		beneficio3CF = "Descuentos exclusivos en cursos universitarios.";
		
		beneficiosCuentaFree.add(beneficio1CF);
		beneficiosCuentaFree.add(beneficio2CF);
		beneficiosCuentaFree.add(beneficio3CF);
		
		// Valores necesarios para algunos constructores (Los Saldos, por ejemplo)
		
		boolean verdad = true;
		double saldoCuentaSueldo = 1500.00;
		double saldoCuentaFree = 20000.00;
		
		// El Cliente
		
		Cliente cliente = new Cliente("WE-6238", "Alfredo", "Gomez", "Av. Los Olivares N°34", 924067923,73945930);
				
		// Lista de Cuentas Bancarias
		
		List<CuentaBancaria> cuentasBancarias = new ArrayList<CuentaBancaria>();
		
		CuentaCorriente cuenta1 = new CuentaCorriente("01", "Cuenta Bancaria 1 - Cuenta Corriente 1", "23571113171923313741", cliente, 5);
		CuentaAhorro cuenta2 = new CuentaAhorro("02", "Cuenta Bancaria 2 - Cuenta Ahorro 1", "23571113171923313741", cliente, 0.03, beneficiosCuentaAhorro);
		CuentaCTS cuenta3 = new CuentaCTS("03", "Cuenta Bancaria 3 - Cuenta CTS 1", "23571113171923313741", cliente, 50000);
		CuentaAhorro cuenta4 = new CuentaSueldo("04", "Cuenta Bancaria 4 - Cuenta Ahorro 2 - Cuenta Sueldo 1", "23571113171923313741", cliente, 0.04, beneficiosCuentaSueldo, "Tambo");
		CuentaAhorro cuenta5 = new CuentaFree("05", "Cuenta Bancaria 5 - Cuenta Ahorro 3 - Cuenta Free 1", "23571113171923313741", cliente, 0.02, beneficiosCuentaFree, verdad);
		
		cuentasBancarias.add(cuenta1);
		cuentasBancarias.add(cuenta2);
		cuentasBancarias.add(cuenta3);
		cuentasBancarias.add(cuenta4);
		cuentasBancarias.add(cuenta5);
		
		// El Cliente y sus Cuentas Bancarias
		
		cliente.setCuentas(cuentasBancarias);
		
		// Meses del año
		
		List<String> mesesAno = new ArrayList<String>();
		String enero = new String();
		String febrero = new String();
		String marzo = new String();
		String abril = new String();
		String mayo = new String();
		String junio = new String();
		String julio = new String();
		String agosto = new String();
		String septiembre = new String();
		String octubre = new String();
		String noviembre = new String();
		String diciembre = new String();
		
		enero = "Enero";
		febrero = "Febrero";
		marzo = "Marzo";
		abril = "Abril";
		mayo = "Mayo";
		junio = "Junio";
		julio = "Julio";
		agosto = "Agosto";
		septiembre = "Septiembre";
		octubre = "Octubre";
		noviembre = "Noviembre";
		diciembre = "Diciembre";
		
		mesesAno.add(enero);
		mesesAno.add(febrero);
		mesesAno.add(marzo);
		mesesAno.add(abril);
		mesesAno.add(mayo);
		mesesAno.add(junio);
		mesesAno.add(julio);
		mesesAno.add(agosto);
		mesesAno.add(septiembre);
		mesesAno.add(octubre);
		mesesAno.add(noviembre);
		mesesAno.add(diciembre);
		
		// El saldo de la Cuenta Sueldo y la Cuenta Free del Cliente por todo el año
		
		for (int contador = 0; contador < mesesAno.size(); contador++)
		{
			cuenta4.setSaldoDisponible(saldoCuentaSueldo);
			cuenta5.setSaldoDisponible(saldoCuentaFree);
			
			cuenta4.calcularInteresMensual();
			cuenta5.calcularInteresMensual();
			
			saldoCuentaSueldo = cuenta4.getSaldoDisponible();
			saldoCuentaFree = cuenta5.getSaldoDisponible();
			
			System.out.println("El saldo de la Cuenta Sueldo el proximo mes sera (" + mesesAno.get(contador) + "): " + saldoCuentaSueldo);
			System.out.println("El saldo de la Cuenta Free el proximo mes sera (" + mesesAno.get(contador) + "): " + saldoCuentaFree);
		}
		
		// Fechas
		
		Date fecha1 = new Date(123, 0, 11, 15, 23, 14);
		Date fecha2 = new Date(123, 0, 19, 10, 45, 56);
		Date fecha3 = new Date(123, 0, 27, 17, 11, 37);
		Date fecha4 = new Date(123, 1, 5, 8, 56, 1);
		Date fecha5 = new Date(123, 1, 15, 13, 24, 57);
		Date fecha6 = new Date(123, 1, 29, 16, 30, 37);
		Date fecha7 = new Date(123, 2, 19, 11, 12, 42);
		Date fecha8 = new Date(123, 2, 19, 19, 2, 4);
		Date fecha9 = new Date(123, 2, 30, 16, 24, 11);
		Date fecha10 = new Date(123, 3, 4, 12, 23, 14);
		
		// Lista de Movimientos Bancarios
		
		List<MovimientoCuenta> movimientosCliente = new ArrayList<MovimientoCuenta>();
		MovimientoCuenta prestamo1 = new MovimientoCuenta("1", "Prestamo de 120", fecha1, 120, "Prestamo");
		MovimientoCuenta prestamo2 = new MovimientoCuenta("2", "Prestamo de 90", fecha2, 90, "Prestamo");
		MovimientoCuenta prestamo3 = new MovimientoCuenta("3", "Prestamo de 190", fecha3, 190, "Prestamo");
		MovimientoCuenta prestamo4 = new MovimientoCuenta("4", "Prestamo de 120", fecha6, 120, "Prestamo");
		MovimientoCuenta prestamo5 = new MovimientoCuenta("5", "Prestamo de 130", fecha9, 130, "Prestamo");
		MovimientoCuenta deposito1 = new MovimientoCuenta("6", "Deposito de 40", fecha4, 40, "Deposito");
		MovimientoCuenta deposito2 = new MovimientoCuenta("7", "Deposito de 70", fecha5, 70, "Deposito");
		MovimientoCuenta deposito3 = new MovimientoCuenta("8", "Deposito de 40", fecha7, 40, "Deposito");
		MovimientoCuenta deposito4 = new MovimientoCuenta("9", "Deposito de 120", fecha8, 120, "Deposito");
		MovimientoCuenta deposito5 = new MovimientoCuenta("10", "Deposito de 70", fecha10, 70, "Deposito");
		
		movimientosCliente.add(prestamo1);
		movimientosCliente.add(prestamo2);
		movimientosCliente.add(prestamo3);
		movimientosCliente.add(prestamo4);
		movimientosCliente.add(prestamo5);
		movimientosCliente.add(deposito1);
		movimientosCliente.add(deposito2);
		movimientosCliente.add(deposito3);
		movimientosCliente.add(deposito4);
		movimientosCliente.add(deposito5);
		
		// Registro de Movimientos de la Cuenta
		// Intente utilizar bucles y estructuras de control para imprimar segun la fecha
		// Pero era casi imposible
		// Y encontre esta funcion: Collections.sort
		// De la clase Collections, sirve para ordenar los elementos de las listas segun un parametro
		// Lo encontre en una pagina en ingles, así que no entendí mucho
		// Aca esta el link: https://www.interviewkickstart.com/learn/java-collections-sort#:~:text=Collections%20sort%20is%20a%20method,be%20sorted%20in%20alphabetical%20order.
		
		Collections.sort(movimientosCliente, (movimientoCuenta1, movimientoCuenta2) -> movimientoCuenta1.getFecha().compareTo(movimientoCuenta2.getFecha()));
		
		for (int contador = 0; contador < movimientosCliente.size(); contador++)
		{
			System.out.println(movimientosCliente.get(contador).toString());
		}
		
		// Creando los Eventos, su Lista, y añadirlos al Cliente
		
		Date fecha11 = new Date(123, 11, 10);
		Date fecha12 = new Date(123, 2, 22);
		Date fecha13 = new Date(123, 2, 17);
		Date fecha14 = new Date(123, 11, 2);
		Date fecha15 = new Date(123, 24, 0);
		
		EventoBancario evento1 = new EventoBancario(fecha11, "Peru Sostenible", "Evento de sostenibilidad en el pais y generar un impacto positivo en el Peru y la region.");
		EventoBancario evento2 = new EventoBancario(fecha12, "Semana Mundial del Ahorro", "Tendra la oportunidad de adquirir conocimientos, habilidades y actitudes para tomar decisiones solidas y lograr su bienestar economico.");
		EventoBancario evento3 = new EventoBancario(fecha13, "Finanzas al Toque", "Los participantes accederan a todo lo que necesitan saber de finanzas para la vida y los negocios. Desarrollara temas como que son las billeteras digitales y como usarlas; como gestionar adecuadamente el presupuesto familiar; que es el flujo de caja y WhatsApp empresa; que es la Defensoria del Cliente Financiero, entre otros.");
		EventoBancario evento4 = new EventoBancario(fecha14, "Cuidar mi Negocio", "Tu y tu negocio merecen seguir creciendo sin limites y nosotros te ayudamos a lograrlo compartiendo la experiencia de nuestros expertos en negocios este 2 de diciembre en el quinto Encuentro Digital de Emprendedores.");
		EventoBancario evento5 = new EventoBancario(fecha15, "Finanzas Personales", "Este 2023, queremos llevar educacion financiera a todo el Peru. ¡Conectate al Curso gratuito de Finanzas Personales para estudiantes de Educacion Superior! Dictado por el especialista Walter Eyzaguirre.");
		
		List<EventoBancario> eventos2023 = new ArrayList<EventoBancario>();
		
		eventos2023.add(evento1);
		eventos2023.add(evento2);
		eventos2023.add(evento3);
		eventos2023.add(evento4);
		eventos2023.add(evento5);
		
		// En el diagrama no había Get o Set de los eventosBancarios
		// Asi que lo agregue
		
		cliente.setEventosBancarios(eventos2023);
	}
}
