package ru.spsuace.course.classwork.iostreams;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ObjectStreams {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        People dad = new People("Bill", "Murray", null, null, 40);
        People mom = new People("Sara", "Murray", null, null, 35);
        People child = new People("John", "Murray", mom, dad, 10);
        child.setDog(new Dog("Mike"));
        System.out.println("child = " + child);

        Path path = Paths.get("object.bin");
        try (ObjectOutputStream outputStream =
                     new ObjectOutputStream(Files.newOutputStream(path))) {
            outputStream.writeObject(child);
        }

        People newChild;
        try (ObjectInputStream inputStream =
                     new ObjectInputStream(Files.newInputStream(path))) {
            newChild = (People) inputStream.readObject();
        }

        System.out.println("newChild = " + newChild);
    }

    public static class People implements Serializable {
        private final String firstName;
        private final String lastName;
        private People mom;
        private People dad;
        private transient Dog dog;
        private int age;
        private transient String initials;

        public People(String firstName, String lastName) {
            this(firstName, lastName, null, null, 0);
        }

        public People(String firstName, String lastName, People mom, People dad, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.mom = mom;
            this.dad = dad;
            this.age = age;
            calculateInitials(firstName, lastName);
        }

        private void calculateInitials(String firstName, String lastName) {
            this.initials = firstName.charAt(0) + "." + lastName.charAt(0) + ".";
        }

        public void setDog(Dog dog) {
            this.dog = dog;
        }

        @Override
        public String toString() {
            return "People{" +
                    "firstName='" + firstName + "\', " +
                    "lastName='" + lastName + "\', " +
                    (mom != null ? "\n    mom=" + mom + ", " : "") +
                    (dad != null ? "\n    dad=" + dad + ", \n    " : "") +
                    (dog != null ? "\n    dog=" + dog + ", \n    " : "") +
                    "age=" + age + ", " +
                    "initials='" + initials + '\'' +
                    '}';
        }



    }

    public static class Dog {
        final String name;

        public Dog(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

}
