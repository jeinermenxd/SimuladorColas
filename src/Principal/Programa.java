/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Algoritmos.Algoritmos;
import javax.swing.JLabel;
import tadCola.Cola;
import tadCola.TadCola;
import algoritmos.AlgoritmosColas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import tadCola.ColaVacia;

/*
 * @Autores: Jamilee Jaramillo - Duyar Aranda - Jeiner Mendieta - Diego del Pezo
 * @Grupo: 9 
 * @Tema: Proyecto de Simulación gráfica de la atención a clientes en un restaurante
 * @Fecha:
 */
public class Programa extends javax.swing.JFrame {

    @SuppressWarnings("FieldMayBeFinal")
    private List<JLabel> Persona;
    private List<JLabel> Mesa;

    int Indice;
    int p = 0;
    static JLabel h;
    int x = 0;
    int i = 5;
    int con = 0;
    int con2 = 0;

    static Cola<Persona> ingreso = new TadCola<>("Sin reservacion");
    static Cola<Persona> reserva = new TadCola<>("Reserva");
    static Cola<Mesa> mesaReservada = new TadCola<>("Mesas Reservadas");
    static Cola<Mesa> mesaNo = new TadCola<>("Mesas");
    static Cola<Persona> AtendidosPR = new TadCola<>("Atendidos RESERVA  ");
    static Cola<Persona> AtendidosPN = new TadCola<>("Atendidos SIN RESERVA");

    static Persona persona;
    public Mesa mesa;
    public Mesa mesa2;
    public Mesa mesa3;
    public Mesa mesaR;
    public Mesa mesaR2;
    static boolean EstadoColaVacia = true;

    /**
     * Metodo para crear verdadero o falso
     *
     * @return true si 0 o false
     */
    public static boolean aleatorioBoleano() {
        int dato = 0;
        dato = Algoritmos.aleatorio(0, 1);
        if (dato == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo que genera personas el cual si reserva pasa a colar reserva y si
     * es normal pasa a la cola ingreso
     *
     * @param image para darle una imagen
     */
    public void GenerarP(JLabel image) {
        if (aleatorioBoleano() == true) {
            image.setBounds(120, 150, 72, 150);
            persona = new Persona(Algoritmos.cedulaAleatorio(), Algoritmos.aleatorio(15, 40), "Reserva", image);
        } else {
            image.setBounds(120, 300, 72, 150);
            persona = new Persona(Algoritmos.cedulaAleatorio(), Algoritmos.aleatorio(15, 40), "Normal", image);
        }
        if (persona.getEstado().equals("Reserva")) {
            reserva.encolar(persona);
        } else {
            ingreso.encolar(persona);
        }
    }
    /**
     * Metodo de de creacion de MesaReservacion y mesa sin reserva
     */
    public void MesaReservacion() {
        mesaR = new Mesa("Reservada", 1, Mesa_Reserva);
        mesaR2 = new Mesa("Reservada", 2, Mesa_Reserva2);
        mesa = new Mesa("Sin Reserva", 3, Mesa1);
        mesa2 = new Mesa("Sin Reserva", 4, Mesa2);
        mesa3 = new Mesa("Sin Reserva", 5, Mesa3);

        mesaReservada.encolar(mesaR);
        mesaReservada.encolar(mesaR2);
        mesaNo.encolar(mesa);
        mesaNo.encolar(mesa2);
        mesaNo.encolar(mesa3);

        mesaReservada.imprimirCola();
        mesaNo.imprimirCola();
    }

    /**
     * Metodo para crear imagenes aleatoria y asignarlas
     */
    public void InsertarImagens() {
        ImageIcon imagen = new ImageIcon("");
        for (int i = 1; i <= 10; i++) {
            int random;
            random = Algoritmos.aleatorio(0, 3);
            if (random == 0) {
                imagen = new ImageIcon("D:\\Netbe\\ED2021-2-EstructurasDeDatos\\src\\Recursos\\PERSONA 1 PEQUEÑA.png");
            }
            if (random == 1) {
                imagen = new ImageIcon("D:\\Netbe\\ED2021-2-EstructurasDeDatos\\src\\Recursos\\PERSONA 2 PEQUEÑO.png");
            }
            if (random == 2) {
                imagen = new ImageIcon("D:\\Netbe\\ED2021-2-EstructurasDeDatos\\src\\Recursos\\PERSONA 4 PEQUEÑO.png");
            }
            if (random == 3) {
                imagen = new ImageIcon("D:\\Netbe\\ED2021-2-EstructurasDeDatos\\src\\Recursos\\PERSONA3PEQUEÑA.png");
            }
            h = new JLabel("" + Indice, JLabel.CENTER);
            h.setIcon(imagen);
            jPanel2.add(h);
            GenerarP(h);
            Persona.add(h);
            Indice++;
            jPanel2.revalidate();

        }
    }
    /**
     * Creates new form Programa
     */
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Programa() {
        initComponents();

        Persona = new ArrayList<>();
        Indice = 0;
        jPanel2.setLayout(null);

        MesaReservacion();

    }

    /**
     * Jlabel para la mesa reserva
     *
     * @return Mesa_Reserva
     */
    public JLabel getMesa_Reserva() {
        return Mesa_Reserva;
    }

    /**
     * Jlabel para la mesa reserva 2
     *
     * @return Mesa_Reserva2
     */
    public JLabel getMesa_Reserva2() {
        return Mesa_Reserva2;
    }

    /**
     * Jlabel para las mesas normales
     *
     * @return Mesa1
     */
    public JLabel getMesa1() {
        return Mesa1;
    }

    /**
     * Jlabel para las mesas normales
     *
     * @return Mesa2
     */
    public JLabel getMesa2() {
        return Mesa2;
    }

    /**
     * Jlabel para las mesas normales
     *
     * @return Mesa3
     */
    public JLabel getMesa3() {
        return Mesa3;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Mesa_Reserva = new javax.swing.JLabel();
        Mesa1 = new javax.swing.JLabel();
        Mesa3 = new javax.swing.JLabel();
        Mesa_Reserva2 = new javax.swing.JLabel();
        Mesa2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Restaurant"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 126, 46));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mesa_Reserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Mesa_opt.png"))); // NOI18N
        jPanel2.add(Mesa_Reserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        Mesa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Mesa_opt.png"))); // NOI18N
        jPanel2.add(Mesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        Mesa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Mesa_opt.png"))); // NOI18N
        jPanel2.add(Mesa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        Mesa_Reserva2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Mesa_opt.png"))); // NOI18N
        jPanel2.add(Mesa_Reserva2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, -1, -1));

        Mesa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Mesa_opt.png"))); // NOI18N
        jPanel2.add(Mesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, -1));

        jLabel1.setText("PERSONAS RESERVA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel2.setText("PERSONAS NORMALES");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, 10));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/PERSONA 1 PEQUEÑA.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/PERSONA 2 PEQUEÑO.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/PERSONA3PEQUEÑA.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/PERSONA 2 PEQUEÑO.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/PERSONA 4 PEQUEÑO.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/PERSONA 1 PEQUEÑA.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 750, 490));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setText("COMENZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 90, -1, 43));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setText("MOSTRAR RESULTADO FINAL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, -1, 41));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Sirve para cerrar el progragrama
     *
     * @param evt
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    /**
     * El boton sirve para encolar las personas , luego mandarlas a la mesa para
     * luego desencolarlas
     *
     * @param evt
     */
    @SuppressWarnings("SleepWhileInLoop")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);

