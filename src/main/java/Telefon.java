public class Telefon {
    private String model;
    private int numer;

    private Pracownik pracownik;
    public Telefon(String model, int numer){
        this.numer=numer;
        this.model=model;
    }
    public boolean hasOwner(){
        return pracownik != null;
    }
    public void addOwner(Pracownik pracownik){
        this.pracownik=pracownik;
    }
    public void clearOwner(){
        if(!hasOwner())
            return;
        pracownik.removeTelefon(this);
        pracownik=null;
    }
    public void removeOwner(){
        if(!hasOwner())
            return;
        pracownik=null;
    }

}
