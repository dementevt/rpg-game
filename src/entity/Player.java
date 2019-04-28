package entity;

import window.Game;

import java.awt.*;

public class Player extends GameObject{

    int width, height;

    public Player(Game game, int x, int y){
        super(game,x,y); //вызывает конструктор GameObject
        this.width = 32;
        this.height = 32;
    }

    @Override
    public void render(Graphics g) {
        g.fillRect(x,y,width,height);
    }
}
