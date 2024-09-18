/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ProdutoKvm;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author User
 */
public class Produto_DAO extends DAO_Abstract{

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
        Criteria criteria = session.createCriteria(ProdutoKvm.class);
        criteria.add(Restrictions.eq("idprodutoKvm", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
    }

    @Override
    public List listAll() {
                session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoKvm.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
     public List listMarca(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoKvm.class);
        criteria.add(Restrictions.like("marcaKvm", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public List listPreco(double preco) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoKvm.class);
        criteria.add(Restrictions.eq("precoKvm", preco));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
}
    public List listMarcaPreco(String nome,double preco) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoKvm.class);
        criteria.add(Restrictions.like("marcaKvm", "%" + nome + "%"));
        criteria.add(Restrictions.eq("precoKvm", preco));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
}

    public static void main(String[] args) {
        Produto_DAO produto_DAO = new Produto_DAO();
        List lista = produto_DAO.listMarca("marca que você está procurando");
        for (Object produtoMsl : lista) {
            System.out.println("marca:" + ((ProdutoKvm)produtoMsl).getMarcaKvm());
        }
}}
