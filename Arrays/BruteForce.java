package Arrays;
public class BruteForce {
    public static void Brute(int arr[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j = 0; j<arr.length; j++){
                int end = j;
                currsum=0;
                for(int k = start; k<=end; k++){
                    currsum += arr[k];
                }
                System.out.println(currsum);
                if(maxsum < currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("maxsum is " + maxsum);
        
        
    }
    
    
    
    public static void main(String args[]){
        int arr[] = {1,-2,6,-1,3};
        Brute(arr);
    }
}
