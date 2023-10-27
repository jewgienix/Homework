package homework5.computer;

public class RAM {
    String name;
    int memory;
    public RAM(){
        name = "Hitachi";
        memory = 16;
    }

    public RAM(String name, int memory) {
        this.name = name;
        this.memory = memory;
    }
    public String toString(){
        return "Name: " + name + " Memory: " + memory;
    }
}
