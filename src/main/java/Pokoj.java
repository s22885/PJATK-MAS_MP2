public class Pokoj {
    private String pietro;
    private Zajecia zajecia;

    public Pokoj(String pietro) {
        this.pietro = pietro;
    }

    public boolean setZajecia(Zajecia zajecia) {
        if (this.zajecia == null || !this.zajecia.equals(zajecia)) {
            this.zajecia = zajecia;
            return true;
        }
        return false;
    }
}
