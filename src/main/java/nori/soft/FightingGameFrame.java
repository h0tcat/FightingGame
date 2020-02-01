package nori.soft;

import javax.swing.*;
import java.awt.event.WindowEvent;

public class FightingGameFrame extends JFrame {
    public FightingGameFrame(){
        super("Java格闘ゲーム");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1000,700);

        setLocationRelativeTo(null);
        setResizable(false);

        super.add(new FightingGamePanel());
    }
}
