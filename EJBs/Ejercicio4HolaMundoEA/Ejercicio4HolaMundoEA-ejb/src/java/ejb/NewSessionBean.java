/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;

/**
 *
 * @author alvarocr
 */
@Stateless
public class NewSessionBean implements NewSessionBeanRemote {

    @Override
    public void diHola(String name) {
        System.out.println("Hola, "+name);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
