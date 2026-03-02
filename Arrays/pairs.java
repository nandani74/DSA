package Arrays;

public class pairs {
    public static void pairsArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            for(int j=i+1; j<arr.length;j++){
                System.out.print("(" + curr + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[] = {2,3,5,6,9};
        pairsArr(arr);

    }
}
