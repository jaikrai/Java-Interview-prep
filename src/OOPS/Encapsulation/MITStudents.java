package OOPS.Encapsulation;

public class MITStudents {
    private String name;
    private MITHouse house;

    public MITStudents(String name, int age){
        this.name = name;
        this.house = MITHouse.values()[Math.abs(name.hashCode()) % 4];

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MITHouse getHouse() {
        return house;
    }

    public void setHouse(MITHouse house) {
        this.house = house;
    }
}
