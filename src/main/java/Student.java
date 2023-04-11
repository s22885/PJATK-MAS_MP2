import java.util.ArrayList;
import java.util.List;

public class Student {
    private String imie;
    private String nazwisko;

    private List<UczelniaStudent> listaUczelni;

    private List<Zajecia> listaZajec;

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;

        this.listaZajec = new ArrayList<Zajecia>();
        this.listaUczelni = new ArrayList<UczelniaStudent>();
    }

    public boolean addUczelnia(UczelniaStudent uczelniaStudent) {
        if (!listaUczelni.contains(uczelniaStudent)) {
            this.listaUczelni.add(uczelniaStudent);
            return true;
        }
        return false;
    }

    public boolean removeUczelnia(UczelniaStudent uczelniaStudent) {
        if (listaUczelni.contains(uczelniaStudent)) {
            listaUczelni.remove(uczelniaStudent);
            return true;
        }
        return false;
    }

    public void addZajecia(Zajecia zajecia) {
        this.listaZajec.add(zajecia);
    }
}
