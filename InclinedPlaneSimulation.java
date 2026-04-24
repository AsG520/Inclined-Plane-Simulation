
// import packages for simulation
import javax.swing.JFrame; // import of JFrame.
import javax.swing.ImageIcon; // import of ImageIcon.
import javax.swing.JLabel; // import of JLabel.
import javax.swing.JPanel; // import of JPanel.
import java.awt.Graphics; // import of Graphics.
import java.awt.Graphics2D; // import of Graphics2D
import java.awt.Color; // import of Color.

public class InclinedPlaneSimulation {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Inclined Plane Simulation"); // declaration of the frame with the name ("Inclined
                                                                // Plane Simulation").
        frame.setLayout(null); // layout of the frame, set to null (no layout).
        frame.setSize(700, 450); // dimensions (x, y) of the frame, includes the width and height.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // user can exit out of the frame.

        JLabel floor = new JLabel(); // JLabel for the floor of the simulation.
        floor.setBounds(0, 400, 700, 50); // bounds of the floor (x, y, width, height).
        floor.setOpaque(true); // makes the floor visible within the frame.
        floor.setBackground(Color.BLACK); // sets the color of the floor to be black.
        frame.add(floor); // adds the floor the frame, which the user can see.

        int WIDTH_BALL = 100; // width of the ball, set to 100px.
        int HEIGHT_BALL = 100; // height of the ball, set to 100px.

        ImageIcon ball_icon = new ImageIcon("ball.png"); // declaration of ImageIcon for the ball, which will be used
                                                         // for JLabel.
        JLabel ball = new JLabel(ball_icon); // declaration of the JLabel for the ball, ImageIcon is passed as a
                                             // parameter.
        ball.setBounds(200, 200, WIDTH_BALL, HEIGHT_BALL); // bounds of the ball (x, y, width, height).
        frame.add(ball); // adds the ball to the frame, which the user can see.

        RampPanel ramp = new RampPanel();
        ramp.setBounds(0, 0, 800, 450);

        frame.add(ball); // adds ball to the frame
        frame.add(floor); // adds floor to the frame
        frame.add(ramp); // adds ramp to the frame

        frame.getContentPane().setBackground(Color.LIGHT_GRAY); // sets the background color of the frame to be light
                                                                // gray
        frame.setVisible(true); // frame visibility for the user, which is set to true.
    }

    static class RampPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics g2d = (Graphics2D) g;
            g2d.drawLine(200, 400, 700, 75);
        }
    }
}