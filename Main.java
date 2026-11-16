import java.util.Scanner;
//Nona Molina BARA
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //CADA CUANTOS CHICLES NOS DAN UN ENVOLTORIO
        System.out.println("Cada cuantos chicles nos dan un envoltorio? ");
        int necesito = sc.nextInt();
        //LOS ENVOLTORIOS QUE NOS DAN POR CADA CHICLE
        System.out.println("Cuantos chicles nos dan? ");
        int envoltorios = sc.nextInt();
        //LOS CHICLES QUE COMPRO AL PRINCIPIO 
        System.out.println("Con cuantos chicles empezamos? ");
        int compramos = sc.nextInt();

        int envoltoriosDisponibles = compramos;
        int chicles = compramos;    
        //SI NO TENEMOS ENVOLTORIOS SUFICIENTES PARA COMPRAR CHICLES, O SI COMPRAMOS MENOS CHICLES DE LOS QUE NECESITAMOS PARA OBTENER UN ENVOLTORIO, ENTONCES ESTAMOS EN RUINA
        if (necesito <= envoltorios && compramos >= necesito) {
            System.out.println("RUINA");
        } 
        else {
             //MIENTRAS TENGAMOS ENVOLTORIOS DISPONIBLES, SEGUIREMOS COMPRANDO CHICLES
            while (envoltoriosDisponibles >= necesito) {
                // Calcular cuántos chicles conseguimos
                int nuevos = (envoltoriosDisponibles / necesito) * envoltorios;

                // Guardar los envoltorios que sobran
                int sobrantes = envoltoriosDisponibles % necesito;

                // Actualizar los envoltorios
                envoltoriosDisponibles = sobrantes + nuevos;

                // Totales de chicles
                chicles += nuevos;
            }
            //USO EL PRINTF PARA MOSTRAR EL RESULTADO DE LOS CHICLES Y LOS ENVOLTORIOS DISPONIBLES(PORQUE SEGURO QUE ANTON NOS PONE MEJOR NOTA JEJE)
            System.out.printf("%d %d%n", chicles, envoltoriosDisponibles);
        }

        }
    }
