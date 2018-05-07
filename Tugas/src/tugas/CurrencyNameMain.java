/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import org.oorsprong.websamples.ArrayOftCurrency;
import org.oorsprong.websamples.CountryInfoService;
import org.oorsprong.websamples.CountryInfoServiceSoapType;
import org.oorsprong.websamples.TCurrency;

/**
 *
 * @author PC-10
 */
public class CurrencyNameMain {
    public static void main(String[] args){
        CountryInfoService ci = new CountryInfoService();
        CountryInfoServiceSoapType cit = ci.getCountryInfoServiceSoap();
        ArrayOftCurrency Ac = cit.listOfCurrenciesByName();
        for (TCurrency TC : Ac.getTCurrency()){
            System.out.println("Currency  "+TC.getSISOCode()+"-"+ TC.getSName());
        }
    }
}

