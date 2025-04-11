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

    public static void imprimirDescendente(int n1) {
        if (n1 < 1) {
            return; // Caso base: no se imprime nada si n < 1
        }

        System.out.print(n1 + " ");
        imprimirDescendente(n1 - 1); // Llamada recursiva con n - 1
    }

    public static int reverso(int n) {
        return reversoHelper(n, 0);
    }

    private static int reversoHelper(int n, int acumulador) {
        if (n == 0) {
            return acumulador;
        }

        int digito = n % 10;
        return reversoHelper(n / 10, acumulador * 10 + digito);
    }
}