package day9;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    final String rollNumber;

    private Student(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    private Student(String rollNumber, String firstName, String lastName, int age) {
        this(rollNumber);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                rollNumber.equals(student.rollNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, rollNumber);
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private String rollNumber;
        private boolean rollNumberDefined = false;

        public Builder withName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withRollNumber(String rollNumber) {
            this.rollNumber = rollNumber;
            rollNumberDefined = !rollNumber.isEmpty();
            return this;
        }

        public Student build() {
            if (rollNumberDefined) {
                return new Student(
                        rollNumber,
                        firstName,
                        lastName,
                        age
                );
            }
            System.out.println("must define roll number");
            return null;
        }
    }

    public String fullName() {
        return firstName + " " + lastName;
    }
}
