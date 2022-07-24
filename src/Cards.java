import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cards {
    public static void main(String[] args) {
        String[] tools = {"black","gray","brown","pink","yellow"};
        ArrayList<String> l = new ArrayList<>();
        Collections.addAll(l,tools);
        int start = 1;
        String target = "black";
        System.out.println(shiftCards(l,start,target));

    }
    static int shiftCards(List<String> cards, int startIndex, String target){

        int endIndex = cards.indexOf(target);
        if(startIndex==endIndex){
            return 0;
        }
        if(Math.abs(startIndex-endIndex)==1){
            return 1;
        }
        int forward = 0;
        int backward = 0;
        if(endIndex>startIndex){
            backward = startIndex+(cards.size()-1-endIndex)+1;
            forward = endIndex-startIndex;
        }
        if(startIndex>endIndex){
            forward =endIndex+(cards.size()-1-startIndex)+1;
            backward = startIndex-endIndex;
        }
        return Math.min(forward,backward);

    }
}
