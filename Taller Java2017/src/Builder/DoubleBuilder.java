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
public class DoubleBuilder extends Builder{

    @Override
    public Hamburger buildHamburger() {
        return new DoubleBurger();
    }

    @Override
    public void buildBread() {
        hamburger.setBread(new Bread());
    }

    @Override
    public void buildTomatoe() {
        hamburger.setTomatoe(new Tomatoe ());
    }

    @Override
    public void buildMeat() {
        System.out.println("Tiene doble carne");
    }

    @Override
    public void buildPineapple() {
        System.out.println("No tiene piña");
    }
    
}
