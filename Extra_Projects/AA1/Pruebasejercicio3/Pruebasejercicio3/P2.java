package Pruebasejercicio3;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class P2 {
    public static void main(String[] args) {
        List<Object> list3 = new ArrayList<>();
        P2.replaceAll(list3, "hola", "adiós");
         System.out.println(list3); // []
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
