import java.util.List;

/**
 * Created by Dean on 8/25/2015.
 * Finished 8/25/2015
 */
public class PrintAnything{
    public static <T> void printArray(T[] array){
        if(array.length == 0){
            System.out.println("Array contains nothing");
        }else {
            for(T element: array){
                System.out.print(element + " ");
            }
        }
    }
    //Print out any arrayList
    public static <T> void printArrayList(List<T> list){
        if(list.size() == 0){
            System.out.println("ArrayList contains nothing");
        } else {
            for (T element : list) {
                System.out.print(element + " ");
            }
        }
    }
}
