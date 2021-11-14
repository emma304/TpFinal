/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOInterfaces;

import java.util.List;


/**
 *
 * @author mauro
 */
public interface DAO <T,K>{
    void insertar(T a);
        void modificar(T a);
        void eliminar(T a);
        List<T> obtenerTodos();
        T obtener(K id);
}
