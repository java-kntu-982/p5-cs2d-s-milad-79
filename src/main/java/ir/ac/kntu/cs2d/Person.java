package ir.ac.kntu.cs2d;

public class Person {
    private int money=800;
    private int june=100;

    public Person() {
    }

    public void armor(){
        this.june+=180;
    }
    public boolean zakhmi(int damage){
        this.june-=damage;
        if (june>0){
            return true;
        }
        System.out.println("Dead :(");
        return false;
    }
    public int getMoney() {
        return money;
    }
    public void addmoney(int money){
        this.money+=money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public int getJune() {
        return june;
    }
    public void setJune(int june) {
        this.june = june;
    }
}
