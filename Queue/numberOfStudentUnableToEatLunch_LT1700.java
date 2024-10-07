package Queue;
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        queue_LL qu = new queue_LL(); // it holds students array
        int i_sand = 0; // pointer on sandwiches array
        int miss_chance = 0;
        for (int i = 0; i < students.length; i++) {
            qu.push(students[i]);
        }

        // logic
        while(i_sand != sandwiches.length) {
            if (qu.peek() == sandwiches[i_sand]){
                qu.remove();
                i_sand++;
                miss_chance = 0;
            }
            // rotation
            else{
                if (miss_chance == qu.size()) return qu.size();
                else {
                    int ele = qu.remove();
                    qu.push(ele);
                    miss_chance++; // give a chance
                }
            }
        }
        return 0;
    }
}
public class numberOfStudentUnableToEatLunch_LT1700 {
    public static void main(String[] args) {
        int [] students = {1,1,1,0,0,1};
        int [] sandwiches = {1,0,0,0,1,1};
        Solution s = new Solution();
        System.out.println( s.countStudents(students,sandwiches));

    }
}
