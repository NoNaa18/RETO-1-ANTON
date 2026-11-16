import java.util.Scanner;

public class SumaDescendente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        int numero = teclado.nextInt();
        String numeroTexto = String.valueOf(numero);
        int digitos = numeroTexto.length();
        int resultado = 0;

        for(int i = 1; i <= digitos; i++) {
            resultado = resultado + Integer.parseInt(numeroTexto);
            numeroTexto = numeroTexto.substring(1);
        }
        System.out.println("El resultado es: " + resultado);
    }
}
