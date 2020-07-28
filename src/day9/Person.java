package day9;

public class Person implements Comparable<Person> {
    String userName;
    String password;

    @Override
    // 1 : this is greater
    // 0: other is same
    // -1: other is larger
    public int compareTo(Person other) {
        return this.userName.compareTo(other.userName);
    }
}
