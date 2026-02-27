public class Task8_Test {

    public static void main(String[] args) {

        // We are creating 2 object here for each class and testing the equals method for each class.
        Person p1 = new Person("John", "Smith", "Male");
        Person p2 = new Person("John", "Smith", "Male");

        Teacher t1 = new Teacher("Anna", "Brown", "Female",
                                 "Computer Science", "Java");
        Teacher t2 = new Teacher("Anna", "Brown", "Female",
                                 "Computer Science", "Java");

        Student s1 = new Student("Mike", "Taylor", "Male", "S123");
        Student s2 = new Student("Mike", "Taylor", "Male", "S123");

        PhdStudent ps1 = new PhdStudent("Sara", "Lee", "Female",
                                        "P456", "Engineering", "AI");
        PhdStudent ps2 = new PhdStudent("Sara", "Lee", "Female",
                                        "P456", "Engineering", "AI");

        System.out.println(p1);
        System.out.println("Person equals: " + p1.equals(p2));

        System.out.println(t1);
        System.out.println("Teacher equals: " + t1.equals(t2));

        System.out.println(s1);
        System.out.println("Student equals: " + s1.equals(s2));

        System.out.println(ps1);
        System.out.println("PhD Student equals: " + ps1.equals(ps2));
    }
}