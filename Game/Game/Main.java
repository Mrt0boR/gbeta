public class Main extends Menu {
    public static void main(String[] args) throws InterruptedException {


        //methods fof process in the main class
        Menu mainmenu = new Menu();
        mainmenu.welcomemessage();

        mainmenu.inputcharname();



        /*
        Level1 levelonerun = new Level1();
        levelonerun.nameChar(mainmenu.characterforename, mainmenu.charactersurname);
        levelonerun.scenesetter();
        levelonerun.lvl1op1();
        */


        Level2 level2 = new Level2();
        level2.nameChar(mainmenu.characterforename, mainmenu.charactersurname);
        level2.lvl2scenesetter();

        level2.level2door();



    }
}


