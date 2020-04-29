import java.util.*;

public class TestMapMethod {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        String [] ss = {"A","B","C","D","F"};
        int num = 0;
        for(String c: ss){
            m.put(c,num);
            num++;
        }
        for(String c: ss){
            m.remove(c);
            System.out.println(m);
            System.out.println(m.size());
            System.out.println(m.isEmpty());

        }



        for(String c: ss){
            m.put(c,num);
            num++;
        }
        System.out.println(m);

        System.out.println(m.keySet());
        for(String c: m.keySet()){
            System.out.println(m.get(c));
            System.out.println(m.containsKey(c));
            System.out.println(m.containsValue(m.get(c)));

        }


        for(Map.Entry e: m.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
            System.out.println(e.toString());

        }

        System.out.println(m.values());

        Set keys = m.keySet();
        Iterator keyIt = keys.iterator();
        while (keyIt.hasNext()){
            System.out.println(m.get(keyIt.next()));
        }

    }
}
