/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author pgrenning
 */
public class HelloWorldException {
    public static void main (String[] args) throws Exception {
        System.out.println("Bienvenitos!");
        throw new Exception("Generic Exception");
    }
}
