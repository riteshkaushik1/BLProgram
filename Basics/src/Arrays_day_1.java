//import java.util.Scanner;
//
//public class Arrays_day_1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] marks =  new int[n];
//        for(int j=0;j<n;j++){
//            marks[j] = sc.nextInt();
//        }
//        for( int num : marks){
//            System.out.println(num);
//        }
//    }
//}
// 2d -  Arrays
import java.util.Scanner;

public class Arrays_day_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] marks =  new int[n][m];
        for(int j=0;j<n;j++){
            for(int k=0;k<m;k++){
                marks[j][k] = sc.nextInt();

            }
        }
        for (int k = 0; k < n; k++) {
            for(int j = 0; j < m; j++) {
                System.out.print(marks[k][j] + " ");
            }
        }

    }
}
