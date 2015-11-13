package es.uc3m.tiw.model.daos;

import javax.persistence.EntityManager;
import javax.transaction.UserTransaction;

import es.uc3m.tiw.model.dominios.leccion;

public class leccionDAO {

	 private final EntityManager em;
	    private final UserTransaction ut;
	    
	 public leccionDAO(EntityManager em, UserTransaction ut) {
			super();
			this.em = em;
			this.ut = ut;
		}
	//private Long id;
		
	 public leccion guardarleccion(leccion nuevoleccion) throws Exception{
		 ut.begin();
		 em.persist(nuevoleccion);
		 ut.commit();
		 return nuevoleccion;
	 }
	 public leccion actualizarleccion(leccion actualleccion) throws Exception{
		 ut.begin();
		 em.merge(actualleccion);
		 ut.commit();
		 return actualleccion;
	 }
	 public void borrarleccion(leccion leccion) throws Exception{
		 ut.begin();
		 em.remove(em.merge(leccion));
		 ut.commit();
		 
	 }
	 /*
	  * public usuarios comprobarLogin(String email, String password)throws NoResultException{
     return em.createQuery("select u from Cliente u where u.email='"+email+"' and u.password='"+password+"'",usuarios.class).getSingleResult();
  }
	  */
	    public leccion buscarleccion(Long id) {
	        return em.find(leccion.class, id);
	    } 
	
	
	
	
	
	
	
	
}
