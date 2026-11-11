import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dividendo = 0;
        System.out.println("Cada cuantos chicles nos dan un envoltorio? ");
        int chicles = sc.nextInt();

        System.out.println("Cuantos envoltorios nos dan? ");
        int envoltorios = sc.nextInt();

        System.out.println("Con cuantos chicles empezamos? ");
        int chicles_empezamos = sc.nextInt();

        while (chicles_empezamos > 0 && envoltorios > 0){
            chicles_empezamos = chicles_empezamos / chicles;
            dividendo = chicles_empezamos % chicles;
        }
        System.out.println(chicles_empezamos);
        System.out.println(dividendo);
    }
}