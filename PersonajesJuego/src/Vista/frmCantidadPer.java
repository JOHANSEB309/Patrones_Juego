/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Johan Fontecha, Diana Ferraro, Andres Quintero
 */
public class frmCantidadPer extends javax.swing.JFrame {

    /**
     * Creates new form frmCantidadPer
     */
    public frmCantidadPer() {
        initComponents();
        txtCantidad.setHorizontalAlignment((int) CENTER_ALIGNMENT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jblPersonaje = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextArea();
        jblPergamino = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jblEscoja = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        jblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jblPersonaje.setBackground(new java.awt.Color(220, 213, 203));
        jblPersonaje.setFont(new java.awt.Font("Papyrus", 1, 28)); // NOI18N
        jblPersonaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblPersonaje.setToolTipText("");
        jblPersonaje.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jblPersonaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jblPersonaje.setOpaque(true);
        jblPersonaje.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jblPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 160, 260));

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver.png"))); // NOI18N
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, 130, -1));

        txtDescripcion.setEditable(false);
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        txtDescripcion.setRows(5);
        txtDescripcion.setOpaque(false);
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 290, 320));

        jblPergamino.setBackground(new java.awt.Color(220, 213, 203));
        jblPergamino.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jblPergamino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pergamino.png"))); // NOI18N
        jblPergamino.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jblPergamino, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 410, 480));

        txtCantidad.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 230, 90, 40));

        jblEscoja.setBackground(new java.awt.Color(220, 213, 203));
        jblEscoja.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jblEscoja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblEscoja.setText("Escoja la cantidad de ");
        jblEscoja.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jblEscoja.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jblEscoja.setOpaque(true);
        jPanel1.add(jblEscoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, 290, 110));

        btnContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Continuar.png"))); // NOI18N
        jPanel1.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 550, 150, 60));

        jblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoCant.jpg"))); // NOI18N
        jblFondo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jblFondo.setPreferredSize(new java.awt.Dimension(1200, 674));
        jPanel1.add(jblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getJblPersonaje() {
        return jblPersonaje;
    }

    public void setJblPersonaje(JLabel jblPersonaje) {
        this.jblPersonaje = jblPersonaje;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public void setBtnVolver(JButton btnVolver) {
        this.btnVolver = btnVolver;
    }

    public JTextArea getTxtDescripcion() {
        return txtDescripcion;
    }

    public void setTxtDescripcion(JTextArea txtDescripcion) {
        this.txtDescripcion = txtDescripcion;
    }

    public JLabel getJblEscoja() {
        return jblEscoja;
    }

    public void setJblEscoja(JLabel jblEscoja) {
        this.jblEscoja = jblEscoja;
    }

    public JTextField getTxtCantidad() {
        return txtCantidad;
    }

    public void setTxtCantidad(JTextField txtCantidad) {
        this.txtCantidad = txtCantidad;
    }

    public JButton getBtnContinuar() {
        return btnContinuar;
    }

    public void setBtnContinuar(JButton btnContinuar) {
        this.btnContinuar = btnContinuar;
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jblEscoja;
    private javax.swing.JLabel jblFondo;
    private javax.swing.JLabel jblPergamino;
    private javax.swing.JLabel jblPersonaje;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables
}