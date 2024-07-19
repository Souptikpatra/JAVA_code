package Linked_List;
public class linkedListCycle2_LEETCODE_142 {
    public static node hasCycle(node head){
        if (head == null || head.next == null) return null;
        node slow = head;
        node fast = head;
        boolean flag = false; // cycle is not present
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                flag = true;
                break;
            }
        }
        if (flag == true){ // cycle present
            node temp = head;
            // now 'slow' is pointing on some node where 'fast' also pointing that node
            while(temp != slow){
                temp = temp.next;
                slow = slow.next;
            }
            return slow; // or return temp
        }
        else {
            return null; // no cycle found
        }
    }
    public static void main(String[] args) {
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b; // cycle
        node t = hasCycle(a);
        System.out.println(t.value);

    }
}
