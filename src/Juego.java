
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author FP
 */
public class Juego extends javax.swing.JFrame {

    /**
     * Creates new form Juego
     */
    public Juego() {
        initComponents();
    }
    
    //Metodo mostrar panel
     private void mostrarPanel(String nombrePanel) {
        CardLayout card = (CardLayout) jPanelCentral.getLayout();
        card.show(jPanelCentral, nombrePanel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelTitutlo = new javax.swing.JPanel();
        jLTitutlo = new javax.swing.JLabel();
        jLLogo = new javax.swing.JLabel();
        jPanelCentral = new javax.swing.JPanel();
        jPInicio = new javax.swing.JPanel();
        jLImagenfondo3 = new javax.swing.JLabel();
        jPInstrucciones = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPFichas = new javax.swing.JPanel();
        jB50 = new javax.swing.JButton();
        jB1 = new javax.swing.JButton();
        jB100 = new javax.swing.JButton();
        jB25 = new javax.swing.JButton();
        jB500 = new javax.swing.JButton();
        jB1000 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB10 = new javax.swing.JButton();
        jLTituloFichas = new javax.swing.JLabel();
        jLTotal = new javax.swing.JLabel();
        jTTotalComprar = new javax.swing.JTextField();
        jBReiniciar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jPJuego = new javax.swing.JPanel();
        jPanelBotones = new javax.swing.JPanel();
        jBIntrucciones = new javax.swing.JButton();
        jBFichas = new javax.swing.JButton();
        jBJuego = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanelTitutlo.setBackground(new java.awt.Color(0, 0, 0));

        jLTitutlo.setBackground(new java.awt.Color(255, 255, 255));
        jLTitutlo.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLTitutlo.setForeground(new java.awt.Color(255, 255, 255));
        jLTitutlo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitutlo.setText("JUEGO DE LA RULETA CASINO");
        jLTitutlo.setMaximumSize(new java.awt.Dimension(200, 200));
        jLTitutlo.setMinimumSize(new java.awt.Dimension(200, 200));
        jLTitutlo.setPreferredSize(new java.awt.Dimension(113, 40));

        jLLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casi.jpg"))); // NOI18N

        javax.swing.GroupLayout JPanelTitutloLayout = new javax.swing.GroupLayout(JPanelTitutlo);
        JPanelTitutlo.setLayout(JPanelTitutloLayout);
        JPanelTitutloLayout.setHorizontalGroup(
            JPanelTitutloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelTitutloLayout.createSequentialGroup()
                .addComponent(jLLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(jLTitutlo, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
        );
        JPanelTitutloLayout.setVerticalGroup(
            JPanelTitutloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelTitutloLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLTitutlo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(jLLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanelCentral.setBackground(new java.awt.Color(153, 255, 153));
        jPanelCentral.setLayout(new java.awt.CardLayout());

        jLImagenfondo3.setBackground(new java.awt.Color(255, 0, 0));
        jLImagenfondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ruleta8.jpg"))); // NOI18N

        javax.swing.GroupLayout jPInicioLayout = new javax.swing.GroupLayout(jPInicio);
        jPInicio.setLayout(jPInicioLayout);
        jPInicioLayout.setHorizontalGroup(
            jPInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPInicioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLImagenfondo3, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPInicioLayout.setVerticalGroup(
            jPInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPInicioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLImagenfondo3, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelCentral.add(jPInicio, "card5");

        jPInstrucciones.setBackground(new java.awt.Color(0, 0, 0));

        jTextArea1.setBackground(new java.awt.Color(209, 83, 83));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("1. Solo podrás jugar si eres mayor de edad.\n\n2. Para apostar debes tener dinero ingresado en la cuenta previamente.\n\n3. Tienes 37 números posibles (0 al 36). El color verde para el 0, color rojos pares y color negro impares.\n\n4. Si apuestas al rojo o al negro el el dinero x2.\n\n5. Si apuestas una docena (1-12, 13-24, 25-36) el dinero x3..\n\n6. Si apuestas a un número en concreto (0 al 36) el dinero x36.\n\n7. Sólo podrás apostar una opción a la vez. Debes marcar el botón de check para confirmar.\n\n8. Pulsa el botón de salir para terminar el juego.");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Te indicamos las instrucciones del juego");

        javax.swing.GroupLayout jPInstruccionesLayout = new javax.swing.GroupLayout(jPInstrucciones);
        jPInstrucciones.setLayout(jPInstruccionesLayout);
        jPInstruccionesLayout.setHorizontalGroup(
            jPInstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPInstruccionesLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPInstruccionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(272, 272, 272))
        );
        jPInstruccionesLayout.setVerticalGroup(
            jPInstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPInstruccionesLayout.createSequentialGroup()
                .addGroup(jPInstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPInstruccionesLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPInstruccionesLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanelCentral.add(jPInstrucciones, "card3");

        jPFichas.setBackground(new java.awt.Color(102, 102, 102));

        jB50.setBackground(new java.awt.Color(51, 0, 0));
        jB50.setForeground(new java.awt.Color(255, 255, 255));
        jB50.setText("50");
        jB50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB50ActionPerformed(evt);
            }
        });

        jB1.setBackground(new java.awt.Color(204, 204, 204));
        jB1.setForeground(new java.awt.Color(0, 0, 0));
        jB1.setText("1");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB100.setBackground(new java.awt.Color(0, 0, 0));
        jB100.setText("100");
        jB100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB100ActionPerformed(evt);
            }
        });

        jB25.setBackground(new java.awt.Color(0, 102, 0));
        jB25.setForeground(new java.awt.Color(255, 255, 255));
        jB25.setText("25");
        jB25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB25ActionPerformed(evt);
            }
        });

