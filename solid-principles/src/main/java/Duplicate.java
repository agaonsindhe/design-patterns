import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicate {


    public static void main(String[] args) {

        String input = "ABCACBaD";

        char [] inputArray = input.toCharArray();
        Set<Character> op = new HashSet<>();
        Map<Character,Integer> count = new HashMap<>();
        Character temp = null;
        int i=0;
        for(Character c : inputArray){
            if(count.containsKey(c)){
                count.put(c,count.get(c)+1);
            }else{
                count.put(c,1);
            }
        }

        count.forEach((key,value) -> System.out.println(key+" : "+value));
    }
}
