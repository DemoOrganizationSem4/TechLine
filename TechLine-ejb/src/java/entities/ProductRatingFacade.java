/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ProductRatingFacade extends AbstractFacade<ProductRating> implements ProductRatingFacadeLocal {
    @PersistenceContext(unitName = "TechLine-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductRatingFacade() {
        super(ProductRating.class);
    }
    
}
