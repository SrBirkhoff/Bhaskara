/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baskara;

import javax.swing.ImageIcon;

/**
 *
 * @author Birkhoff
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
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

        jSeparator3 = new javax.swing.JSeparator();
        jres = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rdelta = new javax.swing.JLabel();
        rx1 = new javax.swing.JLabel();
        rx2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        vc = new javax.swing.JSpinner();
        vb = new javax.swing.JSpinner();
        va = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        baoquadrado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        vezesa = new javax.swing.JLabel();
        vezesc = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        menosb = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        raizdedelta = new javax.swing.JLabel();
        duasvezesa = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        btnx = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Equações de 2º Grau :: SrBirkhoff");
        setResizable(false);

        jres.setBackground(new java.awt.Color(197, 197, 197));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(29, 29, 29));
        jLabel5.setText("RESULTADOS");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 3, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 60, 0));
        jLabel7.setText("Valor do Delta: ");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 3, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 60, 0));
        jLabel8.setText("Valor do X ':");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 3, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 60, 0));
        jLabel10.setText("Valor do X '':");

        rdelta.setFont(new java.awt.Font("Ubuntu", 3, 16)); // NOI18N
        rdelta.setForeground(new java.awt.Color(255, 112, 0));
        rdelta.setText("Não Informado.");

        rx1.setFont(new java.awt.Font("Ubuntu", 3, 16)); // NOI18N
        rx1.setForeground(new java.awt.Color(255, 112, 0));
        rx1.setText("Não Informado.");

        rx2.setFont(new java.awt.Font("Ubuntu", 3, 16)); // NOI18N
        rx2.setForeground(new java.awt.Color(255, 112, 0));
        rx2.setText("Não Informado.");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensbitch/05_06_matematica.png"))); // NOI18N

        javax.swing.GroupLayout jresLayout = new javax.swing.GroupLayout(jres);
        jres.setLayout(jresLayout);
        jresLayout.setHorizontalGroup(
            jresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jresLayout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(82, 82, 82)
                .addGroup(jresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rx2)
                    .addComponent(rdelta)
                    .addComponent(rx1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(121, 121, 121))
        );
        jresLayout.setVerticalGroup(
            jresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGroup(jresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jresLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(rdelta))
                        .addGap(18, 18, 18)
                        .addGroup(jresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(rx1))
                        .addGap(18, 18, 18)
                        .addGroup(jresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(rx2)))
                    .addGroup(jresLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel1.setText("Valor A:");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel2.setText("Valor B:");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel3.setText("Valor C:");

        vc.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        vc.setModel(new javax.swing.SpinnerNumberModel(0, -99, 99, 1));
        vc.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                vcStateChanged(evt);
            }
        });

        vb.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        vb.setModel(new javax.swing.SpinnerNumberModel(0, -99, 99, 1));
        vb.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                vbStateChanged(evt);
            }
        });

        va.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        va.setModel(new javax.swing.SpinnerNumberModel(0, -99, 99, 1));
        va.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                vaStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ubuntu", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 28));
        jLabel4.setText("Δ = ");

        baoquadrado.setFont(new java.awt.Font("Ubuntu", 3, 48)); // NOI18N
        baoquadrado.setForeground(new java.awt.Color(1, 1, 1));
        baoquadrado.setText("B² ");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 3, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(1, 1, 1));
        jLabel6.setText("-4.");

        vezesa.setFont(new java.awt.Font("Ubuntu", 3, 48)); // NOI18N
        vezesa.setForeground(new java.awt.Color(1, 1, 1));
        vezesa.setText("A.");

        vezesc.setFont(new java.awt.Font("Ubuntu", 3, 48)); // NOI18N
        vezesc.setForeground(new java.awt.Color(1, 1, 1));
        vezesc.setText("C");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 3, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 28));
        jLabel9.setText("X =");

        menosb.setFont(new java.awt.Font("Ubuntu", 3, 48)); // NOI18N
        menosb.setForeground(new java.awt.Color(0, 7, 9));
        menosb.setText("-B ");

        jLabel11.setFont(new java.awt.Font("Ubuntu", 3, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 7, 9));
        jLabel11.setText("±√ ");

        raizdedelta.setFont(new java.awt.Font("Ubuntu", 3, 48)); // NOI18N
        raizdedelta.setForeground(new java.awt.Color(0, 7, 9));
        raizdedelta.setText("∆");

        duasvezesa.setFont(new java.awt.Font("Ubuntu", 3, 48)); // NOI18N
        duasvezesa.setForeground(new java.awt.Color(0, 7, 9));
        duasvezesa.setText("2.A");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton1.setBackground(new java.awt.Color(255, 82, 0));
        jButton1.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jButton1.setText("Calcular Valor do Delta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnx.setBackground(new java.awt.Color(255, 82, 0));
        btnx.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        btnx.setText("Calcular Valores de X");
        btnx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(va, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(baoquadrado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(vezesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vezesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(40, 40, 40)
                                .addComponent(jSeparator2))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(menosb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(raizdedelta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jSeparator1)
                                        .addGap(13, 13, 13))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(93, 93, 93)
                                        .addComponent(duasvezesa)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(85, 85, 85))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnx, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
            .addComponent(jres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(va)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vb)
                            .addComponent(jLabel3)
                            .addComponent(vc))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(raizdedelta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menosb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(baoquadrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vezesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vezesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(duasvezesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator2))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_vaStateChanged
        // TODO add your handling code here:
        int a = (int) va.getValue();
        vezesa.setText(Integer.toString(a) + ".");
        duasvezesa.setText("2." + Integer.toString(a) + " ");
    }//GEN-LAST:event_vaStateChanged

    private void vbStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_vbStateChanged
        // TODO add your handling code here:
        int b = (int) vb.getValue();
        baoquadrado.setText(Integer.toString(b) + "² ");
        menosb.setText("-" + Integer.toString(Math.abs(b)) + " ");
    }//GEN-LAST:event_vbStateChanged

    private void vcStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_vcStateChanged
        // TODO add your handling code here:
        int c = (int) vc.getValue();
        vezesc.setText(Integer.toString(c) + " ");
    }//GEN-LAST:event_vcStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a = (int) va.getValue();
        int b = (int) vb.getValue();
        int c = (int) vc.getValue();
        
        int bq = (b)*(b);
        int delta = ((bq)-4*(a)*(c));
        rdelta.setText(Integer.toString(delta));
        rx1.setText("Não Informado.");
        rx2.setText("Não Informado.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxActionPerformed
        // TODO add your handling code here:
        int a = (int) va.getValue();
        int b = (int) vb.getValue();
        int c = (int) vc.getValue();
        
        int bq = (b)*(b);
        int delt = ((bq)-4*(a)*(c));
        rdelta.setText(Integer.toString(delt));

        if (delt >= 0) {
            
        int raiz = (int) Math.sqrt(delt);
        
        int x1 = ((b*-1)+raiz)/(2*a);
        rx1.setText(Integer.toString(x1));
        
        int x2 = ((b*-1)-raiz)/(2*a);
        rx2.setText(Integer.toString(x2));
        } else {
            rx1.setText("Delta Sem Raiz Quadrada Válida");
            rx2.setText("Delta Sem Raiz Quadrada Válida");
        }
        
    }//GEN-LAST:event_btnxActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel baoquadrado;
    private javax.swing.JButton btnx;
    private javax.swing.JLabel duasvezesa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel jres;
    private javax.swing.JLabel menosb;
    private javax.swing.JLabel raizdedelta;
    private javax.swing.JLabel rdelta;
    private javax.swing.JLabel rx1;
    private javax.swing.JLabel rx2;
    private javax.swing.JSpinner va;
    private javax.swing.JSpinner vb;
    private javax.swing.JSpinner vc;
    private javax.swing.JLabel vezesa;
    private javax.swing.JLabel vezesc;
    // End of variables declaration//GEN-END:variables

    private double bq(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double sqrt(int delt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
