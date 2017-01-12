import java.util.Scanner;
import java.io.*;


public class xtra
{
  public static void main(String[] args)
  {
    int home = 1;
    while (home == 1) {
    for (int i = 0; i < 50; ++i) System.out.println();
    System.out.println("Welkom bij de chatbot van feestwinkel ProjectX.");
    System.out.println("Geef aan wat voor vraag u heeft en als u geen vraag heeft, wat doet u hier dan?:");
    System.out.println("Wat is de vooraad van onze winkel?, typ in: 1");
    System.out.println("Wat zijn de openingstijden van onze winkel?, typ in: 2");
    System.out.println("Wanneer levert onze winkel de prodcten bij u thuis als ze dat wel echt doen?, typ in: 3");
    System.out.println("Over contactgegevens zit u hier verkeerd, u moet die optie hier beneden dan gebruiken, dit is namelijk voor info over de garantie, typ in: 4");
    System.out.println("Over contactgegevens, zit u hier wel goed, typ in: 5");
    System.out.println("Of wil je nu al afsluiten?, typ in: 6");
    Scanner antwM = new Scanner(System.in);

      try {
        int antwNumM = antwM.nextInt();
        if (antwNumM == 1) {
          for (int i = 0; i < 50; ++i) System.out.println();
            System.out.println("Onze vooraad bestaat uit dingen:");
            System.out.println("Slingers enzo: 10 euro per slinger");
            System.out.println("Ja we hebben ook lampen: 10 euro per lamp");
            System.out.println("Rare en gekke outfits:25 euro per outfit");
            System.out.println("Schmink sets om uw make-up te vervangen: 5 euro per set");
            System.out.println("Maskers zodat u lekker onherkenbaar kan blijven: 10 euro per masker");
            System.out.println("Confetti om mensen mee onder te blazen: 1 euro per rol");
            System.out.println("Pruiken om op te doen: 10 euro per pruik");
            System.out.println("Brillen om op te zetten: 3 euro per bril");
            System.out.println("En natuurlijk ook contactlenzen, want ja waarom niet: 10 euro per set");

            int vooraad = 1;
            while (vooraad == 1) {
            System.out.println("Om terug te gaan naar het hoofdmenu, typ in 1");
            System.out.println("Om de chatbot af te sluiten, typ in 2");
            Scanner antwV = new Scanner(System.in);

            try {
              int antwNumV = antwV.nextInt();
              if (antwNumV == 1) {
                home = 1;
                vooraad = 0;
                for (int i = 0; i < 50; ++i) System.out.println();
              } else if (antwNumV == 2) {
                for (int i = 0; i < 50; ++i) System.out.println();
                System.exit(1);
              } else {
                System.out.println("U heeft geen acceptabel antwoord ingevoerd, probeer het opnieuw.");
              }
            }
            catch(Exception e) {
              System.out.println("U heeft geen acceptabel antwoord ingevoerd, probeer het opnieuw.");
            }
          }
      } else if (antwNumM == 2) {
        for (int i = 0; i < 50; ++i) System.out.println();
        System.out.println("Maandag t/m Vrijdag: 09:00 - 20:00");
        System.out.println("Zaterdag: 09:00 - 21:00");
        System.out.println("Zondag: gesloten");

        int tijden = 1;
        while (tijden == 1) {
        System.out.println("Om terug te gaan naar het hoofdmenu, typ in 1");
        System.out.println("Om de chatbot af te sluiten, typ in 2");
        Scanner antwT = new Scanner(System.in);

        try {
          int antwNumT = antwT.nextInt();
          if (antwNumT == 1) {
            home = 1;
            tijden = 0;
            for (int i = 0; i < 50; ++i) System.out.println();
          } else if (antwNumT == 2) {
            for (int i = 0; i < 50; ++i) System.out.println();
            System.exit(1);
          } else {
            System.out.println("U heeft geen acceptabel antwoord ingevoerd, probeer het opnieuw.");
          }
        }
        catch(Exception e) {
          System.out.println("U heeft geen acceptabel antwoord ingevoerd, probeer het opnieuw.");
        }
        }
      } else if (antwNumM == 3) {
        for (int i = 0; i < 50; ++i) System.out.println();
        System.out.println("Wij leveren onze producten de volgende werkdag als het voor 19:00 is besteld als de bezorger ook wat koffie mag.");

        int levering = 1;
        while (levering == 1) {
        System.out.println("Om terug te gaan naar het hoofdmenu, typ in 1");
        System.out.println("Om de chatbot af te sluiten, typ in 2");
        Scanner antwL = new Scanner(System.in);

        try {
          int antwNumL = antwL.nextInt();
          if (antwNumL == 1) {
            home = 1;
            levering = 0;
            for (int i = 0; i < 50; ++i) System.out.println();
          } else if (antwNumL == 2) {
            for (int i = 0; i < 50; ++i) System.out.println();
            System.exit(1);
          } else {
            System.out.println("U heeft geen acceptabel antwoord ingevoerd, probeer het opnieuw.");
          }
        }
        catch(Exception e) {
          System.out.println("U heeft geen acceptabel antwoord ingevoerd, probeer het opnieuw.");
        }
        }
      } else if (antwNumM == 4) {
        for (int i = 0; i < 50; ++i) System.out.println();
        System.out.println("U heeft 6 maanden garantie na het aanschaffen van 1 van onze producten, dat heb je niet op kinderen!");

        int garantie = 1;
        while (garantie == 1) {
        System.out.println("Om terug te gaan naar het hoofdmenu, typ in 1");
        System.out.println("Om de chatbot af te sluiten, typ in 2");
        Scanner antwG = new Scanner(System.in);

        try {
          int antwNumG = antwG.nextInt();
          if (antwNumG == 1) {
            home = 1;
            garantie = 0;
            for (int i = 0; i < 50; ++i) System.out.println();
          } else if (antwNumG == 2) {
            for (int i = 0; i < 50; ++i) System.out.println();
            System.exit(1);
          } else {
            System.out.println("U heeft geen acceptabel antwoord ingevoerd, probeer het opnieuw.");
          }
        }
        catch(Exception e) {
          System.out.println("U heeft geen acceptabel antwoord ingevoerd, probeer het opnieuw.");
        }
        }
      } else if (antwNumM == 5) {
        for (int i = 0; i < 50; ++i) System.out.println();
        System.out.println("Als u contact wilt opnemen kan dat via ons telefoon nummer: 112 of 0252-583568");
        System.out.println("Of u kunt ons een e-mail sturen naar: nee@datgaatjeniksaan.be of projectX@gmail.com");

        int contact = 1;
        while (contact == 1) {
        System.out.println("Om terug te gaan naar het hoofdmenu, typ in 1");
        System.out.println("Om de chatbot af te sluiten, typ in 2");
        Scanner antwC = new Scanner(System.in);

        try {
          int antwNumC = antwC.nextInt();
          if (antwNumC == 1) {
            home = 1;
            contact = 0;
            for (int i = 0; i < 50; ++i) System.out.println();
          } else if (antwNumC == 2) {
            for (int i = 0; i < 50; ++i) System.out.println();
            System.exit(1);
          } else {
            System.out.println("U heeft geen acceptabel antwoord ingevoerd, probeer het opnieuw.");
          }
        }
        catch(Exception e) {
          System.out.println("U heeft geen acceptabel antwoord ingevoerd, probeer het opnieuw.");
        }
        }
      } else if (antwNumM == 6) {
        for (int i = 0; i < 50; ++i) System.out.println();
        System.exit(1);
      } else {
        for (int i = 0; i < 50; ++i) System.out.println();
        System.out.println("U heeft geen acceptabel antwoord ingevoerd, probeer het opnieuw door op enter te drukken.");
        home = 0;
        Scanner enter = new Scanner(System.in);
        String enterPressed = enter.nextLine();
        home = 1;
      }
    } catch(Exception e) {
      for (int i = 0; i < 50; ++i) System.out.println();
      System.out.println("U heeft geen acceptabel antwoord ingevoerd, probeer het opnieuw door op enter te drukken.");
      home = 0;
      Scanner enter = new Scanner(System.in);
      String enterPressed = enter.nextLine();
      home = 1;
    }
    }
  }
}
