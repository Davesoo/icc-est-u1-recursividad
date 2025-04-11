import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor base:");
        int b = leer.nextInt();
        System.out.println("Ingrese un valor de potencia:");
        int e = leer.nextInt(); 
        System.out.println(b + "^" + e);

        int resultadoPotencia = potencia(b, e);
        System.out.println(b + " elevado a la potencia de " + e + " es: " + resultadoPotencia);

        int n = 5;
        int resultadoFactorial = factorial(n);
        System.out.println("El factorial de " + n + " es: " + resultadoFactorial);

        EjerciciosRecursivos eRecursivos = new EjerciciosRecursivos();
        int fibo = eRecursivos.fibonacci(5);
        System.out.println("El Fibonacci de 5 es: " + fibo);
        
        int numero = 12345;
        int resultadoSumaDigitos = EjerciciosRecursivos.sumaDigitos();  // Método estático
        System.out.println("La suma de los dígitos de " + numero + " es: " + resultadoSumaDigitos);

        leer.close();
    }

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1; 
        }
        return base * potencia(base, exponente - 1); 
    }

    
    public static int factorial(int n) {
        if (n == 0) {
            System.out.println("Alcancé el caso base");
            return 1; 
        }
        int resultado = n * factorial(n - 1);
        System.out.println("Calculando factorial de: " + n + " * factorial(" + (n - 1) + ")");
        return resultado;
    }
    
}

class EjerciciosRecursivos {

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;  
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  
    }

    public int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;  
        }
        return base * potencia(base, exponente - 1);
    }
}

