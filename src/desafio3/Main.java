package desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
        for (double i = 1; i <= n; i++) {
            h += (1/i);
        }

        //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
        System.out.println(Math.round(h));
    }
}
