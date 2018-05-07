/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import org.oorsprong.websamples.ArrayOftCountryCodeAndName;
import org.oorsprong.websamples.CountryInfoService;
import org.oorsprong.websamples.CountryInfoServiceSoapType;
import org.oorsprong.websamples.TCountryCodeAndName;

/**
 *
 * @author PC-10
 */
public class CountryNameMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CountryInfoService ci = new CountryInfoService();
        CountryInfoServiceSoapType cit = ci.getCountryInfoServiceSoap();
        ArrayOftCountryCodeAndName cna = cit.listOfCountryNamesByName();
        for (TCountryCodeAndName TC : cna.getTCountryCodeAndName()){
            System.out.println("Negara "+TC.getSISOCode()+"-"+TC.getSName());
        }    
    }
}


