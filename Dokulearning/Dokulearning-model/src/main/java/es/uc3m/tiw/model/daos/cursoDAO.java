package es.uc3m.tiw.model.daos;

import static javax.persistence.GenerationType.AUTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.transaction.UserTransaction;
import javax.persistence.Query;

import es.uc3m.tiw.model.dominios.curso;
import es.uc3m.tiw.model.dominios.usuarios;

import java.util.List;

@Entity
public class cursoDAO{	
	  private final EntityManager em;
	    private final UserTransaction ut;
	    
	 public cursoDAO(EntityManager em, UserTransaction ut) {
			super();
			this.em = em;
			this.ut = ut;
		}
	//private Long id;
		
	 public curso guardarCurso(curso nuevoCurso) throws Exception{
		 ut.begin();
		 em.persist(nuevoCurso);
		 ut.commit();
		 return nuevoCurso;
	 }
	 public curso actualizarCurso(curso actualCurso) throws Exception{
		 ut.begin();
		 em.merge(actualCurso);
		 ut.commit();
		 return actualCurso;
	 }
	 public void borrarCurso(curso curso) throws Exception{
		 ut.begin();
		 em.remove(em.merge(curso));
		 ut.commit();
		 
	 }
	 /*
	  * public usuarios comprobarLogin(String email, String password)throws NoResultException{
        return em.createQuery("select u from Cliente u where u.email='"+email+"' and u.password='"+password+"'",usuarios.class).getSingleResult();
     }
	  */
	    public curso buscarCurso(Long id) {
	        return em.find(curso.class, id);
	    } 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 




}
