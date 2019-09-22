package com.mycompany.restclient;

import com.mycompany.restclient.model.Computer;
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
        String uri = "http://localhost:8080/rest/computer";
        
        String json = restService.getAsJson(uri);
        System.err.println(json);
        
        //GetAll
//        Class vo = Computer[].class;
//        Object retorno = restService.get(uri, vo);
//        Computer[] computers = (Computer[]) retorno;
//        for(Computer comp: computers){
//            System.out.println(comp.getOperationalSystem());
//        }
        
//        //GetById
        int id = 3;
        Class voGet = Computer.class;
        Object retornoGet = restService.get(uri, voGet, id);
        Computer comp3 = (Computer) retornoGet;
        System.out.println(comp3.getId());
//        
//        //Post
//        Computer newComputer = new Computer(1, "Linux", 16, true);
//        Computer retornoComputer = (Computer) restService.post(uri, newComputer);
//        System.out.println(retornoComputer.getId());
//        
//        //Put
//        int idPut = 1;
//        Computer computerChanged = new Computer(1, "Windows", 8, false);
//        Computer retornoAlterar = (Computer) restService.put(uri, computerChanged, id);
//        System.out.println(retornoAlterar.getId());
//        
//        //Delete
//        restService.delete(uri, 1);
    }
}
