package Pruebasejercicio3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;


public class P3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        final List<Object> list4 = new ArrayList<>(Arrays.asList(1, null, 3, null));
        P3.replaceAll(list4, null, "null");
        System.out.println(list4); // [1, null, 3, null]
        }
    public static void replaceAll(List<Object> list, Object o1, Object o2) {
        if (list.contains(o1)) {
            ListIterator<Object> it = list.listIterator();
            while (it.hasNext()) {
                if (it.next().equals(o1)) {
                    it.set(o2);
                }
            }
        }
    }
    
}
