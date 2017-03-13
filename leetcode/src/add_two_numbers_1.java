/**
 * Created by dell-pc on 2017/1/7.
 */
public class add_two_numbers_1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode l3=head;
        int sum = 0;
        while (l1 != null || l2 != null) {
            sum /= 10;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            l3.next = new ListNode(sum % 10);
            l3 = l3.next;
        }
        if(sum/10==1){
            l3.next=new ListNode(1);
        }
        return head.next;
    }
}