        InsertarImagens();

        int PN = AlgoritmosColas.contarCola(ingreso);
        int PR = AlgoritmosColas.contarCola(reserva);
        reserva.imprimirCola();

        for (int i = 0; i < PR; i++) {
            if (reserva != null && mesaReservada != null) {
                try {
                    Persona In = reserva.desencolar();
                    Mesa Me = mesaReservada.desencolar();//aqui se desencola una mesa
                    if (Me.getEstado().equals("Reservada")) {
                        In.getPersonass().setBounds(Me.getMesass().getLocation().x - 75, Me.getMesass().getLocation().y, 72, 150);
                        try {
                            Me.setEstado("Ocupado");
                            con++;
                            Thread.sleep(2 * 1000);
                            /*if (In.getPersonass()==(In.getPersonass())){
                     In.getPersonass().setVisible(false);
                    }*/
                            Me.setEstado("Reservada");
                            mesaReservada.encolar(Me);
                            AtendidosPR.encolar(In);
                        } catch (InterruptedException e) {
                        }
                    } else {
                        reserva.encolar(In);
                    }
                } catch (ColaVacia ex) {
                }
            }
        }
        ingreso.imprimirCola();
        for (int i = 0; i < PN; i++) {
            if (ingreso != null && mesaNo != null) {
                try {
                    Persona In = ingreso.desencolar();
                    Mesa Me = mesaNo.desencolar();//aqui se desencola una mesa
                    if (Me.getEstado().equals("Sin Reserva")) {
                        In.getPersonass().setBounds(Me.getMesass().getLocation().x - 75, Me.getMesass().getLocation().y, 72, 150);
                        try {
                            Me.setEstado("Ocupado");
                            con2++;
                            In.getPersonass().repaint();
                            In.getPersonass().revalidate();
                            Thread.sleep(2 * 800);
                            /*if (In.getPersonass()==(In.getPersonass())){
                     In.getPersonass().setVisible(false);
                    }*/
                            Me.setEstado("Sin Reserva");
                            mesaNo.encolar(Me);
                            AtendidosPN.encolar(In);
                        } catch (InterruptedException ex) {
                        }
                    } else {
                        ingreso.encolar(In);
                    }
                } catch (ColaVacia ex) {
                }
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Nos muestra cuantas personas han entrado a la mesa
     *
     * @param evt
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Personas de Mesas con Reserva :" + con);
        JOptionPane.showMessageDialog(null, "Personas de Mesas Normales :" + con2);

    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("Convert2Lambda")
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Programa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mesa1;
    private javax.swing.JLabel Mesa2;
    private javax.swing.JLabel Mesa3;
    private javax.swing.JLabel Mesa_Reserva;
    private javax.swing.JLabel Mesa_Reserva2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
