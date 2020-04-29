import java.util.*;

public class TestMap {
    int a;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestMap testMap = (TestMap) o;
        return a == testMap.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }

    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();

        String [] ss = {"A","B","C","D","F"};
        int num = 0;
        for(String c: ss){
            m.put(c,num);
            num++;
        }

        //第一种获取key来遍历所有value

            //通过把key的集合转换为迭代器，通过迭代key来遍历所有value
            Set keys = m.keySet();
            Iterator keyIt = keys.iterator();
            while (keyIt.hasNext()){
                System.out.println(m.get(keyIt.next()));
            }

            //通过foreach来遍历key集合来遍历所有value
            for(String c: m.keySet()){
                System.out.println(m.get(c));
                System.out.println(m.containsKey(c));
                System.out.println(m.containsValue(m.get(c)));

            }
        //第二种entryset
        for(Map.Entry e: m.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());

            System.out.println(e.getClass());





        }
    }
}
