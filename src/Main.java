import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Personel> people = new ArrayList<Personel>();
        for(int i = 0; i < 50 ; i++){
            people.add(new Personel());
        }
        System.out.println(people);
    }
}


