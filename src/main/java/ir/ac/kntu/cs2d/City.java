package ir.ac.kntu.cs2d;

public class City extends Person{
    private Colt colt;
    private CityGun gun;

    public City() {
        this.colt.glock();
    }

    public Colt getColt() {
        return colt;
    }

    public void setColt(Colt colt) {
        this.colt = colt;
    }

    public CityGun getGun() {
        return gun;
    }

    public void setGun(CityGun gun) {
        this.gun = gun;
    }
}
