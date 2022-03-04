/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.msprmarchestp;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author milla
 */
public class Program {
    
    static void HtmlList( ArrayList ListeEquipement){
        
        String filename = "liste.html";
         BufferedWriter bufWriter = null;
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filename, true);
            bufWriter = new BufferedWriter(fileWriter);
            //InsÃ©rer un saut de ligne
            
            
            for (int i = 0; i < ListeEquipement.size() ; i++) {
               fileWriter = new FileWriter(filename, true);
            bufWriter = new BufferedWriter(fileWriter);      
                bufWriter.newLine(); 
                int valueForIndex = ListeEquipement.indexOf(ListeEquipement.get(i));
                
                     bufWriter.write("<a href="+ ListeEquipement.get(i)+ ".html>" +ListeEquipement.get(i) +"</a>" +" ");
           
                    bufWriter.write(ListeEquipement.get(i) + " </br></br>");
                
           
            
            System.out.println("ligne ajouté " + valueForIndex + " " + ListeEquipement.get(i) );
            bufWriter.close();
            
            }
        } catch (IOException ex) {
           // Logger.getLogger(TextFileWriter.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bufWriter.close();
                fileWriter.close();
            } catch (IOException ex) {
              //  Logger.getLogger(TextFileWriter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    /*
    
    try{
         // Le fichier d'entrée
      FileInputStream file = new FileInputStream( nom+".txt");   
      Scanner scanner = new Scanner(file);  
      
      //renvoie true s'il y a une autre ligne à lire
       FileWriter myWriter = new FileWriter("test" + ".html");
     
                         try {
     
      myWriter.write("<!DOCTYPE html>\n" +
"<html lang=\"en\" dir=\"ltr\">\n" +
"  <head>\n" +
"    <meta charset=\"utf-8\">\n" +
"    <title></title>\n" +
"  </head>\n" +
"  <body>\n <center><h1>" +
            nom+
" </h1> </center>  \n" +
"  </body>\n" +
"</html>");
      myWriter.close();
    } 
    catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        
        
        
      } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
      }
        
        
    }
    
    
    */
    
    //-----------------------------------------------------------------------------------------------------
    static void CreaHtml(String Nom){
        
     String NomP = Nom +" " ;
                try {
      FileWriter myWriter = new FileWriter(Nom + ".html");
      myWriter.write("<!DOCTYPE html>\n" +
"<html lang=\"en\" dir=\"ltr\">\n" +
"  <head>\n" +
"    <meta charset=\"utf-8\">\n" +
"    <title></title>\n" +
"  </head>\n" +
"  <body>\n <center><h1>" +
             NomP +
" </h1> </center>  \n" +
"  </body>\n" +
"</html>");
      myWriter.close();
    } 
    catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        
    }
    
    //---------------------------------------------------------------------------------------------------

    
    
    
    static void CreaHtmlForEachStaff(String Nom){
try{
    BufferedWriter bufWriter = null;
        FileWriter fileWriter = null;
     ArrayList agent = new ArrayList();
         // Le fichier d'entrée
      FileInputStream file = new FileInputStream( Nom+".txt");   
      Scanner scanner = new Scanner(file);  
      
      //renvoie true s'il y a une autre ligne à lire
      while(scanner.hasNextLine())
      {
          String str = scanner.nextLine() ;
        String[] words = str.split("\n");
         for (String word : words) {
              agent.add(word);
         }
        
      }
      scanner.close();      
   
               System.out.println(agent.size());
      FileWriter myWriter = new FileWriter(Nom + ".html");
    
     myWriter.write("<!DOCTYPE html>\n" +
"<html lang=\"en\" dir=\"ltr\">\n" +
"  <head>\n" +
"    <meta charset=\"utf-8\">\n" +
"    <title>Agent "+ agent.get(0) + " " + agent.get(1) +" </title>\n" +
"  </head>\n" +
"  <body>\n <center><h1>" +
           "<h3>Identification : "+ agent.get(0) + " " + agent.get(1) + "</h3>\n"   + "Photo : \n" + "</br>" + "<img width="+"25%"+" src="+"IDs/"+Nom+".jpg"+ "></br>" + "poste de travail : " +  agent.get(2)  + "</br> mot de passe : "  + agent.get(3) + agent.get(4)+ "<ul>" + "<p><input type=" +"checkbox"+" checked >"+ agent.get(5)+ "</p>" + "<p><input type=" +"checkbox"+" checked >" 
           + agent.get(6) + "</p>" + "<p><input type=" +"checkbox"+" checked >" + agent.get(7) +  "</p>" + "<p><input type=" +"checkbox"+" checked >"+agent.get(8) + "</p>" +
" </h1> </center>  \n" +
"  </body>\n" +
"</html>");
      myWriter.close();
       
            
            //InsÃ©rer un saut de ligne
            
            
           
            
    
}
    catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        
    }
    
    
    //---------------------------------------------------------------------------------------------------
    
     static ArrayList Htmlagent(String NomFichier){
        
        ArrayList ListeEquipement = new ArrayList();
        try{
         // Le fichier d'entrée
      FileInputStream file = new FileInputStream( NomFichier+".txt");   
      Scanner scanner = new Scanner(file);  
      
      //renvoie true s'il y a une autre ligne à lire
      while(scanner.hasNextLine())
      {
          String str = scanner.nextLine() ;
        String[] words = str.split("\t");
         for (String word : words) {
             ListeEquipement.add(word);
         }
        
      }
      scanner.close();      
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
        
        return ListeEquipement;
    }
    
    
    //---------------------------------------------------------------------------------------------------
    static ArrayList LireFichier(String NomFichier){
        
        ArrayList ListeEquipement = new ArrayList();
        try{
         // Le fichier d'entrée
      FileInputStream file = new FileInputStream( NomFichier+".txt");   
      Scanner scanner = new Scanner(file);  
      
      //renvoie true s'il y a une autre ligne à lire
      while(scanner.hasNextLine())
      {
          String str = scanner.nextLine() ;
        String[] words = str.split("\t");
         for (String word : words) {
             ListeEquipement.add(word);
         }
        
      }
      scanner.close();      
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
        
        return ListeEquipement;
    }
   
    public static void main(String[] args) {
        
         ArrayList personne = new ArrayList();
        
        System.out.println("Hello");
     
        
        CreaHtml("patrick");
        HtmlList(personne);
       personne = LireFichier("staff");
       
      
       
        for (int i = 0; i < personne.size(); i++) {
            
            System.out.println(personne.get(i));
            
        }
        System.out.println();
                
 HtmlList(personne);
 
         for (int i = 0; i < personne.size(); i++) {
          String GetNom = String.valueOf(personne.get(i));
          System.out.println(GetNom);
            CreaHtmlForEachStaff(GetNom);
        }
 
    }
    
    
    
    
}
