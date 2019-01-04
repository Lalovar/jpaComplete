package appJPA;

import dao.DaoProduct;
import model.Product;
import java.util.*;
import model.Taco;
import model.Sale;
import dao.DaoTaco;
import dao.DaoSale;

public class App {
   

    public static void main(String[] args) {
       DaoTaco taquito = new DaoTaco();
       /**
       Taco taquitos = new Taco();
       taquitos.setName("Asada");
       taquitos.setPrice(15);
       taquito.insert(taquitos);
       
       taquitos.setdesc("taco de asada");
       taquito.update(taquitos);
       **/
       
       Collection<Taco> list = taquito.findAll();
       for (Taco taco : list){
           System.out.println (taco);
       }
       
       
    }
}