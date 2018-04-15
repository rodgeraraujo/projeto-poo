package br.edu.ifpb.ads.poo.oficinaeletronica.DAO;

import br.edu.ifpb.ads.poo.oficinaeletronica.Modelo.Funcionario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Lucas
 */
public class FuncionarioDao implements IntDao {


    
    private File file;
    
    public FuncionarioDao() throws IOException{
        File file = new File("arquivos\\funcionarios");
        
        if(!file.exists()){
            file.createNewFile();
        }
    }
    
    @Override
    public boolean salvar(Funcionario obj) throws IOException, ClassNotFoundException {

        List<Funcionario> funcionarios = listar();
        
        if(buscar(obj.getCPF()) == null){
            if(funcionarios.add(obj)){
                atualizaArquivo(funcionarios);
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
        
        
    }

    @Override
    public boolean remover(Funcionario obj) throws IOException, ClassNotFoundException {
        List<Funcionario> funcionarios = listar();
        
        if(funcionarios.remove(obj)){
            atualizaArquivo(funcionarios);
            return true;
        }else{
            return false;
        }
    }

    @Override
  public Funcionario buscar(String cpf) throws IOException, ClassNotFoundException {
      List<Funcionario> funcionarios = listar();
      
    for(Funcionario e : funcionarios){
        if(e.getCPF()== cpf){
            return e;
        }
    }
    return null;
    }


    @Override
    public List<Funcionario> listar() throws IOException, ClassNotFoundException {
        
        if(file.length() > 0){
            ObjectInputStream in  = new ObjectInputStream(
                    new FileInputStream(file));
            return (List<Funcionario>) in.readObject();
        }else{
            return null;
        }
    }

    private void atualizaArquivo(List<Funcionario> funcionarios) throws IOException {

        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(file));
        out.writeObject(funcionarios);
    }
    
    
}
