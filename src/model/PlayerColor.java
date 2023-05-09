package model;

import java.awt.*;

/**
 * This class is mainly used to wrap the Color object that describes
 * the ownership of the piece and the current player.
 * 此类主要用于包装描述
 * *作品的所有权和当前玩家。此类主要用于包装描述
 * *作品的所有权和当前玩家。
 */
public enum PlayerColor {
    BLUE(Color.BLUE), RED(Color.RED);

    private final Color color;

    PlayerColor(Color color) {
        this.color = color;
    }


    public Color getColor() {
        return color;
    }


}
