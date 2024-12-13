package Linked_List;
public class getIntersectionNode_LEETCODE_160 {
    public node getIntersectionNode(node headA, node headB) {
        node tempA = headA;
        node tempB = headB;
        int lengthA = 0;
        int lengthB = 0;
        // getting length of both list
        while(tempA != null ){
            tempA = tempA.next;
            lengthA++;
        }
        while(tempB != null ){
            tempB = tempB.next;
            lengthB++;
        }
        // taking absolute difference
        int diff = Math.abs(lengthA-lengthB);
        tempA = headA; // reset
        tempB = headB; // reset
        // moving that <temp> pointer whose length is larger
        if (lengthA >= lengthB){
            for (int i = 1; i <= diff; i++) {
                tempA = tempA.next;
            }
        }
        else {
            for (int i = 1; i <= diff; i++) {
                tempB = tempB.next;
            }
        }
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        // if the list has no intersection then ultimately both tempA,tempB going to point 'null'
        if (tempA == null){ // or tempB == null
            return null;
        }
        else return tempA; // or tempB
    }
    public static void main(String[] args) {

    }
}
