package com.mygdx.game;

public class Pacman {
private Vector2 position;

public Pacman(int x, int y) {
    position = new Vector2(x,y);
}    

public Vector2 getPosition() {
    return position;    
}
}
}
