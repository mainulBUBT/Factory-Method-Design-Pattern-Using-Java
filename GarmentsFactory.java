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
public class GarmentsFactory {
    
    public GarmentsCloths getCloths(String clothsType){
        
        if(clothsType == null){
            return null;
        }
        if(clothsType.equalsIgnoreCase("SPRING") || clothsType.equalsIgnoreCase("SILK")){
            return new SpringCloths();
        }
        else if(clothsType.equalsIgnoreCase("SUMMER") || clothsType.equalsIgnoreCase("COTTON")){
            return new SummerCloths();
        } 
        else if(clothsType.equalsIgnoreCase("WINTER") || clothsType.equalsIgnoreCase("WOOL")){
            return new WinterCloths();
        }
        return null;
    }
}
