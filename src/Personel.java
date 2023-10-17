public class Personel {


    private String name;
    private int age;
    private String id;

    public Personel(String name,int age,String id) {
        this.name = name;
        this.age = age;
        this.id = id;


    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
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




    //Overrides toString method to convert the output of an object list to a type of readable String
    @Override
    public String toString(){
        return this.name + "-" + this.age + "-" + this.id ;
    }


}


