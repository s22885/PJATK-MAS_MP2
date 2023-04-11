import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String imie;
    private final String nazwisko;

    private final List<UczelniaStudent> listaUczelni;

    private final List<Zajecia> listaZajec;

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;

        this.listaZajec = new ArrayList<>();
        this.listaUczelni = new ArrayList<>();
    }

    public void addUczelnia(UczelniaStudent uczelniaStudent) {
        if (!listaUczelni.contains(uczelniaStudent)) {
            this.listaUczelni.add(uczelniaStudent);
        }
    }

    public void removeUczelnia(UczelniaStudent uczelniaStudent) {
        if (listaUczelni.contains(uczelniaStudent)) {
            listaUczelni.remove(uczelniaStudent);
        }
    }

    public void addZajecia(Zajecia zajecia) {
        if (this.listaZajec.contains(zajecia))
            return;
        this.listaZajec.add(zajecia);
    }

    public void removeZajecia(Zajecia zajecia) {
        if (!this.listaZajec.contains(zajecia))
            return;
        this.listaZajec.remove(zajecia);
    }
}
