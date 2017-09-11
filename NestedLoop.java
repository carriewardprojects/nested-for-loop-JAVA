/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedloop;

/**
 *
 * @author student
 */
public class NestedLoop {

    public static void main(String[] args) {
        
        int x = 0;
        int i,j;
        
        for ( i = 0; i < 10; i++ ){
            for ( j = 10; j > 4; j-- ){
                x = x+1;
                System.out.print(x + " ");
            }
        }
        System.out.println("\nThe value of 'x' is now: " + x);
                
    }
    
}
