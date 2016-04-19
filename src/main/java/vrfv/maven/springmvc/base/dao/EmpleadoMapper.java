/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vrfv.maven.springmvc.base.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import vrfv.maven.springmvc.base.dto.Empleado;

/**
 *
 * @author FAVV879F
 */
public class EmpleadoMapper implements RowMapper<Empleado>{

    @Override
    public Empleado mapRow(ResultSet rs, int i) throws SQLException {
        Empleado emp = new Empleado();
        emp.setIdEmpleado(Integer.parseInt(rs.getString("idEmpleado")));
        emp.setNombre(rs.getString("nombre"));
        return emp;
    }
    
}
