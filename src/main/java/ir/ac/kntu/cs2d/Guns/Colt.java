package ir.ac.kntu.cs2d.Guns;

public class Colt extends Gun {
    public Colt() {
    }
    public void glock(){
        this.setPrize(400);
        this.setDamage(21);
        this.setFireAgain(300);
        this.setMagazineCapacity(20);
        this.setReload(2.3f);
    }

    public void usp(){
        this.setPrize(500);
        this.setDamage(24);
        this.setFireAgain(340);
        this.setMagazineCapacity(12);
        this.setReload(2.2f);
    }

    public void mp5(){
        this.setPrize(650);
        this.setDamage(34);
        this.setFireAgain(550);
        this.setMagazineCapacity(7);
        this.setReload(2.2f);
    }
}
