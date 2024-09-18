/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.Criteria;
import bean.UsuarioKvm;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author dell
 */
public class Usuario_DAO extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(UsuarioKvm.class);
        criteria.add(Restrictions.eq("idusuarioKvm", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioKvm.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
     public boolean listCadastro(String nome, String senha){
        
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioKvm.class);
        criteria.add(Restrictions.eq("nomeKvm", nome));
        criteria.add(Restrictions.eq("senhaKvm", senha));
        List lista = criteria.list();
        session.getTransaction().commit();
        System.out.println("lista:" + lista);
        if(lista.isEmpty()){
            return false; 
        }else{
            return true; 
        }
    }
    public List listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioKvm.class);
        criteria.add(Restrictions.like("nomeKvm", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public List listCpf(String cpf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioKvm.class);
        criteria.add(Restrictions.like("cpfKvm", "%" + cpf + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public List listNomeCpf(String nome, String cpf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioKvm.class);
        criteria.add(Restrictions.like("nomeKvm", "%" + nome + "%"));
        criteria.add(Restrictions.like("cpfKvm", "%" + cpf + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public static void main(String[] args) {
        Usuario_DAO usuario_DAO = new Usuario_DAO();
        List lista = usuario_DAO.listNome("nome que você está procurando");
        for (Object usuarioKvm : lista) {
            System.out.println("nome:" + ((UsuarioKvm)usuarioKvm).getNomeKvm());
        }
    }

}
