/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Markedu.dao;

import Markedu.entidades.Evento;
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author luan
 */
public class EventoDAO {

    private Session sessao;
    private Transaction trans;
    Evento e = new Evento();

    public void salvar(Evento a) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();
            sessao.save(a);
            trans.commit();

        } catch (Exception e) {
            System.out.println("");
        } finally {
            sessao.close();
        }
    }
}
