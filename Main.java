import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Oleg on 26.01.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException{
        List<String> array = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            array.add(sc.nextLine());
        }
        Sorter sorter = new Sorter(array);
        for(int i=0; i<array.size(); i++){
            System.out.print(array.get(i)+" ");
        }
        System.out.println();
        array = sorter.Sort();
        for(int i=0; i<array.size(); i++){
            System.out.print(array.get(i)+" ");
        }

    }
}
