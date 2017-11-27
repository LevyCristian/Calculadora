package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author levy_
 */
public class Frame extends javax.swing.JFrame {
	    
		private javax.swing.JButton Clear;
	    private javax.swing.JButton Del;
	    private javax.swing.JLabel Display;
	    private javax.swing.JLabel DisplayHistorico;
	    private javax.swing.JButton Divide;
	    private javax.swing.JButton Eight;
	    private javax.swing.JButton Equal;
	    private javax.swing.JButton Five;
	    private javax.swing.JButton Four;
	    private javax.swing.JButton Modulo;
	    private javax.swing.JButton Mult;
	    private javax.swing.JButton Nine;
	    private javax.swing.JButton One;
	    private javax.swing.JButton Porcent;
	    private javax.swing.JButton Seven;
	    private javax.swing.JButton Six;
	    private javax.swing.JButton Sub;
	    private javax.swing.JButton Sum;
	    private javax.swing.JButton Three;
	    private javax.swing.JButton Two;
	    private javax.swing.JButton Zero;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JButton point;
	    
	    Controller controller = new Controller();
	    
	    //Váriaveis de controle
	    private boolean firstClick = true;
	    private boolean firstOperation = true;
	    private boolean firstPoint = true;
	    private boolean typeFloat = false;
	    
    public Frame() {
        initComponents();
    }
                     
