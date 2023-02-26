/* 
 * Euan Ham
 * AP Computer Science A
 * Mr. Sheldon
 * Open-Ended Activity
*/
public class Pokemon{
    private String name, type;
    private double hp, atk;
    //Constructor with parameters
    public Pokemon(String name, String type, double hp, double atk){
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.atk = atk;
    }
    //getters
    public String getName() {
        return name;
    }
    public String getType(){
        return type;
    }
    public double getHp(){
        return hp;
    }
    public double getAtk(){
        return atk;
    }
    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setHp(String hp){
        this.hp = hp;
    }
    public void setAtk(String atk){
        this.atk = atk;
    }
    //other methods
    public String toString(){
        return "I am " + getName() + ", my type is " + getType() + ", and my attack & defense are " + getAtk() + " and " + getHp() + ".";
    }
    public double speedRatio(){
        return (getAtk())/(getHp());
    }
    public double powerLevel(){
        double health = getHp();
        double attack = getAtk();
        return 2 * (health + attack);
    }
    public boolean isFast(){
        double ratio = speedRatio();
        if(ratio > 2){
            return true;
        } else {
            return false;
        }
    }
    public boolean isPowerful(){
        double attack = getAtk();
        if(attack > 50){
            return true;
        } else {
            return false;
        }
    }
    public boolean isTooStrong(){
        if ((isPowerful() || isFast()) && (powerLevel() > 250)){
            return true;
        } else {
            return false;
        }
    }
    public void battleCry(){
        String pokeName = getName().toUpperCase();
        for (int i = 0; i < pokeName.length(); i++){
            System.out.println(pokeName.substring(i, i + 1));
        }
        System.out.println("!!!");
        System.out.println("I AM " + pokeName + " !!!");
    }
}