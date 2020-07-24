package ir.ac.kntu.cs2d.Guns;

public class Gun {
    private int prize;
    private int damage;
    private int fireAgain;
    private float reload;
    private int magazineCapacity;

    public Gun() {
    }

    public Gun(int prize, int damage, int fireAgain, float reload, int magazineCapacity) {
        this.prize = prize;
        this.damage = damage;
        this.fireAgain = fireAgain;
        this.reload = reload;
        this.magazineCapacity = magazineCapacity;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getFireAgain() {
        return fireAgain;
    }

    public void setFireAgain(int fireAgain) {
        this.fireAgain = fireAgain;
    }

    public float getReload() {
        return reload;
    }

    public void setReload(float reload) {
        this.reload = reload;
    }

    public int getMagazineCapacity() {
        return magazineCapacity;
    }

    public void setMagazineCapacity(int magazineCapacity) {
        this.magazineCapacity = magazineCapacity;
    }
}
