package domain;

public class Reward {
    private int id;
    private String name;
    private String descrption;
    private int idLevel;

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
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public int getIdLevel() {
        return idLevel;
    }

    public void setIdLevel(int idLevel) {
        this.idLevel = idLevel;
    }

    public void showReward(){
        System.out.println("********** Reward ***********");
        System.out.println("Nombre: "+ name);
        System.out.println("Descripcion: "+descrption);
        System.out.println("*********************************");
    }
}
