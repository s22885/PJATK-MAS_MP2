public class Pokoj {
    private String pietro;
    private Zajecia zajecia;

    public Pokoj(String pietro) {
        this.pietro = pietro;
    }

    public boolean removeZajecia() {
        if (zajecia != null) {
            zajecia.clearPokoj();
            clearZajecia();
            return true;
        }
        return false;
    }

    public boolean clearZajecia() {
        if (zajecia == null)
            return false;
        this.zajecia = null;
        return true;
    }

    public boolean setZajecia(Zajecia zajecia) {
        if (this.zajecia == null || !this.zajecia.equals(zajecia)) {
            this.zajecia = zajecia;
            return true;
        }
        return false;
    }
}
