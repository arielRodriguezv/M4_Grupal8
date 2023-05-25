
import java.util.Scanner;

public class M4Ejercicio_Grupal8 {

	static void registrar() {

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Ingrese un nombre");
			nombre = scan.nextLine();
		} while (nombre.isBlank());

		do {
			System.out.println("Ingrese Fecha nacimiento");
			fechaNac = scan.nextLine();
		} while (fechaNac.isBlank());

		do {
			System.out.println("Ingrese Run");
			run = scan.nextLine();
		} while (run.isBlank());

		do {
			System.out.println("Ingrese tipo de usuario : Cliente/Profesional/Administrativo");
			tipo = scan.nextLine();
			tipo = tipo.toLowerCase();
		} while (tipo.isBlank());
	}

	static void registraTipo() {
		Scanner scan = new Scanner(System.in);

		switch (tipo) {
		case "cliente":
			System.out.println("Ingrese direccion");
			direccion = scan.nextLine();
			System.out.println("Ingrese telefono");
			telefono = scan.nextLine();
			System.out.println("Ingrese la cantidad de empleados");
			Scanner cantemp = new Scanner(System.in);
			cantEmpleados = cantemp.nextInt();

			break;

		case "profesional":
			System.out.println("Ingrese años de experiencia");
			añosExp = scan.nextInt();

			System.out.println("Ingrese departamento al cual pertenece");
			Scanner depa = new Scanner(System.in);
			departamento = depa.nextLine();

			break;

		case "administrativo":
			System.out.println("Ingrese la funcion que cumple");
			funcion = scan.nextLine();
			System.out.println("Ingrese nombre de superior");
			nombreSup = scan.nextLine();

			break;
		}
	}

	static void mostrarUser() {

		System.out.println("Nombre: " + nombre);
		System.out.println("Fecha de nacimiento: " + fechaNac);
		System.out.println("Run: " + run);
		System.out.println("Tipo de usuario: " + tipo);

		if (tipo.equals("cliente")) {
			System.out.println("Dirección: " + direccion);
			System.out.println("Telefono: " + telefono);
			System.out.println("Cantidad de empleados: " + cantEmpleados);
		} else if (tipo.equals("profesional")) {
			System.out.println("Años de experiencia: " + añosExp);
			System.out.println("Departamento: " + departamento);
		} else if (tipo.equals("administrativo")) {
			System.out.println("Función: " + funcion);
			System.out.println("Nombre de Superior: " + nombreSup);

		}

	}

	static String nombre = "";
	static String fechaNac = "";
	static String run = "";
	static String tipo = "f";
	static String direccion = "";
	static String telefono = "";
	static String departamento = "";
	static String funcion = "";
	static String nombreSup = "";
	static int cantEmpleados = 0;
	static int añosExp = 0;

	public static void main(String[] args) {

		System.out.println("Asesorias en prevención de riesgos SPA.");
		System.out.println("Bienvenido");

		registrar();

		registraTipo();

		mostrarUser();

	}

}
