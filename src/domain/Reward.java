package domain;

public class Reward {
    private int id;
    private String name;
    private String description;
   // private int idLevel;

    public Reward(int id, String name, String description) { //No hace falta el idLevel, la asociacion ya se aplica en Reward
        this.id = id;
        this.name = name;
        this.description = description;
       // this.idLevel = idLevel;
    }

    public int get_id() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrption() {
        return description;
    }

    public void setDescrption(String description) {
        this.description = description;
    }

    /*public int getIdLevel() {
        return idLevel;
    }

    public void setIdLevel(int idLevel) {
        this.idLevel = idLevel;
    }*/

    public void showReward(){
        System.out.println("********** Reward ***********");
        System.out.println("Nombre: "+ name);
        System.out.println("Descripcion: "+description);
        System.out.println("*********************************");
    }
}
