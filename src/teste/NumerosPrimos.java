package teste;

public class NumerosPrimos {
    static void main() {
        int num,divisaoUm=1;
        boolean primeiro=false,segundo=false;

        for (int i = 1;i<=50; i++){
            num=i;
            divisaoUm = i%1;
            if (num/num == 1){
                primeiro = true;
            }
        }
    }
}
