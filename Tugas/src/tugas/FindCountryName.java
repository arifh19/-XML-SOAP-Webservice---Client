/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;
import org.oorsprong.websamples.CountryInfoService;
import org.oorsprong.websamples.CountryInfoServiceSoapType;

/**
 *
 * @author PC-10
 */
public class FindCountryName {
    public static void main(String[] args){
        CountryInfoService ci = new CountryInfoService();
        CountryInfoServiceSoapType cis = ci.getCountryInfoServiceSoap();
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Kode Negara : ");
//        String code = scanner.nextLine();
//        System.out.print("Kode Mata uang : ");
//        String codeCurrency = scanner.nextLine();
        String code = args[0];
        cis.countryName(code);
        String codeCurrency = args[1];
        System.out.println("Country Name "+cis.countryName(code));
        System.out.println("Capital City "+cis.capitalCity(code));
        System.out.println("Currency "+cis.currencyName(codeCurrency));
    }
}

