package nori.soft;

import javax.swing.*;
import java.awt.*;

public class FightingGamePanel extends JPanel {

    @Override
    public void paint(Graphics graph){
        super.paint(graph);
        graph.drawLine(0,0,1000,800);
    }
}
