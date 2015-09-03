/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Markedu.Banco.conectaBanco;
import Modelo.ModeloLogin;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author luan
 */
public class ControleLogin {
   conectaBanco conex = new conectaBanco();
   ModeloLogin modelo = new ModeloLogin();
   
   
    public void salvar(ModeloLogin mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.conn.prepareStatement("insert into usuario(nome_usuario, senha_usuario, permissao_usuario, login_usuario)values (?, ?, ?, ?)");
          pst.setString(1, mod.getNome());
          pst.setString(4, mod.getLogin());
          pst.setString(2, mod.getSenha());
          pst.setString(3, mod.getPermissao());
          pst.execute();
          JOptionPane.showMessageDialog(null, "Usuário inserido");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Usuario\n"+ ex);
        }
        
        conex.desconcta();
        
    }
public ModeloLogin Primeiro(){
        conex.conexao();
       
       try {
           conex.executaSQL("select * from usuario");
           conex.rs.first();
           modelo.setId(conex.rs.getInt("codigo_usuario"));
           modelo.setLogin(conex.rs.getString("login_usuario"));
           modelo.setNome(conex.rs.getString("nome_usuario"));
           modelo.setPermissao(conex.rs.getString("permissao_usuario"));
           modelo.setSenha(conex.rs.getString("senha_usuario"));
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro\n"+ ex);
       }
        conex.desconcta();
       return modelo;
      
    }

      
        
    }

   
        
