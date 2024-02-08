import oscP5.OscP5;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Controller {
    public static class OSCReceiver {
        OscP5 oscP5;

        public OSCReceiver(int port) {
            oscP5 = new OscP5(this, port);
            oscP5.plug(this, "LeftOutput", "/left");
            oscP5.plug(this, "RightOutput", "/right");
            oscP5.plug(this, "UpOutput", "/up");
            oscP5.plug(this, "DownOutput", "/down");
            oscP5.plug(this, "BombOutput", "/bomb");
            oscP5.plug(this, "CardOutput", "/card");
            oscP5.plug(this, "ActiveOutput", "/active");
            oscP5.plug(this, "WOutput", "/W");
            oscP5.plug(this, "AOutput", "/A");
            oscP5.plug(this, "SOutput", "/S");
            oscP5.plug(this, "DOutput", "/D");
        }

        void LeftOutput() {
            try {
                System.out.println("Left message received");
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_LEFT);
            }

            catch (AWTException e) {
                e.printStackTrace();
            }
        }

        void RightOutput() {
            try {
                System.out.println("Right message received");
                Robot robot = new Robot();

                robot.keyPress(KeyEvent.VK_RIGHT);
            }

            catch (AWTException e) {
                e.printStackTrace();
            }
        }

        void UpOutput() {
            try {
                System.out.println("Up message received");
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_UP);
            }

            catch (AWTException e) {
                e.printStackTrace();
            }
        }

        void DownOutput() {
            try {
                System.out.println("Down message received");
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_DOWN);
            }

            catch (AWTException e) {
                e.printStackTrace();
            }
        }

        void BombOutput() {
            try {
                System.out.println("Bomb message received");
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_E);
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }

        void CardOutput() {
            try {
                System.out.println("Card message received");
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_Q);
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }

        void ActiveOutput() {
            try {
                System.out.println("Active message received");
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_SPACE);
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }

        void WOutput() {
            try {
                System.out.println("W message received");
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_W);
            }

            catch (AWTException e) {
                e.printStackTrace();
            }
        }

        void AOutput() {
            try {
                System.out.println("A message received");
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_A);
            }

            catch (AWTException e) {
                e.printStackTrace();
            }
        }

        void SOutput() {
            try {
                System.out.println("S message received");
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_S);
            }

            catch (AWTException e) {
                e.printStackTrace();
            }
        }

        void DOutput() {
            try {
                System.out.println("D message received");
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_D);
            }

            catch (AWTException e) {
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
