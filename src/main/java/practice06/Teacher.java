package practice06;

public class Teacher extends Person{
    private int klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }


    public String introduce(){
        String str="";
        if(klass==0){
            str= super.introduce()+" I am a Teacher. I teach No Class.";
        }else {
            str = super.introduce()+" I am a Teacher. I teach Class "+klass+".";
        }
        return  str;
    }
}
