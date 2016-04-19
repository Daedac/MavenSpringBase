/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vrfv.maven.springmvc.base.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import vrfv.maven.springmvc.base.dao.EmpleadoDao;
import vrfv.maven.springmvc.base.dao.EmpleadoMapper;
import vrfv.maven.springmvc.base.dao.sql.EmpleadoSQL;
import vrfv.maven.springmvc.base.dto.Empleado;

/**
 *
 * @author FAVV879F
 */
@Repository
public class EmpleadoDaoImpl implements EmpleadoDao{
    @Autowired
    private JdbcTemplate templateJavaApp;
    
    @Override
    public List<Empleado> consultaEmpleados() {
        return this.templateJavaApp.query(EmpleadoSQL.CONSULTA_EMPLEADOS, new EmpleadoMapper());
    }

    @Override
    public Empleado consultaEmpleadoPorId(Integer idEmpleado) {
        try{
        return this.templateJavaApp.queryForObject(EmpleadoSQL.CONSULTA_EMPLEADO_ID, new Object[]{idEmpleado}, new EmpleadoMapper());
        }catch(EmptyResultDataAccessException e){
            return null;
        }
    }

    @Override
    public List<Empleado> consultaPorIndicioNombre(String indicioNombre) {
        return this.templateJavaApp.query(EmpleadoSQL.CONSULTA_EMPLEADO_INDICIO_NOMBRE, new Object[]{"%"+indicioNombre+"%"}, new EmpleadoMapper());
    }
}
