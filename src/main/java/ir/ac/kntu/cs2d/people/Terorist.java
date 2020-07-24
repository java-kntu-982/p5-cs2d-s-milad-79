package ir.ac.kntu.cs2d.people;

import ir.ac.kntu.cs2d.Guns.*;

public class Terorist extends Person{
    private Colt colt;
    private TerorGun gun;
    private boolean bomb;

    public Terorist() {
        this.colt=new Colt(400,21,300,2.3f,20);
    }

    public Colt getColt() {
        return colt;
    }

    public void setColt(Colt colt) {
        this.colt = colt;
    }
    public TerorGun getGun() {
        return gun;
    }

    public void setGun(TerorGun gun) {
        this.gun = gun;
    }
}
