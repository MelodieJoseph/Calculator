
package calculatorproject;


public class CalculatorFrame extends javax.swing.JFrame {

    Model model = new Model();

    public CalculatorFrame() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        msgMessage = new javax.swing.JOptionPane();
        bgrRadiansDegrees = new javax.swing.ButtonGroup();
        bgrFont = new javax.swing.ButtonGroup();
        bgrSize = new javax.swing.ButtonGroup();
        panBasic = new javax.swing.JPanel();
        txtOutput = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btnReciprocal = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnPowerOf = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnPlusMinus = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnFactorial = new javax.swing.JButton();
        btnClearAll = new javax.swing.JButton();
        btnClearEntry = new javax.swing.JButton();
        panExtended = new javax.swing.JPanel();
        radDegrees = new javax.swing.JRadioButton();
        radRadians = new javax.swing.JRadioButton();
        btnSin = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();
        btnPI = new javax.swing.JButton();
        btnAsin = new javax.swing.JButton();
        btnAcos = new javax.swing.JButton();
        btnAtan = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuView = new javax.swing.JMenu();
        chkBasic = new javax.swing.JCheckBoxMenuItem();
        chkExtended = new javax.swing.JCheckBoxMenuItem();
        mnuFont = new javax.swing.JMenu();
        chkPlain = new javax.swing.JCheckBoxMenuItem();
        chkBold = new javax.swing.JCheckBoxMenuItem();
        mnuRound = new javax.swing.JMenu();
        mnu0 = new javax.swing.JMenuItem();
        mnu1 = new javax.swing.JMenuItem();
        mnu2 = new javax.swing.JMenuItem();
        mnu3 = new javax.swing.JMenuItem();
        mnu4 = new javax.swing.JMenuItem();
        mnu5 = new javax.swing.JMenuItem();
        mnu6 = new javax.swing.JMenuItem();
        mnu7 = new javax.swing.JMenuItem();
        mnu8 = new javax.swing.JMenuItem();
        mnu9 = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();
        mnuHotkeys = new javax.swing.JMenuItem();
        mnuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CpCalculator");

