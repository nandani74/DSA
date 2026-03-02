package Arrays;
public class Largest {
    public static int LargestNum(int arr[]){
        int Largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(Largest<arr[i]){
                Largest = arr[i];
            }
        }
        return Largest;
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        System.out.println(LargestNum(arr));
    }
}
