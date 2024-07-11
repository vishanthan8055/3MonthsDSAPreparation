package Vis.JavaCodes.Strings;

public class Leet1701GCDOfStrings {
    public static void main(String[] args) {
        String s1 = "AAAAAAAAA";
        String s2 = "AAACCC";
        System.out.println(gcdOfStrings(s1,s2));
    }
    public static String gcdOfStrings(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();
        int maxLength = Math.max(l1, l2);
        int minLength = Math.min(l1,l2);
        for(int i = minLength;i>0;i--){
            if(l1%i == 0 && l2%i==0){
                if(l1>l2){
                    String st2 = str2.substring(0, i);
                    String repeated1 = new String(new char[maxLength/i]).replace("\0", st2);
                    String repeated2 = new String(new char[minLength/i]).replace("\0", st2);
                    return str1.equals(repeated1) && str2.equals(repeated2)?st2:"";
                }
                else{
                    String st2 = str1.substring(0, i);
                    String repeated1 = new String(new char[maxLength/i]).replace("\0", st2);
                    String repeated2 = new String(new char[minLength/i]).replace("\0", st2);
                    return str2.equals(repeated1)&& str1.equals(repeated2)?st2:"";
                }
            }
        }
        return "";
    }
}
