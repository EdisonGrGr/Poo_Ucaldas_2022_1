import java.util.Scanner;

public class Taller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio1();
		//Ejercicio2();
		//Ejercicio3();
		//Ejercicio4();
		//Ejercicio5();
		//Ejercicio6();
		//Ejercicio7();
		//Ejercicio8();
		Ejercicio9();
		Ejercicio10();
		Ejercicio11();
		Ejercicio12();
		Ejercicio13();
	}
public static void Ejercicio1()
		{
			/*/Escribe un programa en el que se declaren las
			variables enteras numeroA y numeroB. Asignales los
			valores 89 y 323. Mostrar por consola el valor de cada
			variable, la suma, la resta, la división y la
			multiplicación./*/
			double numeroA = 89;
			double numeroB = 323;
			double suma = 0, resta = 0, division = 0, multiplicacion = 0;
			System.out.println("El número A es : " + numeroA);
			System.out.println("El número B es : " + numeroB);
			suma = numeroA + numeroB;
			System.out.println("La suma de ambos números es: " + suma);
			resta = numeroA - numeroB;
			System.out.println("La resta de ambos números es: " + resta);
			multiplicacion = numeroA * numeroB;
			System.out.println("La multiplicacion de ambos números es: " + multiplicacion);
			division = numeroA / numeroB;
			System.out.println("La dividion de ambos números es: " + division);					
	}
public static void Ejercicio2()
{
	/*/Realiza un conversor de pesos a dolar. La cantidad en
	pesos que se quiere convertir deberá estar
	almacenada en una variable.
	El valor de un dolar es: $3.895 pesos/*/
	Scanner scanner = new Scanner(System.in);
	double pesos = 0;
	double dolar = 3895;
	double conversor = 0;
	System.out.print("Digite la cantidad de pesos que desea convertir a dolares: $");
	pesos = scanner.nextDouble();
	conversor = pesos / dolar;
	System.out.println("La cantidad ingresada en dolares es: $" + conversor);
}
public static void Ejercicio3()
{
	/*/Escribe un programa que calcule el total de una
	factura a partir de la base de la compra (precio sin
	IVA). La base de la compra estará almacenada en una
	variable.
	Salida en consola:
	Base sin IVA: $3500
	IVA: $665
	Total: $4165/*/
	Scanner scanner = new Scanner(System.in);
	double basecompra = 0;
System.out.print("Digite la base de la compra sin IVA: $");
basecompra = scanner.nextDouble();
double totalfactura = (basecompra * 0.19)+basecompra;
System.out.println("El total de la compra con el IVA es: " + totalfactura);
}
public static void Ejercicio4()
{
	/*/Escribe un programa en que dado un número del 1 a
	7 escriba el correspondiente nombre del día de la
	semana y lo muestre por consola/*/
	Scanner scanner = new Scanner(System.in);
	int num = 0;
	System.out.print("Digite un número del 1 al 7: ");
	num = scanner.nextInt();
	switch(num)
	{
	case 1:
	{
		System.out.print("Lunes");
		break;
	}
	case 2:
	{
		System.out.print("Martes");
		break;
	}
	case 3:
	{
		System.out.print("Miercoles");
		break;
	}
	case 4:
	{
		System.out.print("Jueves");
		break;
	}
	case 5:
	{
		System.out.print("Viernes");
		break;
	}
	case 6:
	{
		System.out.print("Sabado");
		break;
	}
	case 7:
	{
		System.out.print("Domingo");
		break;
	}
	default:
		System.out.print("El número ingresado no es apto");
	}
}
public static void Ejercicio5()
{
	/*/Escribe un programa que ordene tres números
	enteros introducidos por teclado. Que los muestre sin
	ordenar y despues ordenados por consola/*/
	Scanner scanner = new Scanner(System.in);
	int num1 = 0, num2 = 0, num3 = 0;
	System.out.println("Digite tres numeros: ");
	num1 = scanner.nextInt();
	num2 = scanner.nextInt();
	num3 = scanner.nextInt();
	System.out.println("Los número digitados son :" + num1 + " "  + num2 + " " + num3);
	System.out.println("Los numeros digitados en orden ascendente son: ");
	if (num1 >= num2 && num2 >= num3)
	{
	System.out.print("" + num3 + num2 + num1);
	}
	else if (num2 >= num3 && num3 >= num1)
	{
	System.out.print("" + num1 + num3 + num2);
	}
	else if (num3 >= num1 && num1 >= num2)
	{
		System.out.print("" + num2 + num1 + num3);
	}
	else 
	{
		System.out.println("" + num1 + num2 + num3);
	}

}
public static void Ejercicio6()
{
	/*/Escribe un programa que diga cuál es el primer cifra
	de un número entero introducido por teclado. Se
	permiten números de hasta 5 cifras./*/
	Scanner scanner = new Scanner(System.in);
	int numero = 0, primer = 0;
	System.out.println("Digite un numero de maximo 5 cifras: ");
	numero = scanner.nextInt();
	if ( numero < 10 ) {
	      primer = numero;
	    }	    
	    if (( numero >= 10 ) && ( numero < 100 )) {
	      primer = numero / 10;
	    }	    
	    if (( numero >= 100 ) && ( numero < 1000 )) {
	      primer = numero / 100;
	    }	    
	    if (( numero >= 1000 ) && ( numero < 10000 )) {
	      primer = numero / 1000;
	    }	    
	    if ( numero >= 10000 ) {
	      primer = numero / 10000;
	    }	    
	    System.out.println("La primera cifra del número digitado es: " + primer + ".");
	    }