        jB500.setBackground(new java.awt.Color(102, 0, 102));
        jB500.setText("500");
        jB500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB500ActionPerformed(evt);
            }
        });

        jB1000.setBackground(new java.awt.Color(204, 204, 0));
        jB1000.setForeground(new java.awt.Color(0, 0, 0));
        jB1000.setText("1000");
        jB1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1000ActionPerformed(evt);
            }
        });

        jB5.setBackground(new java.awt.Color(255, 51, 51));
        jB5.setForeground(new java.awt.Color(0, 0, 0));
        jB5.setText("5");
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });

        jB10.setBackground(new java.awt.Color(51, 153, 255));
        jB10.setForeground(new java.awt.Color(0, 0, 0));
        jB10.setText("10");
        jB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB10ActionPerformed(evt);
            }
        });

        jLTituloFichas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLTituloFichas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTituloFichas.setText("FICHAS PARA COMPRAR");

        jLTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTotal.setText("Total a comprar:");

        jTTotalComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTotalComprarActionPerformed(evt);
            }
        });

        jBReiniciar.setBackground(new java.awt.Color(0, 0, 0));
        jBReiniciar.setForeground(new java.awt.Color(255, 255, 255));
        jBReiniciar.setText("REINICIAR");
        jBReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBReiniciarActionPerformed(evt);
            }
        });

        jBGuardar.setBackground(new java.awt.Color(0, 0, 0));
        jBGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jBGuardar.setText("GUARDAR");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPFichasLayout = new javax.swing.GroupLayout(jPFichas);
        jPFichas.setLayout(jPFichasLayout);
        jPFichasLayout.setHorizontalGroup(
            jPFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFichasLayout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jLTituloFichas, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPFichasLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPFichasLayout.createSequentialGroup()
                        .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPFichasLayout.createSequentialGroup()
                        .addComponent(jB50, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jB100, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addGroup(jPFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB500, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPFichasLayout.createSequentialGroup()
                        .addComponent(jB25, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))
                    .addGroup(jPFichasLayout.createSequentialGroup()
                        .addComponent(jB1000, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jLTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jTTotalComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFichasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jBReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPFichasLayout.setVerticalGroup(
            jPFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFichasLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLTituloFichas)
                .addGap(53, 53, 53)
                .addGroup(jPFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB25, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFichasLayout.createSequentialGroup()
                        .addGroup(jPFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jB100, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB500, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB1000, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB50, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFichasLayout.createSequentialGroup()
                        .addGroup(jPFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTotal)
                            .addComponent(jTTotalComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))))
        );

        jPanelCentral.add(jPFichas, "card4");

        javax.swing.GroupLayout jPJuegoLayout = new javax.swing.GroupLayout(jPJuego);
        jPJuego.setLayout(jPJuegoLayout);
        jPJuegoLayout.setHorizontalGroup(
            jPJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPJuegoLayout.setVerticalGroup(
            jPJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        jPanelCentral.add(jPJuego, "card5");

        jPanelBotones.setBackground(new java.awt.Color(0, 0, 0));
        jPanelBotones.setLayout(new javax.swing.BoxLayout(jPanelBotones, javax.swing.BoxLayout.Y_AXIS));

        jBIntrucciones.setBackground(new java.awt.Color(0, 0, 0));
        jBIntrucciones.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jBIntrucciones.setForeground(new java.awt.Color(255, 255, 255));
        jBIntrucciones.setText("Pasos");
        jBIntrucciones.setMaximumSize(new java.awt.Dimension(130, 110));
        jBIntrucciones.setMinimumSize(new java.awt.Dimension(130, 23));
        jBIntrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIntruccionesActionPerformed(evt);
            }
        });
        jPanelBotones.add(jBIntrucciones);

        jBFichas.setBackground(new java.awt.Color(186, 30, 30));
        jBFichas.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jBFichas.setText("Fichas");
        jBFichas.setMaximumSize(new java.awt.Dimension(130, 110));
        jBFichas.setMinimumSize(new java.awt.Dimension(130, 23));
        jBFichas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFichasActionPerformed(evt);
            }
        });
        jPanelBotones.add(jBFichas);

        jBJuego.setBackground(new java.awt.Color(0, 0, 0));
        jBJuego.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jBJuego.setForeground(new java.awt.Color(255, 255, 255));
        jBJuego.setText("Juego");
        jBJuego.setMaximumSize(new java.awt.Dimension(130, 110));
        jBJuego.setMinimumSize(new java.awt.Dimension(130, 23));
        jBJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBJuegoActionPerformed(evt);
            }
        });
        jPanelBotones.add(jBJuego);

        jBSalir.setBackground(new java.awt.Color(186, 30, 30));
        jBSalir.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.setMaximumSize(new java.awt.Dimension(130, 110));
        jBSalir.setMinimumSize(new java.awt.Dimension(130, 23));
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        jPanelBotones.add(jBSalir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelTitutlo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelTitutlo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int dinero = 0 ;
    private void jB50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB50ActionPerformed
       dinero = dinero + 50;
       jTTotalComprar.setText(dinero+"");
    }//GEN-LAST:event_jB50ActionPerformed

    private void jB100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB100ActionPerformed
       dinero = dinero + 100;
       jTTotalComprar.setText(dinero+"");
    }//GEN-LAST:event_jB100ActionPerformed

    private void jB25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB25ActionPerformed
       dinero = dinero + 25;
       jTTotalComprar.setText(dinero+"");
    }//GEN-LAST:event_jB25ActionPerformed

    private void jB500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB500ActionPerformed
       dinero = dinero + 500;
       jTTotalComprar.setText(dinero+"");
    }//GEN-LAST:event_jB500ActionPerformed

    private void jB1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1000ActionPerformed
        dinero = dinero + 1000;
       jTTotalComprar.setText(dinero+"");
    }//GEN-LAST:event_jB1000ActionPerformed

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed
       dinero = dinero + 5;
       jTTotalComprar.setText(dinero+"");
    }//GEN-LAST:event_jB5ActionPerformed

    private void jB10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB10ActionPerformed
       dinero = dinero + 10;
       jTTotalComprar.setText(dinero+"");
    }//GEN-LAST:event_jB10ActionPerformed

    private void jBFichasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFichasActionPerformed
        mostrarPanel("card4");
    }//GEN-LAST:event_jBFichasActionPerformed

    private void jBJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBJuegoActionPerformed
        mostrarPanel("card5");
    }//GEN-LAST:event_jBJuegoActionPerformed

    private void jBIntruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIntruccionesActionPerformed
        mostrarPanel("card3");
    }//GEN-LAST:event_jBIntruccionesActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jTTotalComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTotalComprarActionPerformed
       
    }//GEN-LAST:event_jTTotalComprarActionPerformed

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
       dinero = dinero + 1;
       jTTotalComprar.setText(dinero+"");
    }//GEN-LAST:event_jB1ActionPerformed

    private void jBReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBReiniciarActionPerformed
        dinero = 0;
        jTTotalComprar.setText("");
    }//GEN-LAST:event_jBReiniciarActionPerformed

    int totalfichas = 0;
    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        totalfichas = dinero;
        
    }//GEN-LAST:event_jBGuardarActionPerformed

    
    
    
    
 
    
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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
       jLabel1l.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelTitutlo;
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB10;
    private javax.swing.JButton jB100;
    private javax.swing.JButton jB1000;
    private javax.swing.JButton jB25;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB50;
    private javax.swing.JButton jB500;
    private javax.swing.JButton jBFichas;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBIntrucciones;
    private javax.swing.JButton jBJuego;
    private javax.swing.JButton jBReiniciar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLImagenfondo3;
    private javax.swing.JLabel jLLogo;
    private javax.swing.JLabel jLTituloFichas;
    private javax.swing.JLabel jLTitutlo;
    private javax.swing.JLabel jLTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPFichas;
    private javax.swing.JPanel jPInicio;
    private javax.swing.JPanel jPInstrucciones;
    private javax.swing.JPanel jPJuego;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTTotalComprar;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
