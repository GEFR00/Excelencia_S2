package DAO;
import java.util.List;
import vista.Login;

public interface DAO<T, K> {
    
    void insertar(T obj);
    
    List<T> obtenerTodos(); 
    
    void eliminar(T obj);
   
    void modificar(T obj);
    
    T obtener(K id);
    
}
