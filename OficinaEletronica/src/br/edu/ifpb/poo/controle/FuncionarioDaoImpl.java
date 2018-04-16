package br.edu.ifpb.poo.controle;

import br.edu.ifpb.poo.modelo.Funcionario;
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
 * @verson 1.0
 * @since version 1.0
 * @author Rogério Araújo <rogerio.aruajo@mail.com>
 * @author Lucas Garrido <lucasgf07@gmail.com>
 * @date 18/03/2018
 */
public class FuncionarioDaoImpl implements FuncionarioDao {

    private File file;
    
    /**
     * Criar arquivo funcionarios.bin
     * @throws IOException 
     */
    public FuncionarioDaoImpl() throws IOException{
        file = new File("arquivos\\funcionarios.bin");
        
        if(!file.exists()){
            file.createNewFile();
        }
    }

    /**
     * Método salvar
     * @param f
     * @return
     * @throws IOException
     * @throws ClassNotFoundException 
     */
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

    /**
     * Método remover
     * @param f
     * @return
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    @Override
    public boolean remover(Funcionario f) throws IOException, ClassNotFoundException {
        List<Funcionario> funcionarios = listar();
        
        
            if(funcionarios.remove(f)){
                atualizaArquivo(funcionarios);
                return true;
            }else{
                return false;
            }
    }

    /**
     * Método buscar
     * @param cpf
     * @return
     * @throws IOException
     * @throws ClassNotFoundException 
     */
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

    /**
     * Método listar
     * @return
     * @throws IOException
     * @throws ClassNotFoundException 
     */
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

    /**
     * Método para atualizar arquivo
     * @param funcionarios
     * @throws FileNotFoundException
     * @throws IOException 
     */
    private void atualizaArquivo(List<Funcionario> funcionarios) 
            throws FileNotFoundException, IOException {

        try(ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(file))){
            out.writeObject(funcionarios);
        }
    }
    
}
