/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Lobo
 */
public class Vista_alum extends javax.swing.JFrame {

    /**
     * Creates new form Vista_alumno
     */
    public Vista_alum() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_vista_alum01 = new javax.swing.JButton();
        Button_vista_alum02 = new javax.swing.JButton();
        Button_vista_alum03 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Button_vista_alum01.setText("    Ver notas    ");
        Button_vista_alum01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_vista_alum01MouseClicked(evt);
            }
        });

        Button_vista_alum02.setText("     Ver lista      ");
        Button_vista_alum02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_vista_alum02MouseClicked(evt);
            }
        });

        Button_vista_alum03.setText("Ver profesores");
        Button_vista_alum03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_vista_alum03MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Button_vista_alum03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button_vista_alum02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button_vista_alum01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(Button_vista_alum01)
                .addGap(47, 47, 47)
                .addComponent(Button_vista_alum02)
                .addGap(45, 45, 45)
                .addComponent(Button_vista_alum03)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_vista_alum01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_vista_alum01MouseClicked
        Vista_alum_notas vista_alum_notas = new Vista_alum_notas();
        vista_alum_notas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_vista_alum01MouseClicked

    private void Button_vista_alum02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_vista_alum02MouseClicked
        Vista_alum_lista vista_alum_lista = new Vista_alum_lista();
        vista_alum_lista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_vista_alum02MouseClicked

    private void Button_vista_alum03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_vista_alum03MouseClicked
        Vista_alum_profe vista_alum_profe = new Vista_alum_profe();
        vista_alum_profe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_vista_alum03MouseClicked

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
            java.util.logging.Logger.getLogger(Vista_alum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_alum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_alum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_alum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_alum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_vista_alum01;
    private javax.swing.JButton Button_vista_alum02;
    private javax.swing.JButton Button_vista_alum03;
    // End of variables declaration//GEN-END:variables
}
