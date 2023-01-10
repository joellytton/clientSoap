package com.br.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import com.br.client.gen.GetCountryResponse;
import com.br.client.gen.GetCountryRequest;

public class CountryClient extends WebServiceGatewaySupport {
    public GetCountryResponse getCountry(String country) {
        GetCountryRequest request = new GetCountryRequest();
        request.setName(country);
        return (GetCountryResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }
}
