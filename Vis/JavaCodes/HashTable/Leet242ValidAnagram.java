package Vis.JavaCodes.HashTable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Leet242ValidAnagram {
    public static void main(String[] args) {
        String s = "aa", t = "bb";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hash =  new HashMap<>();
        HashMap<Character,Integer> hash2 =  new HashMap<>();
        int length = s.length();
        if(length != t.length()){
            return false;
        }
        for(int i = 0; i< length; i++){
            char c = s.charAt(i);
            char d = t.charAt(i);
            if(hash.containsKey(c)){
                Integer val = hash.get(c);
                hash.put(c, val+1);
            }
            else{
                hash.put(c,1);
            }
            if(hash2.containsKey(d)){
                Integer val = hash2.get(d);
                hash2.put(d, val+1);
            }
            else{
                hash2.put(d,1);
            }
        }
        Set<Character> characters = hash.keySet();
        for(Character i : characters){
            if(!hash.get(i).equals(hash2.get(i))){
                return false;
            }
        }
        return true;
    }
}
