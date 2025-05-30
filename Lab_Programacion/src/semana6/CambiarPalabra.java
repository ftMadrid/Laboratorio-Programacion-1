/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package semana6;

/**
 *
 * @author ricardomadrid
 */
public class CambiarPalabra extends javax.swing.JFrame {

    int posicion = 0;

    public CambiarPalabra() {
        initComponents();
        labelTexto.setText("Ingrese la palabra #" + (posicion+1) + ":");
        antiguas.setText("");
        nuevas.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloAhorcado = new javax.swing.JLabel();
        labelTexto = new javax.swing.JLabel();
        palabra = new javax.swing.JTextField();
        botonAceptar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        antiguas = new javax.swing.JLabel();
        nuevas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloAhorcado.setFont(new java.awt.Font("Kefa", 1, 24)); // NOI18N
        tituloAhorcado.setText("Cambiar Palabras");

        labelTexto.setText("Ingresa una palabra:");

        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        antiguas.setText("Antiguas");

        nuevas.setText("Nuevas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nuevas)
                    .addComponent(labelTexto)
                    .addComponent(tituloAhorcado)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(volver)
                            .addComponent(palabra, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonAceptar))
                    .addComponent(antiguas))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(tituloAhorcado)
                .addGap(39, 39, 39)
                .addComponent(labelTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(palabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAceptar))
                .addGap(27, 27, 27)
                .addComponent(antiguas)
                .addGap(18, 18, 18)
                .addComponent(nuevas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(volver)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        // TODO add your handling code here:

        String nueva = "";
        for(int i = 0; i<Juego.palabras.length;i++){
            nueva += Juego.palabras[i]+" ";
        }
        
        String[] palabrasAntiguas = Juego.palabras;
        String antigua = "";
        boolean chequeo = false;
        Juego.palabras[posicion] = palabra.getText();
        posicion++;

        if (posicion > 9) {
            botonAceptar.setEnabled(false);
            palabra.setEnabled(false);
            chequeo = true;
        } else {
            labelTexto.setText("Ingrese la palabra #" + (posicion+1) + ":");
        }
        
        for(int i = 0; i<palabrasAntiguas.length;i++){
            antigua += palabrasAntiguas[i]+" ";
        }
        
        if(chequeo){
            antiguas.setText("Palabras Antiguas: "+antigua);
            nuevas.setText("Palabras Nuevas: "+nueva);
        }

    }//GEN-LAST:event_botonAceptarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu();

        dispose();
        menu.setLocationRelativeTo(this);
        menu.setVisible(true);

    }//GEN-LAST:event_volverActionPerformed

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
            java.util.logging.Logger.getLogger(CambiarPalabra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambiarPalabra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambiarPalabra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambiarPalabra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambiarPalabra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel antiguas;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JLabel labelTexto;
    private javax.swing.JLabel nuevas;
    private javax.swing.JTextField palabra;
    private javax.swing.JLabel tituloAhorcado;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
