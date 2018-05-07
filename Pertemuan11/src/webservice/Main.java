/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

import tedi.tri.KatalogProdukInterface;
import tedi.tri.KatalogProdukService;
import tedi.tri.Produk;
/**
 *
 * @author PC-10
 */
public class Main {
    public static void main(String[] args){
        KatalogProdukService kp = new KatalogProdukService();
        KatalogProdukInterface kpi = kp.getKatalogProdukPort();
   
        if(args.length!=1){
            for(String katagori : kpi.getProductCategories()){
                System.out.println("Kategori "+katagori);
            }
        }else{
            String katagori = args[0];
            for (Produk produk : kpi.getProducts(katagori)){
                System.out.println("Name : "+produk.getName());
                System.out.println("SKU : "+produk.getSku());
                System.out.println("Price : "+produk.getPrice());
            }
        }
    }   
}
