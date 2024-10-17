package Pruebasejercicio3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;


public class P4 {
    public static void main(String[] args) {
        List<Object> list5 = new ArrayList<>(Arrays.asList("hola", 2, true));
        P4.replaceAll(list5, 3, "tres");
        System.out.println(list5); // [hola, 2, true]
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
