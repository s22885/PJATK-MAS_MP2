import java.time.LocalDateTime;
import java.util.Optional;

public class Paragon {
    private final LocalDateTime localDateTime = LocalDateTime.now();
    private float kwota;

    private final Sklep sklep;

    public static Optional<Paragon> createParagon(float kwota, Sklep sklep) {
        if (sklep == null)
            return Optional.empty();
        return Optional.of(new Paragon(kwota, sklep));

    }

    private Paragon(float kwota, Sklep sklep) {
        this.kwota = kwota;
        this.sklep = sklep;
    }

    public boolean checkOwnership(Sklep sklep) {
        return this.sklep.equals(sklep);
    }
}
