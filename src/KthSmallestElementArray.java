import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElementArray {

    public static int kthSmallestElementArray(int [] arr, int k){
        PriorityQueue<Integer> ans = new PriorityQueue<>(Collections.reverseOrder());
        for(int i= 0; i<arr.length; i++){
            ans.add(arr[i]);
        }
        while(ans.size()>k){
            ans.poll();
        }
        return ans.peek();
    }
    public static void main(String[] args) {

    }
}
