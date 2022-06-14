package  com.supremo.builder;

public class BuilderPatternExecutor {

    public static void main(String[] args) {

        Student s1 = new Student.Builder("Anshuman","HOUSTON UNIVERSITY").setAge(32).build();

        System.out.println(s1.toString());

    }


}
