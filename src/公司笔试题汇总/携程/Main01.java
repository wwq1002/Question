package 公司笔试题汇总.携程;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main01 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /*请完成下面这个函数，实现题目要求的功能
     ******************************开始写代码******************************/
    static ListNode partition(ListNode head,int m) {
        ListNode newhead2=new ListNode(0);
        ListNode temp22222222=newhead2;

        ListNode newhdaddsasdasdasdasdhead1=new ListNode(0);
        ListNode temp1=newhdaddsasdasdasdasdhead1;


        while (head!=null){
            if (head.val<=m){
                temp1.next=head;
                temp1=temp1.next;
            }else {
                temp22222222.next=head;
                temp22222222=temp22222222.next;
            }
            head=head.next;
        }
        temp22222222.next=null;
        temp1.next=newhead2.next;
        return newhdaddsasdasdasdasdhead1.next;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ListNode head=null;
        ListNode node=null;
        int m=in.nextInt();
        while(in.hasNextInt()){
            int v=in.nextInt();
            if(head==null){
                node=new ListNode(v);
                head=node;
            }else{
                node.next=new ListNode(v);
                node=node.next;
            }
        }
        head= partition(head,m);
        if(head!=null){
            System.out.print(head.val);
            head=head.next;
            while(head!=null){
                System.out.print(",");
                System.out.print(head.val);
                head=head.next;
            }
        }
        System.out.println();
    }
}
