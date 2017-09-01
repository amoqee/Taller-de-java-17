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
public class HawaiBuilder extends Builder{

    public Hawaiian buildHamburger() {
        return new Hawaiian();
    }

    public void buildBread() {
        Bread b = new Bread();
        hamburger.setBread(b);
        
        
    }

    public void buildTomatoe() {
        hamburger.setTomatoe(new Tomatoe ());
    }

    public void buildMeat() {
        hamburger.setMeat(new Meat ());
    }

    public void buildPineapple() {
        hamburger.setPineapple(new Pineapple ());
    }

    
    
    
}
