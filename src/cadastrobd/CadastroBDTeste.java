package cadastrobd;

import java.sql.SQLException;
import java.util.ArrayList;

import cadastrobd.model.PessoaFisica;
import cadastrobd.model.PessoaFisicaDAO;
import cadastrobd.model.PessoaJuridica;
import cadastrobd.model.PessoaJuridicaDAO;

import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author Cleyton
 */
public class CadastroBDTeste {
    
    private static final Logger LOGGER = Logger.getLogger(CadastroBDTeste.class.getName());
    
    private final PessoaFisicaDAO pfDao;
    private final PessoaJuridicaDAO pjDao;
    
    public CadastroBDTeste() {
        pfDao = new PessoaFisicaDAO();
        pjDao = new PessoaJuridicaDAO();
    }
    
    private void run() {
        PessoaFisica pf = new PessoaFisica(null, "Sandra", "Avenida S, 99", "Sao Paulo",
            "SP", "9999-9999", "sandra@gmail.com", "99999999999");

        if (pf.getNome() == null || pf.getNome().trim().isEmpty()) {
            System.out.println("'nome' cannot be empty or null.");
            return; 
        }
        
        try {
            System.out.println("Pessoa Fisica incluida com ID: " + pfDao.incluir(pf));
            pf.setCidade("Rio de Janeiro");
            pf.setEstado("RJ");
            pfDao.alterar(pf);
            ArrayList<PessoaFisica> listaPf = pfDao.getPessoas();
            listaPf.forEach(pessoa -> System.out.println(pessoa.getNome()));
            pfDao.excluir(pf);
            pfDao.close();
        }
        catch (SQLException e) {
            LOGGER.log(Level.SEVERE, e.toString(), e);
        }

        PessoaJuridica pj = new PessoaJuridica(null, "Fabrica Fox","Avenida F, 88", "Goias",
            "GO", "8888-8888", "fox@gmail.com", "88888888888888");

        if (pj.getNome() == null || pj.getNome().trim().isEmpty()) {
            System.out.println("'nome' cannot be empty or null.");
            return; 
        }
        
        try {
            System.out.println("Pessoa Juridica incluida com ID: " + pjDao.incluir(pj));
            pj.setCidade("Belo Horizonte");
            pj.setEstado("MG");
            pjDao.alterar(pj);
            ArrayList<PessoaJuridica> listaPj = pjDao.getPessoas();
            listaPj.forEach(empresa -> System.out.println(empresa.getNome()));
            pjDao.excluir(pj);
            pjDao.close();
        }
        catch (SQLException e) {
            LOGGER.log(Level.SEVERE, e.toString(), e);
        }
        
    }
    
    public static void main(String[] args) {
        new CadastroBDTeste().run();
    }
    
}
