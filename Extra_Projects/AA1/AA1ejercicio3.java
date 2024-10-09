package Funciones;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;


public class AA1ejercicio3 {
    public static void main(String[] args) {
        List<Object> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 3, 5));
            AA1ejercicio3.replaceAll(list2, 3, 6);
            System.out.println(list2); // [1, 2, 6, 4, 6, 5]
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
