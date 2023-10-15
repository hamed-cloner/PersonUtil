import java.util.Random;

public class Personel{
    private String name;
    private int age;
    private String id;

    Random random = new Random();
    public Personel () {
        this.name = PersonUtils.nameGenerator(5);
        this.age = random.nextInt(98) + 1;
        this.id = PersonUtils.UniqueIdGenerator("[0-9]", 10);

    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    }


