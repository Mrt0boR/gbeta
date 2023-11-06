public class Death extends Menu{

    String explosionstring = ("kaboom".toUpperCase());
    public void deathbyexplosion(){
        System.out.println(explosionstring);

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


}
