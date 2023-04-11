import java.util.ArrayList;
import java.util.List;

public class Zajecia {
    private final List<Student> listaStudentow;

    private Pokoj pokoj;
    private final String name;

    public Zajecia(String name) {
        this.name = name;
        this.listaStudentow = new ArrayList<>();
    }

    public void setPokoj(Pokoj pokoj) {
        if (this.pokoj == null || this.pokoj.equals(pokoj)) {
            this.pokoj = pokoj;
            this.pokoj.setZajecia(this);
        }
    }

    public void clearPokoj() {
        if (this.pokoj == null)
            return;
        this.pokoj = null;
    }

    public void removePokoj() {
        if (this.pokoj != null) {
            pokoj.clearZajecia();
            clearPokoj();
        }

    }

    public void addStudent(Student student) {
        if (this.listaStudentow.contains(student))
            return;
        this.listaStudentow.add(student);
        student.addZajecia(this);
    }

    public void removeStudent(Student student) {
        if (!this.listaStudentow.contains(student))
            return;
        this.listaStudentow.remove(student);
        student.removeZajecia(this);
    }

}