public static void Ejercicio7()
{
	/*/Muestra los números múltiplos de 8 de 0 a 100
	utilizando un bucle while./*/
	int i = 0;
	while (i++ <= 99)
	{
		System.out.println(i);
		if (i%8==0)
		{
			System.out.println("Es multiplos de 8");
		}
	}
}
public static void Ejercicio8()
{
	/*/Escribe un programa que calcule el promedio de un
	conjunto de números positivos introducidos por
	teclado. El programa no sabe cuántos números se
	ingresaran. El usuario indicará que ha terminado de
	ingresar los datos cuando ingrese un número
	negativo./*/
	Scanner scanner = new Scanner(System.in);
	double i = 0;
    double numeroDigitado = 0;
    double suma = 0;

    System.out.println("Este programa calcula el porcentaje de los números positivos digitados.");
    System.out.println("Para parar, introduzca un número negativo.");
    System.out.println("Vaya digitando números:");

    while (numeroDigitado >= 0) {
      numeroDigitado = scanner.nextDouble();
      i++;
      suma += numeroDigitado;
    }
    
    System.out.print("El promedio de los números positivos digitados es ");
    System.out.println((suma - numeroDigitado) / (i - 1));
}
public static void Ejercicio9()
{
	/*/Escribe un programa que lea por consola diez
	números e indique cuántos son positivos, y cuántos
	son negativos./*/
	Scanner scanner = new Scanner(System.in);
	int[] num = new int [10];	
	System.out.println("Digite 10 números: ");
	int contadorPos = 0, contadorNeg = 0;
	for (int i = 0; i<= 9; i++)
	{
		int number = scanner.nextInt();
		num[i] = number;
		if (num[i] < 0)
			contadorNeg++;
		else if(num[i] >= 0)
			contadorPos++;
	}
	System.out.println("la cantidad de números positivos es: " + contadorPos);
	System.out.println("la cantidad de números positivos es: " + contadorNeg);
		}
public static void Ejercicio10()
{
	/*/Escribe un programa que recibe un número por
	consola e imprima una pirámide de números
	Ejemplo
	1
	121
	12321
	1234321/*/
	Scanner scanner = new Scanner(System.in);
	System.out.print("Ingrese un número: ");
    int numeroNivel = scanner.nextInt();
    int numeroPosicion = numeroNivel * 2 -1;
    int posInicial = numeroNivel;
    int posFinal = numeroNivel;
    
    for (int i = 0; i < numeroNivel; i++) {
      int contador = 1;
      String resultado = "";
      
      for (int j=0; j <= numeroPosicion; j++) {
        if ((j < posInicial) || (j > posFinal)) {
          resultado += " ";
        } else {
          if (j < numeroNivel) {
            resultado += contador;
            contador++;
          } else {
            resultado += contador;
            contador--;
          }
        }    
      }
      System.out.println(resultado);
      posFinal++;
      posInicial--;
    }
}
public static void Ejercicio11()
{
	/*/Crear un arreglo de 10 caracteres con el nombre
	caracteres y asigna valores a los elementos según la
	siguiente tabla:
	Posición 0 1 2 3 4 5 6 7 8 9
	Valor ‘h' ‘z' '@' ' ' '+' ‘J/*/
	Scanner scanner = new Scanner(System.in);
	System.out.print("Escriba una palabra: ");
	String caracteres = scanner.next().toUpperCase();
	char[] Carac = new char[caracteres.length()]; 
	if(caracteres.length() < 10) {
		System.out.println("Palabra desglosada en el arreglo: ");
	for(int i = 0; i < caracteres.length(); i++)
	{
		Carac[i] = caracteres.charAt(i);	
	}
	for(char c : Carac) {
		System.out.println(c);
	}
	}
	else
		System.out.println("Limite superado para el arreglo. ");

}
public static void Ejercicio12()
{
	/*/Crea un programa que reciba por consola 10 números
	y que luego los muestre en orden inverso, es decir, el
	primero que se ingresa es el último en mostrarse y
	viceversa./*/
	Scanner scanner = new Scanner (System.in);
	System.out.print("Ingrese 10 números: ");	
	int[] num = new int [10];
		for(int i = 0; i < 10; i++)
		{
			num[i] = scanner.nextInt();
		}
		System.out.println("Números al reves: " );
	int j = 9;
	while(j >= 0) {
		System.out.println(num[j]);
	j--;
	}
}
public static void Ejercicio13()
{
	/*/Crea un programa que solicite por consola 8 números
	enteros y que luego muestre esos números junto con
	la palabra "par" o "impar"./*/
	Scanner scanner = new Scanner (System.in);
    int[] num = new int [8];
	
	System.out.print("Ingrese 8 números: ");
	
	for(int i = 0; i<= 7; i++)
	{
		int nums = scanner.nextInt();
		num[i] = nums;
	}
	System.out.println("Clasificación: ");
	for(int i = 0; i<= 7; i++) {
	if(num[i] % 2 == 0) 
		 System.out.println(num[i] + " Par");
		else 
			System.out.println(num[i] + " Impar");
	}
}
}
