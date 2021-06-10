package calculator;
public class Calculadora extends javax.swing.JFrame {
    public float num1;
    public float num2;
    public String op;
    public Calculadora() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSuma = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnExponencial = new javax.swing.JButton();
        btnPorcentaje = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnIgual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(248, 238, 231));

        txtOperacion.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(93, 85, 85));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtResultado.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(93, 85, 85));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOperacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSuma.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(93, 85, 85));
        btnSuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1.png"))); // NOI18N
        btnSuma.setText("+");
        btnSuma.setFocusPainted(false);
        btnSuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSuma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1press.png"))); // NOI18N
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 50, 50));

        btnPunto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btnPunto.setForeground(new java.awt.Color(93, 85, 85));
        btnPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn2.png"))); // NOI18N
        btnPunto.setText(".");
        btnPunto.setFocusPainted(false);
        btnPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPunto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1.png"))); // NOI18N
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        jPanel2.add(btnPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 50, 50));

        btnExponencial.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnExponencial.setForeground(new java.awt.Color(93, 85, 85));
        btnExponencial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1.png"))); // NOI18N
        btnExponencial.setText("x²");
        btnExponencial.setFocusPainted(false);
        btnExponencial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExponencial.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1press.png"))); // NOI18N
        btnExponencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExponencialActionPerformed(evt);
            }
        });
        jPanel2.add(btnExponencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 50, 50));

        btnPorcentaje.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnPorcentaje.setForeground(new java.awt.Color(93, 85, 85));
        btnPorcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1.png"))); // NOI18N
        btnPorcentaje.setText("<");
        btnPorcentaje.setFocusPainted(false);
        btnPorcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPorcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1press.png"))); // NOI18N
        btnPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(btnPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 50, 50));

        btnResta.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        btnResta.setForeground(new java.awt.Color(93, 85, 85));
        btnResta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1.png"))); // NOI18N
        btnResta.setText("-");
        btnResta.setFocusPainted(false);
        btnResta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1press.png"))); // NOI18N
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        jPanel2.add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 50, 50));

        btnMultiplicacion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btnMultiplicacion.setForeground(new java.awt.Color(93, 85, 85));
        btnMultiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1.png"))); // NOI18N
        btnMultiplicacion.setText("x");
        btnMultiplicacion.setFocusPainted(false);
        btnMultiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMultiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1press.png"))); // NOI18N
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });
        jPanel2.add(btnMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 50, 50));

        btnDivision.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(93, 85, 85));
        btnDivision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1.png"))); // NOI18N
        btnDivision.setText("/");
        btnDivision.setFocusPainted(false);
        btnDivision.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDivision.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1press.png"))); // NOI18N
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        jPanel2.add(btnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 50, 50));

        btnBorrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(93, 85, 85));
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1.png"))); // NOI18N
        btnBorrar.setText("C");
        btnBorrar.setFocusPainted(false);
        btnBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBorrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1press.png"))); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        btn6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btn6.setForeground(new java.awt.Color(93, 85, 85));
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn2.png"))); // NOI18N
        btn6.setText("6");
        btn6.setFocusPainted(false);
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1.png"))); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 50, 50));

        btn3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(93, 85, 85));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn2.png"))); // NOI18N
        btn3.setText("3");
        btn3.setFocusPainted(false);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1.png"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 50, 50));

        btn8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btn8.setForeground(new java.awt.Color(93, 85, 85));
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn2.png"))); // NOI18N
        btn8.setText("8");
        btn8.setFocusPainted(false);
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1.png"))); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 50, 50));

        btn5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btn5.setForeground(new java.awt.Color(93, 85, 85));
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn2.png"))); // NOI18N
        btn5.setText("5");
        btn5.setFocusPainted(false);
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1.png"))); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 50, 50));

        btn2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(93, 85, 85));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn2.png"))); // NOI18N
        btn2.setText("2");
        btn2.setFocusPainted(false);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1.png"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 50, 50));

        btn7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btn7.setForeground(new java.awt.Color(93, 85, 85));
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn2.png"))); // NOI18N
        btn7.setText("7");
        btn7.setFocusPainted(false);
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1.png"))); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 50, 50));

        btn1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(93, 85, 85));
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn2.png"))); // NOI18N
        btn1.setText("1");
        btn1.setFocusPainted(false);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1.png"))); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 50, 50));

        btn9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btn9.setForeground(new java.awt.Color(93, 85, 85));
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn2.png"))); // NOI18N
        btn9.setText("9");
        btn9.setFocusPainted(false);
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1.png"))); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 50, 50));

        btn4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btn4.setForeground(new java.awt.Color(93, 85, 85));
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn2.png"))); // NOI18N
        btn4.setText("4");
        btn4.setFocusPainted(false);
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1.png"))); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 50, 50));

        btn0.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btn0.setForeground(new java.awt.Color(93, 85, 85));
        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn2.png"))); // NOI18N
        btn0.setText("0");
        btn0.setFocusPainted(false);
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1.png"))); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 50, 50));

        jLabel2.setText("(灬º‿º灬)");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 50, -1));

        btnIgual.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn3.png"))); // NOI18N
        btnIgual.setText("=");
        btnIgual.setFocusPainted(false);
        btnIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIgual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/btn1press.png"))); // NOI18N
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        jPanel2.add(btnIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 330, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        this.num2=Float.parseFloat(this.txtResultado.getText());
        
        switch(this.op){
            case "+":this.txtResultado.setText(zero(this.num1+this.num2));break;
            case "-":this.txtResultado.setText(zero(this.num1-this.num2));break;
            case "*":this.txtResultado.setText(zero(this.num1*this.num2));break;
            case "/":if(this.num2==0){ this.txtResultado.setText("ERROR");}
            else{
                this.txtResultado.setText(zero(this.num1/this.num2));}break;
        }
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentajeActionPerformed
        String texto =txtResultado.getText().substring(0,txtResultado.getText().length()-1);
        txtResultado.setText(texto);
    }//GEN-LAST:event_btnPorcentajeActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        this.txtResultado.setText(this.txtResultado.getText()+"0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        this.txtResultado.setText(this.txtResultado.getText()+"1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        this.txtResultado.setText(this.txtResultado.getText()+"2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
       this.txtResultado.setText(this.txtResultado.getText()+"3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        this.txtResultado.setText(this.txtResultado.getText()+"4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        this.txtResultado.setText(this.txtResultado.getText()+"5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        this.txtResultado.setText(this.txtResultado.getText()+"6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        this.txtResultado.setText(this.txtResultado.getText()+"7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        this.txtResultado.setText(this.txtResultado.getText()+"8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        this.txtResultado.setText(this.txtResultado.getText()+"9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        this.txtResultado.setText(" ");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        this.num1=Float.parseFloat(this.txtResultado.getText());
        this.op="+";
        this.txtResultado.setText(" ");
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        this.num1=Float.parseFloat(this.txtResultado.getText());
        this.op="-";
        this.txtResultado.setText(" ");
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        this.num1=Float.parseFloat(this.txtResultado.getText());
        this.op="*";
        this.txtResultado.setText(" ");
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        this.num1=Float.parseFloat(this.txtResultado.getText());
        this.op="/";
        this.txtResultado.setText(" ");
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        if(!(this.txtResultado.getText().contains("."))){
            this.txtResultado.setText(this.txtResultado.getText()+".");
        }
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnExponencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExponencialActionPerformed
        this.num1 = Float.parseFloat(txtResultado.getText());
        this.num1 *=num1;
        this.txtResultado.setText(String.valueOf(num1));
    }//GEN-LAST:event_btnExponencialActionPerformed

    public String zero (float txtResultado){
         String retorno="";
         retorno=Float.toString(txtResultado);
         if(txtResultado%1==0){
             retorno=retorno.substring(0,retorno.length()-2);
         }
         
         return retorno;
    }
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnExponencial;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnPorcentaje;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
