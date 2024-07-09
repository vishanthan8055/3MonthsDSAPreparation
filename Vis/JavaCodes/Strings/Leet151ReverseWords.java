package Vis.JavaCodes.Strings;
public class Leet151ReverseWords {
    public static void main(String[] args) {
        String s = "       hello             world         ";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        s = s.trim();
        String[] s1 = s.split(" ");
        for(int i = s1.length-1;i>=0;i--){
            if(s1[i].isEmpty()){
                continue;
            }
            String a = s1[i].trim();
            if(i!=0){
                ans.append(a+" ");
            }
            else{
                ans.append(a);
            }
        }
        return ans.toString();
    }
}
