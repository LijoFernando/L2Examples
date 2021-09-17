package hashMap;

import java.security.Key;
import java.util.Collection;
import java.util.HashMap;

public class HashInternal {
    static HashMap<String,Integer> hMap = new HashMap<>();

    private static void demoHMap(){
        hMap.put("abc",14);
        String str ="FB";
        String str1 ="Ea";
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
    }

    public static void main(String[] args) {
        demoHMap();
    }
}
