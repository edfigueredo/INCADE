import java.util.LinkedList;

public class listas {
    public static void main(String[] args) {
        System.out.println("funciono");
        LinkedList cola= new LinkedList();
         for (int  i=0; i<11; i++){
             cola.offer(i);
         }
         while (cola.peek()!= null){
             System.out.println(cola.poll());
         }
    }
}
