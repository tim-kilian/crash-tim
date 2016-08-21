import javax.swing.*;

/**
 * Created by tim on 18.07.16.
 */
public class Game extends JFrame {

    public Game() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setTitle("CrashTim");

        GameField level = new GameField();
        add(level);

        setVisible(true);

        Thread gameThread = new GameLoopThread(level);
        gameThread.start();
    }

    public static void main(String[] args) {
        new Game();
    }
}