    private void initComponents() {
 
        jPanel1 = new javax.swing.JPanel();
        Del = new javax.swing.JButton();
        DisplayHistorico = new javax.swing.JLabel();
        Display = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        Porcent = new javax.swing.JButton();
        Equal = new javax.swing.JButton();
        Modulo = new javax.swing.JButton();
        Divide = new javax.swing.JButton();
        Mult = new javax.swing.JButton();
        Sub = new javax.swing.JButton();
        Sum = new javax.swing.JButton();
        Eight = new javax.swing.JButton();
        Nine = new javax.swing.JButton();
        One = new javax.swing.JButton();
        Five = new javax.swing.JButton();
        Six = new javax.swing.JButton();
        Four = new javax.swing.JButton();
        Two = new javax.swing.JButton();
        Seven = new javax.swing.JButton();
        Three = new javax.swing.JButton();
        point = new javax.swing.JButton();
        Zero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(405, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jPanel1.setName("Historico"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 180));

        Del.setBackground(new java.awt.Color(255, 255, 255));
        Del.setForeground(new java.awt.Color(0, 137, 124));
        Del.setText("DEL");
        Del.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Del.addActionListener(new ProcessaBotoes());

        DisplayHistorico.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        DisplayHistorico.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DisplayHistorico.setText("");

        Display.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Display.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Display.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Del))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DisplayHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(DisplayHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Del, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Clear.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        Clear.setForeground(new java.awt.Color(0, 158, 197));
        Clear.setText("C");
        Clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Clear.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Clear.addActionListener(new ProcessaBotoes());

        Porcent.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        Porcent.setForeground(new java.awt.Color(0, 158, 197));
        Porcent.setText("%");
        Porcent.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Porcent.addActionListener(new ProcessaBotoes());

        Equal.setBackground(new java.awt.Color(0, 196, 126));
        Equal.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        Equal.setForeground(new java.awt.Color(255, 255, 255));
        Equal.setText("=");
        Equal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Equal.addActionListener(new ProcessaBotoes());

        Modulo.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        Modulo.setForeground(new java.awt.Color(0, 158, 197));
        Modulo.setText("+/-");
        Modulo.setAlignmentY(0.0F);
        Modulo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Modulo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Modulo.addActionListener(new ProcessaBotoes());

        Divide.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        Divide.setForeground(new java.awt.Color(0, 158, 197));
        Divide.setText("÷");
        Divide.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Divide.addActionListener(new ProcessaBotoes());

        Mult.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Mult.setForeground(new java.awt.Color(0, 158, 197));
        Mult.setText("X");
        Mult.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Mult.addActionListener(new ProcessaBotoes());

        Sub.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        Sub.setForeground(new java.awt.Color(0, 158, 197));
        Sub.setText("-");
        Sub.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Sub.addActionListener(new ProcessaBotoes());

        Sum.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        Sum.setForeground(new java.awt.Color(0, 158, 197));
        Sum.setText("+");
        Sum.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Sum.addActionListener(new ProcessaBotoes());

        Eight.setBackground(new java.awt.Color(255, 255, 255));
        Eight.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        Eight.setText("8");
        Eight.setAlignmentY(0.0F);
        Eight.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Eight.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Eight.addActionListener(new ProcessaBotoes());

        Nine.setBackground(new java.awt.Color(255, 255, 255));
        Nine.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        Nine.setText("9");
        Nine.setAlignmentY(0.0F);
        Nine.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Nine.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Nine.addActionListener(new ProcessaBotoes());

        One.setBackground(new java.awt.Color(255, 255, 255));
        One.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        One.setText("1");
        One.setAlignmentY(0.0F);
        One.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        One.setMargin(new java.awt.Insets(0, 0, 0, 0));
        One.addActionListener(new ProcessaBotoes());

        Five.setBackground(new java.awt.Color(255, 255, 255));
        Five.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        Five.setText("5");
        Five.setToolTipText("");
        Five.setAlignmentY(0.0F);
        Five.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Five.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Five.addActionListener(new ProcessaBotoes());

        Six.setBackground(new java.awt.Color(255, 255, 255));
        Six.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        Six.setText("6");
        Six.setAlignmentY(0.0F);
        Six.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Six.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Six.addActionListener(new ProcessaBotoes());

        Four.setBackground(new java.awt.Color(255, 255, 255));
        Four.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        Four.setText("4");
        Four.setAlignmentY(0.0F);
        Four.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Four.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Four.addActionListener(new ProcessaBotoes());

        Two.setBackground(new java.awt.Color(255, 255, 255));
        Two.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        Two.setText("2");
        Two.setAlignmentY(0.0F);
        Two.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Two.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Two.addActionListener(new ProcessaBotoes());

        Seven.setBackground(new java.awt.Color(255, 255, 255));
        Seven.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        Seven.setText("7");
        Seven.setAlignmentY(0.0F);
        Seven.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Seven.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Seven.addActionListener(new ProcessaBotoes());

        Three.setBackground(new java.awt.Color(255, 255, 255));
        Three.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        Three.setText("3");
        Three.setAlignmentY(0.0F);
        Three.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Three.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Three.addActionListener(new ProcessaBotoes());

        point.setBackground(new java.awt.Color(255, 255, 255));
        point.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        point.setText(".");
        point.setAlignmentY(0.0F);
        point.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        point.setMargin(new java.awt.Insets(0, 0, 0, 0));
        point.addActionListener(new ProcessaBotoes());
        

        Zero.setBackground(new java.awt.Color(255, 255, 255));
        Zero.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        Zero.setText("0");
        Zero.addActionListener(new ProcessaBotoes());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(One, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Four, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Seven, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(point, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Zero, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Equal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Two, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Three, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Sum, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Five, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Six, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Sub, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Eight, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nine, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mult, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Modulo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Porcent, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Divide, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Porcent, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Divide, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eight, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nine, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Seven, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mult, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Five, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Six, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sub, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Zero, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(Equal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Four, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(One, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Two, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Three, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sum, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(point, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
        );

        pack();
    }                      

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);    
            }
        });
    }         
   private class ProcessaBotoes implements ActionListener{
        public void actionPerformed(ActionEvent e){
        	
        	
        	if(e.getSource() == One){ 
        		if(firstClick) {
        			Display.setText("1");
        			firstClick = false;
        		}
        		else {
        			String str = Display.getText();
        			Display.setText(str+"1");
        		}
        	}
        	
        	else if(e.getSource() == Two){ 
        		if(firstClick) {
        			Display.setText("2");
        			firstClick = false;
        		}
        		else {
        			String str = Display.getText();
        			Display.setText(str+"2");
        		}
        	}
        	
        	
        	else if(e.getSource() == Three){ 
        		if(firstClick) {
        			Display.setText("3");
        			firstClick = false;
        		}
        		else {
        			String str = Display.getText();
        			Display.setText(str+"3");
        		}
        	}
        	else if(e.getSource() == Four){ 
        		if(firstClick) {
        			Display.setText("4");
        			firstClick = false;
        		}
        		else {
        			String str = Display.getText();
        			Display.setText(str+"4");
        		}
        		
        	}
        	else if(e.getSource() == Five){ 
        		if(firstClick) {
        			Display.setText("5");
        			firstClick = false;
        		}
        		else {
        			String str = Display.getText();
        			Display.setText(str+"5");
        		}
        	}
        	else if(e.getSource() == Six){ 
        		if(firstClick) {
        			Display.setText("6");
        			firstClick = false;
        		}
        		else {
        			String str = Display.getText();
        			Display.setText(str+"6");
        		}
        	}
        	else if(e.getSource() == Seven){ 
        		if(firstClick) {
        			Display.setText("7");
        			firstClick = false;
        		}
        		else {
        			String str = Display.getText();
        			Display.setText(str+"7");
        		}
        	}
        	else if(e.getSource() == Eight){ 
        		if(firstClick) {
        			Display.setText("8");
        			firstClick = false;
        		}
        		else {
        			String str = Display.getText();
        			Display.setText(str+"8");
        		}
        	}
        	else if(e.getSource() == Nine){ 
        		if(firstClick) {
        			Display.setText("9");
        			firstClick = false;
        		}
        		else {
        			String str = Display.getText();
        			Display.setText(str+"9");
        		}
        	}
        	else if(e.getSource() == Zero){ 
        		if(firstClick) {}
        		else {
        			String str = Display.getText();
        			Display.setText(str+"0");
        		}	
        	}
        	// Botões de ação 
        	
        	else if(e.getSource() == point){ 
        		if(firstClick || firstPoint ) {
        			String str = Display.getText();
        			Display.setText(str+".");
        			firstPoint = false;
        			firstClick = false;
        			typeFloat = true;
        		}	
        	}
        	
        	else if(e.getSource() == Clear){ 
        		Display.setText("0");
        		DisplayHistorico.setText("");
        		firstClick = true;
        		firstOperation = true;
        		firstPoint = true;
        		typeFloat = false;
        		
        	}
        	
        	else if(e.getSource() == Modulo){ 
        		if(!firstPoint) {
        			Display.setText(this.convertToString(this.convertToFloat(Display.getText())*-1));	
        		}
        		else {
        			Display.setText(this.convertToStringInt(this.convertToInt(Display.getText())*-1));
        		}
        	}
        	
        	else if(e.getSource() == Del){
        		if(firstClick) {} 
        	    else {
        			if (Display.getText().length() > 0) {
        				Display.setText(Display.getText().substring(0, Display.getText().length() - 1));
        				if(Display.getText().length() == 0) {
        					Display.setText("0");
        					firstClick = true;
        				}
        			}
        		}
        	}
        	
        	else if(e.getSource() == Porcent){ 
        		
        	}
        	
        	else if(e.getSource() == Sum){
        		
        		if(firstPoint && !typeFloat){
        			if(!firstOperation){
       
        				Display.setText(this.convertToStringInt(controller.getValueI(this.convertToInt(Display.getText()))));
        				controller.setOperator(1);
        				controller.setValue1int(this.convertToInt(Display.getText()));
            			this.updateScreamH("", "");
        			}
        			else{
        				controller.startI(this.convertToInt(Display.getText()), 1);
            			this.updateScreamH(Display.getText(), "+");
            				
        			}
        			firstClick = true;
        			firstOperation = false;
        		}
        		
        		else {
        			
        			if(!firstOperation){
        				
        				Display.setText(this.convertToString(controller.getValuef(this.convertToFloat(Display.getText()))));
        				controller.setOperator(1);
        				controller.setValue1f(this.convertToFloat(Display.getText()));
        				this.updateScreamH("", "");
        				firstPoint = true;
            			firstClick = true;
        			}
        			else{
        				controller.startf(this.convertToFloat(Display.getText()), 1);
        				this.updateScreamH(Display.getText(), "+");
        				firstPoint = true;
            			firstClick = true;
            			firstOperation = false;	
        			}
        		}
        	}
        	
        	else if(e.getSource() == Sub){
        		
        		if(firstPoint && !typeFloat){
        			if(!firstOperation){
        				
        				Display.setText(this.convertToStringInt(controller.getValueI(this.convertToInt(Display.getText()))));
        				controller.setOperator(2);
        				controller.setValue1int(this.convertToInt(Display.getText()));
            			this.updateScreamH("", "");
        			}
        			else{
        				controller.startI(this.convertToInt(Display.getText()), 2);
            			this.updateScreamH(Display.getText(), "-");
            				
        			}
        			firstClick = true;
        			firstOperation = false;
        		}
        		
        		else {
        			
        			if(!firstOperation){
        				
        				Display.setText(this.convertToString(controller.getValuef(this.convertToFloat(Display.getText()))));
        				controller.setOperator(2);
        				controller.setValue1f(this.convertToFloat(Display.getText()));
        				this.updateScreamH("", "");
        				firstPoint = true;
            			firstClick = true;
        			}
        			else{
        				controller.startf(this.convertToFloat(Display.getText()), 2);
        				this.updateScreamH(Display.getText(), "-");
        				firstPoint = true;
            			firstClick = true;
            			firstOperation = false;	
        			}
        		}
        	}
        	else if(e.getSource() == Mult){
        		
        		if(firstPoint && !typeFloat){
        			if(!firstOperation){
        				
            			Display.setText(this.convertToStringInt(controller.getValueI(this.convertToInt(Display.getText()))));
            			controller.setOperator(3);
            			controller.setValue1int(this.convertToInt(Display.getText()));
            			this.updateScreamH("", "");
        			}
        			else{
        				controller.startI(this.convertToInt(Display.getText()), 3);
            			this.updateScreamH(Display.getText(), "*");
            				
        			}
        			firstClick = true;
        			firstOperation = false;
        		}
        		
        		else {
        			
        			if(!firstOperation){
        				
        				Display.setText(this.convertToString(controller.getValuef(this.convertToFloat(Display.getText()))));
        				controller.setOperator(3);
        				controller.setValue1f(this.convertToFloat(Display.getText()));
        				this.updateScreamH("", "");
        				firstPoint = true;
            			firstClick = true;
        			}
        			else{
        				controller.startf(this.convertToFloat(Display.getText()), 3);
        				this.updateScreamH(Display.getText(), "*");
        				firstPoint = true;
            			firstClick = true;
            			firstOperation = false;	
        			}
        		}
        	}
        	else if(e.getSource() == Divide){
        		
        		
        		if(firstPoint && !typeFloat){
        			if(!firstOperation){
        				
            			Display.setText(this.convertToStringInt(controller.getValueI(this.convertToInt(Display.getText()))));
            			controller.setOperator(4);
            			controller.setValue1int(this.convertToInt(Display.getText()));
            			this.updateScreamH("", "");
        			}
        			else{
        				controller.startI(this.convertToInt(Display.getText()), 4);
            			this.updateScreamH(Display.getText(), "/");
            				
        			}
        			firstClick = true;
        			firstOperation = false;
        		}
        		
        		else {
        			
        			if(!firstOperation){
        				
        				Display.setText(this.convertToString(controller.getValuef(this.convertToFloat(Display.getText()))));
        				controller.setOperator(4);
        				controller.setValue1f(this.convertToFloat(Display.getText()));
        				this.updateScreamH("", "");
        				firstPoint = true;
            			firstClick = true;
        			}
        			else{
        				controller.startf(this.convertToFloat(Display.getText()), 4);
        				this.updateScreamH(Display.getText(), "/");
        				firstPoint = true;
            			firstClick = true;
            			firstOperation = false;	
        			}
        		}
        	}
        	else if(e.getSource() == Porcent){
        		
        		if(firstPoint && !typeFloat){
        			if(!firstOperation){
            			Display.setText(this.convertToStringInt(controller.getValueI(this.convertToInt(Display.getText()))));
            			controller.setValue1int(this.convertToInt(Display.getText()));
            			this.updateScreamH("", "");
        			}
        			else{
        				controller.startI(this.convertToInt(Display.getText()), 1);
            			this.updateScreamH(Display.getText(), "+");
            				
        			}
        			firstClick = true;
        			firstOperation = false;
        		}
        		
        		else {
        			
        			if(!firstOperation){
        				Display.setText(this.convertToString(controller.getValuef(this.convertToFloat(Display.getText()))));
        				controller.setValue1f(this.convertToFloat(Display.getText()));
        				this.updateScreamH("", "");
        				firstPoint = true;
            			firstClick = true;
        			}
        			else{
        				controller.startf(this.convertToFloat(Display.getText()), 1);
        				this.updateScreamH(Display.getText(), "+");
        				firstPoint = true;
            			firstClick = true;
            			firstOperation = false;	
        			}
        		}
        	}
        	
        	else if(e.getSource() == Equal){
        		
        		
        		if(firstClick){
        				
        			}
        		
        		else if(firstPoint && !typeFloat){
            		if(!firstOperation){
                		Display.setText(this.convertToStringInt(controller.getValueI(this.convertToInt(Display.getText()))));
                		controller.setValue1int(this.convertToInt(Display.getText()));
                		this.updateScreamH("", "");
            		}
            		else{
            				
                				
            		}
            		firstClick = true;
            		firstOperation = false;
            	}
            		
            	else {
            			
            		if(!firstOperation){
            			Display.setText(this.convertToString(controller.getValuef(this.convertToFloat(Display.getText()))));
            			controller.setValue1f(this.convertToFloat(Display.getText()));
           				this.updateScreamH("", "");
           				firstPoint = true;
               			firstClick = true;
           			}
           			else{
           				
           				firstPoint = true;
               			firstClick = true;
               			firstOperation = false;	
           			}
           		}
       		}
       	
        
        }//

		public float convertToFloat(String str) {
			return Float.parseFloat(str);
		}
		public String convertToString(float flt) {
			return Float.toString(flt);
		}
		
		public int convertToInt(String str) {
			return Integer.parseInt(str);
		}
		public String convertToStringInt(int temp) {
			return Integer.toString(temp);
		}
		public void updateScreamH(String temp1 , String temp2){
			DisplayHistorico.setText(temp1+" "+temp2);
		}
   }
}