import java.util.HashMap;
import java.util.Map;

public class Akademik {
    private final Map<Integer, Pokoj> pokoje;
    private final String nazwaAkademika;

    public Akademik(String nazwaAkademika) {
        this.nazwaAkademika = nazwaAkademika;
        this.pokoje = new HashMap<>();
    }

    public void addPokoj(int id, Pokoj pokoj) {
        if (this.pokoje.containsValue(pokoj)) return;

        this.pokoje.put(id, pokoj);
    }

    public void removePokoj(int id) {
        if (!this.pokoje.containsKey(id)) return;
        this.pokoje.remove(id);
    }

    public void removePokoj(Pokoj pokoj) {
        if (!this.pokoje.containsValue(pokoj)) return;
        this.pokoje.values().remove(pokoj);
    }
}
