package Pruebasejercicio3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

//Prueba sin elementos a reemplazar
public class P1 {
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        P1.replaceAll(list1, 5, 6);
        System.out.println(list1); // [1, 2, 3, 4]
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
