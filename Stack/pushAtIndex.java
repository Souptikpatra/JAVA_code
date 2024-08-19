package Stack;
import java.util.Scanner;
import java.util.Stack;
public class pushAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give index: ");
        int index = sc.nextInt();
        System.out.print("give value: ");
        int value = sc.nextInt();
        Stack<Integer> original_st = new Stack<>();
        original_st.push(10);
        original_st.push(20);
        original_st.push(30);
        original_st.push(40);
        System.out.println("original stack"+original_st);
        // removing element from original stack till we reach at particular index
        Stack<Integer> temp = new Stack<>();
        while(original_st.size() >= index){
            temp.push(original_st.pop());
        }
        // push desired value
        original_st.push(value);
        // roll back elements from temp to original stack
        while(! temp.isEmpty()){
            original_st.push(temp.pop());
        }
        System.out.println("original stack after insertion: "+original_st);
    }
}
