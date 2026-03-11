import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        while(temp > 0){
            temp = temp / 10;
            count++;
        }

        int[] digits = new int[count];

        temp = num;
        for(int i=0;i<count;i++){
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        System.out.print("Reversed number: ");

        for(int i=0;i<count;i++){
            System.out.print(digits[i]);
        }

    }
}