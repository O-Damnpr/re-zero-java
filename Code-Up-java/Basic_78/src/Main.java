import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = 1; i <= num; i++){
            if(i%2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}