package 剑指offer;

import java.util.ArrayList;
import java.util.Collections;

public class 字符全排列 {
    public ArrayList<String> permutation(String str) {
        ArrayList<String> res = new ArrayList<String>();
        if(str != null && str.length() > 0){
            process(str.toCharArray(), 0, res);
            Collections.sort(res);//最后的排序，以保证为字典序
        }
        return res;
    }

    public void process(char[] str,int i,ArrayList<String> list){
        if(i == str.length-1){
            String val = String.valueOf(str);
            if(!list.contains(val)){
                list.add(val);
            }
        }else{
            for(int j=i; j<str.length; j++){
                swap(str,i,j);
                process(str, i+1, list);
                swap(str,i,j);
            }
        }
    }

    public void swap(char[] str,int i,int j){
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

}
