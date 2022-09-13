import java.util.Random;
import java.util.Scanner;

public class random{

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int hedef_tur;
        int i = 10;

        System.out.println("Enter Number of Rounds: ");
        hedef_tur = input.nextInt();
        if (hedef_tur<0 | hedef_tur>99) {
            while (i > 0) {
                
                if (hedef_tur > 0 & hedef_tur < 100) {
                    break;
                }
                else{
                    System.out.println("Enter Number of Rounds: "); 
                    hedef_tur = input.nextInt();
                }
            }
        }

        // create instance of Random class
        Random rand = new Random();

        int Sayi1 = 0;
        int Sayi2 = 0;
        int Sayi3 = 0;
        int a = 7;
        int b = 9;
        //Header
        for (int y=1; y<=a; y++){
            System.out.print("+");
            for ( int z=1; z<=b; z++){
                System.out.print("-");
            }
        }
        System.out.println("+");

        System.out.println("|  ROUND  |  DICE1  |  DICE2  |  DICE3  | TOTAL1  | TOTAL2  | TOTAL3  |");

        for (int k = 1; k<= hedef_tur; k++ ){
            // Generate random integers in range 1 to 6
            int rand_int1 = rand.nextInt(5)+1;
            int rand_int2 = rand.nextInt(5)+1;
            int rand_int3 = rand.nextInt(5)+1;
            

            for (int y=1; y<=a; y++){
                System.out.print("+");
                for ( int z=1; z<=b; z++){
                    System.out.print("-");
                }
            }
            System.out.println("+");
            // Print random integers 5
            String word=Integer.toString(k);
            int len=word.length();
            String space=new String(new char[3-len]).replace("\0", " ");

            System.out.print("|Round "+space+word);
            System.out.print("|    "+rand_int1+"    ");
            System.out.print("|    "+rand_int2+"    ");
            System.out.print("|    "+rand_int3+"    ");

            if (rand_int1 == rand_int2 & rand_int1 == rand_int3){
                Sayi1 = Sayi1 + rand_int1;
                Sayi2 = Sayi2 + rand_int2;
                Sayi3 = Sayi3 + rand_int3;
            }
            if (rand_int1 != rand_int2 & rand_int1 != rand_int3 & rand_int2 != rand_int3){
                Sayi1 = Sayi1 + rand_int1;
                Sayi2 = Sayi2 + rand_int2;
                Sayi3 = Sayi3 + rand_int3;
            }
            if (rand_int1 == rand_int2 & rand_int1 != rand_int3){
                if ( rand_int1 > rand_int3){
                    Sayi1 = Sayi1 + rand_int1*2;
                    Sayi2 = Sayi2 + rand_int2*2;
                    Sayi3 = Sayi3 + rand_int3;
                }
                else {
                    Sayi1 = Sayi1 + rand_int1;
                    Sayi2 = Sayi2 + rand_int2;
                    Sayi3 = Sayi3 + rand_int3;
                }
            }
            if (rand_int1 != rand_int2 & rand_int1 == rand_int3){
                if ( rand_int1 > rand_int2){
                    Sayi1 = Sayi1 + rand_int1*2;
                    Sayi2 = Sayi2 + rand_int2;
                    Sayi3 = Sayi3 + rand_int3*2;
                }
                else {
                    Sayi1 = Sayi1 + rand_int1;
                    Sayi2 = Sayi2 + rand_int2;
                    Sayi3 = Sayi3 + rand_int3;
                }
            }
            if (rand_int1 != rand_int2 & rand_int2 == rand_int3){
                if ( rand_int1 < rand_int2){
                    Sayi1 = Sayi1 + rand_int1;
                    Sayi2 = Sayi2 + rand_int2*2;
                    Sayi3 = Sayi3 + rand_int3*2;
                }
                else {
                    Sayi1 = Sayi1 + rand_int1;
                    Sayi2 = Sayi2 + rand_int2;
                    Sayi3 = Sayi3 + rand_int3;
                }
            }
            word=Integer.toString(Sayi1);
            len=word.length();
            space=new String(new char[3-len]).replace("\0", " ");
            System.out.print("|  "+space+word+"    ");
            
            word=Integer.toString(Sayi2);
            len=word.length();
            space=new String(new char[3-len]).replace("\0", " ");
            System.out.print("|  "+space+word+"    ");

            word=Integer.toString(Sayi3);
            len=word.length();
            space=new String(new char[3-len]).replace("\0", " ");
            System.out.print("|  "+space+word+"    ");
            System.out.println("|");
            input.close();
        }
        for (int y=1; y<=a; y++){
            System.out.print("+");
            for ( int z=1; z<=b; z++){
                System.out.print("-");
            }
        }
        System.out.println("+");
    }
}