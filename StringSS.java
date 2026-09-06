public class StringSS {
    public static void main(String[] args) {
        String  name = "John";
        name = name + "Cena";
        System.out.println("HELLO " + name);// string are immutable in java, so when we concatenate a string it creates a new object in the heap memory and the reference variable name is pointing to that new object.

        String s1 = "Hello";
        String s2 = "Hello";    
        System.out.println(s1==s2);//true because both are pointing to same object in string pool
    }
}
