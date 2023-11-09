public class Death extends Menu{ //child of the parent class Menu.java

    String explosionstring = ("kaboom".toUpperCase());  //test of native touppercase method
    public void deathbyexplosion(){
        System.out.println(explosionstring);



        try {
            Thread.sleep(100);


        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println("your body lies in bits - you are the new wallpaper");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

    }


    public void deathbyfall() {
        System.out.println("You fall a long height");
        System.out.println("splat.");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e){
            throw new RuntimeException(e);

        }

        System.out.println("You are dead.");;

        try{
            Thread.sleep(500);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    public void deathbyshooting(){
        System.out.println("You have been shot");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e){
            throw new RuntimeException(e);

        }

        System.out.println("You are dead.");;

        try{
            Thread.sleep(500);
            } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    public void deathroll(){
        System.out.println("Rolling...");
        try {
            Thread.sleep(1000);
            } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println("You took a chance and rolled below 10, you are dead.");

    }


}
