package code2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class c2 {
    //    给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
//
//请你将两个数相加，并以相同形式返回一个表示和的链表。
//
//你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//    输入：l1 = [2,4,3], l2 = [5,6,4]
//输出：[7,0,8]
//解释：342 + 465 = 807.
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode pre = new ListNode();
        ListNode cur = pre;
        while (l1 != null || l2 != null) {

            int x=l1!=null?l1.val:0;
            int y=l2!=null?l2.val:0;
            int sum=x+y+carry;
            int f=sum%10;
            carry=sum/10;
            cur.next=new ListNode(f);
            cur=cur.next;
           if(l1!=null){
                l1=l1.next;
            }
           if (l2!=null){
                l2=l2.next;
            }
        }
        if(carry==1)
            cur.next=new ListNode(1);
        return pre.next;
    }

    public static void main(String[] args) {
        ListNode l=new ListNode(2);
        l.next=new ListNode(4);
        l.next.next=new ListNode(3);
        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);

        c2 c2=new c2();
        ListNode listNode = c2.addTwoNumbers(l, l2);


    }
}
