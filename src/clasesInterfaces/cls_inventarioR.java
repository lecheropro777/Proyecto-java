
package clasesInterfaces;

import Conexion.Conectar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
public class cls_inventarioR {
    
    private PreparedStatement PS;
    private ResultSet RS;
    private final Conectar CN;
    private DefaultTableModel DT;
    /*private final String SQL_INSERT_ENTRADA = "INSERT INTO datos (id, nombre, precio, cantidadTotal, cantidadTienda,cantidadBodega) values (?,?,?,?)";
    private final String SQL_SELECT_ENTRADA = "SELECT id, nombre, precio, cantidadTotal, cantidadTienda,cantidadBodega FROM datos INNER JOIN datos ON ent_pro_codigo = pro_codigo";
    */
    /*
    public cls_inventarioR(){
        PS = null;
        CN = new Conectar();
    }
    
    private DefaultTableModel setTitulosEntrada(){
        DT = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            };
        DT.addColumn("ID");
        DT.addColumn("Nombre");
        DT.addColumn("Precio");
        DT.addColumn("Cantidad");
        DT.addColumn("Tienda");
        DT.addColumn("Bodega");
        return DT;
    }
    
    public DefaultTableModel getDatosEntradas(){
        try {
            setTitulosEntrada();
            PS = CN.getConnection().prepareStatement(SQL_SELECT_ENTRADA);
            RS = PS.executeQuery();
            Object[] fila = new Object[5];
            while(RS.next()){
                fila[0] = RS.getInt(1);
                fila[1] = RS.getString(2);
                fila[2] = RS.getInt(3);
                fila[3] = RS.getInt(4);
                fila[4] = RS.getInt(5);
                fila[5] = RS.getInt(5);
                DT.addRow(fila);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar los datos."+e.getMessage());
        } finally{
            PS = null;
            RS = null;
            CN.desconectar();
        }
        return DT;
    }
    
    public int registrarEntrada(int ID, String Nombre, int Precio, int cantidad, int Tienda, int Bodega){
        int res=0;
        try {
            PS = CN.getConnection().prepareStatement(SQL_INSERT_ENTRADA);
            PS.setInt(1, ID);
            PS.setString(2, Nombre);
            PS.setInt(3, Precio);
            PS.setInt(4, cantidad);
            PS.setInt(4, Tienda);
            PS.setInt(4, Bodega);
            res = PS.executeUpdate();
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Entrada realizada con éxito.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar la entrada.");
            System.err.println("Error al registrar la entrada." +e.getMessage());
        } finally{
            PS = null;
            CN.desconectar();
        }
        return res;
    }
}
*/