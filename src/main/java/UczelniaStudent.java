public class UczelniaStudent {
    private static int itr = 0;
    private Uczelnia uczelnia;
    private Student student;
    private String eska;

    public UczelniaStudent(Uczelnia uczelnia, Student student){
        this.uczelnia=uczelnia;
        this.student=student;

        itr+=1;
        this.eska = "s"+ String.valueOf(itr);
    }
}
