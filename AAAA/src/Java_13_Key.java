
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Java_13_Key extends Frame implements ActionListener , KeyListener {
    Button btn = new Button("Exit");
    Java_13_Key(){
        this.setLocation(100,50);
        this.setTitle("Key");
        this.setSize(500,500);
        this.setVisible(true);
        this.setLayout(null);
        btn.setLocation(250,250);
        btn.setSize(50,50);
        this.add(btn);
        btn.addActionListener(this);
        btn.addKeyListener(this);
    }

    public static void main(String[] args) {
        Java_13_Key frm = new Java_13_Key();
    }
    public void actionPerformed(ActionEvent e) {
        System.exit(0); //btn Action
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        System.out.println("KeyCode:"+e.getKeyCode());
        System.out.println("KeyChar:"+e.getKeyChar());

        int x,y,w,h;
        x = btn.getX();
        y = btn.getY();
        w = btn.getWidth();
        h = btn.getHeight();
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            x+=10;
        }
        else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            x-=10;
        }
        else if(e.getKeyCode() == KeyEvent.VK_UP){ //座標Y與一班座標系相反
            y-=10;
        }
        else if(e.getKeyCode() == KeyEvent.VK_DOWN){
            y+=10;
        }
        else if(e.getKeyCode() == KeyEvent.VK_PAGE_UP){
            w+=10;
            h+=10;
        }
        else if(e.getKeyCode() == KeyEvent.VK_PAGE_DOWN){
            w-=10;
            h-=10;
        }
        btn.setBounds(x,y,w,h); //重設位置大小
    }

    public void keyReleased(KeyEvent e) {
    }
}