package Vis.JavaCodes.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class Leet2058findTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints {
    public static void main(String[] args) {
//        ListNode n7 = new ListNode(2);
//        ListNode n6 = new ListNode(1,n7);
//        ListNode n5 = new ListNode(5,n6);
//        ListNode n4 = new ListNode(2,n5);
//        ListNode n3 = new ListNode(1,n4);
//        ListNode n2 = new ListNode(3,n3);
//        ListNode n1 = new ListNode(5,n2);

//        ListNode n2 = new ListNode(1);
//        ListNode n1 = new ListNode(3,n2);

        ListNode n9 = new ListNode(6);
        ListNode n8 = new ListNode(10,n9);
        ListNode n7 = new ListNode(6,n8);
        ListNode n6 = new ListNode(6,n7);
        ListNode n5 = new ListNode(9,n6);
        ListNode n4 = new ListNode(1,n5);
        ListNode n3 = new ListNode(4,n4);
        ListNode n2 = new ListNode(8,n3);
        ListNode n1 = new ListNode(6,n2);

        System.out.println(Arrays.toString(nodesBetweenCriticalPoints(n1)));
    }
    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> ans =new ArrayList<>();
        ListNode curr = head;
        ListNode prev = new ListNode(-1,curr);
        int length = 0;
        while(curr.next != null){
            length++;
            if(length != 1){
                if(checkCritical(curr,prev)){
                    ans.add(length);
                }
            }
            prev = curr;
            curr = curr.next;
        }
        if(length <3){
            return new int[]{-1,-1};
        }
        int[] array = ans.stream().mapToInt(i -> i).toArray();
        Arrays.sort(array);
        if(array.length == 0){
            return new int[]{-1,-1};
        }
        if(array.length == 1){
            return new int[]{-1,-1};
        }
        if(array.length==2){
            return new int[]{array[array.length-1]-array[0],array[array.length-1]-array[0]};
        }
        int maxdiff = array[array.length-1]-array[0];
        int mindiff = array[array.length-1];
        for(int i=0;i<array.length-1;i++){
            int t = Math.abs(array[i]-array[i+1]);
            if(t<=mindiff){
                mindiff = t;
            }
        }
        return new int[]{mindiff,array[array.length-1]-array[0]};
    }

    private static boolean checkCritical(ListNode curr, ListNode prev) {
        int prevVal = prev.val;
        int currVal = curr.val;
        int nextVal = curr.next.val;
        if(currVal>prevVal  && currVal>nextVal){
            return true;
        }
        if(currVal<prevVal  && currVal<nextVal){
            return true;
        }
        return false;
    }
}

//public class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}