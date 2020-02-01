package nori.soft;

import nori.soft.scene.*;

public class FightingGame {

    static protected FightingGameFrame gameFrame;
    public static void main(String[] args){
        gameFrame=new FightingGameFrame();
        GameSelectModeEnum gameSelectModeEnum;

        boolean debugMode=true;
        if(debugMode){
            gameSelectModeEnum=GameSelectModeEnum.LOCALMODE;
        }else{
            gameSelectModeEnum=GameSelectModeEnum.TITLE;
        }

        switch (gameSelectModeEnum){
            case TITLE:
                GameTitle gameTitle=new GameTitle();
            case LOCALMODE:
                GameLocalMode localMode=new GameLocalMode();
            case MULTIMODE:
                GameMultiMode multiMode=new GameMultiMode();
        }

        gameFrame.setVisible(true);
    }
}
