import java.util.HashMap;
import java.util.List;
import java.util.Map;

//corona:2
//kills:1
//Print number of occurrences of each word in the string
public class Sample {

    public static void main(String[] args) {

        String s ="corona kills stay away from corona corona corona";
        Map<String, Integer> map = getCountOfWords(s);

        System.out.println(map.get("corona"));
        /*for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }*/

    }

    public static Map<String,Integer> getCountOfWords(String s){
        String[] words = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        return map;
    }
}
