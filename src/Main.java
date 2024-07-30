import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        JFrame frm = new JFrame();
        frm.setTitle("HAFIZA OYUNU");
        frm.setBounds(100, 50, 800, 800);
        JButton btn;

        JButton baslat = new JButton("OYUNU BAŞLAT");
        baslat.setBounds(550, 0, 250, 30);
        frm.add(baslat);

        Border b1 = BorderFactory.createLineBorder(Color.BLACK, 3);

        ArrayList<JButton> butonlar = new ArrayList<>();
        ArrayList<Integer> rgs = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int x = (int) (Math.random() * 700);
            int y = (int) (Math.random() * 700);
            int s =(int)(Math.random()*100);
            btn = new JButton(Integer.toString(s));
            btn.setBounds(x, y, 100, 100);
            btn.setFont(new Font("artical", Font.BOLD, 30));
            frm.add(btn);
            btn.setBackground(Color.green);
            btn.setForeground(Color.WHITE);
            btn.setBorder(b1);
            butonlar.add(btn);
            rgs.add(s);
        }

        int s =rgs.get((int)(Math.random()*5));
        baslat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < butonlar.size(); i++) {
                    butonlar.get(i).setForeground(Color.green);
                }

                JOptionPane.showMessageDialog(null, s + "SAYISINI BULABİLİR MİSİN?", "HAFIZA OYUNU ", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        for (int i = 0; i < butonlar.size(); i++) {
            JButton bt = butonlar.get(i);

            bt.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    int ssayi = s;
                    int busayi = Integer.parseInt(bt.getText());

                    if (ssayi == busayi)
                        JOptionPane.showMessageDialog(null, "DOĞRU BİLDİNİZ", "SONUÇ", JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null, "YANLIŞ BİLDİNİZ", "SONUÇ", JOptionPane.ERROR_MESSAGE);
                }
            });
        }
        frm.setBackground(Color.WHITE);
        frm.setDefaultCloseOperation(3);
        frm.setLayout(null);
        frm.setVisible(true);
    }
}