package builder;

public class Student {
    private String name;
    private String batch;
    private double psp;
    private int age;
    private int gradYear;
    private String phone;

    // Inner classes
    // They can access private members of outside class
    // Belongs to the object of the outer class
    // (just like any other attributes)
    static class Builder {
        private String name;
        private String batch;
        private double psp;
        private int age;
        private int gradYear;
        private String phone;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    private Student(Builder builder) {
        if(builder.getAge() > 100) {
            throw new RuntimeException();
        }

        this.name = builder.getName();
        this.batch = builder.getBatch();
        this.psp = builder.getPsp();
        this.age = builder.getAge();
        this.gradYear = builder.getGradYear();
        this.phone = builder.getPhone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Belongs to Student class
    public static Builder getBuilder() {
        return new Builder();
    }
}
