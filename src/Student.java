public class Student {
    public int id;
    //private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.id + " : " + this.name;
    }
}
