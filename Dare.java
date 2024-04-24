package dare;

public class Dare {

    public void dareQuestion(int ch){
        switch (ch) {
            case 1:
                System.out.println("Sing the chorus of your favorite song as loudly as you can, no matter where you are.");
                break;
            case 2:
                System.out.println("Send a message to the fifth person in your contact list with only emojis and see how they respond.");
                break;
            case 3:
                System.out.println("Create a funny dance and perform it for everyone in the room.");
                break;
            case 4:
                System.out.println("Put on a blindfold and try to draw a picture of a boat near by the river without peeking.");
                break;
            case 5:
                System.out.println("Do your best impression of a famous person.");
                break;
            case 6:
                System.out.println("Recite the alphabet backward.");
                break;
            case 7:
                System.out.println("Recite a tongue twister three times without making a mistake.");
                break;
            case 8:
                System.out.println("Sound like any 3 animals");
                break;
            case 9:
                System.out.println("Do a quick impression of a famous movie character.");
                break;
            case 10:
                System.out.println("Give yourself a funny nickname and use it for the rest of the game.");
                break;
            default:
                break;
        }
    }
    
}
