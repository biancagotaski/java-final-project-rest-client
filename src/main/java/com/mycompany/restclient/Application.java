package com.mycompany.restclient;

import com.mycompany.restclient.model.Computer;
import com.mycompany.restclient.model.Loan;
import com.mycompany.restclient.service.RestService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author bianca
 */
@SpringBootApplication
public class Application implements CommandLineRunner{
    
    private RestService restService;
    
    public Application(RestService restService){
        this.restService = restService;
    }
    
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        String uri = "http://localhost:8080/rest/loan";
        
        String json = restService.getAsJson(uri);
        System.err.println(json);
        
        //GetAll
//        Class vo = Loan[].class;
//        Object retorno = restService.get(uri, vo);
//        Loan[] loans = (Loan[]) retorno;
//        for(Loan loan: loans){
//            System.out.println(loan.getCpfCustomer());
//        }
        
        //GetById
//        int id = 33;
//        Class voGet = Loan.class;
//        Object retornoGet = restService.get(uri, voGet, id);
//        Loan lo3 = (Loan) retornoGet;
//        System.out.println(lo3.getId());
        
        //Post
        Loan newLoan = new Loan(2, "22/09/2019", "22/01/2020", "154.565.555-40");
        Loan retornoLoan = (Loan) restService.post(uri, newLoan);
        System.out.println(retornoLoan.getId());
        
        //Put
//        int idPut = 1;
//        Loan loanChanged = new Loan(3, "17/05/2019", "18/07/2019", "154.565.555-40");
//        Loan retornoAlterar = (Loan) restService.put(uri, loanChanged, id);
//        System.out.println(retornoAlterar.getId());
        
        //Delete
//        restService.delete(uri, 33);
        
        //####################################################################
        
        //GetAll
//        Class vo = Computer[].class;
//        Object retorno = restService.get(uri, vo);
//        Computer[] computers = (Computer[]) retorno;
//        for(Computer comp: computers){
//            System.out.println(comp.getOperationalSystem());
//        }
        
//        //GetById
//        int id = 1;
//        Class voGet = Computer.class;
//        Object retornoGet = restService.get(uri, voGet, id);
//        Computer comp3 = (Computer) retornoGet;
//        System.out.println(comp3.getId());
//        
//        //Post
//        Computer newComputer = new Computer(2, "Windows", 8, true, "Asus PC", 2700, 54545, "Asus");
//        Computer retornoComputer = (Computer) restService.post(uri, newComputer);
//        System.out.println(retornoComputer.getId());
//        
//        //Put
//        int idPut = 1;
//        Computer computerChanged = new Computer(3, "Windows", 8, false, "Asus PC", 2700, 54545, "Asus");
//        Computer retornoAlterar = (Computer) restService.put(uri, computerChanged, id);
//        System.out.println(retornoAlterar.getId());
//        
//        //Delete
//        restService.delete(uri, 33);
    }
}
