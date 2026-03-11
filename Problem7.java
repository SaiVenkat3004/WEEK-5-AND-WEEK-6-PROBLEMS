import java.util.Scanner;

public class Problem7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        // Count digits
        while(temp > 0){
            temp = temp / 10;
            count++;
        }

        int[] digits = new int[count];

        temp = num;

        // Store digits
        for(int i = 0; i < count; i++){
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        int[] frequency = new int[10];

        // Count frequency
        for(int i = 0; i < count; i++){
            frequency[digits[i]]++;
        }

        // Display frequency
        System.out.println("Digit Frequencies:");

        for(int i = 0; i < 10; i++){
            if(frequency[i] > 0){
                System.out.println(i + " -> " + frequency[i]);
            }
        }

    }
}