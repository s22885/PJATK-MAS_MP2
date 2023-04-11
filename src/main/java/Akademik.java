import java.util.HashMap;
import java.util.Map;

public class Akademik {
    private Map<Integer, Pokoj> pokoje;
    private String nazwaAkademika;

    public Akademik(String nazwaAkademika) {
        this.nazwaAkademika = nazwaAkademika;
        this.pokoje = new HashMap<>();
    }

    public boolean addPokoj(int id, Pokoj pokoj) {
        if (this.pokoje.containsValue(pokoj)) return false;

        this.pokoje.put(id, pokoj);
        return true;
    }

    public boolean removePokoj(int id) {
        if (!this.pokoje.containsKey(id)) return false;
        this.pokoje.remove(id);
        return true;
    }

    public boolean removePokoj(Pokoj pokoj) {
        if (!this.pokoje.containsValue(pokoj)) return false;
        this.pokoje.values().remove(pokoj);
        return true;
    }
}
