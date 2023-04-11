public class Pokoj {
    private final String pietro;
    private Zajecia zajecia;

    public Pokoj(String pietro) {
        this.pietro = pietro;
    }

    public void removeZajecia() {
        if (zajecia != null) {
            zajecia.clearPokoj();
            clearZajecia();
        }
    }

    public void clearZajecia() {
        if (zajecia == null)
            return;
        this.zajecia = null;
    }

    public void setZajecia(Zajecia zajecia) {
        if (this.zajecia == null || !this.zajecia.equals(zajecia)) {
            this.zajecia = zajecia;
        }
    }
}
