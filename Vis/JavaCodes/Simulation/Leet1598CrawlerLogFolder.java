package Vis.JavaCodes.Simulation;

public class Leet1598CrawlerLogFolder {
    public static void main(String[] args) {
        String[] logs = {"./","wz4/","../","mj2/","../","../","ik0/","il7/"};
        System.out.println(minOperations(logs));
    }
    public static int minOperations(String[] logs) {
        int depth = 0;
        for(String s:logs){
            if(s.startsWith("./")){
                continue;
            }else if(s.startsWith("../")){
                if(depth!=0){
                    depth--;
                }
            }else{
                depth++;
            }
        }
        return depth>=0?depth:0;
    }
}
