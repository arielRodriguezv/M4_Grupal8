
import java.util.Scanner;
public class M4Ejercicio_Grupal8 {
	
	static void registrar() {
		
		Scanner name = new Scanner(System.in);
		System.out.println("Ingrese nombre");
		nombre = name.nextLine();
		
		Scanner birth = new Scanner(System.in);
		System.out.println("Ingrese Fecha nacimiento");
		fechaNac = birth.nextLine();
		
		Scanner id = new Scanner(System.in);
		System.out.println("Ingrese Run");
		run = id.nextLine();
		
		Scanner type = new Scanner(System.in);
		System.out.println("Ingrese tipo de usuario : Cliente/Profesional/Administrativo");
		tipo = type.nextLine();
		
	}
	
	static String nombre = "";
	static String fechaNac = "";
	static String run = "";
	static String tipo = "";

	public static void main(String[] args) {
		
		
		
		
		System.out.println("Asesorias en prevecion de riesgos SPA.");
		System.out.println("Bienvenido");
		
		registrar();
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Fecha de nacimiento: " + fechaNac);
		System.out.println("Run: " + run);
		System.out.println("Tipo de usuario: " + tipo);

	}

}
