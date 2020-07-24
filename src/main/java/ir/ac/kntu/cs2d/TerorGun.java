package ir.ac.kntu.cs2d;

public class TerorGun extends GunAsli{

    public void ak47(){
        this.setPrize(2500);
        this.setDamage(22);
        this.setFireAgain(120);
        this.setMagazineCapacity(30);
        this.setReload(2.5f);
    }
    public void galil(){
        this.setPrize(2000);
        this.setDamage(13);
        this.setFireAgain(120);
        this.setMagazineCapacity(35);
        this.setReload(2.6f);
    }
}
