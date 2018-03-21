package object;

public class person {
    public String name;
    public String graduate;

    public person(String name,String graduate){
        this.name = name;
        this.graduate =graduate;
    }

    public void introduction(){
        System.out.println("私の名前は" + this.name +"です。" + this.graduate + "出身");
    }
}