package es.uc3m.tiw.model.daos;

import javax.persistence.EntityManager;
import javax.transaction.UserTransaction;

import es.uc3m.tiw.model.dominios.material;

public class materialDAO {
	
	 private final EntityManager em;
	    private final UserTransaction ut;
	    
	 public materialDAO(EntityManager em, UserTransaction ut) {
			super();
			this.em = em;
			this.ut = ut;
		}
	//private Long id;
		
	 public material guardarmaterial(material nuevomaterial) throws Exception{
		 ut.begin();
		 em.persist(nuevomaterial);
		 ut.commit();
		 return nuevomaterial;
	 }
	 public material actualizarmaterial(material actualmaterial) throws Exception{
		 ut.begin();
		 em.merge(actualmaterial);
		 ut.commit();
		 return actualmaterial;
	 }
	 public void borrarmaterial(material material) throws Exception{
		 ut.begin();
		 em.remove(em.merge(material));
		 ut.commit();
		 
	 }
	 /*
	  * public usuarios comprobarLogin(String email, String password)throws NoResultException{
     return em.createQuery("select u from Cliente u where u.email='"+email+"' and u.password='"+password+"'",usuarios.class).getSingleResult();
  }
	  */
	    public material buscarmaterial(Long id) {
	        return em.find(material.class, id);
	    } 
	
	
	
	
}
