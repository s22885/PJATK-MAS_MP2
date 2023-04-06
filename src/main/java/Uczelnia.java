import java.util.ArrayList;
import java.util.List;

public class Uczelnia {
    private String nazwaUczelni;
    private List<UczelniaStudent> listaStudentow;

    public Uczelnia(String nazwaUczelni){
        this.nazwaUczelni=nazwaUczelni;
        this.listaStudentow = new ArrayList<UczelniaStudent>();
    }

    public void addStudent(UczelniaStudent uczelniaStudent){
        this.listaStudentow.add(uczelniaStudent);
    }
}
