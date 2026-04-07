class Student {

    Student() {
        System.out.println("Default Constructor");
    }

    Student(String name) {
        System.out.println("Name: " + name);
    }

    Student(String name, int age) {
        System.out.println("Name: " + name + " Age: " + age);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Jyothi");
        Student s3 = new Student("Jyothi", 20);
    }
}