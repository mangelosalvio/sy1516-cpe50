
public class Pet {
    private String petType, petName;

    public Pet( String petType, String petName ){
        this.petType = petType;
        this.petName = petName;
    }

    @Override
    public String toString() {
        return this.petType + " : " + this.petName + "\n";
    }
}
