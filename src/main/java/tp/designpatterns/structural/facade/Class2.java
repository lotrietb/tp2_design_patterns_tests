/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.designpatterns.structural.facade;

public class Class2 {
    public int doAnotherThing ( Class1 class1 , int x ) {
        return 2 * class1.doSomethingComplicated(x);
    }
}
