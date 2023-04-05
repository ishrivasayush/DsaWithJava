package Array;

import java.util.*;

public class CompareTwoArray {

    public static void main(String[] args) {

        int arr1[]={10,20,30,40,50};
        int arr2[]={20,30,10,40,50};
        approach2(arr1,arr2);

    }
    public static void approach2(int arr1[],int arr2[])
    {
        int flag=0;
        if(arr1.length!=arr2.length)
        {
            flag=1;
        }
        else {
            Map<Integer,Integer> mp=new HashMap<>();
            for (int x:arr1) {
                 if (mp.get(x)==null)
                 {
                     mp.put(x,1);
                 }
                 else {
                     int count=mp.get(x);
                     count++;
                     mp.put(x,count);
                 }
            }
            for(int y:arr2)
            {
                if (mp.get(y)==null || mp.get(y)==0)
                {
                    flag=1;
                    break;
                }
                else {
                    int count=mp.get(y);
                    count--;
                    mp.put(y,count);
                }
            }

        }
        if (flag==0)
        {
            System.out.println("Arrays are equal!");
        }
        else {
            System.out.println("Arrays are not equal!");
        }
    }
    static void Approach1(int arr1[],int arr2[])
    {
        boolean flag=false;
        if (arr1.length==arr2.length) {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i]==arr2[i])
                {
                    flag=true;
                }
            }
            if (flag==true)
            {
                System.out.println("Same");
            }
        }
    }
}
