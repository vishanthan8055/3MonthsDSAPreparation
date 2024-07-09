package Vis.JavaCodes.Strings;

public class Leet1768MergeStringsAlternately {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "pqr";
        System.out.println(mergeAlternately(s1,s2));
    }
    public static String mergeAlternately(String word1, String word2) {
        int min = Math.min(word1.length(), word2.length());
        StringBuilder sol = new StringBuilder();
        for(int i = 0; i < min;i++){
            sol.append(word1.charAt(i));
            sol.append(word2.charAt(i));
        }
        if(word1.length()<word2.length()){
            sol.append(word2.substring(min));
        }
        else if(word1.length()>word2.length()){
            sol.append(word1.substring(min));
        }
        return sol.toString();
    }
}
