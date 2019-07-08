/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debugexample;

/**
 *
 * @author Sam
 */
public class DebugExample {

    public static void main(String[] args) {

        methodA();
    }
    
    public static void methodA(){
        
        for( int i = 1 ; i <= 10 ; i++){
            methodB(i);
            System.out.println(" **");
        }        
    }
    
    public static int methodB(int x){
        System.out.printf("%3d", x);
        if(x == 10){
            return 0;
        } else {
            methodB(x+1);
        }
        return 0;
    }
}
