package ir.ac.kntu.cs2d;

public class GunAsli extends Gun{
    public GunAsli() {
    }
    public void mp5(){
        this.setPrize(1500);
        this.setDamage(13);
        this.setFireAgain(120);
        this.setMagazineCapacity(30);
        this.setReload(3.1f);
    }
    public void p90(){
        this.setPrize(2350);
        this.setDamage(11);
        this.setFireAgain(80);
        this.setMagazineCapacity(50);
        this.setReload(3.3f);
    }
    public void ak47(){
        this.setPrize(2500);
        this.setDamage(22);
        this.setFireAgain(120);
        this.setMagazineCapacity(30);
        this.setReload(2.5f);
    }
    public void m4a1(){
        this.setPrize(3100);
        this.setDamage(22);
        this.setFireAgain(120);
        this.setMagazineCapacity(30);
        this.setReload(3.1f);
    }
    public void galil(){
        this.setPrize(2000);
        this.setDamage(13);
        this.setFireAgain(120);
        this.setMagazineCapacity(35);
        this.setReload(2.6f);
    }
    public void famas(){
        this.setPrize(2250);
        this.setDamage(14);
        this.setFireAgain(120);
        this.setMagazineCapacity(25);
        this.setReload(3.3f);
    }
}
