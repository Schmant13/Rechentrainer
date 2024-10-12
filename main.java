import javax.swing.*;

public class main {
    public static void main (String[]args){
        JFrame f = new JFrame("Rechentrainer");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1920,1080);

        JMenuItem additionMenuItem = new JMenuItem("Addition");
        JMenuItem start = new JMenuItem("Was möchtest du üben");
        JMenuBar menu = new JMenuBar();

        menu.add(start);
        menu.add(additionMenuItem);
        f.add(menu);
        f.setVisible(true);
    }
}
