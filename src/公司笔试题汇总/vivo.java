package 公司笔试题汇总;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class vivo {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        int output = solution(inputStr );
        System.out.println(output);
    }

    private static int solution(String str) {
      if (str==null||str.length()<=0)return 0;
        char[] chs=str.toCharArray();
        Stack<Character> stack=new Stack<>();
        int i=0;
        while (!stack.isEmpty()||i<chs.length){
            if (chs[i]=='0')return stack.size();

        if (chs[i]=='('){
            stack.push(chs[i]);
            i++;
        }else {
            stack.pop();
            i++;
        }
        }
        return 0;
    }
}
