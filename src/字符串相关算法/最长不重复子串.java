package 字符串相关算法;

import java.util.HashMap;
import java.util.Map;

public class 最长不重复子串 {
    public static String lengthOfLongestSubstring(String s) {
        int star = 0;
        int head = 0;
        int ans = 0;
        Map<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {/*如果重复出现 则更新下标*/
            if (hashMap.containsKey(s.charAt(i)))
                //star = Math.max(hashMap.get(s.charAt(i)), star);
               star=hashMap.get(s.charAt(i));
            if (ans < i - star + 1) {
                ans = i - star + 1;
                head = star;
            }
            hashMap.put(s.charAt(i), i + 1);
        }
        return s.substring(head, head + ans);
    }

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("ab"));
    }
}
