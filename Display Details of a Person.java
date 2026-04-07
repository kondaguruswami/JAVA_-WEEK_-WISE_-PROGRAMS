class Person {

    void personalDetails(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void qualification(String degree) {
        System.out.println("Qualification: " + degree);
    }

    public static void main(String[] args) {

        Person p = new Person();

        p.personalDetails("Jyothi", 20);
        p.qualification("B.Tech AI & ML");
    }
}