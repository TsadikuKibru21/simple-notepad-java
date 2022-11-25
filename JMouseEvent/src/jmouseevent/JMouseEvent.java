/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jmouseevent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author tsede
 */


public class JMouseEvent extends JFrame{
    
private final JPanel Mousepanel;
private final JLabel label1;

public JMouseEvent(){
   super("JMouse event");
 Mousepanel =new JPanel();
 Mousepanel.setBackground(Color.white);
  add(Mousepanel,BorderLayout.CENTER);  
 label1 =new JLabel();
add(label1,BorderLayout.SOUTH);

 MouseHandler handle =new MouseHandler();
 Mousepanel.addMouseListener(handle);
  Mousepanel.addMouseMotionListener(handle);
    
}
 private class MouseHandler implements MouseListener,MouseMotionListener{

        @Override
        public void mouseClicked(MouseEvent e) {
         //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        label1.setText(String.format("click at(%d,%d)", e.getX(),e.getY()));
        Mousepanel.setBackground(Color.red);
        }

        @Override
        public void mousePressed(MouseEvent e) {
          
            // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          label1.setText(String.format("Pressed at(%d,%d)", e.getX(),e.getY()));
            Mousepanel.setBackground(Color.red);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          label1.setText(String.format("Released at(%d,%d)", e.getX(),e.getY()));
            Mousepanel.setBackground(Color.red);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          label1.setText(String.format("Entered at(%d,%d)", e.getX(),e.getY()));
            Mousepanel.setBackground(Color.gray);
        }

        @Override
        public void mouseExited(MouseEvent e) {
          //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       
          label1.setText(String.format("Exited at(%d,%d)", e.getX(),e.getY()));
            Mousepanel.setBackground(Color.black);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          label1.setText(String.format("Dragged at(%d,%d)", e.getX(),e.getY()));
            Mousepanel.setBackground(Color.yellow);
        }

        @Override
        public void mouseMoved(MouseEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
         label1.setText(String.format("Moved at(%d,%d)", e.getX(),e.getY()));
           Mousepanel.setBackground(Color.blue);
        }
     
     
     
     
     
 }   
    

    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JMouseEvent jt=new JMouseEvent();
        jt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jt.setSize(300,300);
        jt.setVisible(true);
    }
    
}
