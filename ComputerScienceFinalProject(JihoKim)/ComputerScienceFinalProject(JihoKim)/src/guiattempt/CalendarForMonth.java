/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiattempt;

import java.io.IOException;
import java.util.Calendar;

/**
 *
 * @author Jiho Kim
	please note that only the basic template for this program has been set out previous
	to creating the program. For more information, feel free to contact me by email at
	jihok1107@gmail.com or by phone at 587-830-6725
 */
public class CalendarForMonth extends javax.swing.JFrame {

    public String calendarLabel = "June";
    public int yearLabel = 2017;
    public int monthNumber = 6;

    /**
     * Creates new form Calendar
     */
    public void getMonth() {
        calendarLabel = month.getText();
    }

    public void getYear() {
        String labelYear = year.getText();
        yearLabel = Integer.parseInt(labelYear);
    }

    private void addYear() {
        yearLabel++;
    }

    private void subtractYear() {
        yearLabel--;
    }

    public CalendarForMonth() {
        initComponents();
        getMonth();
        date.setText("");
        setCalendarDates();

    }

    public static int day(int month, int day, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31 * m) / 12) % 7;
        return d;
        //returns 0 for sunday, 1 for monday, 2 for tuesday, etc.

    }

    // return true if the given year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0)) {
            return true;
        }
        if (year % 400 == 0) {
            return true;
        }
        return false;
    }

    public void setCalendarDates() {
//        Calendar.day(6, 1, 2017);

        int month = 6;    // month (Jan = 1, Dec = 12)

        // months[i] = name of month i
        String[] months = {
            "", // leave empty so that months[1] = "January"
            "January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"
        };

        // days[i] = number of days in month i
        int[] days = {
            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        //System.out.println(days[2]);

        String day[] = new String[6];
        for (int x = 0; x < 6; x++) {
            day[x] = "";
        }

        if (calendarLabel.equals("January")) {
            month = 1;
        }

        if (calendarLabel.equals("February")) {
            month = 2;
        }

        if (calendarLabel.equals("March")) {
            month = 3;
        }

        if (calendarLabel.equals("April")) {
            month = 4;
        }

        if (calendarLabel.equals("May")) {
            month = 5;
        }

        if (calendarLabel.equals("June")) {
            month = 6;
        }

        if (calendarLabel.equals("July")) {
            month = 7;
        }

        if (calendarLabel.equals("August")) {
            month = 8;
        }

        if (calendarLabel.equals("September")) {
            month = 9;
        }

        if (calendarLabel.equals("October")) {
            month = 10;
        }

        if (calendarLabel.equals("November")) {
            month = 11;
        }

        if (calendarLabel.equals("December")) {
            month = 12;
        }

        // check for leap year
        if (month == 2 && isLeapYear(yearLabel)) {
            days[2] = 29;
        }

        //  Returns 0 for Sunday, 1 for Monday, and so forth.
        int dateOfFirstWeek = 8 - (day(monthNumber, 1, yearLabel));

        if (dateOfFirstWeek == 8) {
            dateOfFirstWeek = 1;
        }
        //System.out.println(dateOfFirstWeek);
        //System.out.println("number of days: " + days[month]);

        int firstWeekSetup = 9 - dateOfFirstWeek;

        for (int x = 0; x < firstWeekSetup - 2; x++) {
            day[0] += "                  ";
        }

        // print the calendar
        int i = 1;

        while (i <= (dateOfFirstWeek)) {
            day[0] += (i + "                ");
            i++;
        }

        date.setText(day[0]);

        while (i <= (7 + dateOfFirstWeek) && i > dateOfFirstWeek) {
            if (i < 10) {
                day[1] += (i + "                ");
            } else {
                day[1] += (i + "              ");
            }

            i++;
        }
        date2.setText(day[1]);

        while (i <= (14 + dateOfFirstWeek) && i > (7 + dateOfFirstWeek)) {
            if (i < 10) {
                day[2] += (i + "                ");
            } else {
                day[2] += (i + "              ");
            }

            i++;
        }
        date3.setText(day[2]);

        while (i <= (21 + dateOfFirstWeek) && i > (14 + dateOfFirstWeek)) {
            day[3] += (i + "              ");
            i++;
        }
        date4.setText(day[3]);

        while (i >= (21 + dateOfFirstWeek) && i <= days[month] && i <= (28 + dateOfFirstWeek)) {
            day[4] += (i + "              ");
            i++;
        }
        date5.setText(day[4]);

        while (i >= (28 + dateOfFirstWeek) && i <= days[month]) {
            day[5] += (i + "              ");
            i++;
        }
        date6.setText(day[5]);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        addNewNotification = new javax.swing.JButton();
        back = new javax.swing.JButton();
        monday = new javax.swing.JLabel();
        tuesday = new javax.swing.JLabel();
        wednesday = new javax.swing.JLabel();
        thursday = new javax.swing.JLabel();
        friday = new javax.swing.JLabel();
        saturday = new javax.swing.JLabel();
        sunday = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        yearPlus = new javax.swing.JButton();
        yearMinus = new javax.swing.JButton();
        date = new javax.swing.JLabel();
        month = new javax.swing.JLabel();
        monthMinus = new javax.swing.JButton();
        monthPlus = new javax.swing.JButton();
        date2 = new javax.swing.JLabel();
        date3 = new javax.swing.JLabel();
        date4 = new javax.swing.JLabel();
        date5 = new javax.swing.JLabel();
        date6 = new javax.swing.JLabel();

        jLabel6.setText("Thursday");

        jLabel9.setText("Saturday");

        jLabel10.setText("Saturday");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addNewNotification.setText("new notification");
        addNewNotification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewNotificationActionPerformed(evt);
            }
        });

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        monday.setText("Mon");

        tuesday.setText("Tues");

        wednesday.setText("Wed");

        thursday.setText("Thur");

        friday.setText("Fri");

        saturday.setText("Sat");

        sunday.setText("Sun");

        year.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        year.setText("2017");

        yearPlus.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        yearPlus.setText("+");
        yearPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearPlusActionPerformed(evt);
            }
        });

        yearMinus.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        yearMinus.setText("-");
        yearMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearMinusActionPerformed(evt);
            }
        });

        date.setText("DATE HERE");

        month.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        month.setText("June");

        monthMinus.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        monthMinus.setText("-");
        monthMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthMinusActionPerformed(evt);
            }
        });

        monthPlus.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        monthPlus.setText("+");
        monthPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthPlusActionPerformed(evt);
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
                        .addComponent(addNewNotification)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(monthPlus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(monthMinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(month, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                        .addComponent(yearMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(year)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date6, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(date4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(date3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(date2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                                .addComponent(date5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(monday)
                                    .addGap(49, 49, 49)
                                    .addComponent(tuesday)
                                    .addGap(44, 44, 44)
                                    .addComponent(wednesday)
                                    .addGap(34, 34, 34)
                                    .addComponent(thursday)
                                    .addGap(52, 52, 52)
                                    .addComponent(friday)
                                    .addGap(56, 56, 56)
                                    .addComponent(saturday)
                                    .addGap(47, 47, 47)
                                    .addComponent(sunday))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yearMinus)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(monthMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monthPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(yearPlus)
                                .addComponent(year)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(month)
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monday)
                    .addComponent(tuesday)
                    .addComponent(wednesday)
                    .addComponent(thursday)
                    .addComponent(friday)
                    .addComponent(saturday)
                    .addComponent(sunday))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(date5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(date6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNewNotification)
                    .addComponent(back))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addNewNotificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewNotificationActionPerformed
        try {
            // TODO add your handling code here:

            new NotificationCreator().setVisible(true);

            //new Calendar().setVisible(false);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        dispose();
    }//GEN-LAST:event_addNewNotificationActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new CalendarForMonth().setVisible(false);
        try {
            // apparently this code isn't working since it's creating "new" so figure out how to close tab when clicked.
            new MainScreen().setVisible(true);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void yearMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearMinusActionPerformed
        // TODO add your handling code here:
        subtractYear();
        year.setText("" + yearLabel);
        setCalendarDates();
    }//GEN-LAST:event_yearMinusActionPerformed

    private void yearPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearPlusActionPerformed
        // TODO add your handling code here:
        addYear();
        year.setText("" + yearLabel);
        setCalendarDates();
    }//GEN-LAST:event_yearPlusActionPerformed

    private void monthMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthMinusActionPerformed
        // TODO add your handling code here:
        switch (calendarLabel) {
            case "January": {
                calendarLabel = "December";
                month.setText(calendarLabel);
                monthNumber = 12;
                subtractYear();
                year.setText("" + yearLabel);
                setCalendarDates();
                break;
            }
            case "February": {
                calendarLabel = "January";
                month.setText(calendarLabel);
                monthNumber = 1;
                setCalendarDates();
                break;
            }
            case "March": {
                calendarLabel = "February";
                month.setText(calendarLabel);
                monthNumber = 2;
                setCalendarDates();
                break;
            }
            case "April": {
                calendarLabel = "March";
                month.setText(calendarLabel);
                monthNumber = 3;
                setCalendarDates();
                break;
            }
            case "May": {
                calendarLabel = "April";
                month.setText(calendarLabel);
                monthNumber = 4;
                setCalendarDates();
                break;
            }
            case "June": {
                calendarLabel = "May";
                month.setText(calendarLabel);
                monthNumber = 5;
                setCalendarDates();
                break;
            }
            case "July": {
                calendarLabel = "June";
                month.setText(calendarLabel);
                monthNumber = 6;
                setCalendarDates();
                break;
            }
            case "August": {
                calendarLabel = "July";
                month.setText(calendarLabel);
                monthNumber = 7;
                setCalendarDates();
                break;
            }
            case "September": {
                calendarLabel = "August";
                month.setText(calendarLabel);
                monthNumber = 8;
                setCalendarDates();
                break;
            }
            case "October": {
                calendarLabel = "September";
                month.setText(calendarLabel);
                monthNumber = 9;
                setCalendarDates();
                break;
            }
            case "November": {
                calendarLabel = "October";
                month.setText(calendarLabel);
                monthNumber = 10;
                setCalendarDates();
                break;
            }
            case "December": {
                calendarLabel = "November";
                month.setText(calendarLabel);
                monthNumber = 11;
                setCalendarDates();

            }
        }

    }//GEN-LAST:event_monthMinusActionPerformed

    private void monthPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthPlusActionPerformed
        // TODO add your handling code here:

        switch (calendarLabel) {
            case "January": {
                calendarLabel = "February";
                month.setText(calendarLabel);
                monthNumber = 2;
                setCalendarDates();
                break;
            }
            case "February": {
                calendarLabel = "March";
                month.setText(calendarLabel);
                monthNumber = 3;
                setCalendarDates();
                break;
            }
            case "March": {
                calendarLabel = "April";
                month.setText(calendarLabel);
                monthNumber = 4;
                setCalendarDates();
                break;
            }
            case "April": {
                calendarLabel = "May";
                month.setText(calendarLabel);
                monthNumber = 5;
                setCalendarDates();
                break;
            }
            case "May": {
                calendarLabel = "June";
                month.setText(calendarLabel);
                monthNumber = 6;
                setCalendarDates();
                break;
            }
            case "June": {
                calendarLabel = "July";
                month.setText(calendarLabel);
                monthNumber = 7;
                setCalendarDates();
                break;
            }
            case "July": {
                calendarLabel = "August";
                month.setText(calendarLabel);
                monthNumber = 8;
                setCalendarDates();
                break;
            }
            case "August": {
                calendarLabel = "September";
                month.setText(calendarLabel);
                monthNumber = 9;
                setCalendarDates();
                break;
            }
            case "September": {
                calendarLabel = "October";
                month.setText(calendarLabel);
                monthNumber = 10;
                setCalendarDates();
                break;
            }
            case "October": {
                calendarLabel = "November";
                month.setText(calendarLabel);
                monthNumber = 11;
                setCalendarDates();
                break;
            }
            case "November": {
                calendarLabel = "December";
                month.setText(calendarLabel);
                monthNumber = 12;
                setCalendarDates();
                break;
            }
            case "December": {
                calendarLabel = "January";
                month.setText(calendarLabel);
                monthNumber = 1;
                addYear();
                year.setText("" + yearLabel);
                setCalendarDates();

            }
        }
    }//GEN-LAST:event_monthPlusActionPerformed

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
            java.util.logging.Logger.getLogger(CalendarForMonth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalendarForMonth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalendarForMonth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalendarForMonth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalendarForMonth().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewNotification;
    private javax.swing.JButton back;
    private javax.swing.JLabel date;
    private javax.swing.JLabel date2;
    private javax.swing.JLabel date3;
    private javax.swing.JLabel date4;
    private javax.swing.JLabel date5;
    private javax.swing.JLabel date6;
    private javax.swing.JLabel friday;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel monday;
    private javax.swing.JLabel month;
    private javax.swing.JButton monthMinus;
    private javax.swing.JButton monthPlus;
    private javax.swing.JLabel saturday;
    private javax.swing.JLabel sunday;
    private javax.swing.JLabel thursday;
    private javax.swing.JLabel tuesday;
    private javax.swing.JLabel wednesday;
    private javax.swing.JLabel year;
    private javax.swing.JButton yearMinus;
    private javax.swing.JButton yearPlus;
    // End of variables declaration//GEN-END:variables
}
