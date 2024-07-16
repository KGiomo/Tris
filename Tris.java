package JTris;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Giovanni
 */
public class Tris extends javax.swing.JFrame {
    
    private String startGame = "X";
    private boolean win = false;
    
    public Tris() {
        initComponents();
    }
    
    private void sceltaGiocatore()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else
        {
            startGame = "X";
        }
    }
    
    private void controllo()
    {
        String b1 = Casella1.getText();
        String b2 = Casella2.getText();
        String b3 = Casella3.getText();
       
        String b4 = Casella4.getText();
        String b5 = Casella5.getText();
        String b6 = Casella6.getText();
        
        String b7 = Casella7.getText();
        String b8 = Casella8.getText();
        String b9 = Casella9.getText();
        
        
        if(b1 == ("X") && b2 ==("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Il giocatore 1 ha vinto", "Tris", JOptionPane.INFORMATION_MESSAGE);
            
            Casella1.setBackground(Color.ORANGE);
            Casella2.setBackground(Color.ORANGE);
            Casella3.setBackground(Color.ORANGE);
            win = true;
        }
        
        if(b4 == ("X") && b5 ==("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Il giocatore 1 ha vinto", "Tris", JOptionPane.INFORMATION_MESSAGE);
            
            Casella4.setBackground(Color.ORANGE);
            Casella5.setBackground(Color.ORANGE);
            Casella6.setBackground(Color.ORANGE); 
            win = true;
        }
         
        if(b7 == ("X") && b8 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Il giocatore 1 ha vinto", "Tris", JOptionPane.INFORMATION_MESSAGE);
            
            Casella7.setBackground(Color.ORANGE);
            Casella8.setBackground(Color.ORANGE);
            Casella9.setBackground(Color.ORANGE); 
            win = true;
        }
        
        if(b1 == ("X") && b4 ==("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Il giocatore 1 ha vinto", "Tris", JOptionPane.INFORMATION_MESSAGE);
            
            Casella1.setBackground(Color.ORANGE);
            Casella4.setBackground(Color.ORANGE);
            Casella7.setBackground(Color.ORANGE);  
            win = true;
        }
        
        if(b2 == ("X") && b5 ==("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Il giocatore 1 ha vinto", "Tris", JOptionPane.INFORMATION_MESSAGE);
            
            Casella2.setBackground(Color.ORANGE);
            Casella5.setBackground(Color.ORANGE);
            Casella8.setBackground(Color.ORANGE);
            win = true;

        }
        
        if(b3 == ("X") && b6 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Il giocatore 1 ha vinto", "Tris", JOptionPane.INFORMATION_MESSAGE);
            
            Casella3.setBackground(Color.ORANGE);
            Casella6.setBackground(Color.ORANGE);
            Casella9.setBackground(Color.ORANGE);
            win = true;
        }
        
        
        if(b1 == ("X") && b5 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Il giocatore 1 ha vinto", "Tris", JOptionPane.INFORMATION_MESSAGE);
            
            Casella1.setBackground(Color.ORANGE);
            Casella5.setBackground(Color.ORANGE);
            Casella9.setBackground(Color.ORANGE);
            win = true;
        }
        
        if(b3 == ("X") && b5 ==("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Il giocatore 1 ha vinto", "Tris", JOptionPane.INFORMATION_MESSAGE);
            
            Casella3.setBackground(Color.ORANGE);
            Casella5.setBackground(Color.ORANGE);
            Casella7.setBackground(Color.ORANGE);
            win = true;
        }
        
        
        if(b1 == ("O") && b2 ==("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Il giocatore 2 ha vinto", "Tris", JOptionPane.INFORMATION_MESSAGE);
            
            Casella1.setBackground(Color.PINK);
            Casella2.setBackground(Color.PINK);
            Casella3.setBackground(Color.PINK);
            win = true;
            
        }
        
        if(b4 == ("O") && b5 ==("O") && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Il giocatore 2 ha vinto", "Tris", JOptionPane.INFORMATION_MESSAGE);
            
            Casella4.setBackground(Color.PINK);
            Casella5.setBackground(Color.PINK);
            Casella6.setBackground(Color.PINK);
            win = true;
        }
         
        if(b7 == ("O") && b8 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Il giocatore 2 ha vinto", "Tris", JOptionPane.INFORMATION_MESSAGE);
            
            Casella7.setBackground(Color.PINK);
            Casella8.setBackground(Color.PINK);
            Casella9.setBackground(Color.PINK);
            win = true;
        }
        
        if(b1 == ("O") && b4 ==("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Il giocatore 2 ha vinto", "Tris", JOptionPane.INFORMATION_MESSAGE);
            
            Casella1.setBackground(Color.PINK);
            Casella4.setBackground(Color.PINK);
            Casella7.setBackground(Color.PINK);
            win = true;
        }
        
        if(b2 == ("O") && b5 ==("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Il giocatore 2 ha vinto", "Tris", JOptionPane.INFORMATION_MESSAGE);
            
            Casella2.setBackground(Color.PINK);
            Casella5.setBackground(Color.PINK);
            Casella8.setBackground(Color.PINK); 
            win = true;
        }
        
        if(b3 == ("O") && b6 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Il giocatore 2 ha vinto", "Tris", JOptionPane.INFORMATION_MESSAGE);
            
            Casella3.setBackground(Color.PINK);
            Casella6.setBackground(Color.PINK);
            Casella9.setBackground(Color.PINK);  
            win = true;
        }
        
        
        if(b1 == ("O") && b5 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Il giocatore 2 ha vinto", "Tris", JOptionPane.INFORMATION_MESSAGE);
            
            Casella1.setBackground(Color.PINK);
            Casella5.setBackground(Color.PINK);
            Casella9.setBackground(Color.PINK);
            win = true;
        }
        
        if(b3 == ("O") && b5 ==("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Il giocatore 2 ha vinto", "Tris", JOptionPane.INFORMATION_MESSAGE);

            
            Casella3.setBackground(Color.PINK);
            Casella5.setBackground(Color.PINK);
            Casella7.setBackground(Color.PINK); 
            win = true;
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Casella1 = new javax.swing.JButton();
        Casella2 = new javax.swing.JButton();
        Casella3 = new javax.swing.JButton();
        Casella4 = new javax.swing.JButton();
        Casella5 = new javax.swing.JButton();
        Casella6 = new javax.swing.JButton();
        Casella7 = new javax.swing.JButton();
        Casella8 = new javax.swing.JButton();
        Casella9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TRIS");
        setResizable(false);

        Casella1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Casella1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casella1ActionPerformed(evt);
            }
        });

        Casella2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Casella2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casella2ActionPerformed(evt);
            }
        });

        Casella3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Casella3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casella3ActionPerformed(evt);
            }
        });

        Casella4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Casella4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casella4ActionPerformed(evt);
            }
        });

        Casella5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Casella5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casella5ActionPerformed(evt);
            }
        });

        Casella6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Casella6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casella6ActionPerformed(evt);
            }
        });

        Casella7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Casella7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casella7ActionPerformed(evt);
            }
        });

        Casella8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Casella8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casella8ActionPerformed(evt);
            }
        });

        Casella9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Casella9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casella9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Casella1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Casella2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Casella4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Casella5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Casella7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Casella8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Casella3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Casella6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Casella9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(346, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Casella3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Casella6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Casella1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casella2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Casella4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casella5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Casella7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Casella8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Casella9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 93, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Casella1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casella1ActionPerformed
        // TODO add your handling code here:
        
        Casella1.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           Casella1.setForeground(Color.RED);
        }
        else
        {
            Casella1.setForeground(Color.MAGENTA);
        }
        
        controllo();
        
        if(win == false)
            sceltaGiocatore();
    }//GEN-LAST:event_Casella1ActionPerformed

    private void Casella2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casella2ActionPerformed
        // TODO add your handling code here:
        
        Casella2.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           Casella2.setForeground(Color.RED);
        }
        else
        {
            Casella2.setForeground(Color.MAGENTA);
        }
        
        controllo();
        
        if(win == false)
            sceltaGiocatore();
    }//GEN-LAST:event_Casella2ActionPerformed

    private void Casella3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casella3ActionPerformed
        // TODO add your handling code here:
        Casella3.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           Casella3.setForeground(Color.RED);
        }
        else
        {
            Casella3.setForeground(Color.MAGENTA);
        }
        
        controllo();
        
        if(win == false)
            sceltaGiocatore();
    }//GEN-LAST:event_Casella3ActionPerformed

    private void Casella4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casella4ActionPerformed
        // TODO add your handling code here:
        Casella4.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           Casella4.setForeground(Color.RED);
        }
        else
        {
            Casella4.setForeground(Color.MAGENTA);
        }
        
        controllo();
        
        if(win == false)
            sceltaGiocatore();
    }//GEN-LAST:event_Casella4ActionPerformed

    private void Casella5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casella5ActionPerformed
        // TODO add your handling code here:
        Casella5.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           Casella5.setForeground(Color.RED);
        }
        else
        {
            Casella5.setForeground(Color.MAGENTA);
        }
        
        controllo();
        
        if(win == false)
            sceltaGiocatore();
    }//GEN-LAST:event_Casella5ActionPerformed

    private void Casella6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casella6ActionPerformed
        // TODO add your handling code here:
        Casella6.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           Casella6.setForeground(Color.RED);
        }
        else
        {
            Casella6.setForeground(Color.MAGENTA);
        }
        
        controllo();
        
        if(win == false)
            sceltaGiocatore();
    }//GEN-LAST:event_Casella6ActionPerformed

    private void Casella9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casella9ActionPerformed
        // TODO add your handling code here:
        Casella9.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           Casella9.setForeground(Color.RED);
        }
        else
        {
            Casella9.setForeground(Color.MAGENTA);
        }
        
        controllo();
        
       if(win == false)
            sceltaGiocatore();
    }//GEN-LAST:event_Casella9ActionPerformed

    private void Casella8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casella8ActionPerformed
        // TODO add your handling code here:
        Casella8.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           Casella8.setForeground(Color.RED);
        }
        else
        {
            Casella8.setForeground(Color.MAGENTA);
        }
        
        controllo();
        
        if(win == false)
            sceltaGiocatore();
    }//GEN-LAST:event_Casella8ActionPerformed

    private void Casella7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casella7ActionPerformed
        // TODO add your handling code here:
        Casella7.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           Casella7.setForeground(Color.RED);
        }
        else
        {
            Casella7.setForeground(Color.MAGENTA);
        }
        
        controllo();
        
        if(win == false)
            sceltaGiocatore();
    }//GEN-LAST:event_Casella7ActionPerformed

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
            java.util.logging.Logger.getLogger(Tris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Casella1;
    private javax.swing.JButton Casella2;
    private javax.swing.JButton Casella3;
    private javax.swing.JButton Casella4;
    private javax.swing.JButton Casella5;
    private javax.swing.JButton Casella6;
    private javax.swing.JButton Casella7;
    private javax.swing.JButton Casella8;
    private javax.swing.JButton Casella9;
    // End of variables declaration//GEN-END:variables
}
