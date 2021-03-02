
package laboratoriovariables.pkg67606;

import java.util.Scanner; public class Practica1 {
   public static void main(String[] args) {
      //PRIMERA PARTE : DECLARACION DE VARIANLES PRIMITIVAS
      boolean booleano;
      char caracter;
      byte numeroMuyPequeño;
      short numeroPequeño;
      int entero;
      long largo;
      float flotante;
      double doble;
      //SEGUNDA PARTE : DIFERENCIAS ENTRE LOS TIPOS DE DATOS PRIMITIVOS
entero =97;
doble = 97;
caracter= 97;
       System.out.println("El valor 97 como entero es: " + entero);
       System.out.println("El valor 97 como doble es:" + doble);
       System.out.println("El valor 97 como caracter es:" + doble);
       
       String cadena= new String("Variable de Referencia");
       Scanner lector = new Scanner(System.in);
       System.out.println("LOS STRIGS EN JAVA SON:" + cadena);
       System.out.println("");
       //PARTE 4 LITERALES Y VALORES POR DEFERCTO
       booleano =true;
       caracter = '7';
       System.out.println(booleano);
       System.out.println(caracter);
       System.out.println("");
       booleano = false;
       caracter = '\u0037';
       System.out.println(booleano);
       System.out.println(caracter);
       caracter ='\n';
       System.out.println("EL CARACTER DE SALTO DE LINEA DE ACCION:");
       System.out.println(caracter);
       
       flotante = 3.14159265f;
       System.out.println(flotante);
               
        cadena =  "¡PUEDES ASIGNAR VALORES A UN STRING CON ITERALES!";
        System.out.println(cadena);
        System.out.println(caracter);
        //PARTE 4 LECTURA DE DATOS DEL USUARIO
        System.out.println("¿COMO TE LLAMAS?:" );
        String nombre = lector.nextLine();
        System.out.println("¿CUANTOS AÑOS TIENES?:" );
        int edad = lector.nextInt();
        System.out.println("¡TE LLAMAS!"+ nombre + " Y TIENES" + edad + "años");
        
               
            
    }
    
}
