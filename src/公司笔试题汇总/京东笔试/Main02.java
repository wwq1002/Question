package 公司笔试题汇总.京东笔试;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

    public class Main02 {
        public static void remove(int[][] friends,int m) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i = 0;i<friends.length;i++){
                if (!map.keySet().contains(friends[i][0])) {
                    map.put(friends[i][0], 1);
                }else {
                    map.put(friends[i][0],map.get(friends[i][0])+1);
                }
                if (!map.keySet().contains(friends[i][1])) {
                    map.put(friends[i][1], 1);
                }else {
                    map.put(friends[i][1],map.get(friends[i][1])+1);
                }
            }
            Map<Integer, Integer> sMap = sortMap(map);
            ArrayList<Integer> list = new ArrayList<>();
            int relation = 0;
            for (Map.Entry<Integer, Integer> entry: sMap.entrySet()) {
                if (relation>=m) {
                    break;
                }
                relation = relation + entry.getValue();
                list.add(entry.getKey());
            }
            Collections.sort(list);
            System.out.println(list.size());
            for (int i = 0;i<list.size();i++) {
                if (i==0) {
                    System.out.print(list.get(i));
                }else {
                    System.out.print(" "+list.get(i));
                }

            }

        }
        public static Map<Integer,Integer> sortMap(Map<Integer,Integer> oldMap) {
            ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(oldMap.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> arg0,
                                   Map.Entry<Integer, Integer> arg1) {
                    return arg1.getValue() - arg0.getValue();
                }
            });
            Map<Integer,Integer> newMap = new LinkedHashMap<>();
            for (int i = 0; i < list.size(); i++) {
                newMap.put(list.get(i).getKey(), list.get(i).getValue());
            }
            return newMap;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int mdasdasdas = sc.nextInt();
            int[][] friends = new int[mdasdasdas][2];
            for(int i = 0;i<mdasdasdas;i++){
                friends[i][0] = sc.nextInt();
                friends[i][1] = sc.nextInt();
            }
            remove(friends,mdasdasdas);
            sc.close();
        }



}
