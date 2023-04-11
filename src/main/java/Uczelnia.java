import java.util.ArrayList;
import java.util.List;

public class Uczelnia {
    private String nazwaUczelni;
    private List<UczelniaStudent> listaStudentow;

    public Uczelnia(String nazwaUczelni) {
        this.nazwaUczelni = nazwaUczelni;
        this.listaStudentow = new ArrayList<UczelniaStudent>();
    }

    public boolean addStudent(UczelniaStudent uczelniaStudent) {
        if (!listaStudentow.contains(uczelniaStudent)) {
            this.listaStudentow.add(uczelniaStudent);
            return true;
        }
        return false;
    }

    public boolean removeStudent(UczelniaStudent uczelniaStudent) {
        if (listaStudentow.contains(uczelniaStudent)) {
            listaStudentow.remove(uczelniaStudent);
            return true;
        }
        return false;
    }

    public boolean removeStudentByEska(String eska) {
        for (UczelniaStudent currStudent : listaStudentow) {
            if (eska.equals(currStudent.getEska())) {
                currStudent.removeStudent();
                return true;
            }
        }
        return false;
    }
}
