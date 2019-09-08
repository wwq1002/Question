package 剑指offer;

import java.util.LinkedList;

public class 判断是否是一个出栈的顺序 {


        /**
         * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
         * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
         *  但4,3,5,1,2就不可能是该压栈序列的弹出序列
         * （注意：这两个序列的长度是相等的）
         */
        public static boolean IsPopOrder(int [] pushA,int [] popA) {
            LinkedList<Integer> stackAux=new LinkedList<>();
            if (pushA==null||popA==null||pushA.length==0||popA.length==0) {
                return false;
            }/*
			思路：入栈之后，根据出栈的顺序做一遍，那么辅助站应该为空，不然就不是正确的出栈
	      */
            int popIndex = 0;
            for(int i=0;i<pushA.length;i++) {
                stackAux.push(pushA[i]);
                while(!stackAux.isEmpty()&&stackAux.peek()==popA[popIndex]) {
                    stackAux.pop();
                    popIndex++;
                }
            }
            if (stackAux.isEmpty()) {
                return true;
            }else {
                return false;
            }
        }
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            int[] a={1,2,3,4,5};
            int[] b={4,5,3,2,1};
            int[] c={4,3,5,1,2};
            boolean is_=IsPopOrder(a,b);
            boolean is_not=IsPopOrder(a,c);
            System.out.println(is_);
            System.out.println(is_not);
        }

}
