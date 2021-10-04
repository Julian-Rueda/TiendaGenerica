import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class inicio {
    private JPanel panel1;
    private JTextField textField1;
    private JPasswordField a30PasswordField;
    private JButton aceptarButton;
    private JButton cancelarButton;

    public void aceptarButton(java.awt.event.ActionEvent evt){



            String usuario = textField1.getText();
            String contrasena = a30PasswordField.getText();
            //select username, password, privilegio from  usuarios where activo = 1 and username = 'julian';
            String url = "select username, password, privilegio "
                    + "from  usuarios where activo = 1 and username ='" + usuario + "'";
        try {
            connection con = conexion.obtenerConexion();
            PreparedStatement ps = con.preparedStatement(url);
            ResultSet rs = ps.executeQuery();

            if (rs.next()){
                //si esta
                String u=rs.getString("username");
                String p=rs.getString("password");
                String pri=rs.getString("privilegio");
                if (contrasena.equals(p)){
                    //ingresa como usuario o admin
                    if (pri.equals("usuario")){
                        usuario ventanaUsuario= new usuario();
                        ventanaUsuario.setVisible(true);

                        }else  if (pri.equals("admin")){
                        admin ventanAdmin= new admin();
                        ventanAdmin.setVisible(true);
                        {
                        }
                    }
                    }

                }else {
                    JOptionPane.showMessageDialog(null,"Contraseña incorrecta");
                }

            }
            else {
                //no existe
                JOptionPane.showMessageDialog(null,"El usuario no existe");
            }

        } catch (SQLException ex){
           System.out.println(ex.toString());
        }
    }
}

