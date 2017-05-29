/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superclassreferencesubclass;

/**
 *
 * @author tiago.lucas
 */
public class SuperClassReferenceSubClass{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        BoxWeight wb = new BoxWeight(10, 15, 20, 25.75);
        Box b;
        double vol;
        vol = wb.volume();
        System.out.println("Volume of wb is "+vol);
        System.out.println("Weight of wb is "+wb.weight);
        System.out.println();
        
        //assign BoxWeight reference to Box reference
        b=wb;
        vol=b.volume(); //ok
        System.out.println("Volume of b is "+vol);
        /*The following statement is invalid because b does not
        define a weight member.
        */
        //System.out.println("Weight of b is "+b.weight);
    }
    
}
