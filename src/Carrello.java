
import java.util.Scanner;

public class Carrello {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quanti prodotti vuoi inserire? ");
        int lenghtCarrello = scan.nextInt();
        Prodotto[] carrello = new Prodotto[lenghtCarrello];

        for (int idx = 0; idx < carrello.length; idx++) {

            System.out.print("Scegli cosa inserire tra Televisore(1), Cuffie(2) o Smartphone(3) : ");
            int userChoise = scan.nextInt();
            
            switch (userChoise) {
                case 1:
                    System.err.println("Stai impostanto un nuovo televisore da inserire");
                    System.out.print("Nome televisore: ");
                    String nomeTv = scan.next();
                    System.out.print("Marca: ");
                    String marcaTv = scan.next();
                    System.out.print("Prezzo: ");
                    double prezzoTv = scan.nextDouble();
                    System.out.print("IVA: ");
                    double ivaTv = scan.nextDouble();
                    System.out.print("Pollici: ");
                    int polliciTv = scan.nextInt();
                    System.out.print("E' smart (true/false): ");
                    boolean smartTv = scan.nextBoolean();

                    Televisori nuovoTelevisore = new Televisori(nomeTv, marcaTv, prezzoTv, ivaTv, polliciTv, smartTv);
                    carrello[idx] = nuovoTelevisore;
                    break;

                case 2:
                    System.err.println("Stai impostanto delle nuove cuffie da inserire");
                    System.out.print("Nome cuffie: ");
                    String nomeCuffie = scan.next();
                    System.out.print("Marca: ");
                    String marcaCuffie = scan.next();
                    System.out.print("Prezzo: ");
                    double prezzoCuffie = scan.nextDouble();
                    System.out.print("IVA: ");
                    double ivaCuffie = scan.nextDouble();
                    System.out.print("Colore: ");
                    String coloreCuffie = scan.next();
                    System.out.print("Sono wireless (true/false): ");
                    boolean wirelessCuffie = scan.nextBoolean();

                    Cuffie nuoveCuffie = new Cuffie(nomeCuffie, marcaCuffie, prezzoCuffie, ivaCuffie, coloreCuffie, wirelessCuffie);
                    carrello[idx] = nuoveCuffie;
                    break;

                case 3:
                    System.err.println("Stai impostanto un nuovo smartphone da inserire");
                    System.out.print("Nome smartphone: ");
                    String nomeSmartphone = scan.next();
                    System.out.print("Marca: ");
                    String marcaSmartphone = scan.next();
                    System.out.print("Prezzo: ");
                    double prezzoSmartphone = scan.nextDouble();
                    System.out.print("IVA: ");
                    double ivaSmartphone = scan.nextDouble();
                    System.out.print("Memoria: ");
                    int memoriaSmartphone = scan.nextInt();

                    Smartphone nuovoSmartphone = new Smartphone(nomeSmartphone, marcaSmartphone, prezzoSmartphone, ivaSmartphone, memoriaSmartphone);
                    carrello[idx] = nuovoSmartphone;
                    break;

                default:
                    System.out.println("Prodotto non trovato!");
                    break;
            }
        }

        System.out.println("Il carrello è composto da ");
        for (int idx = 0; idx < carrello.length; idx++) {
            System.out.println(carrello[idx].toString());
        }
    }
}
