package se.ECUTB.RijadHamula;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        double a,b,d;
        int menyVal;
        boolean kör = true;
        do {
            System.out.println("1.Addera");
            System.out.println("2:Subbtrahon");
            System.out.println("3.Multiplikation");
            System.out.println("4.Division");
            System.out.println("5.Om du vill avsluta programet tryck 5");
            menyVal =  scanner.nextInt();
            Kalk Rijad = new Kalk();
            switch (menyVal) {

                case 1:
                    System.out.println("Skriv in två siffror");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    d = Rijad.add(a,b);
                    System.out.println("Resultat   " + d);
                    break;

                case 2:
                    System.out.println("Skriv in två siffror");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    d = Rijad.sub(a,b);
                    System.out.println("Resultat   " + d);
                    break;

                case 3:
                    System.out.println("Skriv in två siffror");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    d = Rijad.multi(a,b);
                    System.out.println("Resultat   " + d);
                    break;

                case 4:
                    System.out.println("Skriv in två siffror");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    d = Rijad.div(a,b);
                    System.out.println("Resultat  " + d );
                    break;

                default:
                    System.out.println("Välj ett alternativ ovan");
                    break;





        }


    }while (menyVal != 5);
}
{
    }
}
