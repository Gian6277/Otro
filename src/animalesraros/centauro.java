/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalesraros;

/**
 *
 * @author kapo_
 */
public class centauro implements Icaballo , Ihumano{

    public centauro() {
    }
    
    @Override
    public void cabalgar(){
        System.out.println("El centauro cabalga");
    }
    @Override
    public void hablar(){
        System.out.println("El centauro habla");
    }
    public void lucha() {
        System.out.println("El centauro lucha");
}
}
