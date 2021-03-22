/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidaccountbalance;

/**
 *
 * @author user
 */
public class VidAccountBalance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    final int INITIAL_BALANCE = 1000;
    final double INTEREST = 1.05;
    
        System.out.print("Balance after year 1 = $");
        System.out.println(INITIAL_BALANCE * INTEREST);
        
        System.out.print("Balance after year 2 = $");
        System.out.println(INITIAL_BALANCE * INTEREST * INTEREST);
        
        System.out.print("Balance after year 3 = $");
        //System.out.println(INITIAL_BALANCE * INTEREST * INTEREST * INTEREST);
        System.out.println(INITIAL_BALANCE *(Math.pow(INTEREST, 3)));
        
        
    
    
        
    }
    
}
