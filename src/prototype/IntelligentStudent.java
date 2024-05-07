package prototype;

public class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent() { }

    public IntelligentStudent(IntelligentStudent is) {
        super(is);
        this.iq = is.iq;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public IntelligentStudent clone() {
//        IntelligentStudent copy = new IntelligentStudent();
//        copy.setName(this.getName());
//        copy.setAge(this.getAge());
//        copy.setPsp(this.getPsp());
//        copy.setAvgPsp(this.getAvgPsp());
//        copy.setBatchName(this.getBatchName());
//        copy.iq = this.iq;

        return new IntelligentStudent(this);
    }
}
