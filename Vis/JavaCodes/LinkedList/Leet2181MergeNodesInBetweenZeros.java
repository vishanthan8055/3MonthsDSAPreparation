package Vis.JavaCodes.LinkedList;

public class Leet2181MergeNodesInBetweenZeros {
    public static void main(String[] args) {
//        ListNode n8 = new ListNode(0);
//        ListNode n7 = new ListNode(2,n8);
//        ListNode n6 = new ListNode(5,n7);
//        ListNode n5 = new ListNode(4,n6);
//        ListNode n4 = new ListNode(0,n5);
//        ListNode n3 = new ListNode(1,n4);
//        ListNode n2 = new ListNode(3,n3);
//        ListNode n1 = new ListNode(0,n2);

//        0,24,14,0;
        ListNode n4 = new ListNode(0);
        ListNode n3 = new ListNode(14,n4);
        ListNode n2 = new ListNode(24,n3);
        ListNode n1 = new ListNode(0,n2);
        ListNode ans = mergeNodes(n1);
        while (ans.next!=null){
            System.out.println(ans.val+" "+ans.next.val);
            ans = ans.next;
        }

    }
    public static ListNode mergeNodes(ListNode head) {
        ListNode curr = head;
        ListNode cu = new ListNode();
        ListNode h = new ListNode(0,cu);
        int i = 0;
        int sum = 0;
        while(curr.next != null){
            ListNode next = curr.next;
            if(next.val != 0){
                int val = curr.val;
                int val1 = next.val;
                sum = val + val1;
                next.val = sum;
            }
            else{
                if(i == 0){
                    h.val = sum;
                    ListNode next1 = new ListNode();
                    if(next.next == null){
                        h.next = null;
                    }else {
                        h.next = next1;
                        cu = next1;
                    }
                    i++;
                }
                else {
                    cu.val = sum;
                    ListNode next1 = new ListNode();
                    if(next.next == null){
                        cu.next = null;
                    }else {
                        cu.next = next1;
                        cu = next1;
                    }
                }
            }
            curr = next;
        }
        return h;
    }
}
