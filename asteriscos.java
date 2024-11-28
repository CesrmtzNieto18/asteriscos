import javax.swing.JOptionPane;
public class asteriscos {
    public static void main(String[] args){
        for (int numero = 0; numero<10; numero++){
           int numI = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un "
                   + "numero para determinar si es par o impar"));
           if(numI% 2== 0){
               System.out.print("El numero es par");
        }else{
                System.out.print("El numero es impar");
                for( int i = 0; i<numI; i++){
                    System.out.print("*\t");
                }
                
           }   
        }
    }
    
}
