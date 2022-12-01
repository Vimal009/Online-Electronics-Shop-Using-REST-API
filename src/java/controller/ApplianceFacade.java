/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import product.Appliance;

/**
 *
 * @author LENOVO
 */
@Stateless
public class ApplianceFacade extends AbstractFacade<Appliance> {

    @PersistenceContext(unitName = "WebServicePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ApplianceFacade() {
        super(Appliance.class);
    }
    
}
