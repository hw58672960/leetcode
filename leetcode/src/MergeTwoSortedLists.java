import java.util.List;

/**
 * Created by dell-pc on 2017/2/10.
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoSortedLists(ListNode l1,ListNode l2){
        ListNode head=new ListNode(0);
        ListNode p=head;
        while(l1!=null||l2!=null){
            if (l1!=null&&l2!=null){
                if(l1.val>l2.val){
                    p.next=l1;
                    l1=l1.next;
                }
                else{
                    p.next=l2;
                    l2=l2.next;
                }
                p=p.next;
            }
            if(l1==null){
                p.next=l2;
                break;
            }
            if(l2==null){
                p.next=l1;
                break;
            }
        }
        return head.next;
    }
}
