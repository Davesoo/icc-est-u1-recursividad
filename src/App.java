public class App {
    public static void main(String[] args) throws Exception {
// los metodos estaticos pueden  llamar solo a metodos estaticos
        int n= 5;
        int resultadoFinal = factorial(n);
        System.out.println("resultado:" + resultadoFinal);
        
    }
   public static int  factorial(int n){
    if(n==0){
        System.out.println("Alcanse el caso base");
        return 1;
       
    }
    int resultado = n * factorial(n-1);
    System.out.println("Calcular factorial de: "+ n + "* factorial(" + (n-1) + " -1)");
    return resultado;
    }

    EjerciciosRecursivos e = new EjerciciosRecursivos ();
    int fibo = e.fibonacci (5);
    
}
