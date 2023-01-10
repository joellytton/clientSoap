package com.br.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.br.client.gen.GetCountryResponse;

@Component
public class ClientRunner implements CommandLineRunner  {
    @Autowired private CountryClient client;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("chegou no run");
        GetCountryResponse response =  client.getCountry("Spain");
        System.out.println(response.getCountry().getName());
    }
    
}
