/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import org.oorsprong.websamples.ArrayOftContinent;
import org.oorsprong.websamples.CountryInfoService;
import org.oorsprong.websamples.CountryInfoServiceSoapType;
import org.oorsprong.websamples.TContinent;

/**
 *
 * @author PC-10
 */
public class ContinentNameMain {
    public static void main(String[] args){
        CountryInfoService ci = new CountryInfoService();
        CountryInfoServiceSoapType cit = ci.getCountryInfoServiceSoap();
        ArrayOftContinent ac = cit.listOfContinentsByName();
        for (TContinent TCon : ac.getTContinent()){
            System.out.println("Benua "+TCon.getSCode()+"-"+TCon.getSName());
        }
    }
}

