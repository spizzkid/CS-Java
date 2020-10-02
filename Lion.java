import java.awt.*;
import java.util.Random;

public class Lion extends Critter{

    public Lion() { }
    Random random = new Random();
    private int r = random.nextInt(3);
    private int saver = r;


    public Color getColor() {
        if(r == 0)
            return Color.RED;
        else if(r == 1)
            return Color.GREEN;
        else if(r == 2)
            return Color.BLUE;
        return null;
    }
    @Override
    public String toString()
    {
        return "L";
    }

    private int count = 0;
    @Override
    public Action getMove(CritterInfo info) {
    count++;
    if (count > 2)
    {
        count = 0;
        r = random.nextInt(3);
        while(r == saver)
        {
            r = random.nextInt(3);
        }
        saver = r;
    }
    if(info.getFront() == Neighbor.OTHER)
        return Action.INFECT;

    if(info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL)
        return Action.LEFT;

    else if (info.getFront() == Neighbor.SAME)
        return Action.RIGHT;

    else
        return Action.HOP;
    }
}
