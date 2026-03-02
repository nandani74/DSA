package Arrays;
public class LinearSearch{
    public static int Linear(int arr[],int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,9};
        int key = 9;
        int index=Linear(arr,key);
        if(index==-1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("key at index : "+ index);
        }
    }
}