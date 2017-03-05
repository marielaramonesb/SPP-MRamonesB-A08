//MARIELA RAMONES B IMT A0141149
package spp.mramonesb.a08;

/**
 *
 * @author marielaramonesbalvoa
 */
public class SPPMRamonesBA08 {
@SuppressWarnings ("empty-statement")
    public static void main(String[] args) 
    {
    //Promediador de posiciones pares y suma lde nones
    int promedio, par=0, non=0, cont=0;
    int [][] matrix = {{10,30,89,48,56},
                       {32,23,84,20,10},
                       {72,108,71,402,8}};
    // i inicia en 0, el ciclo se ejectua mientras i < tamaño del arreglo *i incrementa de 2 en 2 
    for (int i=0; i<matrix.length; i++){
        for (int j=0; j<matrix[i].length ; j=j+2){
            par= par+matrix [i][j];
            cont++;    
        }                
    }
    promedio=par/cont;
        System.out.println("El promedio es:" + promedio);
        
    //j inicia en 1, el ciclo se ejecuta mientras j < tamaño del arreglo
    //j se encrementa de dos en dos.
        for (int i=0; i<matrix.length; i++){
            for (int j=1; j<matrix[i].length; j=j+2){
                non=non+matrix[i][j];
            }
        }
        System.out.println("La suma de nones es: " +non);
    }
}