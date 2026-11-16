import java.util.Scanner;

public class    Acuarios {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime el numero de compartimentos: ");
        int numCompartimentos = teclado.nextInt();
        System.out.print("Dime la cantidad de litros del acuario mas grande: ");
        int litrosAcuarioGrande = teclado.nextInt();
        System.out.print("Dime la diferencia de litros entre cada acuario: ");
        int diferenciaLitros = teclado.nextInt();
        int sumaTotal = 0;
        for(int i = 1; i <= numCompartimentos; i++) {
            sumaTotal = sumaTotal + litrosAcuarioGrande;
            litrosAcuarioGrande = litrosAcuarioGrande - diferenciaLitros;
        }
        System.out.println("La cantidad de litros de agua necesarios para llenar el acuario es de: " + sumaTotal);
    }
}