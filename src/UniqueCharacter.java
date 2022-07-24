import java.util.HashMap;
import java.util.Map;

public class UniqueCharacter {
    public static void main(String[] args) {
        String s = "";
        System.out.println(uniqueCharacter(s));
    }
    static int uniqueCharacter(String s){
       if (s == null || s.length()==0){
// base case
           return -1;
       }
        HashMap<Character,Integer> hash = new HashMap<>();
        char u = s.charAt(0);
        boolean found = false;
        for (int i = 0; i <s.length() ; i++) {
//            here we're updating the values to each character in the string
            hash.put(s.charAt(i),hash.getOrDefault(s.charAt(i),0)+1);
//here we're checking the value to each key which occurs only one
            for (Map.Entry<Character,Integer>e : hash.entrySet()) {
                    if(e.getValue()==1){
                        found = true;
                        u = e.getKey();
                        break;
                    }
            }

        }
        if(found){
            return s.indexOf(u)+1;
        }
        else return -1;
    }
}