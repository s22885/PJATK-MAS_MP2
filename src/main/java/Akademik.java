import java.util.HashMap;
import java.util.Map;

public class Akademik {
    private Map<Integer, Pokoj> pokoje;
    private String nazwaAkademika;

    public Akademik(String nazwaAkademika) {
        this.nazwaAkademika = nazwaAkademika;
        this.pokoje = new HashMap<Integer, Pokoj>();
    }
    public void addPokoj(int id, Pokoj pokoj){
        this.pokoje.put(id,pokoj);
    }
}
