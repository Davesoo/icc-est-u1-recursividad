public class EjerciciosRecursivos {

    // Método para calcular Fibonacci
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Método para calcular potencia de un número de manera recursiva
    public int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }

    // Método para calcular la suma de los dígitos de un número
    public static int sumaDigitos(int numero) {
        // Caso base: si el número es menor que 10, devuelve el mismo número
        if (numero < 10) {
            return numero;
        }
        
        // Caso recursivo: extraer el último dígito con el operador %
        return (numero % 10) + sumaDigitos(numero / 10);
    }

    // Método para sumar números consecutivos de forma recursiva
    public int sumaConsecutivos(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumaConsecutivos(n - 1);
    }
}



