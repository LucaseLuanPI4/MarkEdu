/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Markedu.Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author luan
 */
public class conectaBanco {
    
    public Statement stm ;
    public ResultSet rs;
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5432/mark";
    private String usuario = "postgres";
    private String senha = "padrao";
    public Connection conn;
    
       public void conexao(){
        System.setProperty("jdbc.Drivers", driver);
        try {
            conn = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conectado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Conecxão!\n Erro " +ex.getMessage());
           
        }
    }
       public void executaSQL(String sql){
        try {
            stm = conn.createStatement (rs.TYPE_SCROLL_SENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro de Execução SQL!\n Erro " +ex.getMessage());
        }
       }
    
    public void desconcta(){
        try {
            conn.close();
        JOptionPane.showMessageDialog(null, "Desconectado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Fechar a Conecxão!\n Erro" +ex.getMessage());
        }
    }
}
