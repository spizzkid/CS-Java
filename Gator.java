import java.awt.*;
import java.util.Random;

public class Gator extends Critter {


    int status = 0;
    Random random = new Random();

    public Gator() { }

    public Color getColor()
    {
        if (status == 0)
            return Color.CYAN;
        else
            return Color.BLACK;
    }

    public String toString()
    {
        return "G";
    }

    public Action getMove(CritterInfo info)
    {
        int r = random.nextInt(3);
        if (status == 0)
            status = 1;
        else if (status == 1)
            status = 0;
        if(info.getFront() == Neighbor.OTHER)
            return Action.INFECT;
        else if(info.getFront() == Neighbor.WALL) {

            if (info.getRight() == Neighbor.SAME && info.getRightDirection() == info.getDirection()) {
                return Action.LEFT;
            } else if (info.getLeft() == Neighbor.SAME && info.getLeftDirection() == info.getDirection()) {
                return Action.RIGHT;
            }
        } else
            return null;


         if(info.getFront() == Neighbor.EMPTY)
            return Action.HOP;
        else
            return Action.RIGHT;
    }
}
