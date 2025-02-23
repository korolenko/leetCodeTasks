package topInterview75;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    ListNode add(int value){
        next = new ListNode(val,this.next);
        val = value;
        return this;
    }
}
/*
https://leetcode.com/problems/add-two-numbers/solutions/5184763/video-simple-addition-algorithm-python-javascript-java-and-c/
 */
public class AddTwoNumbers {

    /*Input: l1 = [2,4,3], l2 = [5,6,4]
    Output: [7,0,8]
    Explanation: 342 + 465 = 807.
    */
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2).add(4).add(9);
        ListNode l2 = new ListNode(5).add(6).add(4).add(9);
        ListNode res =  addTwoNumbers(l1,l2);
        System.out.println("hw");
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode res = temp;
        int perenos = 0;
        while (l1 != null || l2 != null){
            int val1 = (l1 == null)? 0: l1.val;
            int val2 = (l2 == null)? 0: l2.val;
            int sum = val1 + val2 + perenos;
            perenos = sum / 10;

            int realVal = sum % 10;
            temp.next = new ListNode(realVal);
            temp = temp.next;
            if(l1 !=null){
                l1 = l1.next;
            }
            if(l2 !=null){
                l2 = l2.next;
            }
            System.out.println("ss");
        }
        return res;
    }
}
