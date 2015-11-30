package es.uc3m.tiw.model.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.UserTransaction;

import es.uc3m.tiw.model.dominios.CreadorCurso;

public class CreadorCursoDAO {
	private final EntityManager em;
    private final UserTransaction ut;

    public CreadorCursoDAO(EntityManager em, UserTransaction ut) {
        super();
        this.em = em;
        this.ut = ut;
    }

    public CreadorCurso guardarProfesor(CreadorCurso nuevoProfesor) throws Exception{
        ut.begin();    
        em.persist(nuevoProfesor); 
        ut.commit();   
        return nuevoProfesor;
    }
    public CreadorCurso actualizarProfesor(CreadorCurso profesor) throws Exception{
        ut.begin();
        em.merge(profesor);
        ut.commit();
        return profesor;
    }
    
    public void borrarProfesor(CreadorCurso profesor)throws Exception{
        ut.begin();
        em.remove(em.merge(profesor));
        ut.commit();
    }
    
    //buscar por nick
	public CreadorCurso buscarNickProfesor(String nick) {
			
			Query query =  em.createQuery("SELECT u FROM Usuarios u where u.nick=:nick", CreadorCurso.class);
			query.setParameter("nick", nick);
			List resultList = query.getResultList();
			if (resultList.isEmpty()) {
				return null;
			}else{
			
				return (CreadorCurso) query.getSingleResult();
			}
			
		}
}
