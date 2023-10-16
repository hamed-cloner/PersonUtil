import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Personel> people = new ArrayList<Personel>();
        for (int i = 0; i < 50; i++) {
            people.add(new Personel(PersonUtils.nameGenerator(5), PersonUtils.ageGenerator(), PersonUtils.UniqueIdGenerator("[0-9]", 10)));
        }
        Collections.sort(people, new personComparator());
        System.out.println(Collections.singletonList(people.toString()));

//        PersonUtils.searchString(people, "[^abcdefg]");
        System.out.println(PersonUtils.searchString(Collections.singletonList(people.toString()), "[^ab]"));

//        PersonUtils.searchString(people, "[^abc]");


    }


    static class personComparator implements java.util.Comparator<Personel> {
        @Override
        public int compare(Personel a, Personel b) {
            return a.getAge() - b.getAge();
        }
    }
}



