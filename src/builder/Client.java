package builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = Student.getBuilder();
//        builder.setAge(20);
//        builder.setName("sumit");
//        builder.setBatch("Mar24");
//        builder.setPsp(90.0);

        // Student student = builder.build();

        Student student = Student.getBuilder()
                .setName("Guna")
                .setAge(20)
                .setBatch("mar24")
                .build();


        System.out.println("DEBUG");


    }
}
