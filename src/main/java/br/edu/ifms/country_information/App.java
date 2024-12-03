package br.edu.ifms.country_information;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import br.edu.ifms.country_information.servico.CountryInfoServiceSoapType;
import jakarta.xml.ws.Service;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws MalformedURLException {
    	
    	
    	URL urlCountryInformation = new URL("http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?WSDl");
        
        QName qnameCountryInformation = new QName("http://www.oorsprong.org/websamples.countryinfo", "CountryInfoService");
  
        Service serviceContry = Service.create(urlCountryInformation, qnameCountryInformation);
        
        CountryInfoServiceSoapType  servico = serviceContry.getPort(CountryInfoServiceSoapType.class);
        
        
        
        
            
      
      

    }
}
