import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, jorge !");


        // 
        //clase scanner que nos permiten que el usuario escriba 
        Scanner scanner = new Scanner(System.in) ; 

        // declaraciones y asignaciones 
        String palabraScreta = "Programacion" ; 
        int intentosMaximos = 10 ; 
        int intentos = 0 ; 
        boolean palabrasAdivinadas = false ; 

        //arreglos   letra
        char[] leteasAdivinadas = new char[palabraScreta.length()] ; 
        
        // estructura de control : iterativa (Bucle)
        for (int i = 0; i < leteasAdivinadas.length; i++) {
            // como es char van comillas simples 
            leteasAdivinadas[i] = '_' ; 
            //System.out.print("cantidad de la letra a adividar opero en guin bajo " );
            System.out.print(leteasAdivinadas[i]);
           //     System.out.print(palabraScreta);
        }
        // Estructura de control : iterativa (bucle)
        // mientras la palabra no este adivinada 
        while(!palabrasAdivinadas && intentos < intentosMaximos) {
            //                                              esto se usa cuando tenemos una palabra de chars  | array de char muy diferente a array de striong  
           // System.out.println("palabras a adivinar " + String.valueOf(leteasAdivinadas));
           System.out.println("palabras a adivinar " + String.valueOf(leteasAdivinadas) + " ( " + palabraScreta.length() + "letras ");
            System.out.println("introducce una letra , porfavor ");

            // usamos la clase scanner para pedir una letra 
            // solo devuelve la primera letra la primera letra aue escriba la persionañ
            char letra = Character.toLowerCase(scanner.next().charAt(0)) ; //7  minuscukla y mayusculaaaaaaaaaaaaaaaaaaaa

            boolean letraCorreact = false ; 
            for (int i = 0; i < palabraScreta.length(); i++) {
                //estrucctura de control : condicional
                if(palabraScreta.charAt(i) == letra){
                    leteasAdivinadas[i] = letra ; 
                    letraCorreact = true ; 

                }
            }

            if(!letraCorreact){
                intentos++ ;
                System.out.print("!Incorrecto ¡ Te quedan  " + (intentosMaximos - intentos  )  + "intentos" ) ; 

            }

            //letra adivinada son igual ala palbra secreta  
            if ( String.valueOf(leteasAdivinadas).equals(palabraScreta)){
                palabrasAdivinadas = true ;
                System.out.print("!felicidades , has adivinado la palabra secreetaa  ¡" + palabraScreta); 

            }
        }
        // si la palabra no fue adivinada 
        if(!palabrasAdivinadas){
            System.out.print("!Que pena te has quedado sin intentossss¡");
        }






    }
}
