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
        Class vo = Loan[].class;
        Object retorno = restService.get(uri, vo);
        Loan[] loans = (Loan[]) retorno;
        for(Loan loan: loans){
            System.out.println(loan.getCpfCustomer());
        }
        
        //GetById
        int id = 33;
        Class voGet = Loan.class;
        Object retornoGet = restService.get(uri, voGet, id);
        Loan lo3 = (Loan) retornoGet;
        System.out.println(lo3.getId());
        
        //Post
        Loan newLoan = new Loan(2, "22/09/2019", "22/01/2020", "154.565.555-40");
        Loan retornoLoan = (Loan) restService.post(uri, newLoan);
        System.out.println(retornoLoan.getId());
        
        //Put
        Loan loanChanged = new Loan(1, "17/05/2019", "18/07/2019", "154.565.555-40");
        Loan retornoAlterar = (Loan) restService.put(uri + "/" + loanChanged.getId(), loanChanged);
        System.out.println(retornoAlterar.getId());
        
        //Delete
        restService.delete(uri, 167);
    }
}
