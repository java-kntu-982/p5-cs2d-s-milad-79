package ir.ac.kntu.cs2d.Guns;
public class CityGun extends GunAsli {
    public void m4a1(){
        this.setPrize(3100);
        this.setDamage(22);
        this.setFireAgain(120);
        this.setMagazineCapacity(30);
        this.setReload(3.1f);
    }
    public void famas(){
        this.setPrize(2250);
        this.setDamage(14);
        this.setFireAgain(120);
        this.setMagazineCapacity(25);
        this.setReload(3.3f);
    }
}
