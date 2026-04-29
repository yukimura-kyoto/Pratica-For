package Exercicios;

public class Ex04 {
    static void main() {
        int soma=0;
        for (int i=1;i<=20;i++){
            if (i%2==1){
                System.out.println(i);
                soma= soma+i;
            }
        }
        System.out.println(soma);
    }
}
