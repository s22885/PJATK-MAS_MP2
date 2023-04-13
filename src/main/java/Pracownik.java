import java.util.ArrayList;
import java.util.List;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private List<Telefon> telefonList = new ArrayList<>();
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
        if (hasTelefon(telefon))
            return false;
        if (telefon.hasOwner())
            return false;
        this.telefonList.add(telefon);
        telefon.addOwner(this);
        return true;
    }

    public boolean hasTelefon(Telefon telefon) {
        return telefonList.contains(telefon);
    }

    public void removeTelefon(Telefon telefon) {
        if (!hasTelefon(telefon))
            return;
        this.telefonList.remove(telefon);
    }

    public void clearTelefon(Telefon telefon) {
        if (!hasTelefon(telefon))
            return;

        int pos=0;
        for (int i=0; i<telefonList.size();i++){
            if (telefonList.get(i).equals(telefon)){
                i=pos;
                break;
            }
        }
        telefonList.get(pos).removeOwner();
        telefonList.remove(pos);
    }
}
