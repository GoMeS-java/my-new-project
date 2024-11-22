import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class New {
    public static void main(String[] args){
        List<Integer> List = new ArrayList<>();
        for (int i = 0; i<10; i++){
            List.add(i);
        }
       List.remove(5);
        System.out.println(List);
        //Мы проводим много удалений из нашего листа
        List = new LinkedList<>();
        }

    }


