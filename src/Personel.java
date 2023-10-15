public class Personel{
    private String name;
    private int age;
    private String id;

    public Personel (String name,int age) {
        this.name = name;
        this.age = age;
        this.id = PersonUtils.UniqueIdGenerator("[0-9]", 10);

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    }


