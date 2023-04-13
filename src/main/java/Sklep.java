import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sklep {
    private static int pracowikIdItr = 0;
    private final String nazwaSklepu;
    private final Map<Integer, Pracownik> pracownikMap = new HashMap<>();
    private final List<SklepProdukt> sklepProduktList = new ArrayList<>();

    private List<Paragon> paragonList = new ArrayList<>();

    public Sklep(String nazwaSklepu) {
        this.nazwaSklepu = nazwaSklepu;
    }

    public boolean unlinkProdukt(SklepProdukt sklepProdukt) {
        if (!sklepProduktList.contains(sklepProdukt))
            return false;
        sklepProduktList.remove(sklepProdukt);
        return true;
    }

    public boolean LinkProdukt(SklepProdukt sklepProdukt) {
        if (sklepProduktList.contains(sklepProdukt))
            return false;
        sklepProduktList.add(sklepProdukt);
        return true;
    }

    public boolean addPracownik(Pracownik pracownik) {
        if (pracownikMap.containsValue(pracownik))
            return false;
        pracownikMap.put(pracowikIdItr++, pracownik);
        pracownik.addSklep(this);
        return true;
    }

    public boolean removePracownik(int idPracownik) {
        if (!pracownikMap.containsKey(idPracownik))
            return false;
        Pracownik tmpPracownik = pracownikMap.get(idPracownik);
        tmpPracownik.removeSklep(this);
        return true;
    }
    public boolean addParagon(Paragon paragon){
        if (!paragon.checkOwnership(this))
            return false;
        if (paragonList.contains(paragon))
            return false;
        this.paragonList.add(paragon);
        return true;
    }
    public boolean removeParagon(Paragon paragon){
        if (!paragonList.contains(paragon))
            return false;
        paragonList.remove(paragon);
        return true;
    }

}
