//import java.util.Scanner;
//
//public class Basic_questions {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int l =  sc.nextInt();
//        int r = sc.nextInt();
//        int incre = sc.nextInt();
//         for(int i = l; i <= r; i++){
//             arr[i] += incre;
//         }
//         for(int i = 0; i < n; i++){
//             System.out.print(arr[i] + " ");
//         }
//    }
//}

import java.util.*;
public class Basic_questions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch =  str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            System.out.println(map.get(ch)+ " ");
        }
    }

}