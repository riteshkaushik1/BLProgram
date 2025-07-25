import java.util.*;
public class Armstong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original_n = n;
        int temp = n;
        int sum =0;
        int power = 0;
        while(n!=0){
            n = n/10;
            power++;
        }
        while(temp>0){
            int digit = temp%10;
            sum += (int) Math.pow(digit,power);
            temp = temp/10;
        }
        if(sum == original_n){
            System.out.println("Armstrong_number");
        }
        else{
            System.out.println("Not a Armstrong_number");
        }
    }
}
