/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import org.oorsprong.websamples.ArrayOftLanguage;
import org.oorsprong.websamples.CountryInfoService;
import org.oorsprong.websamples.CountryInfoServiceSoapType;
import org.oorsprong.websamples.TLanguage;

/**
 *
 * @author PC-10
 */
public class LanguageNameMain {
    public static void main(String[] args){
        CountryInfoService ci = new CountryInfoService();
        CountryInfoServiceSoapType cit = ci.getCountryInfoServiceSoap();
        ArrayOftLanguage Al = cit.listOfLanguagesByName();
        for (TLanguage TL : Al.getTLanguage()){
            System.out.println("Language "+TL.getSISOCode()+"-"+TL.getSName());
        }
    }
}
