/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.moi;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Acer
 */
@Local
public interface moiFacadeLocal {

    void create(moi moi);

    void edit(moi moi);

    void remove(moi moi);

    moi find(Object id);

    List<moi> findAll();

    List<moi> findRange(int[] range);

    int count();
    
}
