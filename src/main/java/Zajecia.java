import java.util.ArrayList;
import java.util.List;

public class Zajecia {
    private List<Student> listaStudentow;

    private Pokoj pokoj;
    private String name;

    public Zajecia(String name) {
        this.name = name;
        this.listaStudentow = new ArrayList<>();
    }

    public boolean setPokoj(Pokoj pokoj) {
        if (this.pokoj == null || this.pokoj.equals(pokoj)) {
            this.pokoj = pokoj;
            this.pokoj.setZajecia(this);
            return true;
        }
        return false;
    }

    public void addStudent(Student student) {
        this.listaStudentow.add(student);
    }

}
