package ir.ac.kntu.cs2d.people;

import ir.ac.kntu.cs2d.Guns.*;

public class City extends Person{
    private Colt colt;
    private CityGun gun;

    public City() {
        this.colt=new Colt(500,24,340,2.2f,12);
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
