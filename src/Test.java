import java.util.*;

public class Test {

    public static void main(String args[]){
        Map<String, Integer> someMap = new HashMap<>();
        Set<Map.Entry<String, Integer>> al1 = someMap.entrySet();
        List<String> al = (List<String>) someMap.keySet();
    }
}
