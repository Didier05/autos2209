/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.awt.Color;
import poo.conceptos.basicos.Automovil;

/**
 *
 * @author Marely Medina
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo java !!!");
       Persona per1 = new Persona();
       per1.setNombre("Didier BM");
       System.out.println("Nombre:"+per1.getNombre() );
       per1.comer("Hamburguesa hawaiana");
              
       Persona per2 = new Persona();
       per2.setNombre("Felipe");
        per2.comer ("pizza hawaina");
        System.out.println("Nombre per2:" + per2.getNombre());
    
        Automovil bocho;
        System.out.println("");
        System.out.println("Automvil  Bocho");
        bocho = new Automovil();
        bocho.setMarca("VW");
        System.out.println("Marca  " + bocho.getMarca());
        bocho.setSubMarca("Sedan");
        System.out.println("SubMarca  "+bocho.getSubMarca());
        bocho.setModelo(1970);
        System.out.println("Modelo:"+ bocho.getModelo());
        bocho.setColor(Color.BLUE);
        System.out.println("Color  "+ bocho.getColor());
                
        Automovil Akura;
        System.out.println("");
        System.out.println("Automvil  Akura");
        Akura = new Automovil();
        Akura.setMarca("Akura");
        System.out.println("Marca  " + Akura.getMarca());
        Akura.setSubMarca("NSX");
        System.out.println("SubMarca:  " + Akura.getSubMarca());
        Akura.setModelo(2013);
        System.out.println("Modelo:  " + Akura.getModelo());
        Akura.setColor(Color.GRAY);
        System.out.println("Color:  " + Akura.getColor());
        
        Automovil Mustang;
        System.out.println("");
        System.out.println("Automvil  Mustang");
        Mustang = new Automovil();
        Mustang.setMarca("Ford");
        System.out.println("Marca:  " + Mustang.getMarca());
        Mustang.setSubMarca("Mustang");
        System.out.println("SubMarca:  " + Mustang.getSubMarca());
        Mustang.setModelo(2010);
        System.out.println("Modelo:  " + Mustang.getModelo());
        Mustang.setColor(Color.yellow);
        System.out.println("Color:  " + Mustang.getColor());
              
    }
    
    
    
    
}
