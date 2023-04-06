package Algorithms;
import java.util.Scanner;
public class Searching {
    public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Value of n:");
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= scanner.nextInt();
        }
        System.out.println("Enter the Elements Key:");
        int key= scanner.nextInt();
        if (LinearSearch(arr,key)==-1)
        {
            System.out.println("Element Not Found");
        }
        else {
            System.out.println("Element Found At Location: "+LinearSearch(arr,key));
        }
    }
    public static int LinearSearch(int arr[],int key)
    {
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static int LinearSearchString(String s[],String key)
    {
        for (int i = 0; i < s.length ; i++) {
            if (s[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static int BinarySearch(int arr[],int key)
    {
        return -1;
    }
}
