/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.VendaProdutoKvm;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author User
 */
public class Vendaproduto_DAO extends DAO_Abstract{

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void upedate(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
              session.beginTransaction();
        Criteria criteria = session.createCriteria(VendaProdutoKvm.class);
        criteria.add(Restrictions.eq("idvendaProdutoKvm", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
    }

    @Override
    public List listAll() {
                session.beginTransaction();
        Criteria criteria = session.createCriteria(VendaProdutoKvm.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
}
