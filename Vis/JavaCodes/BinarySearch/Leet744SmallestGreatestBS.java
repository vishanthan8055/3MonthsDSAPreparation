
package Vis.JavaCodes.BinarySearch;
public class Leet744SmallestGreatestBS {
    public static void main(String[] args) {
        char[] l = {'c','f','j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(l,target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length - 1;
        while(s<e){
            int m = s + ((e-s)/2);
            if (letters[m]<=target) {
                s = m+1;
            }
            else{
                e = m;
            }
        }
        return letters[e];
    }
}
