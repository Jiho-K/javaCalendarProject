/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiattempt;

import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jiho Kim
	please note that only the basic template for this program has been set out previous
	to creating the program. For more information, feel free to contact me by email at
	jihok1107@gmail.com or by phone at 587-830-6725
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public String[] notificationCurrent;
    public int index;
    private int changeNotificationX;

    public String[] getNotification() throws IOException {
        File fileLoc = new File("notification.txt");

        Scanner sf = new Scanner(fileLoc);
        String currentNotification[] = new String[1000];

        int maxIndx = -1;
        while (sf.hasNext()) {
            maxIndx++;
            currentNotification[maxIndx] = sf.nextLine();
            //System.out.println(currentNotification[maxIndx]);

        }
        ////System.out.println("asdf"); check to see if code still works.
        index = maxIndx;
        sf.close();

        return currentNotification;
    }

    public MainScreen() throws IOException {
        initComponents();
        String notification[] = getNotification();

        ////System.out.println(index);
        for (int i = 0; i <= 7; i++) {
            switch (i) {
                case 0: {
                    notificationLabel0.setText(notification[i]);
                    break;
                }
                case 1: {
                    notificationLabel1.setText(notification[i]);
                    break;
                }
                case 2: {
                    notificationLabel2.setText(notification[i]);
                    break;
                }
                case 3: {
                    notificationLabel3.setText(notification[i]);
                    break;
                }
                case 4: {
                    notificationLabel4.setText(notification[i]);
                    break;
                }
                case 5: {
                    notificationLabel5.setText(notification[i]);
                    break;
                }
                case 6: {
                    notificationLabel6.setText(notification[i]);
                    break;
                }
                case 7: {
                    notificationLabel7.setText(notification[i]);
                }
            }
        }

    }

    private void deleteNotification() throws IOException {
        File fileLoc = new File("notification.txt");
        String absolutePath = fileLoc.getAbsolutePath();
        //REMEMBER TO TRY AND GET ABSOLUTE PATH FOR NEXT TIME!!!

        Scanner sf = new Scanner(fileLoc);
        String currentNotification[] = new String[1000];

        int maxIndx = -1;
        while (sf.hasNext()) {
            maxIndx++;
            currentNotification[maxIndx] = sf.nextLine();

        }
        ////System.out.println("asdf"); check to see if code still works.

        sf.close();

        FileWriter fw = new FileWriter(fileLoc);
        PrintWriter output = new PrintWriter(fw);

        if (changeNotificationX == 0) {
            for (int x = 0; x <= maxIndx; x++) {
                if (!currentNotification[x].equals(notificationLabel0.getText())) {
                    output.println(currentNotification[x]);
                }
            }
        } else if (changeNotificationX == 1) {
            for (int x = 0; x <= maxIndx; x++) {
                if (!currentNotification[x].equals(notificationLabel1.getText())) {
                    output.println(currentNotification[x]);
                }
            }
        } else if (changeNotificationX == 2) {
            for (int x = 0; x <= maxIndx; x++) {
                if (!currentNotification[x].equals(notificationLabel2.getText())) {
                    output.println(currentNotification[x]);
                }
            }
        } else if (changeNotificationX == 3) {
            for (int x = 0; x <= maxIndx; x++) {
                if (!currentNotification[x].equals(notificationLabel3.getText())) {
                    output.println(currentNotification[x]);
                }
            }
        } else if (changeNotificationX == 4) {
            for (int x = 0; x <= maxIndx; x++) {
                if (!currentNotification[x].equals(notificationLabel4.getText())) {
                    output.println(currentNotification[x]);
                }
            }
        } else if (changeNotificationX == 5) {
            for (int x = 0; x <= maxIndx; x++) {
                if (!currentNotification[x].equals(notificationLabel5.getText())) {
                    output.println(currentNotification[x]);
                }
            }
        } else if (changeNotificationX == 6) {
            for (int x = 0; x <= maxIndx; x++) {
                if (!currentNotification[x].equals(notificationLabel6.getText())) {
                    output.println(currentNotification[x]);
                }
            }
        } else if (changeNotificationX == 7) {
            for (int x = 0; x <= maxIndx; x++) {
                if (!currentNotification[x].equals(notificationLabel7.getText())) {
                    output.println(currentNotification[x]);
                }
            }
        }

        output.close();
        fw.close();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        notificationLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        upcomingEvents = new javax.swing.JLabel();
        notificationLabel0 = new javax.swing.JLabel();
        notificationLabel1 = new javax.swing.JLabel();
        notificationLabel2 = new javax.swing.JLabel();
        notificationLabel3 = new javax.swing.JLabel();
        notificationLabel4 = new javax.swing.JLabel();
        notificationLabel5 = new javax.swing.JLabel();
        notificationLabel7 = new javax.swing.JLabel();
        close3 = new javax.swing.JButton();
        close2 = new javax.swing.JButton();
        close1 = new javax.swing.JButton();
        close4 = new javax.swing.JButton();
        close5 = new javax.swing.JButton();
        close6 = new javax.swing.JButton();
        close0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Calendar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Weather");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        upcomingEvents.setText("Upcoming Events");

        notificationLabel0.setText("Notification Here");

        close3.setText("dismiss");
        close3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close3ActionPerformed(evt);
            }
        });

        close2.setText("dismiss");
        close2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close2ActionPerformed(evt);
            }
        });

        close1.setText("dismiss");
        close1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close1ActionPerformed(evt);
            }
        });

        close4.setText("dismiss");
        close4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close4ActionPerformed(evt);
            }
        });

        close5.setText("dismiss");
        close5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close5ActionPerformed(evt);
            }
        });

        close6.setText("dismiss");
        close6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close6ActionPerformed(evt);
            }
        });

        close0.setText("dismiss");
        close0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(notificationLabel0, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(close0))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(upcomingEvents)
                        .addGap(29, 29, 29)
                        .addComponent(jButton2)
                        .addGap(37, 37, 37)
                        .addComponent(jButton3))
                    .addComponent(notificationLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(notificationLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(close2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(notificationLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(close3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(notificationLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(close1)
                            .addComponent(close4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(notificationLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(close6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(notificationLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(close5)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(upcomingEvents))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notificationLabel0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close0))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(notificationLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(notificationLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(close2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(notificationLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(close3)))
                    .addComponent(close1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notificationLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notificationLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notificationLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close6))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new CalendarForMonth().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new Weather().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void close0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close0ActionPerformed
        changeNotificationX = 0;
        try {
            // TODO add your handling code here:
            deleteNotification();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        notificationLabel0.setText(notificationLabel1.getText());
        notificationLabel1.setText(notificationLabel2.getText());
        notificationLabel2.setText(notificationLabel3.getText());
        notificationLabel3.setText(notificationLabel4.getText());
        notificationLabel4.setText(notificationLabel5.getText());
        notificationLabel5.setText(notificationLabel6.getText());
        notificationLabel6.setText(notificationLabel7.getText());
        notificationLabel7.setText("");


    }//GEN-LAST:event_close0ActionPerformed

    private void close1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close1ActionPerformed
        // TODO add your handling code here:
        changeNotificationX = 1;
        try {
            // TODO add your handling code here:
            deleteNotification();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        notificationLabel1.setText(notificationLabel2.getText());
        notificationLabel2.setText(notificationLabel3.getText());
        notificationLabel3.setText(notificationLabel4.getText());
        notificationLabel4.setText(notificationLabel5.getText());
        notificationLabel5.setText(notificationLabel6.getText());
        notificationLabel6.setText(notificationLabel7.getText());
        notificationLabel7.setText("");
    }//GEN-LAST:event_close1ActionPerformed

    private void close2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close2ActionPerformed
        // TODO add your handling code here:
        changeNotificationX = 2;
        try {
            // TODO add your handling code here:
            deleteNotification();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        notificationLabel2.setText(notificationLabel3.getText());
        notificationLabel3.setText(notificationLabel4.getText());
        notificationLabel4.setText(notificationLabel5.getText());
        notificationLabel5.setText(notificationLabel6.getText());
        notificationLabel6.setText(notificationLabel7.getText());
        notificationLabel7.setText("");
    }//GEN-LAST:event_close2ActionPerformed

    private void close3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close3ActionPerformed
        // TODO add your handling code here:
        changeNotificationX = 3;
        try {
            // TODO add your handling code here:
            deleteNotification();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        notificationLabel3.setText(notificationLabel4.getText());
        notificationLabel4.setText(notificationLabel5.getText());
        notificationLabel5.setText(notificationLabel6.getText());
        notificationLabel6.setText(notificationLabel7.getText());
        notificationLabel7.setText("");
    }//GEN-LAST:event_close3ActionPerformed

    private void close4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close4ActionPerformed
        // TODO add your handling code here:
        changeNotificationX = 4;
        try {
            // TODO add your handling code here:
            deleteNotification();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        notificationLabel4.setText(notificationLabel5.getText());
        notificationLabel5.setText(notificationLabel6.getText());
        notificationLabel6.setText(notificationLabel7.getText());
        notificationLabel7.setText("");
    }//GEN-LAST:event_close4ActionPerformed

    private void close5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close5ActionPerformed
        // TODO add your handling code here:
        changeNotificationX = 5;
        try {
            // TODO add your handling code here:
            deleteNotification();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        notificationLabel5.setText(notificationLabel6.getText());
        notificationLabel6.setText(notificationLabel7.getText());
        notificationLabel7.setText("");
    }//GEN-LAST:event_close5ActionPerformed

    private void close6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close6ActionPerformed
        // TODO add your handling code here:
        changeNotificationX = 6;
        try {
            // TODO add your handling code here:
            deleteNotification();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        notificationLabel6.setText(notificationLabel7.getText());
        notificationLabel7.setText("");
    }//GEN-LAST:event_close6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        JOptionPane.showMessageDialog(null, "INSERT SPLASH SCREEN HERE", "Message", JOptionPane.ERROR_MESSAGE);
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new MainScreen().setVisible(true);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        File fileLoc = new File("notification.txt");
        String absolutePath = fileLoc.getAbsolutePath();
        //REMEMBER!!! TRY AND GET ABSOLUTE PATH TO WORK IN THE FUTURE

        //System.out.println(absolutePath);

        //FileWriter fw = new FileWriter(fileLoc);
        //PrintWriter output = new PrintWriter(fw);
        //get file writer to get new notification... created
        
        //CURRENTLY THE JButton for dismissing notification has an error. Try to fix in future.
        //ERROR: NotificationLabel6 is MIA (missing in action)
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton close0;
    public javax.swing.JButton close1;
    public javax.swing.JButton close2;
    public javax.swing.JButton close3;
    public javax.swing.JButton close4;
    public javax.swing.JButton close5;
    public javax.swing.JButton close6;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JLabel notificationLabel0;
    public javax.swing.JLabel notificationLabel1;
    public javax.swing.JLabel notificationLabel2;
    public javax.swing.JLabel notificationLabel3;
    public javax.swing.JLabel notificationLabel4;
    public javax.swing.JLabel notificationLabel5;
    public javax.swing.JLabel notificationLabel6;
    public javax.swing.JLabel notificationLabel7;
    public javax.swing.JLabel upcomingEvents;
    // End of variables declaration//GEN-END:variables

}


// https://dzone.com/articles/java-string-format-examples check later for "date and formatting"




//CLICK F6 to start