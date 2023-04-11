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

    public boolean clearPokoj() {
        if (this.pokoj == null)
            return false;
        this.pokoj = null;
        return true;
    }

    public boolean removePokoj() {
        if (this.pokoj != null) {
            pokoj.clearZajecia();
            clearPokoj();
            return true;
        }
        return false;
    }

    public boolean addStudent(Student student) {
        if (this.listaStudentow.contains(student))
            return false;
        this.listaStudentow.add(student);
        return true;
    }

    public boolean removeStudent(Student student) {
        if (!this.listaStudentow.contains(student))
            return false;
        this.listaStudentow.remove(student);
        return true;
    }

}
