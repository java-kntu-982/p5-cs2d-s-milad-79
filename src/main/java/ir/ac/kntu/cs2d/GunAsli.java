package ir.ac.kntu.cs2d;

public class GunAsli extends Gun{
    public GunAsli() {
    }
    public void p90(){
        this.setPrize(2350);
        this.setDamage(11);
        this.setFireAgain(80);
        this.setMagazineCapacity(50);
        this.setReload(3.3f);
    }
}
