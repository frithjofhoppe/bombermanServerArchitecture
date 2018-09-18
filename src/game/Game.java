package game;

import client.Client;
import client.GameClient;
import messages.MovingDirection;

import java.util.List;

public class Game {
    List<GameClient> clientList;
    Labyrinth labyrinth;

    void loadLabyrinth(String location) {
    }

    void joinGame(Client client) {
    }

    void dropBomb(int xPos, int yPos) {
    }

    void moveGameClient(MovingDirection direction, GameClient gameClient) {
    }

    boolean isGameReady() {
        return true;
    }
}