        txtOutput.setText("0.0");

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnMultiply.setText("*");
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });

        btnReciprocal.setText("1/x");
        btnReciprocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReciprocalActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btnPowerOf.setText("x^n");
        btnPowerOf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPowerOfActionPerformed(evt);
            }
        });

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnPlusMinus.setText("+/-");
        btnPlusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusMinusActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnDot.setText(".");
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });

        btnEquals.setText("=");
        btnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualsActionPerformed(evt);
            }
        });

        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btnFactorial.setText("x!");
        btnFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactorialActionPerformed(evt);
            }
        });

        btnClearAll.setText("CA");
        btnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllActionPerformed(evt);
            }
        });

        btnClearEntry.setText("CE");
        btnClearEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearEntryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBasicLayout = new javax.swing.GroupLayout(panBasic);
        panBasic.setLayout(panBasicLayout);
        panBasicLayout.setHorizontalGroup(
            panBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBasicLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBasicLayout.createSequentialGroup()
                        .addComponent(btn7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPlus, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBasicLayout.createSequentialGroup()
                        .addGroup(panBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panBasicLayout.createSequentialGroup()
                                .addComponent(btn1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMultiply, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                            .addGroup(panBasicLayout.createSequentialGroup()
                                .addComponent(btn4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDivision, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPowerOf)
                            .addComponent(btnReciprocal, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)))
                    .addGroup(panBasicLayout.createSequentialGroup()
                        .addGroup(panBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnClearAll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panBasicLayout.createSequentialGroup()
                                .addComponent(btn0)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDot)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panBasicLayout.createSequentialGroup()
                                .addComponent(btnEquals)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMinus, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                            .addComponent(btnClearEntry, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panBasicLayout.setVerticalGroup(
            panBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBasicLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3)
                    .addComponent(btnMultiply)
                    .addComponent(btnReciprocal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4)
                    .addComponent(btn5)
                    .addComponent(btn6)
                    .addComponent(btnDivision)
                    .addComponent(btnPowerOf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7)
                    .addComponent(btn8)
                    .addComponent(btn9)
                    .addComponent(btnPlus)
                    .addComponent(btnPlusMinus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0)
                    .addComponent(btnDot)
                    .addComponent(btnEquals)
                    .addComponent(btnMinus)
                    .addComponent(btnFactorial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClearAll)
                    .addComponent(btnClearEntry))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        bgrRadiansDegrees.add(radDegrees);
        radDegrees.setSelected(true);
        radDegrees.setText("Degress");

        bgrRadiansDegrees.add(radRadians);
        radRadians.setText("Radians");

        btnSin.setText("sin");
        btnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinActionPerformed(evt);
            }
        });

        btnCos.setText("cos");
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosActionPerformed(evt);
            }
        });

        btnTan.setText("tan");
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });

        btnPI.setText("PI");
        btnPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPIActionPerformed(evt);
            }
        });

        btnAsin.setText("asin");
        btnAsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsinActionPerformed(evt);
            }
        });

        btnAcos.setText("acos");
        btnAcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcosActionPerformed(evt);
            }
        });

        btnAtan.setText("atan");
        btnAtan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtanActionPerformed(evt);
            }
        });

        btnE.setText("E");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panExtendedLayout = new javax.swing.GroupLayout(panExtended);
        panExtended.setLayout(panExtendedLayout);
        panExtendedLayout.setHorizontalGroup(
            panExtendedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panExtendedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panExtendedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panExtendedLayout.createSequentialGroup()
                        .addComponent(radDegrees)
                        .addGap(9, 9, 9)
                        .addComponent(radRadians)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(panExtendedLayout.createSequentialGroup()
                        .addGroup(panExtendedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panExtendedLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSin, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addGroup(panExtendedLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnPI, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCos, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panExtendedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAsin, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addGroup(panExtendedLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnAtan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnAcos, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addGroup(panExtendedLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnE, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)))
                        .addGap(41, 41, 41))))
        );
        panExtendedLayout.setVerticalGroup(
            panExtendedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panExtendedLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panExtendedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radRadians)
                    .addComponent(radDegrees))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panExtendedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panExtendedLayout.createSequentialGroup()
                        .addComponent(btnSin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPI))
                    .addGroup(panExtendedLayout.createSequentialGroup()
                        .addComponent(btnAsin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAcos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        mnuView.setText("View");
        mnuView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuViewActionPerformed(evt);
            }
        });

        bgrSize.add(chkBasic);
        chkBasic.setSelected(true);
        chkBasic.setText("Basic");
        chkBasic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBasicActionPerformed(evt);
            }
        });
        mnuView.add(chkBasic);

        bgrSize.add(chkExtended);
        chkExtended.setText("Extended");
        chkExtended.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkExtendedActionPerformed(evt);
            }
        });
        mnuView.add(chkExtended);

        jMenuBar1.add(mnuView);

        mnuFont.setText("Font");

        bgrFont.add(chkPlain);
        chkPlain.setSelected(true);
        chkPlain.setText("Plain");
        chkPlain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPlainActionPerformed(evt);
            }
        });
        mnuFont.add(chkPlain);

        bgrFont.add(chkBold);
        chkBold.setText("Bold");
        chkBold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBoldActionPerformed(evt);
            }
        });
        mnuFont.add(chkBold);

        jMenuBar1.add(mnuFont);

        mnuRound.setText("Round");

        mnu0.setText("0");
        mnu0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu0ActionPerformed(evt);
            }
        });
        mnuRound.add(mnu0);

        mnu1.setText("1");
        mnu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu1ActionPerformed(evt);
            }
        });
        mnuRound.add(mnu1);

        mnu2.setText("2");
        mnu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu2ActionPerformed(evt);
            }
        });
        mnuRound.add(mnu2);

        mnu3.setText("3");
        mnu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu3ActionPerformed(evt);
            }
        });
        mnuRound.add(mnu3);

        mnu4.setText("4");
        mnu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu4ActionPerformed(evt);
            }
        });
        mnuRound.add(mnu4);

        mnu5.setText("5");
        mnu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu5ActionPerformed(evt);
            }
        });
        mnuRound.add(mnu5);

        mnu6.setText("6");
        mnu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu6ActionPerformed(evt);
            }
        });
        mnuRound.add(mnu6);

        mnu7.setText("7");
        mnu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu7ActionPerformed(evt);
            }
        });
        mnuRound.add(mnu7);

        mnu8.setText("8");
        mnu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu8ActionPerformed(evt);
            }
        });
        mnuRound.add(mnu8);

        mnu9.setText("9");
        mnu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu9ActionPerformed(evt);
            }
        });
        mnuRound.add(mnu9);

        jMenuBar1.add(mnuRound);

        mnuHelp.setText("Help");
        mnuHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHelpActionPerformed(evt);
            }
        });

        mnuHotkeys.setText("Hotkeys");
        mnuHotkeys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHotkeysActionPerformed(evt);
            }
        });
        mnuHelp.add(mnuHotkeys);

        mnuAbout.setText("About");
        mnuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAboutActionPerformed(evt);
            }
        });
        mnuHelp.add(mnuAbout);

        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panBasic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panExtended, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panExtended, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panBasic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void mnuViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuViewActionPerformed

}//GEN-LAST:event_mnuViewActionPerformed

