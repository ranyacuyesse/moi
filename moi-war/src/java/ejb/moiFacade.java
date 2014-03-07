/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import bean.moi;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Acer
 */
@Stateless
public class moiFacade extends AbstractFacade<moi> {
    @PersistenceContext(unitName = "moi-warPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public moiFacade() {
        super(moi.class);
    }
    
}
