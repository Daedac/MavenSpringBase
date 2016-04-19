/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vrfv.maven.springmvc.base.dao.sql;

/**
 *
 * @author FAVV879F
 */
public class EmpleadoSQL {

    public static String CONSULTA_EMPLEADOS = "select idEmpleado, nombre from Empleado";
    public static String CONSULTA_EMPLEADO_ID = "select idEmpleado, nombre from Empleado where idEmpleado = ?";
    public static String CONSULTA_EMPLEADO_INDICIO_NOMBRE = "select idEmpleado, nombre from Empleado where nombre like ?";
    public static String CONSULTA_ESTADISTICAS_EMPLEADO = "select per.descripcion as nombrePeriodo, est.unidadesProduccion from Periodo per \n"
            + "left join EstadisticasEmpleado est on per.idPeriodo = est.idPeriodo and est.idEmpleado = ? \n"
            + "left join Empleado emp on est.idEmpleado = emp.idEmpleado";
}
