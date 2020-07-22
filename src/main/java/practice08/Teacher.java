package practice08;




public class Teacher extends Person{
    private Klass klass;

    public Teacher(int id,String name, int age) {
        super(id,name, age);
    }

    public Teacher(int id,String name, int age, Klass klass) {
        super(id,name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce(){
        String str="";
        if(klass==null){
            str= super.introduce()+" I am a Teacher. I teach No Class.";
        }else {
            str = super.introduce()+" I am a Teacher. I teach Class "+klass.getNumber()+".";
        }
        return  str;
    }
    public String introduceWith(Student student){
        String str="";
        if( student.getKlass().getNumber()==klass.getNumber()){
            str = super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        }else{
            str = super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
        }
        return str;
    }

}
