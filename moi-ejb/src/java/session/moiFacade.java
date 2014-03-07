/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.moi;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Acer
 */
@Stateless
@LocalBean
public class moiFacade extends AbstractFacade<moi> implements moiFacadeLocal {
    @PersistenceContext(unitName = "moi-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public moiFacade() {
        super(moi.class);
    }
    
}
