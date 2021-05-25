import java.util.Scanner;

public class PracticoDosEjercicio7 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		int edad;
		int experiencia; 
		int remuneracion;
		

	System.out.println("Ingrese su edad");
	edad = sc.nextInt();
	System.out.println("Ingrese sus años de experiencia");
	experiencia = sc.nextInt();
	System.out.println("Ingrese su remuneracion pretendida");
	remuneracion = sc.nextInt();
	
	
	//Calculos
	
	if (edad >= 18 && edad <= 35 && experiencia > 3 && remuneracion < 50000) {
		System.out.println("Usted fue seleccionado definitivamente");
		
	}
	
		//else  {System.out.println("Usted fue rechazado");}

	
	if (edad > 32 && experiencia > 6) 
		{
		
		System.out.println("Usted fue seleccionado definitivamente");
	}
	
	
	
	else if  (edad > 32 && experiencia < 6 && experiencia > 3) {
		System.out.println("Fue seleccionado parcialmente");
	}
	
		
		else 
	    {System.out.println("Usted fue rechazado");}
	 
	
   //Calculos
		
		
		
		

	}

}