private void chkBasicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBasicActionPerformed
if (chkBasic.isSelected()){
     panBasic.setVisible(true);
     this.setSize(305,315);
 }
}//GEN-LAST:event_chkBasicActionPerformed

private void chkExtendedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkExtendedActionPerformed
 if (chkExtended.isSelected()){
     panExtended.setVisible(true);
     this.setSize(500,315);
 }
}//GEN-LAST:event_chkExtendedActionPerformed

private void btnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualsActionPerformed
    try {
            model.Calculate();
        } catch (ArithmeticException e) {
            msgMessage.showMessageDialog(this, "ERROR: Cannot divide by zero", "Error Message", msgMessage.ERROR_MESSAGE);
        }
        txtOutput.setText(String.valueOf(model.getAnswer()));
}//GEN-LAST:event_btnEqualsActionPerformed

private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
txtOutput.setText(model.buttonClick("1"));
}//GEN-LAST:event_btn1ActionPerformed

private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
txtOutput.setText(model.buttonClick("2"));
}//GEN-LAST:event_btn2ActionPerformed

private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
txtOutput.setText(model.buttonClick("3"));
}//GEN-LAST:event_btn3ActionPerformed

private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
txtOutput.setText(model.buttonClick("4"));
}//GEN-LAST:event_btn4ActionPerformed

private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
txtOutput.setText(model.buttonClick("5"));
}//GEN-LAST:event_btn5ActionPerformed

private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
txtOutput.setText(model.buttonClick("6"));
}//GEN-LAST:event_btn6ActionPerformed

private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
txtOutput.setText(model.buttonClick("7"));
}//GEN-LAST:event_btn7ActionPerformed

private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
txtOutput.setText(model.buttonClick("8"));
}//GEN-LAST:event_btn8ActionPerformed

private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
txtOutput.setText(model.buttonClick("9"));
}//GEN-LAST:event_btn9ActionPerformed

private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
txtOutput.setText(model.buttonClick("0"));
}//GEN-LAST:event_btn0ActionPerformed

private void mnuHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHelpActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_mnuHelpActionPerformed

