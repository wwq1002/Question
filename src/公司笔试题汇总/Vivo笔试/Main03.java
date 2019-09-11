package 公司笔试题汇总.Vivo笔试;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main03 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        int input[] = parseInts(inputStr.split(" "));
        int output = solution(input);
        System.out.println(output);
    }

    private static int[] parseInts(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new int[0];
        }
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }

    private static int solution(int[] input) {

        // TODO Write your code here
        int  result=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int number:input
             ) {
            if (map.containsKey(number)){
                map.put(number,map.get(number)+1);
            }else {
                map.put(number,1);
            }
        }
        for (Integer numer:map.values()) {
            result=result+numer*numer;
        }
        return result;
    }
}
