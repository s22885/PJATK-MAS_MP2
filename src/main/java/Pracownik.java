import java.util.ArrayList;
import java.util.List;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private Telefon telefon;
    private final List<Sklep> sklepList = new ArrayList<>();

    public Pracownik(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public boolean addSklep(Sklep sklep) {
        if (sklepList.contains(sklep))
            return false;
        sklepList.add(sklep);
        return true;
    }

    public boolean removeSklep(Sklep sklep) {
        if (!sklepList.contains(sklep))
            return false;
        sklepList.remove(sklep);
        return true;
    }

    public boolean addTelefon(Telefon telefon) {
        if (hasTelefon())
            return false;
        if (telefon.hasOwner())
            return false;
        this.telefon=telefon;
        telefon.addOwner(this);
        return true;
    }

    public boolean hasTelefon() {
        return telefon != null;
    }
    public void removeTelefon(){
        if (!hasTelefon())
            return;
        this.telefon=null;
    }
    public void clearTelefon(){
        if(!hasTelefon())
            return;
        this.telefon.removeOwner();
        this.telefon=null;
    }
}
