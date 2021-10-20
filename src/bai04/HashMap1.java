package bai04;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class HashMap1 {
    public static void main(String[] args) {
        Map<Integer, String> boxes = new HashMap<>();
        //Các cặp key-value
        //Add giá trị key-value
        boxes.put(113,"haha");

        Set<Integer> allKeys = boxes.keySet();
        //Dùng for cho key
        for (Integer key : allKeys){
            System.out.println(boxes.get(key));
        }
        //replace key
        boxes.replace(112,"cdc");

        //remove key/value
        Iterator emergencyListIterator = boxes.entrySet().iterator();
        while (emergencyListIterator.hasNext()){
            Map.Entry<Integer,String> entry = (Map.Entry<Integer, String>)emergencyListIterator.next();
            String entryValue = entry.getValue();
            if (entryValue.equals("Others"))
                emergencyListIterator.remove();
        }


    }
}
