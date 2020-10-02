import java.awt.*;

public class Bear extends Critter {

    // value for bear type and the current status
    boolean polar;
    private int status = 0;

    /**
     * Constructor that get the boolean value
     * @param polar the value that decide the bear type
     */
    public Bear(boolean polar)
    {
        this.polar = polar;
    }

    /**
     * get the bear type from the polar value
     * @return  the color of bear
     */
    public Color getColor() {
        if(polar)
            return Color.white;
        else
            return Color.black;
    }

    public String toString()
    {
        if(status == 0)
            return "/";
        else if(status == 1)
            return "\\";
        else
            return "error";
    }

    @Override
    public Action getMove(CritterInfo info) {
        if(status == 0)
        {
            status = 1;
        }
        else if(status == 1)
        {
            status = 0;
        }

        if (info.getFront() == Neighbor.OTHER)
            return Action.INFECT;
        else if(info.getFront() == Neighbor.EMPTY)
            return Action.HOP;
        else
            return Action.LEFT;
    }
}
