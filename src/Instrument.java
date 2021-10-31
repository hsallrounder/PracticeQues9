import java.util.Random;

public abstract class Instrument {
    public abstract void play();
}
class Piano extends Instrument{
    @Override
    public void play(){
        System.out.println("Piano is playing  tan tan tan tan  ");
    }
}
class Flute extends Instrument{
    @Override
    public void play(){
        System.out.println("Flute is playing  toot toot toot toot");
    }
}
class Guitar extends Instrument{
    @Override
    public void play(){
        System.out.println("Guitar is playing  tin  tin  tin");
    }
}
class q1{
    public static void main(String[] args) {
        Random rand = new Random();
        Instrument Instruments[] = new Instrument[10];
        for(int i=0;i<10;i++){
            int num = rand.nextInt(3);
            if(num==0)
                Instruments[i] = new Piano();
            else if(num==1)
                Instruments[i] = new Flute();
            else
                Instruments[i] = new Guitar();

            Instruments[i].play();
        }
        System.out.println("");
        for(int i=0;i<10;i++){
            if (Instruments[i] instanceof Piano)
                System.out.println("Piano is stored at index " + i);
            else if (Instruments[i] instanceof Flute)
                System.out.println("Flute is stored at index " + i);
            else if (Instruments[i] instanceof Guitar)
                System.out.println("Guitar is stored at index " + i);
        }
    }
}