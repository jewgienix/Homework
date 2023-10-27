package homework5.computer;

public class HDD {
    String name;
    int memory;
    String type;

    public HDD(){
        name = "Seagate";
        memory = 256;
        type = "inner";
    }
    public HDD(String name, int memory, String type){
        this.name = name;
        this.memory = memory;
        this.type = type;
    }
    public String toString(){
        return "Name: " + name + " Memory: " + memory + " type: " + type;
    }
}
