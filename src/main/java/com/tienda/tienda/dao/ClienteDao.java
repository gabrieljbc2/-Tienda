
package com.tienda.tienda.dao;

import com.tienda.tienda.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository <Cliente,Long>{
    
}
