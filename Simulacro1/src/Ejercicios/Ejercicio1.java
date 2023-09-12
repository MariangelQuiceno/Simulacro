package Ejercicios;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/* 1. Haga un algoritmo que solicite el nombre, documento, edad y profesión de n personas e imprima la siguiente información:
- Cantidad de personas ingresadas
- Cantidad de personas mayores de edad
- Cantidad de personas menores de edad. 
*/

public class Ejercicio1 {
	public static void main(String[] args) {
		
		String mensaje = "Menu del sistema\n" + 
		"1. Ingresar Usuario\n" + 
		"2. Información Usuarios\n" + 
		"3. Salir\n";
		
		int entrada = Integer.parseInt(JOptionPane.showInputDialog( mensaje + "\n Ingrese una opción"));
		
		 ArrayList<String> sistema = new ArrayList<String>();
		 
		 do {
		
		switch (entrada) {
		case 1:
			String nombre = JOptionPane.showInputDialog("Ingrese un Nombre");
			String documento = JOptionPane.showInputDialog("Ingrese un Documento");
			String profesion = JOptionPane.showInputDialog("Ingrese su Profesión");
			String edad = JOptionPane.showInputDialog("Ingrese su Edad");
			 
			 sistema.add(nombre);
			 sistema.add(documento);
			 sistema.add(profesion);
			 sistema.add(edad);
			 
			 int entrada1 = Integer.parseInt(JOptionPane.showInputDialog("Pulse 3 para volver al menu"));
			 if(entrada1 == 3) {
				entrada = Integer.parseInt(JOptionPane.showInputDialog( mensaje + "\n Ingrese una opción"));
			 }
		break;
			 
		case 2:
			String informacion = "Usuarios Mayores de edad: " + Mayores(null);
			
			System.out.println(informacion);
			
		break;
			 
			 
			 
}	
		
	}while
	
	public static int Mayores(ArrayList<String> sistema) {
		
		int contador = 0;
		String mayor = sistema.get(3);
		
		if( mayor == "18") {
		contador++;
		}	
		
		return contador;
	}
	
	
}
