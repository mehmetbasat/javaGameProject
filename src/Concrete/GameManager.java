package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {
    @Override
    public void getGameInformation(Game game) {
        System.out.println("Oyun ismi : " + game.getGameName());
        System.out.println("Oyunun fiyatı : " + game.getGamePrice());

    }
}
