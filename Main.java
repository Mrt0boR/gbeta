public class Main extends Menu {
    public static void main(String[] args) throws InterruptedException {

        //mainmenu test


        Menu mainmenu = new Menu();
        mainmenu.welcomemessage();

        mainmenu.inputcharname();

        Level1 levelonetest = new Level1();
        levelonetest.nameChar(mainmenu.characterforename, mainmenu.charactersurname);
        levelonetest.scenesetter();
        levelonetest.lvl1op1();


    }



}
