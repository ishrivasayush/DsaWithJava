package Array;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.println("Enter the values :");
                arr[i][j]= scanner.nextInt();
            }
        }
        for (int x[]: arr) {
            for (int y:x) {
                System.out.println(y);
            }
        }
    }
}
