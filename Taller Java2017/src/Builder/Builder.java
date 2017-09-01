/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author karen.galicia
 */
public abstract class Builder {
    protected Hamburger hamburger;
    public abstract Hamburger buildHamburger();
    public abstract void buildBread();
    public abstract void buildTomatoe();
    public abstract void buildMeat();
    public abstract void buildPineapple();
    
    public Hamburger getHamburger()
    {
        return hamburger;
    }
    public void createHamburger()
    {
        hamburger = buildHamburger();
        buildBread();
        buildTomatoe();
        buildPineapple();
        buildMeat();
    }
}
