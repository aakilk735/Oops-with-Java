
class Student{
    private int Id;
    private String name;
    private String city;
    public int getId(){
        return Id;
    }
    public void setId(int Id){
        this.Id=Id;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city=city;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Student sc=new Student();
        sc.setId(1);
        sc.setName("Mohammad Aakil");
        sc.setCity("Bahorawas");
        System.out.println("Id: "+sc.getId());
        System.out.println("Name: "+sc.getName());
        System.out.println("City: "+sc.getCity());
    }
}
