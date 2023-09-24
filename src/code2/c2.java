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
        List array=new ArrayList();
        List array2=new ArrayList();
        while (l1!= null) {
            array.add(l1.val);
            l1=l1.next;
        }
        while (l2!= null) {
            array2.add(l2.val);
            l1=l2.next;
        }
        int sum=0;
        int len=array2.size();
        int a[]=new int[len];
        for (int i = len-1; i < 0; i--) {
            int i1 = (Integer) array2.get(i) + (Integer) array.get(i);
            sum+=Math.pow(10,(i-1))*i1;
             if(i==0&&i1>10)
             {
                 len++;
             }
        }
        ListNode listNode=new ListNode();
       while(sum==0){
         listNode.val=sum%(10*(len-1));
         sum-=Math.pow(10,(len-1));
         listNode=listNode.next;
         len--;
       }
        return listNode;
    }
}
