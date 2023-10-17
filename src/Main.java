import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // Creating a list of persons with random Name , Age and ID
        List<Personel> people = new ArrayList<Personel>();
        for (int i = 0; i < 50; i++) {
            people.add(new Personel(PersonUtils.nameGenerator(5), PersonUtils.ageGenerator(), PersonUtils.UniqueIdGenerator("[0-9]", 10)));
        }

        // Sorting the created list and printing
        Collections.sort(people, new personComparator());
        System.out.println("The list of persons you created is : \n" + Collections.singletonList(people.toString()));


        //Creating a copy of people list to convert it to a STRING list and searching through list for wanted patterns
        List<String> copyOfPeople = new ArrayList<>();
        for (int k = 0; k < people.size(); k++){
            copyOfPeople.add(people.get(k).toString());
        }
        System.out.println("\nHere is a list of people with your given pattern: \n"+ PersonUtils.searchString(copyOfPeople, "^A"));


        // grouping people according to their age and sorting the map to be readable
        Map<Integer, List<Personel>> groupedPersonel = people.stream().collect(Collectors.groupingBy(s -> s.getAge()));
        System.out.println("\nGrouped personel according to their age =");
        Map<Integer, List<Personel>> sortedMap = new TreeMap<Integer, List<Personel>>(groupedPersonel);
        PersonUtils.printMap(sortedMap);

    }


    static class personComparator implements java.util.Comparator<Personel> {
        @Override
        public int compare(Personel a, Personel b) {
            return a.getAge() - b.getAge();
        }
    }

}



