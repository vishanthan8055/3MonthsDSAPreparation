package Vis.JavaCodes.ZOHO;

public class PrintStringOfOddLengthInX {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int len = str.length();
        for (int i = 0; i < len; i++) {
            int j = len - 1 - i;
            for (int k = 0; k < len; k++) {
                if (k == i || k == j)
                    System.out.print(str.charAt(k));
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
//        String ps = "";
//        String ms = "";
//        int ss = 0;
//        int l = str.length();
//        boolean rev = false;
//        int i = 0;
//        while(i >= 0){
//            if(i == (l/2)){
//                rev = true;
//                System.out.println(ps+str.charAt(i));
//                ps = new String(new char[ps.length() - 2]).replace("\0", " ");
//                ms = " ";
//                i--;
//                ss -= 2;
//                continue;
//            }
//            int msl = ((l - (i+1))) * 2 - 1 - ss;
//            ms = new String(new char[msl]).replace("\0", " ");
//            int noSkip1 = i;
//            int noSkip2 = l - i - 1;
//            System.out.println(ps + str.charAt(noSkip1) + ms + str.charAt(noSkip2));
//            ms = " ";
//            if(rev){
//                if(i == 0){
//                    break;
//                }
//                ps = new String(new char[ps.length() - 2]).replace("\0", " ");
//                ss -= 2;
//                i--;
//            }
//            else{
//                ps = new String(new char[ps.length() + 2]).replace("\0", " ");
//                ss += 2;
//                i++;
//            }
//        }
    }
}
