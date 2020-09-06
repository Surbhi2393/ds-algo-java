//length and indices of longest repeating sequence
public class Test {

    static String s = "aaaabbcccc";

    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        int i=0;
        int j=1;
        while(j<=s.length()){
            if(j==s.length() || (s.charAt(i)!=s.charAt(j))) {
                int len = j-i;
                if(len>=max){
                    max=len;
                    start=i;
                    end=j-1;
                }
                i=j;
                j++;
            }else{
                j++;
            }
        }

        System.out.println(start+","+end+","+max);

    }
}
