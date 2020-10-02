import java.awt.*;

public class Titan extends Giant {
    @Override
    public Color getColor() {
        if (super.toString().equals("fee") || super.toString().equals("foe"))
            return Color.BLACK;
        else if (super.toString().equals("fie")|| super.toString().equals("fum"))
            return Color.WHITE;
        else
            return null;
    }

    public Action getMove(CritterInfo info)
    {
        if(info.getFront() == Neighbor.OTHER)
            return Action.INFECT;
        else if(info.getFront() == Neighbor.EMPTY)
            return Action.HOP;
        else
            return Action.LEFT;
    }
}
