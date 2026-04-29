package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int numMaior=0,numMenor=0;

        //Math.random()
        for (int i=0;i<=5;i++){
            System.out.println("Digite um numero");
            int a = sc.nextInt();
            if (a>numMaior){
                numMaior=a;
            }else if(a<=numMenor||numMenor==0){
                numMenor=a;
            }

        }
        System.out.println(numMenor);
        System.out.println(numMaior);


    }
}