private void mnuHotkeysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHotkeysActionPerformed
    msgMessage.showMessageDialog(this, "+ -addition\r\n - -subtraction\r\n ^ -multiplication\r\n \\ -division\r\n\r\n"
                + " s -sin\r\n S -arcsin\r\n c -cos\r\n C -arccos\r\n t -tan\r\n T -arctan\r\n\r\n i -inverse\r\n m -+/-\r\n"
                + "^ -power\r\n ! -factorial\r\n\r\n d -clear all(CA)\r\n D -clear entry(CE)\r\n\r\n"
                + "Digits 0-9 can be entered from the\r\nkeypad or the keyboard's digit keys.",
                "Hotkeys", javax.swing.JOptionPane.INFORMATION_MESSAGE);
}//GEN-LAST:event_mnuHotkeysActionPerformed

private void mnuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAboutActionPerformed
    msgMessage.showMessageDialog(this, "Cp Calculator\r\nStudent ID: 90050879\r\nAugust 2016\r\n\r\nCreated by Melodie Joseph",
                "Message", javax.swing.JOptionPane.INFORMATION_MESSAGE); 
}//GEN-LAST:event_mnuAboutActionPerformed

private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
model.setOperator("+");
}//GEN-LAST:event_btnPlusActionPerformed

private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
model.setOperator("-");
}//GEN-LAST:event_btnMinusActionPerformed

private void btnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplyActionPerformed
model.setOperator("*");
}//GEN-LAST:event_btnMultiplyActionPerformed

private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
model.setOperator("/");
}//GEN-LAST:event_btnDivisionActionPerformed

private void btnPowerOfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPowerOfActionPerformed
model.setOperator("^");
}//GEN-LAST:event_btnPowerOfActionPerformed

private void btnPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusMinusActionPerformed
    model.plusMinus();
       txtOutput.setText(model.getOutput());
}//GEN-LAST:event_btnPlusMinusActionPerformed

private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotActionPerformed
 model.dotButton();
        txtOutput.setText(model.getOutput());
}//GEN-LAST:event_btnDotActionPerformed

private void btnClearEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearEntryActionPerformed
model.clearEntry();
}//GEN-LAST:event_btnClearEntryActionPerformed

private void btnClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllActionPerformed
txtOutput.setText("");
model.clearAll();
}//GEN-LAST:event_btnClearAllActionPerformed

private void btnPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPIActionPerformed
    model.buttonPi();
        txtOutput.setText(model.getOutput());
}//GEN-LAST:event_btnPIActionPerformed

private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
model.buttonE();
        txtOutput.setText(model.getOutput());
}//GEN-LAST:event_btnEActionPerformed

private void btnFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorialActionPerformed
 try {        
        model.getFactorial();
        txtOutput.setText(String.valueOf(model.getAnswer()));
    }
    catch (NumberFormatException nfe){
        msgMessage.showMessageDialog(this, "ERROR: Must be a positive integer between 0 and 20", "Error Message", msgMessage.ERROR_MESSAGE);
    }
}//GEN-LAST:event_btnFactorialActionPerformed

private void btnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinActionPerformed
  if (radDegrees.isSelected()){
            model.setDegrees(true);
            model.sin();
        }
        else if (radRadians.isSelected()){
            model.setDegrees(false);
            model.sin();
        }
        txtOutput.setText(model.getOutput());
}//GEN-LAST:event_btnSinActionPerformed

private void btnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosActionPerformed
    if (radDegrees.isSelected()){
            model.setDegrees(true);
            model.cos();
        }
    else if (radRadians.isSelected()) {
                model.setDegrees(false);
                model.cos();
                }
      txtOutput.setText(model.getOutput());
}//GEN-LAST:event_btnCosActionPerformed

private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanActionPerformed
     if (radDegrees.isSelected()){
            model.setDegrees(true);
            model.tan();
        }
        else if (radRadians.isSelected()) {
                model.setDegrees(false);
                model.tan();
                }
     txtOutput.setText(model.getOutput());
}//GEN-LAST:event_btnTanActionPerformed

private void btnAsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsinActionPerformed
if (radDegrees.isSelected()){
            model.setDegrees(true);
            model.asin();
        }
        else if (radRadians.isSelected()){
            model.setDegrees(false);
            model.asin();
        }
        txtOutput.setText(model.getOutput());
}//GEN-LAST:event_btnAsinActionPerformed

