package OOP.Generics.CompareObject;

public class Student implements Comparable<Student>{
    double mark ;

    Student(double mark){
        this.mark = mark;
    }

    @Override
    public String toString() {
        return mark + "";
    }

    @Override
    public int compareTo(Student o) {
        return (int)(this.mark - o.mark);
    }
}
