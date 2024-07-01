package Vis.JavaCodes.Twopointers;

public class Leet125ValidPalindrome {
    public static void main(String[] args) {
        String s = "d\"h89 ' 5W4774W5 ' 98h\"d";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        //CHAR LIMITS
        int LIMIT_1 = 64;
        int LIMIT_2 = 91;
        int LIMIT_3 = 96;
        int LIMIT_4 = 123;
        int LIMIT_5 = 47;
        int LIMIT_6 = 58;
        int LIMIT_7 = 48;
        int LIMIT_8 = 57;

        int CASESWITCHER = 32;

        int l = 0;
        int h = s.length()-1;
        while(l<=h){
            char c = s.charAt(l);
            char d = s.charAt(h);
            if(c  == d){
                l++;
                h--;
                continue;
            }

            if(!(c> LIMIT_1 && c< LIMIT_2) && !(c> LIMIT_3 && c< LIMIT_4) && !(c> LIMIT_5 && c< LIMIT_6)){
                l++;
                continue;
            }
            if(!(d> LIMIT_1 && d< LIMIT_2) && !(d> LIMIT_3 && d< LIMIT_4) && !(d>48 && d< LIMIT_8)){
                h--;
                continue;
            }
            if((c> LIMIT_5 && c< LIMIT_6)&&(d> LIMIT_7 && d< LIMIT_8)){
                if(c != d){
                    return false;
                }
                else {
                    l++;
                    h--;
                    continue;
                }
            }
            if(c> LIMIT_1 && c< LIMIT_2){
                if(d> LIMIT_1 && d< LIMIT_2){
                    if(c!=d){
                        return false;
                    }
                }
                else{
                    d = (char)((int)d - CASESWITCHER);
                    if(c!=d){
                        return false;
                    }
                }
            }
            else{
                if(d> LIMIT_3 && d< LIMIT_4) {
                    if(c!=d){
                        return false;
                    }
                }
                else{
                    d = (char)((int)d + CASESWITCHER);
                    if(c!=d){
                        return false;
                    }
                }
            }
            if(c!=d){
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
}