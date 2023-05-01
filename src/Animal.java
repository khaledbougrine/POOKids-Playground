public class Animal  {

    /**
     * Field
     */
    protected Boolean isAlive;
    protected String food;



    protected Integer nPates;
    protected String cover;

    public Animal(Integer nPates) {
        this.nPates = nPates;
    }

    public Integer getnPates() {
        return nPates;
    }

    public void setnPates(Integer nPates) {
        this.nPates = nPates;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }




}
