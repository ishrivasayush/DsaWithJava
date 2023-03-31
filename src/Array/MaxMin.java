package Array;

public class MaxMin {
    public static void main(String[] args) {
        int arr[]={23,34,555,32,4};
        int max=arr[0],min=arr[0];
        for (int a:arr) {
            if (max<a)
            {
                max=a;
            }
            if (min>a)
            {
                min=a;
            }
        }
        System.out.println(max+" "+min);
    }
}
