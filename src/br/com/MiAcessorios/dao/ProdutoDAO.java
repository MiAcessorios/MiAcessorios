
package br.com.MiAcessorios.dao;

import br.com.MiAcessorios.jdbc.ConnectionFactory;
import br.com.MiAcessorios.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    private Connection con;
    
    public ProdutoDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    public ProdutoDAO(Produto prod){
        this.con = new ConnectionFactory().getConnection();
    }

    
    public void cadastrar(Produto prod){   
        
        try{
            String sql = "insert into tb_produto(produto, quantidade, preco)" + 
                            " values(?, ?, ?); ";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, prod.getProduto());
                stmt.setInt(2, prod.getQuantidade());
                stmt.setDouble(3, prod.getPreco());
       
                
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Produto registrado com sucesso!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e);
        }
    }
    
    public void editarProduto(Produto prod){
        
        try{
            String sql = "UPDATE tb_produto SET produto=?, quantidade=?, preco=? " +
                    " WHERE id = ?";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, prod.getProduto());
                stmt.setInt(2, prod.getQuantidade());
                stmt.setDouble(3, prod.getPreco());
                
                
                
                stmt.setInt(4, prod.getId());
               
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Produto editado com sucesso!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e);
      
        }
        
    }
        
        public void excluirProduto(int id){
        try {
            String sql = "DELETE FROM tb_produto WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Produto excluido com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ops! Ocorreu um erro: " + e);
        }
    }
        public List<Produto> listarProduto(int id){
        try{
            List<Produto> produto = new ArrayList<>();
            
            String sql = "SELECT * FROM tb_produto where id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            
            
            while(result.next()){
               Produto prod = new Produto();
                
                prod.setId(result.getInt("id"));
                prod.setProduto(result.getString("produto"));
                prod.setQuantidade(result.getInt("quantidade"));
                prod.setPreco(result.getDouble("preco"));
                
                prod.setId(result.getInt("id"));
                
                
                produto.add(prod);
            }
            
            return produto;
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de execução de consulta: \n" + e);
            return null;
        }
    
    }
       
}
