package Stack;
import java.util.Stack;
public class nextGreaterElement {
    public static int[] nextGrtElem(int [] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1; // last element of ans[] will always -1
        st.push(arr[n-1]);
        for (int i = n-2; i >= 0 ; i--) {
            if (st.peek() > arr[i]) {
                ans[i] = st.peek();
                st.push(arr[i]);
            }
            else { // st.peek() <= arr[i]
                while(st.peek() <= arr[i]){
                    st.pop();
                    if (st.isEmpty()) break;
                }
                if (st.isEmpty()) {
                    ans[i] = -1;
                    st.push(arr[i]);
                }
                else {
                    ans[i] = st.peek();
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
     int [] arr = {1,1,1,1};
     int [] ans = nextGrtElem(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
