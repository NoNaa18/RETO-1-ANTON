import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cada cuantos chicles nos dan un envoltorio? ");
        int necesito = sc.nextInt();

        System.out.println("Cuantos envoltorios nos dan? ");
        int envoltorios = sc.nextInt();

        System.out.println("Con cuantos chicles empezamos? ");
        int compramos = sc.nextInt();

        int solucion = 0;
        int suma = 0;
        int division = 0;
        int resultado = 0;

        while (compramos >= necesito){
            if (envoltorios >= compramos) {
                System.out.println("RUINA");
            } {
                division = compramos / necesito;
                suma = division / necesito;
                resultado = division + suma + compramos;

                solucion = division / necesito;
            }
            break;
        }
        System.out.println(resultado);
        System.out.println(solucion);
    }
}
