public class SklepProdukt {
    private final Produkt produkt;
    private final Sklep sklep;
    private float wartoscProduktu;

    public SklepProdukt(Sklep sklep, Produkt produkt, float wartoscProduktu) {
        this.produkt = produkt;
        this.sklep = sklep;
        this.wartoscProduktu = wartoscProduktu;
        linkSklepProdukt();
    }

    public void linkSklepProdukt() {
        this.produkt.LinkSklep(this);
        this.sklep.LinkProdukt(this);
    }

    public void unlinkSklepProdukt() {
        this.produkt.unlinkSklep(this);
        this.sklep.unlinkProdukt(this);
    }
}
