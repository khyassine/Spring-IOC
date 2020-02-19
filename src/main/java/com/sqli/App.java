package com.sqli;

import com.sqli.demoIOC.model.Produit;
import com.sqli.demoIOC.service.Impl.ProduitServiceImpl;
import com.sqli.demoIOC.service.ProduitService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );

        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        ProduitService produitService=ctx.getBean(ProduitServiceImpl.class);
        List<Produit> produits =produitService.getAll();
        for(Produit produit :produits){
            System.out.println("ID :"+produit);
            System.out.println("Libelle : "+produit);
            System.out.println("Prix : "+produit);
            System.out.println("-----------------------"+produit);

        }
    }
}
