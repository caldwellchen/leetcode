package code3;

import java.util.HashMap;
import java.util.Map;

public class code3 {
    //    给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
//
//
//
//示例 1:
//
//输入: s = "abcabcbb"
//输出: 3
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
    public int lengthOfLongestSubstring(String s) {
        Map map=new HashMap<Character,Integer>();
        int length=0;
        int len=s.length();
        for(int start=0,end=0;end<len;end++){
            char c = s.charAt(end);
            if(!map.containsKey(c)){
                map.put(c,end+1);

            }else{
                start = (Integer)map.get(c);
                map.put(c,end+1);
            }
            length=Math.max(end-start+1,length);
        }
        return length;
    }


}
