import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Personel> people = new ArrayList<Personel>();
        people.add(new Personel("Hamed", 28));
        people.add(new Personel("Mamad" , 25));
        people.add(new Personel("Sara", 24));

        System.out.println(people);



    }

}