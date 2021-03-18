// Сделать чтоб отдельно прописывалась каждая строчка


package sea.javase.lab05;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Form1 extends javax.swing.JFrame {

    public Form1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Text = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Word = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton_Pazdr = new javax.swing.JButton();
        jButton_Fam_Clear = new javax.swing.JButton();
        jButton_Gel_Clear = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jEditorPane_Vivod = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Работа со строками в Java");
        setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        setResizable(false);
        getContentPane().setLayout(null);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTextArea_Text.setBackground(new java.awt.Color(204, 204, 255));
        jTextArea_Text.setColumns(20);
        jTextArea_Text.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextArea_Text.setLineWrap(true);
        jTextArea_Text.setRows(5);
        jTextArea_Text.setText("Я сделал программу $\nИ она $");
        jTextArea_Text.setWrapStyleWord(true);
        jTextArea_Text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jTextArea_Text);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 316, 180);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea_Word.setBackground(new java.awt.Color(255, 204, 204));
        jTextArea_Word.setColumns(20);
        jTextArea_Word.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextArea_Word.setLineWrap(true);
        jTextArea_Word.setRows(5);
        jTextArea_Word.setText("на Java\nработает\n");
        jTextArea_Word.setWrapStyleWord(true);
        jTextArea_Word.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(jTextArea_Word);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(340, 30, 390, 180);

        jLabel1.setText("Текст");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 240, 14);

        jLabel2.setText("Слова из текста :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, 10, 200, 14);

        jButton_Pazdr.setText("Вывод текста");
        jButton_Pazdr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PazdrActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Pazdr);
        jButton_Pazdr.setBounds(560, 540, 170, 23);

        jButton_Fam_Clear.setText("Очистка");
        jButton_Fam_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Fam_ClearActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Fam_Clear);
        jButton_Fam_Clear.setBounds(191, 220, 140, 23);

        jButton_Gel_Clear.setText("Очистка");
        jButton_Gel_Clear.setToolTipText("");
        jButton_Gel_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Gel_ClearActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Gel_Clear);
        jButton_Gel_Clear.setBounds(591, 220, 130, 23);

        jEditorPane_Vivod.setEditable(false);
        jEditorPane_Vivod.setBackground(new java.awt.Color(255, 255, 153));
        jEditorPane_Vivod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jEditorPane_Vivod.setContentType("text/html"); // NOI18N
        jEditorPane_Vivod.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jEditorPane_Vivod.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 8\">\r\n      \r\n    </p>\r\n  </body>\r\n</html>\r\n");
        jEditorPane_Vivod.setToolTipText("");
        jScrollPane4.setViewportView(jEditorPane_Vivod);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(10, 260, 720, 270);

        setSize(new java.awt.Dimension(762, 618));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_PazdrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PazdrActionPerformed
        // Нажатие кнопки поздравить
        ArrayList<String> word = new ArrayList<>(); // Массив слов из текста
        ArrayList<String> text = new ArrayList<>();   // Массив текста
        
        jEditorPane_Vivod.setText(null); // Очищаем область поздравлений
        
        // Заполнение массива персон
        try { // Проверка введенных пользователем фамилий
            for (int i = 0; i < jTextArea_Text.getLineCount(); i++) {
                int start = jTextArea_Text.getLineStartOffset(i);
                int end = jTextArea_Text.getLineEndOffset(i);
                // Проверяем является ли строка пустой (== - не работает)
                String line = jTextArea_Text.getText(start, end - start).trim();
                if (line.equals("")) { continue; }
                text.add(line); // добавление фамилии в массив
            }
        } catch (Exception ex) { JOptionPane.showMessageDialog(rootPane, "Ошибка чтения текста", 
                "Ошибка данных", JOptionPane.ERROR_MESSAGE);
            return; // Выход
        }

        // Заполнение массива пожеланий
        try { // Проверка введенных пользователем пожеланий
            for (int i = 0; i < jTextArea_Word.getLineCount(); i++) {
                int start = jTextArea_Word.getLineStartOffset(i);
                int end = jTextArea_Word.getLineEndOffset(i);
                // Проверяем является ли строка пустой ("==" - не работает)
                String line = jTextArea_Word.getText(start, end - start).trim();
                if (line.equals("")) { continue; }
                // Добавление поздравления в массив
                word.add(line); 
            }
        } catch (Exception ex) { JOptionPane.showMessageDialog(rootPane, "Ошибка чтения пожеланий", 
                "Ошибка данных", JOptionPane.ERROR_MESSAGE);
            return; // Выход
        }
        
        // Проверка количества поздравлений
   //     if (text.size() > word.size()) { // Если фамилий больше чем поздравлений
    //        JOptionPane.showMessageDialog(rootPane, 
     //               "Пожеланий на всех не хватит!", 
     //               "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
     //       return;
     //   }

        StringBuilder s = new StringBuilder("<p align=\"center\"><cite><b><font size=\"5\">");
        try { // ПОЗДРАВЛЯЕМ ВСЕХ ПЕРСОН !!!
            for (int i = 0; i < text.size(); i++) {
                // Генерируем случайное число в диапазоне от 0 до длины массива поздравлений
            //    int p = (int) Math.floor(Math.random() * word.size()); 
    //Реализация варианта           
                String ss = text.get(i);
                System.out.println(ss);
               
                text.set(i,ss.replace("$",word.get(i).toString().toLowerCase()));
                System.out.println(text.get(i));
    // Генерация поздравления            
                s.append(" <font color=\"990505\">" + "<br>" + " " + text.get(i)+"</font>" +"");  //добавляем символ перехода на новую строку
      //          word.remove(p); // Удаляем элемент с индексом р из массива поздравлений
            }
            
        } catch (Exception ex) { JOptionPane.showMessageDialog(rootPane, "Ошибка генерации поздравления", 
                "Ошибка чтения", JOptionPane.ERROR_MESSAGE);
        }
        s.append("<br>");
        jEditorPane_Vivod.setText(s.toString());
    }//GEN-LAST:event_jButton_PazdrActionPerformed

    private void jButton_Fam_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Fam_ClearActionPerformed
        // Очистка списка фамилий
        jTextArea_Text.setText(null);
    }//GEN-LAST:event_jButton_Fam_ClearActionPerformed

    private void jButton_Gel_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Gel_ClearActionPerformed
        // Очистка списка поздравлений
        jTextArea_Word.setText(null);
    }//GEN-LAST:event_jButton_Gel_ClearActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Fam_Clear;
    private javax.swing.JButton jButton_Gel_Clear;
    private javax.swing.JButton jButton_Pazdr;
    private javax.swing.JEditorPane jEditorPane_Vivod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea_Text;
    private javax.swing.JTextArea jTextArea_Word;
    // End of variables declaration//GEN-END:variables
}
