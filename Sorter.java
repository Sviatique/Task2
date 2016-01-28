import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Oleg on 27.01.2016.
 */
public class Sorter {
    List<String> array;
    Sorter(List<String> toSort){
        array = toSort;
    }

    private boolean compare(String first, String second){
        String iteration;
        boolean Shorter = false;
        if(first.length()<second.length()) {
            iteration = first;
            Shorter = true;
        }
        else
            iteration = second;
        for(int i=0; i<iteration.length();i++){
            if(first.toLowerCase().charAt(i)<second.toLowerCase().charAt(i)){

                return true;

            }
            else if(first.toLowerCase().charAt(i)>second.toLowerCase().charAt(i)) {

                return false;
            }
        }
        if(Shorter)
            return true;
        else
            return false;
    }
    public List Sort(){
        for(int i=1;i<array.size();i++){
            for(int j=i;j>0 ;j--){
                if(compare(array.get(j),array.get(j-1))) {
                    String tmp = array.get(j-1);
                    array.set(j-1,array.get(j));
                    array.set(j,tmp);

                }

            }

        }

        return array;

    }


    public List Sort(int index){
        return array;
    }
}
