
/**
 * Created by dell-pc on 2017/3/27.
 */
public class deleteDuplicatesFromSortedLists {
    public ListNode deleteDuplicate(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        head.next=deleteDuplicate(head.next);
        if(head.val==head.next.val){
            return head.next;
        }
        else{
            return head;
        }
    }
}
