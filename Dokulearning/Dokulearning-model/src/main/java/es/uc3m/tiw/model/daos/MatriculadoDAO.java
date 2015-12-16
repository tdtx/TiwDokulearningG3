package es.uc3m.tiw.model.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
//import javax.persistence.NoResultException;
import javax.transaction.UserTransaction;


//import javax.persistence.Query;
import es.uc3m.tiw.model.dominios.Matriculados;

//import java.util.List;

public class MatriculadoDAO {
    private final EntityManager em;
    private final UserTransaction ut;

    public MatriculadoDAO(EntityManager em, UserTransaction ut) {
        super();
        this.em = em;
        this.ut = ut;
    }

    public Matriculados guardarMatriculado(Matriculados nuevoMatriculado) throws Exception{
        ut.begin();    
        em.persist(nuevoMatriculado); 
        ut.commit();   
        return nuevoMatriculado;
    }
    public Matriculados actualizarMatriculado(Matriculados matriculado) throws Exception{
        ut.begin();
        em.merge(matriculado);
        ut.commit();
        return matriculado;
    }
    
    public void borrarMatriculado(Matriculados matriculado)throws Exception{
        ut.begin();
        em.remove(em.merge(matriculado));
        ut.commit();
    }
    public List<Matriculados> buscarCurso(String curso)throws Exception{
    	return em.createQuery("SELECT u FROM Matriculados u where u.curso='"+curso+"'",Matriculados.class).getResultList();
	 }
    // public matriculados comprobarLogin(String email, String password)throws NoResultException{
    //    return em.createQuery("select u from Cliente u where u.email='"+email+"' and u.password='"+password+"'",matriculados.class).getSingleResult();
    // }

    public Matriculados buscarMatriculado(Long id) {
        return em.find(Matriculados.class, id);
    } 
}