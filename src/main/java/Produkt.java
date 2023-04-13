import java.util.ArrayList;
import java.util.List;

public class Produkt {
    private static int produktIdItr = 0;
    private final String nazwaProduktu;

    private final int idProdukt;

    private final List<SklepProdukt> sklepProduktList = new ArrayList<>();

    public Produkt(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
        this.idProdukt = produktIdItr++;
    }
    public boolean LinkSklep(SklepProdukt sklepProdukt){
        if (sklepProduktList.contains(sklepProdukt))
            return false;
        sklepProduktList.add(sklepProdukt);
        return true;
    }
    public boolean unlinkSklep(SklepProdukt sklepProdukt){
        if (!sklepProduktList.contains(sklepProdukt))
            return false;
        sklepProduktList.remove(sklepProdukt);
        return true;
    }
}
