import java.util.Scanner;

public class ciclos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);    // declaro un scanner
        int[][] num= new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("ingrese un valor entero");
                num[i][j] = entrada.nextInt();
            };
        };
        // muestro los valores
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(num[i][j] + " ");
            };
            System.out.println(".");
        }
    };
}