import java.util.Scanner;

public class ExerciseSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int promedio = 0;
int nota1 = 0;
int nota2 = 0;
System.out.print("Digite la primer nota: ");
nota1 = scanner.nextInt();
System.out.print("Digite la segunda nota: ");
nota2 = scanner.nextInt();
promedio = (nota1 + nota2) / 2;
System.out.println("El promedio de las dos notas es: " + promedio);
switch(promedio)
{
case 0,1,2,3,4:
	System.out.println("El estudiante reprobó");
break;
case 5,6:
	System.out.println("El estudiante tiene derecho a un SUPLETORIO");
break;
default:
	System.out.println("El estudiante aprobó");
	break;

}
	}

}
