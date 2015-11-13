package es.uc3m.tiw.model.daos;

import javax.persistence.EntityManager;
import javax.transaction.UserTransaction;

import es.uc3m.tiw.model.dominios.seccion;

public class seccionDAO {

	
	 private final EntityManager em;
	    private final UserTransaction ut;
	    
	 public seccionDAO(EntityManager em, UserTransaction ut) {
			super();
			this.em = em;
			this.ut = ut;
		}
	//private Long id;
		
	 public seccion guardarseccion(seccion nuevoseccion) throws Exception{
		 ut.begin();
		 em.persist(nuevoseccion);
		 ut.commit();
		 return nuevoseccion;
	 }
	 public seccion actualizarseccion(seccion actualseccion) throws Exception{
		 ut.begin();
		 em.merge(actualseccion);
		 ut.commit();
		 return actualseccion;
	 }
	 public void borrarseccion(seccion seccion) throws Exception{
		 ut.begin();
		 em.remove(em.merge(seccion));
		 ut.commit();
		 
	 }
	 /*
	  * public usuarios comprobarLogin(String email, String password)throws NoResultException{
     return em.createQuery("select u from Cliente u where u.email='"+email+"' and u.password='"+password+"'",usuarios.class).getSingleResult();
  }
	  */
	    public seccion buscarseccion(Long id) {
	        return em.find(seccion.class, id);
	    } 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
