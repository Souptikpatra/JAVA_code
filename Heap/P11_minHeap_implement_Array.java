package Heap;
class MinHeap {
    private int[] arr; // Array to store the elements of the heap
    private int size;  // Variable to track the current number of elements in the heap

    // Constructor to initialize the heap with a fixed capacity
    MinHeap(int capacity) {
        arr = new int[capacity]; // Allocate space for the heap array
        size = 0; // Initially, the heap is empty
    }

    // Helper method to swap two elements in the heap
    private void swap(int index1, int index2) {
        int temp = arr[index1]; // Store the value at Index1 temporarily
        arr[index1] = arr[index2]; // Move the value at Index2 to Index1
        arr[index2] = temp; // Assign the temporarily stored value to Index2
    }

    // Method to maintain the min-heap property by bubbling up an element
    private void upHeapify(int childIndex) {
        // Base case: If the child index is at the root, stop the recursion
        if (childIndex == 0) return;

        // Calculate the parent index
        int parentIndex = (childIndex - 1) / 2;

        // If the current element is smaller than its parent, swap them and continue bubbling up
        if (arr[childIndex] < arr[parentIndex]) {
            swap(childIndex, parentIndex); // Swap the child with the parent
            upHeapify(parentIndex); // Recursively call upHeapify on the parent index
        }
    }
    private void downHeapify(int index) {
        // Base case: If the current index is out of bounds, return immediately.
        if (index >= size) return;

        // Calculate the index of the left child of the current node.
        int leftChild = 2 * index + 1;

        // Calculate the index of the right child of the current node.
        int rightChild = 2 * index + 2;

        // Assume the current node (at index) is the smallest for now.
        int mindx = index;

        // Check if the left child exists and is smaller than the current minimum.
        if (leftChild < size && arr[leftChild] < arr[mindx]) {
            mindx = leftChild; // Update the smallest index to the left child.
        }

        // Check if the right child exists and is smaller than the current minimum.
        if (rightChild < size && arr[rightChild] < arr[mindx]) {
            mindx = rightChild; // Update the smallest index to the right child.
        }

        // If the current node is already smaller than or equal to its children, stop.
        if (index == mindx) return;

        // Swap the current node with the smaller child to maintain heap order.
        swap(index, mindx);

        // Recursively call downHeapify on the swapped child to ensure the heap property.
        downHeapify(mindx);
    }



    // Method to add a new element to the heap
    public void add(int data) {
        // Check if there's space in the heap
        if (size < arr.length) {
            arr[size] = data; // Place the new element at the next available position
            upHeapify(size);  // Restore the min-heap property by bubbling up the new element
            size++;           // Increment the size of the heap
        } else {
            // If the heap is full, print an error message
            System.err.println("heap is full!");
        }
    }
    public int remove(){
        if (size==0) System.err.println("heap is empty");
        int elem = arr[0];
        // swap arr[0]: (required element) and arr[size-1]: (last element)
        swap(0,size-1);
        // delete the last element from array : i.e. size--
        size--;
        //downHeapify
        downHeapify(0);
        return elem;
    }

    // Method to retrieve the minimum element (the root of the heap) without removing it
    public int peek() {
        // If the heap is empty, print an error message and return a placeholder value
        if (size == 0) {
            System.err.println("heap is empty!");
            return Integer.MIN_VALUE;
        }
        return arr[0]; // The minimum element is always at the root (index 0)
    }

    // Method to get the current number of elements in the heap
    public int getSize() {
        return size; // Return the size of the heap
    }
}

public class P11_minHeap_implement_Array {
    public static void main(String[] args) {
        MinHeap mn = new MinHeap(10);
        mn.add(2);
        System.out.println("peek: "+mn.peek()+" size: "+ mn.getSize());
        mn.add(4);
        System.out.println("peek: "+mn.peek()+" size: "+ mn.getSize());
        mn.add(5);
        System.out.println("peek: "+mn.peek()+" size: "+ mn.getSize());
        mn.add(8);
        System.out.println("peek: "+mn.peek()+" size: "+ mn.getSize());
        mn.add(7);
        System.out.println("peek: "+mn.peek()+" size: "+ mn.getSize());
        mn.add(9);
        System.out.println("peek: "+mn.peek()+" size: "+ mn.getSize());
        mn.add(6);
        System.out.println("peek: "+mn.peek()+" size: "+ mn.getSize());
        mn.remove();
        System.out.println("peek: "+mn.peek()+" size: "+ mn.getSize());
        mn.remove();
        System.out.println("peek: "+mn.peek()+" size: "+ mn.getSize());
        mn.remove();
        System.out.println("peek: "+mn.peek()+" size: "+ mn.getSize());

    }
}
