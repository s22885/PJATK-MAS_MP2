import java.util.ArrayList;
import java.util.List;

public class Uczelnia {
    private final String nazwaUczelni;
    private final List<UczelniaStudent> listaStudentow;

    public Uczelnia(String nazwaUczelni) {
        this.nazwaUczelni = nazwaUczelni;
        this.listaStudentow = new ArrayList<UczelniaStudent>();
    }

    public void addStudent(UczelniaStudent uczelniaStudent) {
        if (!listaStudentow.contains(uczelniaStudent)) {
            this.listaStudentow.add(uczelniaStudent);
        }
    }

    public void removeStudent(UczelniaStudent uczelniaStudent) {
        if (listaStudentow.contains(uczelniaStudent)) {
            listaStudentow.remove(uczelniaStudent);
        }
    }

    public void removeStudentByEska(String eska) {
        for (UczelniaStudent currStudent : listaStudentow) {
            if (eska.equals(currStudent.getEska())) {
                currStudent.removeStudent();
            }
        }
    }
}
