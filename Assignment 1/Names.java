import java.util.*;
public class Names {
  private String[] Nme = new String[16];
  Random r = new Random();

  public String nameGenerator(){
    Nme[0]="noathulth";
    Nme[1]="The Slow Sailu";
    Nme[2]="Icebreath";
    Nme[3]="Ziormauth";
    Nme[4]="Gentle mind";
    Nme[5]="Poamreod";
    Nme[6]="The Nocturnal Aindrud";
    Nme[7]="The Taker Of Life";
    Nme[8]="Chiommeit";
    Nme[9]="Eater Of Bunnies";
    Nme[10]="Eothei";
    Nme[11]="Lord Of Fire";
    Nme[12]="Mianduniag";
    Nme[13]="Champion Of The White Gipuloa";
    Nme[14]="The Swift Parisophor";
    Nme[15]="Champion Of The Red";
    int ran = r.nextInt(Nme.length);
    String name = Nme[ran];
    return name;
  }
}
