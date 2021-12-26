package Sesi11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Dzikry 
 */
public class JavaException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            // pernyataan yang berpotensi mengakibatkan Exception
           String[] siswa = new String[2];
           siswa[0] = "Jefry";
           siswa[1] = "Yuriva";
           siswa[2] = "Zahra";
           System.out.println(siswa[4]);
        }catch(ArrayIndexOutOfBoundsException ex){
            // pernyataan disini akan di eksekusi jika terjadi Exception
            System.out.println("Data Array Yang Ingin Dikeluarkan Tidak Ada");
        }
        Scanner input = new Scanner(System.in);
        boolean lanjutin=true;
       
        do {            
            try {
                System.out.println("Masukan bilangan :");
                int bil = input.nextInt();      
                System.out.println("Bilangan yang dimasukan adalah :"+bil);
                lanjutin=false;
            } catch (InputMismatchException ex) {
                System.err.println("Coba kembali ! (Input valid : bilangan diperlukan.)");
                input.nextLine();
            }
            
        } while (lanjutin);
    }
    
}