private void btnAcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcosActionPerformed
if (radDegrees.isSelected()){
            model.setDegrees(true);
            model.acos();
        }
        else if (radRadians.isSelected()){
            model.setDegrees(false);
            model.acos();
        }
        txtOutput.setText(model.getOutput());
}//GEN-LAST:event_btnAcosActionPerformed

private void btnAtanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtanActionPerformed
if (radDegrees.isSelected()){
            model.setDegrees(true);
            model.atan();
        }
        else if (radRadians.isSelected()){
            model.setDegrees(false);
            model.atan();
        }
        txtOutput.setText(model.getOutput());
}//GEN-LAST:event_btnAtanActionPerformed

private void btnReciprocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReciprocalActionPerformed
try {
    model.reciprocal();
}
catch (ArithmeticException ae) {
    msgMessage.showMessageDialog(this, "ERROR: Cannot divide by zero", "Error Message", msgMessage.ERROR_MESSAGE);
}
txtOutput.setText(model.getOutput());
}//GEN-LAST:event_btnReciprocalActionPerformed

private void chkPlainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPlainActionPerformed
      if (chkPlain.isSelected()){
            java.awt.Font oldFont = txtOutput.getFont();
            java.awt.Font newFont = new java.awt.Font(oldFont.getName(), java.awt.Font.PLAIN, oldFont.getSize());
            txtOutput.setFont(newFont);
            btn1.setFont(newFont);
            btn2.setFont(newFont);
            btn3.setFont(newFont);
            btn4.setFont(newFont);
            btn5.setFont(newFont);
            btn6.setFont(newFont);
            btn7.setFont(newFont);
            btn8.setFont(newFont);
            btn9.setFont(newFont);
            btn0.setFont(newFont);
            btnReciprocal.setFont(newFont);
            btnMultiply.setFont(newFont);
            btnPlus.setFont(newFont);
            btnMinus.setFont(newFont);
            btnPlusMinus.setFont(newFont);
            btnPowerOf.setFont(newFont);
            btnFactorial.setFont(newFont);
            btnDot.setFont(newFont);
            btnClearAll.setFont(newFont);
            btnClearEntry.setFont(newFont);
            radDegrees.setFont(newFont);
            radRadians.setFont(newFont);
            btnSin.setFont(newFont);
            btnAsin.setFont(newFont);
            btnCos.setFont(newFont);
            btnAcos.setFont(newFont);
            btnTan.setFont(newFont);
            btnAtan.setFont(newFont);
            btnPI.setFont(newFont);
            btnE.setFont(newFont);
        }
}//GEN-LAST:event_chkPlainActionPerformed

private void chkBoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBoldActionPerformed
  if (chkBold.isSelected()){
            java.awt.Font oldFont = txtOutput.getFont();
            java.awt.Font newFont = new java.awt.Font(oldFont.getName(), java.awt.Font.BOLD, oldFont.getSize());
            txtOutput.setFont(newFont);
            btn1.setFont(newFont);
            btn2.setFont(newFont);
            btn3.setFont(newFont);
            btn4.setFont(newFont);
            btn5.setFont(newFont);
            btn6.setFont(newFont);
            btn7.setFont(newFont);
            btn8.setFont(newFont);
            btn9.setFont(newFont);
            btn0.setFont(newFont);
            btnReciprocal.setFont(newFont);
            btnMultiply.setFont(newFont);
            btnPlus.setFont(newFont);
            btnMinus.setFont(newFont);
            btnPlusMinus.setFont(newFont);
            btnPowerOf.setFont(newFont);
            btnFactorial.setFont(newFont);
            btnDot.setFont(newFont);
            btnClearAll.setFont(newFont);
            btnClearEntry.setFont(newFont);
            radDegrees.setFont(newFont);
            radRadians.setFont(newFont);
            btnSin.setFont(newFont);
            btnAsin.setFont(newFont);
            btnCos.setFont(newFont);
            btnAcos.setFont(newFont);
            btnTan.setFont(newFont);
            btnAtan.setFont(newFont);
            btnPI.setFont(newFont);
            btnE.setFont(newFont);
        }
}//GEN-LAST:event_chkBoldActionPerformed

