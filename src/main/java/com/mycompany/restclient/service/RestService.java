package com.mycompany.restclient.service;

import java.time.Duration;
import java.util.Collections;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author bianca
 */
@Service
public class RestService {
    private final RestTemplate restTemplate;
    
    public RestService(RestTemplateBuilder restTemplateBuilder){
        
        this.restTemplate = restTemplateBuilder
                .setConnectTimeout(Duration.ofSeconds(500))
                .setReadTimeout(Duration.ofSeconds(500))
                .build();
        
    }
    
    public String getAsJson(String uri){
        return this.restTemplate.getForObject(uri, String.class);
    }
    
    public Object get(String uri, Class<?> className){
        return this.restTemplate.getForObject(uri, className);
    }
    
    public Object get(String uri, Class className, int id){
        uri += "/{id}";
        return this.restTemplate.getForObject(uri, className, id);
    }
    
    public Object post(String uri, Object object){
        
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        Class className = object.getClass();
        HttpEntity<?> entity = new HttpEntity<>(object, headers);
        ResponseEntity<?> response = this.restTemplate
                .postForEntity(uri, entity, className);
        
        if(response.getStatusCode() == HttpStatus.CREATED){
            return response.getBody();
        }else{
            return null;
        }

    }
    
    public Object put(String uri, Object object, int id){
        
        uri += "/{id}";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        Class className = object.getClass();
        HttpEntity<?> entity = new HttpEntity<>(object, headers);
        
        ResponseEntity<?> response = this
                .restTemplate.exchange(uri, 
                        HttpMethod.PUT,
                        entity,
                        className,
                        id);
        
        if(response.getStatusCode() == HttpStatus.OK){
            return response.getBody();
        }else{
            return null;
        }
        
    }
    
    public void delete(String uri, int id){
        uri += "/{id}";
        this.restTemplate.delete(uri, id);
    }
}
