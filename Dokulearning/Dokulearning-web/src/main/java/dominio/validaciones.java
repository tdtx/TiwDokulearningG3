package dominio;

public class validaciones {
	//holiii
	public boolean obligatorio(String dato){
		return dato != null && dato.trim().length() > 0;
		
	}
	
	public boolean maxLength(String dato, int max){
		return dato.length() <= max;
		
	}
	
	public boolean minLength(String dato, int min){
		return dato.length() >= min;
		
	}
	
	public boolean oblogatorioMaxLength(String dato, int max){
		return obligatorio(dato) && maxLength(dato, max);
		
	}
	
/*	public boolean correo(String dato, int max){
		return dato.trim().matches("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?") && dato.length() <= max;		
	}*/
	
	public boolean formatoClave(String dato, int max, int min){
		return obligatorio(dato) && maxLength(dato, max) && minLength(dato, min);
	}
	
	public boolean stringIguales (String dato1, String dato2){
        if (dato1.equals(dato2)){
            return true;
        } else {
            return false;
        }
    }

}
