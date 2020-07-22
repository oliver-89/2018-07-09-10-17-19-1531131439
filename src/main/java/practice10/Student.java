package practice10;



public class Student extends Person{
    private Klass klass;
    public Student(int id, String name, int age, Klass klass) {
        super(id,name,age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce(){
        String str = "";
        if(klass.getLeader() == this){
            str = super.introduce()+" I am a Student. I am Leader of Class "+klass.getNumber()+".";
        }else{
            str = super.introduce()+" I am a Student. I am at Class "+klass.getNumber()+".";
        }
        return  str;
    }
}
