package Exercicios;

import java.util.Scanner;

public class Ex01 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero (calc Fatorial)");
        int mult=sc.nextInt();
        int soma=1;

        for (int i = 1;i<=mult;i++){
            soma *=i;
        }
        System.out.println(soma);
    }
}
