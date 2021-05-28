import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int NumeroPatente;
		int ValorModelo;
		int AutosM13 = 0;
		int Recaudado = 0;
		float Impuesto;
		int CA;
		
		for (CA=0; CA<3 ;CA++) {
		
		System.out.println("Ingrese numero de patente");
		NumeroPatente = sc.nextInt();
		System.out.println("Ingrese el valor del modelo");
		ValorModelo = sc.nextInt();

		if (NumeroPatente > 130000) { AutosM13 ++; }
		
		if (NumeroPatente > 100000) {
			
		Impuesto = (float) (ValorModelo *0.05);
		
		System.out.println("Usted tiene que pagar" + "  " + Impuesto );
		
		Recaudado += Impuesto;
			
			
		}
		
		else if (NumeroPatente > 100000 && NumeroPatente < 200000) {
			
		Impuesto = (float) (ValorModelo *0.10);
			
        System.out.println("Usted tiene que pagar" + "  " + Impuesto );
		
		Recaudado += Impuesto;	
			
		}
		
		
		else  {
			
		Impuesto = (float) (ValorModelo *0.15);
			
        System.out.println("Usted tiene que pagar" + "  " + Impuesto );
		
		Recaudado += Impuesto;	
			
		}

		
		}
		
		float PorcentajeM13 = (AutosM13*CA)/100;
		
		System.out.println("El monto total recaudado es     " + Recaudado);
		System.out.println("El porcentaje de autos mayores a 130000 es       " +     PorcentajeM13+"%"             );
		
		
	}

}