private void mnu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu9ActionPerformed
model.round(9);
txtOutput.setText(model.getOutput());
}//GEN-LAST:event_mnu9ActionPerformed

private void mnu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu8ActionPerformed
model.round(8);
txtOutput.setText(model.getOutput());
}//GEN-LAST:event_mnu8ActionPerformed

private void mnu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu7ActionPerformed
model.round(7);
txtOutput.setText(model.getOutput());
}//GEN-LAST:event_mnu7ActionPerformed

private void mnu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu6ActionPerformed
model.round(6);
txtOutput.setText(model.getOutput());
}//GEN-LAST:event_mnu6ActionPerformed

private void mnu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu5ActionPerformed
model.round(5);
txtOutput.setText(model.getOutput());
}//GEN-LAST:event_mnu5ActionPerformed

private void mnu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu4ActionPerformed
model.round(4);
txtOutput.setText(model.getOutput());
}//GEN-LAST:event_mnu4ActionPerformed

private void mnu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu3ActionPerformed
model.round(3);
txtOutput.setText(model.getOutput());
}//GEN-LAST:event_mnu3ActionPerformed

private void mnu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu2ActionPerformed
model.round(2);
txtOutput.setText(model.getOutput());
}//GEN-LAST:event_mnu2ActionPerformed

private void mnu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu1ActionPerformed
model.round(1);
txtOutput.setText(model.getOutput());
}//GEN-LAST:event_mnu1ActionPerformed

private void mnu0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu0ActionPerformed
model.round(0);
txtOutput.setText(model.getOutput());
}//GEN-LAST:event_mnu0ActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgrFont;
    private javax.swing.ButtonGroup bgrRadiansDegrees;
    private javax.swing.ButtonGroup bgrSize;
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
    private javax.swing.JButton btnAcos;
    private javax.swing.JButton btnAsin;
    private javax.swing.JButton btnAtan;
    private javax.swing.JButton btnClearAll;
    private javax.swing.JButton btnClearEntry;
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnEquals;
    private javax.swing.JButton btnFactorial;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnPI;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPlusMinus;
    private javax.swing.JButton btnPowerOf;
    private javax.swing.JButton btnReciprocal;
    private javax.swing.JButton btnSin;
    private javax.swing.JButton btnTan;
    private javax.swing.JCheckBoxMenuItem chkBasic;
    private javax.swing.JCheckBoxMenuItem chkBold;
    private javax.swing.JCheckBoxMenuItem chkExtended;
    private javax.swing.JCheckBoxMenuItem chkPlain;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnu0;
    private javax.swing.JMenuItem mnu1;
    private javax.swing.JMenuItem mnu2;
    private javax.swing.JMenuItem mnu3;
    private javax.swing.JMenuItem mnu4;
    private javax.swing.JMenuItem mnu5;
    private javax.swing.JMenuItem mnu6;
    private javax.swing.JMenuItem mnu7;
    private javax.swing.JMenuItem mnu8;
    private javax.swing.JMenuItem mnu9;
    private javax.swing.JMenuItem mnuAbout;
    private javax.swing.JMenu mnuFont;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenuItem mnuHotkeys;
    private javax.swing.JMenu mnuRound;
    private javax.swing.JMenu mnuView;
    private javax.swing.JOptionPane msgMessage;
    private javax.swing.JPanel panBasic;
    private javax.swing.JPanel panExtended;
    private javax.swing.JRadioButton radDegrees;
    private javax.swing.JRadioButton radRadians;
    private javax.swing.JTextField txtOutput;
    // End of variables declaration//GEN-END:variables

}
