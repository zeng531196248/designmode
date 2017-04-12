package Method.clone;

public class Student implements Cloneable 
{
    private int id;
    private String name;
    public StringBuffer sb = new StringBuffer("");

    public Student() {
        this.id = 744;
        this.name = "FL";
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj) {
        return this.id == ((Student) obj).id;
    }

    public String toString() {
        return "Student id : " + id + " Name " + name;
    }    

    public static void main(String[] args) throws CloneNotSupportedException // 这里为什么一定得写
    {
        Student s1 = new Student(101, "WangQiang");
        Student s2 = (Student) s1.clone();
        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);

        s1.sb.append("s1's string");
        System.out.println("s2.sb's value = " + s2.sb.toString());
        System.out.println(s1.sb==s2.sb);
        
    }
}