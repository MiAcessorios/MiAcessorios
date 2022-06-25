
package br.com.MiAcessorios.dao;

import br.com.MiAcessorios.jdbc.ConnectionFactory;
import br.com.MiAcessorios.model.Cliente;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement; 
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteDAO {
    private Connection con;
    
    public ClienteDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void salvarCliente(Cliente cli){
        try {
            String sql = "insert into tb_clientes(nome, sobrenome, email, celular)"  + 
                       " values(?, ?, ?, ?)";
            
            PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, cli.getNome());
                stmt.setString(2, cli.getSobrenome());
                stmt.setString(3, cli.getEmail());
                stmt.setString(4, cli.getCelular());
                
                stmt.execute();
                stmt.close();
                   
                JOptionPane.showMessageDialog(null, "Cliente cadastrado!");
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro!" +e);
            
        }
        
    }
    
    public void editarCliente(Cliente cli){
        try {
            String sql = "UPDATE tb_clientes SET nome=?, sobrenome=?, email=?,  celular=?"+
                    "WHERE id = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, cli.getNome());
                stmt.setString(2, cli.getSobrenome());
                stmt.setString(3, cli.getEmail());
                stmt.setString(4, cli.getCelular());
                
                stmt.setInt(5, cli.getId());
                
                stmt.execute();
                stmt.close();
                   
                JOptionPane.showMessageDialog(null, "Cliente alterado!");
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro!" +e);
            
        }
    }
    
    public void deletarCliente(int id){
        try {
            String sql = "DELETE FROM tb_clientes WHERE id = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
                
                stmt.setInt(1, id);
                
                stmt.execute();
                stmt.close();
                   
                JOptionPane.showMessageDialog(null, "Cliente deletado!");
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro!" +e);
            
        }
        
    }
    
    
    
     public List<Cliente> listarClientes(){
         try {
           List<Cliente> clientes = new ArrayList<>();
           
           String sql = "SELECT * FROM tb_clientes";
           PreparedStatement stmt = con.prepareCall(sql);
           ResultSet rs = stmt.executeQuery();
           
           while(rs.next()){
               Cliente cli = new Cliente();
               
               cli.setId(rs.getInt("id"));
               cli.setNome(rs.getString("nome"));
               cli.setSobrenome(rs.getString("sobrenome"));
               cli.setEmail(rs.getString("email"));
               cli.setCelular(rs.getString("celular"));
               
               clientes.add(cli);
           }
           return clientes;
           
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Erro: \n" +e);
             return null;
         }
      
         
     }     

    public void excluirCliente(Cliente cli) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
            
   }
    
