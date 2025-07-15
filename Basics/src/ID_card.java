import java.util.Scanner;

public class ID_card {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name  = sc. nextLine();
        System.out.println("Enter your Gender: ");
        String gender = sc.nextLine();
        System.out.println("Enter your roll number: ");
        Long  roll_no = sc.nextLong();
        System.out.println("Enter your Date  of Birth: " );
        int Date = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        System.out.println("Enter your Phone Number: ");
        Long Phone_no =  sc.nextLong();
        sc.nextLine();
        System.out.println("Enter your Blood group: ");
        String blood_group = sc.nextLine();
        System.out.println("Enter your Email Address: ");
        String email = sc.nextLine();
        System.out.println(name);
        System.out.println(gender);
        System.out.println(roll_no);
        System.out.println(Date +"/" + month + "/" + year);
        System.out.println(Phone_no);
        System.out.println(blood_group);
        System.out.println(email);
    }
}
