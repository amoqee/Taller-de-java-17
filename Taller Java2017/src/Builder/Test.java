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
public class Test {
    public static void main(String[] args) {
        Director d = new Director();
        Hamburger h = d.orderHamb("Hawaiiana");
        Hamburger dob = d.orderHamb("Doble");
        
        h.gethambType();
        dob.gethambType();
    }
    
}
