package Assignment2;

//singleton class has only one object
//constructor==private
//make a static object with return type that of class using concept of lazy initialization
//for access control in dbms etc
//does not destroy with completion of program

class Singleton{
    private static Singleton single_instance=null;
    public String s;

    private Singleton(){
        s="Hello World";
    }

    public static Singleton getInstance(){
        if(single_instance==null){
            single_instance=new Singleton();
        }
        return single_instance;
    }
}

public class Qsn2 {
    public static void main(String[] args){
        Singleton x=Singleton.getInstance();
        Singleton y=Singleton.getInstance();
        Singleton z=Singleton.getInstance();

        if(x==y && y==z){
            System.out.println("All are same object");
        }
        else {
            System.out.println("All are different objects");
        }
    }
}
