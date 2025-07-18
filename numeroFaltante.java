importarjava . util . escáner ;
 
público clase Principal {  
    public static void main ( String [] args ) {   
        Escáner escáner = nuevo Escáner ( Sistema . en );  
 
        // Leer n
        int n = escáner .nextInt () ;
        larga suma total = ( larga ) n * ( n + 1 ) / 2 ;     
 
        //Leer n - 1 números y calcular su suma
        largo actualSum = 0 ; 
        para ( int i = 0 ; i < n - 1 ; i ++) {    
            sumaactual+= escáner . nextInt ();
        }
 
        // El número que falta es la diferencia entre la suma total y la real
        Sistema . afuera . println ( SumaTotal -SumaActual ) ;
    }
}