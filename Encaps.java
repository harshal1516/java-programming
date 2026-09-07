class Human
{
    private int age;
    private String name;

    // Getter methods in java
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // Setter methods in java
    public void setAge(int a) {
        age = a;
    }

    public void setName(String n) { 
       name = n;
    }
}


public class Encaps {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(23);
        obj.setName("Harshal");

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
