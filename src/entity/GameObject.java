package entity;
import window.Game;
import java.awt.*;

public class GameObject {
    public Game game;

    int x, y; //текущая позиция объекта
    int id; //идентификатор, характеризующий объект (дерево, игрок, пуля, бос)

    int deltX = 0, deltY = 0;

    public GameObject(Game game, int x, int y){
        this.game = game;
        this.x = x;
        this.y = y;
    }

    public void move(){
        x = x + deltX;
        y = y + deltY;
    }

    public void render(Graphics g){

    }
}

}
