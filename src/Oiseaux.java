public class Oiseaux extends  Animal{
    private String types;
    private String sound;



    public Oiseaux(String types) {
        super(2);
        this.types=types;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    void seDeplacer(){
        System.out.println("vol");
    }
}
