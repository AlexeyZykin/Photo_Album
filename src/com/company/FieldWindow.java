package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class FieldWindow extends JFrame {
    JPanel mainField;
    JPanel imageField;

    JLabel headLabel;
    JLabel ControlSignature;
    JTextArea Signature;

    JButton SaveAlbum;
    JButton LoadAlbum;
    JButton AddPhoto;
    JButton DeletePhoto;
    JButton AddSignature;
    JButton DeleteSignature;
    JButton EditSignature;
    JButton Next;
    JButton Previous;
    private JFileChooser fileChooser;

   // List<ImageIcon> images = new ArrayList<ImageIcon>();


    public FieldWindow(String Photo_Album){
    super(Photo_Album);

    this.setContentPane(mainField);
    Signature.setVisible(false);
    headLabel.setFont(new Font("Jokerman", Font.PLAIN, 54));
    this.AddPhoto.addActionListener(this::AddPhoto);
    }

    public void AddPhoto(ActionEvent e){
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "png", "jpeg");
      JFileChooser choice = new JFileChooser();
      choice.setFileFilter(filter);
      int option = choice.showOpenDialog(this);
      File file = null;
        if(option==JFileChooser.APPROVE_OPTION){
            file=choice.getSelectedFile();
        }
        //String name=JOptionPane.showInputDialog(null,"Enter NAME of Image");

        try {
            BufferedImage photo = ImageIO.read(file);


        }
        catch (IOException ex){ }



    }

/*
    public void paint(Graphics g){
        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("p3.gif");
        g.drawImage(i, 120,100,this);
    }
*/


}






















