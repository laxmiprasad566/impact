import java.util.*;
class BlackJack
{
    static int card() {
        
        Scanner sc=new Scanner(System.in);
        Object[] mixedSet = {2, 3, 4, 5, 6, 7, 8, 9, 10, "A", "K", "Q", "J"};

        Random rand = new Random();
        Object randomElement = mixedSet[rand.nextInt(mixedSet.length)];
        if (randomElement instanceof Integer) {
            System.out.print("Card: "+randomElement);
            return (Integer) randomElement;
        }
        String face = (String) randomElement;
        if (face == "K" || face == "Q" ||face == "J" ) {
            System.out.print("Card: "+face);
            return 10; }   
        if (face == "A") {
            System.out.print("Your card is A. Enter value either 1 or 11: ");
            int c= sc.nextInt();
            return c;
        }
        return 0;
    }
    
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int Dsum =0,Psum=0;
    int pc=1,dc=1;
    System.out.print("player's turn: ");
    int a = card();
    System.out.println();
    Psum=Psum+a;
    System.out.printf("Value= %d",Psum);
    System.out.print("\nDealer's turn: ");
    int b = card();
    System.out.println();
    Dsum=Dsum+b;
    System.out.printf("Value= %d",Dsum);
    while (Psum < 21) {
        System.out.print("\nPlayer do you want to cont(y or n): ");
        char c =sc.next().charAt(0);
        if (c == 'y') {
            Psum += card();
            System.out.print("\nValue= "+Psum);
            pc++;
        }
        else {
            break;
        }
    }
    if (Psum < 22) {
    while (Psum > Dsum && Dsum < 21) {
        System.out.print("\nDealer do you want to cont(y or n): ");
        char c =sc.next().charAt(0);
        if (c == 'y') {
            Dsum += card();
            System.out.print("\nValue= "+Dsum);
            dc++;
        }
        else
            break;
    }  
    } 
    int coins=pc+dc;
    if (Psum < 22 && Dsum < 22) {
    if (Psum > Dsum) {
        System.out.print("\nPlayer won "+coins+" !");
    }
    else if(Dsum >= Psum)
        System.out.print("\nPlayer lost and Dealer won "+coins+"!");
    }
    else {
        if(Dsum > 21)
            System.out.print("\nPlayer won "+coins+" !");
        else
            System.out.print("\nPlayer lost and Dealer won "+coins+"!");
    }
    sc.close();
    }
}

