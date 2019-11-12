package ru.itlab.burningpan;

import com.badlogic.gdx.Game;

public class Main extends Game {

    GameScreen gs;

    @Override
    public void create() {
        gs = new GameScreen();
        setScreen(gs);
    }

    @Override
    public void render() {

    }

    @Override
    public void dispose() {

    }
}
