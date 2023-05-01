public class Chien  extends Animal {
    protected String type ;

    @Override
    public String toString() {
        return "Chien{" +
                "type='" + type + '\'' +
                ", isAlive=" + isAlive +
                ", food='" + food + '\'' +
                ", nPates=" + nPates +
                ", cover='" + cover + '\'' +
                '}';
    }

    public Chien(String type) {
        super(4);
        this.type = type;
    }

    void seDeplacer(){
        System.out.println("marche");
    }



}
