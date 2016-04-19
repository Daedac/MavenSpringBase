/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vrfv.maven.springmvc.base.dao;

import java.util.List;
import vrfv.maven.springmvc.base.dto.Empleado;

/**
 *
 * @author FAVV879F
 */
public interface EmpleadoDao {
    public List<Empleado> consultaEmpleados();
    public Empleado consultaEmpleadoPorId(Integer idEmpleado);
    public List<Empleado> consultaPorIndicioNombre(String indicioNombre);
}
