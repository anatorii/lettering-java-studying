import javax.swing.*;
import java.awt.*;

public class Lettering extends JFrame {
    static int width = 800;
    static int height = 600;
    static int clientWidth;
    static int clientHeight;
    private JPanel panel;
    private JLabel label;

    public Lettering() {
        super("Lettering");
        initGui();
    }

    private void initGui() {
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(Lettering.width, Lettering.height));
        this.setLocation(d.width / 2 - Lettering.width / 2, d.height / 2 - Lettering.height / 2);
        this.getContentPane().setBackground(Color.lightGray);
        this.setResizable(false);

        label = new JLabel(" first label ");
        label.setFont(new Font("Serif", Font.ITALIC, 60));
        label.setBackground(Color.orange);
        label.setOpaque(true);

        panel = new JPanel();
        panel.setBackground(Color.lightGray);
        panel.setLayout(new GridBagLayout());
        panel.add(label, null);

        this.add(panel);
        this.pack();
        this.setVisible(true);
    }

    public void setVisible(boolean b) {
        super.setVisible(b);
        clientWidth = Lettering.width;
        clientHeight = Lettering.height;
        if (isResizable()) {
            clientWidth = getContentPane().getWidth();
            clientHeight = getContentPane().getHeight();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Lettering frame = new Lettering();
            }
        });
    }

}
