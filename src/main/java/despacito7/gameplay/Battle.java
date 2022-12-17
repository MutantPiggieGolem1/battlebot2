package despacito7.gameplay;

import despacito7.Player;
import despacito7.util.Drawable;

import java.awt.Graphics2D;

public class Battle implements Drawable {
    private Enemy enemy;
    private Player player;
    private BattleState state;

    public Battle(Enemy e){
        this.enemy = e;
        this.player = Player.getPlayer();
        this.state = BattleState.INTRO;
    }
    public void draw(Graphics2D g){
        switch (state) {
            case INTRO:
                break;
            case LOSE:
                break;
            case WIN:
                break;
            case ETURN:
                break;
            case PTURN:
                break;
        }
    }
    public void tick(){
        switch (state) {
            case INTRO:
                break;
            case LOSE:
                break;
            case WIN:
                break;
            case ETURN:
                break;
            case PTURN:
                break;
        }
    }

    private enum BattleState {
        INTRO, WIN, LOSE,
        PTURN, ETURN
    }
}

interface Enemy {

}