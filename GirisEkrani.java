/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButonAyarları;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JFrame;

/**
 *
 * @author Hakan
 */
public final class GirisEkrani extends javax.swing.JFrame implements IDuzenleyici {

    private final String kimlikText_ORIGINAL = "Kullanıcı Kodunu Giriniz";
    private final String sifreText_ORIGINAL = "Şifre Giriniz";

    public GirisEkrani() {
        initComponents();
        Component Null = null;
        getEdits();
       
    }

    
    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        girisEkraniPanel = new javax.swing.JPanel();
        hosgeldinMesaj = new javax.swing.JLabel();
        kimlikText = new javax.swing.JTextField();
        sifreText = new javax.swing.JPasswordField();
        girisButon = new javax.swing.JButton();
        kullaniciIcon = new javax.swing.JLabel();
        sifreIcon = new javax.swing.JLabel();
        sifremiUnuttumLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stok Takip Giriş Ekranı");

        girisEkraniPanel.setBackground(new java.awt.Color(204, 255, 204));

        hosgeldinMesaj.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hosgeldinMesaj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hosgeldinMesaj.setText("Stok Takip Otomasyonuna Hoş Geldiniz");

        kimlikText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kimlikText.setForeground(new java.awt.Color(153, 153, 153));
        kimlikText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kimlikTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kimlikTextFocusLost(evt);
            }
        });

        sifreText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sifreText.setForeground(new java.awt.Color(153, 153, 153));
        sifreText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sifreTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sifreTextFocusLost(evt);
            }
        });
        sifreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreTextActionPerformed(evt);
            }
        });

        girisButon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        girisButon.setText("Giriş");
        girisButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        girisButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                girisButonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                girisButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                girisButonMouseExited(evt);
            }
        });
        girisButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisButonActionPerformed(evt);
            }
        });

        kullaniciIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/İconlar/logoKullanici.png"))); // NOI18N

        sifreIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/İconlar/logosifre.png"))); // NOI18N

        sifremiUnuttumLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        sifremiUnuttumLabel.setForeground(new java.awt.Color(51, 102, 255));
        sifremiUnuttumLabel.setText("Şifremi Unuttum!");
        sifremiUnuttumLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifremiUnuttumLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifremiUnuttumLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout girisEkraniPanelLayout = new javax.swing.GroupLayout(girisEkraniPanel);
        girisEkraniPanel.setLayout(girisEkraniPanelLayout);
        girisEkraniPanelLayout.setHorizontalGroup(
            girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(hosgeldinMesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                        .addGroup(girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sifreIcon)
                            .addComponent(kullaniciIcon))
                        .addGap(24, 24, 24)
                        .addGroup(girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kimlikText, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, girisEkraniPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(girisButon, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, girisEkraniPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sifremiUnuttumLabel)
                .addGap(204, 204, 204))
        );

        girisEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {kimlikText, sifreText});

        girisEkraniPanelLayout.setVerticalGroup(
            girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                        .addComponent(hosgeldinMesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kullaniciIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(kimlikText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sifreIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(girisButon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sifremiUnuttumLabel)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(girisEkraniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girisEkraniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        girisEkraniPanel.setFocusable(true);
        kimlikText.setText(kimlikText_ORIGINAL);
        sifreText.setText(sifreText_ORIGINAL);
        TextAyarlari.setOnlyNumber(kimlikText);
    }

    private void sifreTextActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private Color OriginalBgColor;
    /*
    *Buton Renklendirmeleri
    */
    private void girisButonMouseEntered(java.awt.event.MouseEvent evt) {                                        
        ButonAyarları.setBgFg(girisButon, Color.darkGray, Color.BLACK);
    }                                       

    private void girisButonMouseExited(java.awt.event.MouseEvent evt) {                                       
        ButonAyarları.setOriginalBgFg(girisButon);
    }                                      
    /*
    *Buton Actions
    */
    private void girisButonActionPerformed(java.awt.event.ActionEvent evt) {                                           
      
    }                                          
    /*
    *Text Odaklanmaları
    */
    private void kimlikTextFocusGained(java.awt.event.FocusEvent evt) {                                       
       TextAyarlari.checkTheTextFocusGained(kimlikText, kimlikText_ORIGINAL);
    }                                      

    private void kimlikTextFocusLost(java.awt.event.FocusEvent evt) {                                     
       TextAyarlari.CheckTheTextFocusLost(kimlikText);
    }                                    

    private void sifreTextFocusGained(java.awt.event.FocusEvent evt) {                                      
        TextAyarlari.checkTheTextFocusGained(sifreText, sifreText_ORIGINAL);
    }                                     

    private void sifreTextFocusLost(java.awt.event.FocusEvent evt) {                                    
        TextAyarlari.CheckTheTextFocusLost(sifreText);
    }                                   

    private void girisButonMouseClicked(java.awt.event.MouseEvent evt) {                                        
        ActionAyarlari.SetVisible(this, new KullaniciEkrani());
    }                                       

    private void sifremiUnuttumLabelMouseClicked(java.awt.event.MouseEvent evt) {                                                 
      SifreGuncellemeEkrani sifreGuncellemeEkrani=new SifreGuncellemeEkrani();
      ActionAyarlari.SetVisible(this, sifreGuncellemeEkrani);
      sifreGuncellemeEkrani.getEskiSifreText().setEnabled(false);
    }                                                

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton girisButon;
    private javax.swing.JPanel girisEkraniPanel;
    private javax.swing.JLabel hosgeldinMesaj;
    private javax.swing.JTextField kimlikText;
    private javax.swing.JLabel kullaniciIcon;
    private javax.swing.JLabel sifreIcon;
    private javax.swing.JPasswordField sifreText;
    private javax.swing.JLabel sifremiUnuttumLabel;
    // End of variables declaration                   

    private JFrame SifreGuncellmeEkrani() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class SifreGuncellmeEkrani {

        public SifreGuncellmeEkrani() {
        }
    }

    
}