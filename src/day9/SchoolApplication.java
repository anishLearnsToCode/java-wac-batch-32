package day9;

public class SchoolApplication {
    public static void main(String[] args) {
//        Student anish = new Student("45e");
//        Student gautam = new Student("34", "gautam", "sachdeva", 20);

        Student anish = new Student.Builder()
                .withRollNumber("45e")
                .withName("anish", "sachdeva")
                .build();

        Student piyush = new Student.Builder()
                .withName("piyush", "")
                .withAge(23)
                .build();

        System.out.println(piyush.fullName());
        System.out.println(anish.fullName());
    }
}
