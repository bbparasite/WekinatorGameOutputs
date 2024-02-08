import oscP5.OscP5;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Controller {
    public static class OSCReceiver {
        OscP5 oscP5;

        public OSCReceiver(int port) {
            oscP5 = new OscP5(this, port);
            oscP5.plug(this, "LeftInput", "/left");
            oscP5.plug(this, "RightInput", "/right");
            oscP5.plug(this, "UpInput", "/up");
            oscP5.plug(this, "DownInput", "/down");
            oscP5.plug(this, "BombInput", "/bomb");
        }

        void LeftInput() {
            try {
                System.out.println("Left message received");
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_A);
            }

            catch (AWTException e) {
                e.printStackTrace();
            }
        }

        void RightInput() {
            try {
                System.out.println("Right message received");
                Robot robot = new Robot();

                robot.keyPress(KeyEvent.VK_D);
            }

            catch (AWTException e) {
                e.printStackTrace();
            }
        }

        void UpInput() {
            try {
                System.out.println("Up message received");
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_W);
            }

            catch (AWTException e) {
                e.printStackTrace();
            }
        }

        void DownInput() {
            try {
                System.out.println("Down message received");
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_S);
            }

            catch (AWTException e) {
                e.printStackTrace();
            }
        }

        void BombInput() {
            try {
                System.out.println("Bomb message received");
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_E);
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        int port = 12000; // Port to listen for OSC messages
        new OSCReceiver(port);
        // Add a delay to keep the program running
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
