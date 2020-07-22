package practice10;


import java.util.LinkedList;

public class Teacher extends Person{
    private Klass klass;

    private LinkedList<Klass> classes;

    public Teacher(int id,String name, int age) {
        super(id,name, age);
    }

    public Teacher(int id,String name, int age, LinkedList<Klass> classes) {
        super(id,name, age);
        this.classes = classes;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }

    public String introduce(){
        String str="";
        if(classes==null){
            str= super.introduce()+" I am a Teacher. I teach No Class.";
        }else {
            String num ="";
            for(int i = 0;i < classes.size();i++){
                if(i==classes.size()-1){
                    num+=classes.get(i).getNumber();
                    break;
                }
                num+= classes.get(i).getNumber()+", ";
            }
            str = super.introduce()+" I am a Teacher. I teach Class "+num+".";
        }
        return  str;
    }
    public String introduceWith(Student student){
        String str="";
        if(isTeaching(student)){
            str = super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        }else{
            str = super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
        }
        return str;
    }

    public boolean isTeaching(Student student){

      for(Klass klass:classes){
          boolean isInClass = klass.isIn(student);
          if(isInClass){
              return isInClass;
          }

      }
        return false;
    }
}
