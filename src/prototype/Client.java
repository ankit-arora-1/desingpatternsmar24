package prototype;

public class Client {

    // Dummy data inside registry
    public static void populateRegistry(StudentRegistry studentRegistry) {
        Student march24Prototype = new Student();
        march24Prototype.setBatchName("march24 advance morning");
        march24Prototype.setAvgPsp(98.0);

        studentRegistry.register("mar24", march24Prototype);

        IntelligentStudent isMay23Prototype = new IntelligentStudent();
        isMay23Prototype.setBatchName("may23");
        isMay23Prototype.setAvgPsp(99.9);

        studentRegistry.register("may23IS", isMay23Prototype);

    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        populateRegistry(studentRegistry);

        // creating a new student
        Student student = studentRegistry.get("mar24").clone();
        student.setName("Sathish");
        student.setPsp(97.0);
        student.setAge(20);

        System.out.println("DEBUG");

    }
}
