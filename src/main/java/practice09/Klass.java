package practice09;



public class Klass {
    private int number;
    private String displayName;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class "+number;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student student){
        if(student.getKlass().getNumber()==this.number){
            leader = student;

        }else {
            System.out.print("It is not one of us.\n");
        }

    }

    public void appendMember(Student student){
         student.getKlass().setNumber(number);
    }


}
