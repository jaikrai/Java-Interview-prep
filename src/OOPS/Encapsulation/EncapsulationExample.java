package OOPS.Encapsulation;
// Encapsulation is about binding an object's state and behaviors together
// is a way of wrapping data and acting into a single unit in java this would be a class
// it helps to prevent class into tightly couple and keep data related same behavior together
// with encapsulation we can hide a class's data from other class this known as data hiding
// we achieve encapsulation in java by declaring all the fields in a class as private and writing
// public methods in the class toi set and get their values
// we use encapsulation so that the user has no idea of thew inner implementation of a give
// class data it contains
// it allows you ti hide values are stored and maintained within a given class
// improves reusability of out program
// makes our code more maintainable


public class EncapsulationExample {
    public static void main(String[] args) {
        MITStudents students = new MITStudents("Tyler Mac", 18);

        System.out.println(students);
        System.out.println("Name: "+students.getName());
        System.out.println("House: "+students.getHouse());
    }
}
