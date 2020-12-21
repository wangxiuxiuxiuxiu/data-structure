package linked;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        LinkedHashMap<String,Object> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("name","jack");
        linkedHashMap.put("age","99");
        linkedHashMap.remove("age");
        linkedHashMap.get("name");
        linkedHashMap.get("rr");
        linkedHashMap.get("age");
        for (Map.Entry e:linkedHashMap.entrySet()) {
            System.out.println(e.getKey());

        }

        HashMap<String,Object> hs = new HashMap<>();
        hs.put("mm","rose");

        hs.put("gg","luhan");
        hs.put("lasa","999");
        hs.put("yhzzhj","999");
        hs.get("gg");
//
        System.out.println((16 - 1) & 3488);
        System.out.println((16 - 1) & 3296);
        System.out.println((16 - 1) & 3314353);
        System.out.println((16 - 1) & -730992708);
        System.out.println(hs.toString());

    }

}
