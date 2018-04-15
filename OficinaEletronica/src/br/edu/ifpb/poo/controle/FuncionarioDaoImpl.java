package br.edu.ifpb.poo.controle;

import br.edu.ifpb.edu.modelo.Funcionario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class FuncionarioDaoImpl implements FuncionarioDao {

    private File file;
    
    public FuncionarioDaoImpl() throws IOException{
        file = new File("arquivos\\funcionarios.bin");
        
        if(!file.exists()){
            file.createNewFile();
        }
    }

    @Override
    public boolean salvar(Funcionario f) throws IOException, ClassNotFoundException {
        List<Funcionario> funcionarios = listar();
        
        if(buscar(f.getCpf()) == null){
            if(funcionarios.add(f)){
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
    public boolean remover(Funcionario f) throws IOException, ClassNotFoundException {
        List<Funcionario> funcionarios = listar();
        
        if(buscar(f.getCpf()) == null){
            if(funcionarios.remove(f)){
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
    public Funcionario buscar(String cpf) throws IOException, ClassNotFoundException {
        List<Funcionario> funcionarios = listar();
        
        for(Funcionario e : funcionarios){
            if(e.getCpf().equals(cpf)){
                return e;
            }
        }
        return null;
    }

    @Override
    public List<Funcionario> listar() throws IOException, ClassNotFoundException {
        if(file.length()>0){
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(file));
            return (List<Funcionario>) in.readObject();
        }else{
            return new ArrayList<>();
        }
    }

    private void atualizaArquivo(List<Funcionario> funcionarios) 
            throws FileNotFoundException, IOException {

        try(ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(file))){
            out.writeObject(funcionarios);
        }
    }
    
}
