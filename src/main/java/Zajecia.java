import java.util.ArrayList;
import java.util.List;

public class Zajecia {
    private List<Student> listaStudentow;

    private Pokoj pokoj;
    private String name;

    public Zajecia(String name) {
        this.name = name;
        this.listaStudentow = new ArrayList<Student>();
    }
    public void setPokoj(Pokoj pokoj){
        this.pokoj = pokoj;
    }
    public void addStudent(Student student){
        this.listaStudentow.add(student);
    }

}
