import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElementArray {


    //get a max heap and delete all the large elements and store only the k smaller elements
    //at the end just return the max out those k element which will be basically the smallest among the whole array
    // but the greatest in those k elements
    public static int kthSmallestElementArray(int [] arr, int k){
        //max heap
        PriorityQueue<Integer> ans = new PriorityQueue<>(Collections.reverseOrder());
        //add
        for(int i= 0; i<arr.length; i++){
            ans.add(arr[i]);
        }
        //store only the k elements
        while(ans.size()>k){
            ans.poll();
        }
        //return the largest among them
        return ans.peek();
    }
    public static void main(String[] args) {

    }
}
