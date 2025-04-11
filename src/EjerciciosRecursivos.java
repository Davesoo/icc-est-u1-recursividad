public class EjerciciosRecursivos {

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

    public static int sumaDigitos(int numero) {
        if (numero < 10) {
            return numero;
        }
        
        return (numero % 10) + sumaDigitos(numero / 10);
    }

    public int sumaConsecutivos(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumaConsecutivos(n - 1);
    }
}



