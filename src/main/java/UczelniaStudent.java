public class UczelniaStudent {
    private static int itr = 0;
    private final Uczelnia uczelnia;
    private final Student student;
    private final String eska;

    public UczelniaStudent(Uczelnia uczelnia, Student student){
        this.uczelnia=uczelnia;
        this.student=student;

        itr+=1;
        this.eska = "s"+ itr;

    }
    public String getEska(){
        return eska;
    }
    public void removeStudent(){
        uczelnia.removeStudent(this);
        student.removeUczelnia(this);
    }
}
