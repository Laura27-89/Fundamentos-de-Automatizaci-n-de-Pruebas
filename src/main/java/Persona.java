public class Persona {
    private String name;
    private String lastname;

    public Persona(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }
    public void changeName(String newName){
        this.name = newName;
    }
    public String getFullName(){
        return this.name + " " + this.lastname;
    }
}
