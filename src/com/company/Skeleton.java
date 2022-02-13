package com.company;

public class Skeleton extends Boss{
    private int arrowsQuantity;

    public int getArrowsQuantity() {
        return arrowsQuantity;
    }

    public void setArrowsQuantity(int arrowsQuantity) {
        this.arrowsQuantity = arrowsQuantity;
    }

    public Skeleton(int health, int damage, int arrowsQuantity) {
        super(health, damage);
        this.arrowsQuantity = arrowsQuantity;
    }
    public String printInfo(){
        return super.printInfo()+" "+ arrowsQuantity;


    }

}
