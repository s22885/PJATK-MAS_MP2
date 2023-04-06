import java.util.ArrayList;
import java.util.List;

public class Student {
    private String imie;
    private String nazwisko;

    private List<UczelniaStudent> listaUczelni;

    private List<Zajecia> listaZajec;

    public Student(String imie,String nazwisko){
        this.imie=imie;
        this.nazwisko=nazwisko;

        this.listaZajec = new ArrayList<Zajecia>();
        this.listaUczelni= new ArrayList<UczelniaStudent>();
    }
    public void addUczelnia(UczelniaStudent uczelniaStudent){
        this.listaUczelni.add(uczelniaStudent);
    }
    public void addZajecia(Zajecia zajecia){
        this.listaZajec.add(zajecia);
    }
}
