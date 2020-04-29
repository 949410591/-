
import javax.imageio.ImageTranscoder;
import java.util.*;
import java.util.zip.CheckedOutputStream;


public class Test <E>{


    public static void main(String[] args) {
        Map<Integer,Integer> m = new TreeMap<>();
        Random rd = new Random();
        for (int i = 0; i <10 ; i++) {
            m.put(rd.nextInt(100),i);

        }
        for(Map.Entry e: m.entrySet()){
            System.out.println(e);

        }

        Collection c  = new ArrayList();
        for (int i = 0; i <10 ; i++) {
            c.add(rd.nextInt(100));

        }
        System.out.println(c);

        for(Iterator i = c.iterator();i.hasNext(); System.out.println(i.next())){}
        System.out.println(c);
        for(Iterator i = c.iterator();i.hasNext();){
            System.out.println(i.next());
        }









    }





}
