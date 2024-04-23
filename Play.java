package play;
import truth.Truth;
import dare.Dare;
import generate.Generate;
import java.util.Scanner;


public class Play{

    public void startPlay(){
        String s;
        Generate g = new Generate();
        int game = 1;
        while(game==1){
        System.out.println("Type Truth or Dare or End");
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        if(s.equals("Truth")){
            Truth t = new Truth();
            int ch = g.generateQuestion();
            t.truthQuestion(ch);
        }
        else if(s.equals("Dare")){
            Dare d = new Dare();
            int ch = g.generateQuestion();
            d.dareQuestion(ch);
        }
        else{
            System.out.println("Game ended");
            game=0;
            sc.close();
        }

    }    
}}