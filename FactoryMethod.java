/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author MIHAN
 */
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GarmentsFactory cloths = new GarmentsFactory();
        
        System.out.println("Cloths search by Season:");
        GarmentsCloths cloths1 = cloths.getCloths("SPRING");
        cloths1.AverageWeight();
        
        GarmentsCloths cloths3 = cloths.getCloths("summer");
        cloths3.AverageWeight();
        
        GarmentsCloths cloths5 = cloths.getCloths("winter");
        cloths5.AverageWeight();
        System.out.println();
        
        
        System.out.println("Cloths search by fabric type:");
        GarmentsCloths cloths2 = cloths.getCloths("Silk");
        cloths2.AverageWeight();

        GarmentsCloths cloths4 = cloths.getCloths("cotton");
        cloths4.AverageWeight();
        
        GarmentsCloths cloths6 = cloths.getCloths("wool");
        cloths6.AverageWeight();
        System.out.println();
        
 
    }
    
}
