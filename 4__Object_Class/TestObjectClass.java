class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    // Overriding equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // same reference
        if (obj == null || getClass() != obj.getClass()) return false;
        Person p = (Person) obj;
        return age == p.age && name.equals(p.name);
    }

    // Overriding hashCode() method
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    // finalize() example (called before garbage collection)
    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " object is being garbage collected");
    }
}

public class TestObjectClass {
    public static void main(String[] args) {
        Person p1 = new Person("Kumar", 25);
        Person p2 = new Person("Kumar", 25);
        Person p3 = p1; // same reference

        // toString() demo
        System.out.println(p1.toString());

        // equals() demo
        System.out.println("p1 equals p2? " + p1.equals(p2));
        System.out.println("p1 equals p3? " + p1.equals(p3));

        // hashCode() demo
        System.out.println("p1 hashCode: " + p1.hashCode());
        System.out.println("p2 hashCode: " + p2.hashCode());

        // getClass() demo
        System.out.println("Class of p1: " + p1.getClass().getName());

        // == vs equals
        System.out.println("p1 == p2? " + (p1 == p2));
        System.out.println("p1 == p3? " + (p1 == p3));

        // finalize demo
        p1 = null;
        p2 = null;
        System.gc(); // suggest JVM to run garbage collector
    }
}
