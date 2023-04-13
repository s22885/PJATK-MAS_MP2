import java.time.LocalDateTime;

public class Paragon {
    private final LocalDateTime localDateTime = LocalDateTime.now();
    private float kwota;

    private final Sklep sklep;


    public Paragon(float kwota,Sklep sklep){
        this.kwota=kwota;
        this.sklep=sklep;
    }
    public boolean checkOwnership(Sklep sklep){
        return this.sklep.equals(sklep);
    }
}
