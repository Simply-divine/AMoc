
public class project1 extends javax.swing.JFrame {
    static int counter=0,current=0,count=0,y=0,now;
    int[] m = new int[10];

    public project1() {
        initComponents();
        set();
        mySettings();
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jbg = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        bookMarkGroup = new javax.swing.ButtonGroup();
        message = new javax.swing.JDialog();
        messageField = new javax.swing.JTextField();
        resultDisplay = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        l = new javax.swing.JTextField();
        jb0 = new javax.swing.JRadioButton();
        jb1 = new javax.swing.JRadioButton();
        jb2 = new javax.swing.JRadioButton();
        jb3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jb4 = new javax.swing.JRadioButton();

        jButton3.setText("jButton3");

        jRadioButton1.setText("jRadioButton1");

        messageField.setEditable(false);
        messageField.setText("your result is:");
        messageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout messageLayout = new javax.swing.GroupLayout(message.getContentPane());
        message.getContentPane().setLayout(messageLayout);
        messageLayout.setHorizontalGroup(
                messageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(messageLayout.createSequentialGroup()
                                .addGroup(messageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(messageLayout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(resultDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(messageLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(90, Short.MAX_VALUE))
        );
        messageLayout.setVerticalGroup(
                messageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(messageLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(resultDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("online test on java");

        l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lActionPerformed(evt);
            }
        });

        jbg.add(jb0);
        jb0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb0ActionPerformed(evt);
            }
        });

        jbg.add(jb1);
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        jbg.add(jb2);
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });

        jbg.add(jb3);
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });

        jButton1.setText("next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("bookmark");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        bookMarkGroup.add(jButton4);
        jButton4.setLabel("bookmark");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        bookMarkGroup.add(jButton5);
        jButton5.setLabel("bookmark");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        bookMarkGroup.add(jButton7);
        jButton7.setLabel("bookmark");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        bookMarkGroup.add(jButton8);
        jButton8.setLabel("bookmark");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        bookMarkGroup.add(jButton9);
        jButton9.setLabel("bookmark");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        bookMarkGroup.add(jButton10);
        jButton10.setLabel("bookmark");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        bookMarkGroup.add(jButton11);
        jButton11.setLabel("bookmark");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        bookMarkGroup.add(jButton12);
        jButton12.setLabel("bookmark");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        bookMarkGroup.add(jButton13);
        jButton13.setLabel("bookmark");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jbg.add(jb4);
        jb4.setSelected(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jb0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGap(72, 72, 72))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jButton1)
                                                                                        .addComponent(jb2))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jb1)
                                                                        .addComponent(jb3)
                                                                        .addComponent(jButton2))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jb4)
                                                                .addGap(35, 35, 35)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jButton13)
                                                                .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING))
                                                        .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jButton4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton5)
                                                .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton8)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jb1)
                                                        .addComponent(jb0))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jb3)
                                                        .addComponent(jb2)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jButton9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton10)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jb4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton1)
                                                        .addComponent(jButton2))
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(jButton11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton13)
                                                .addGap(0, 27, Short.MAX_VALUE))))
        );

        pack();
    }

    private void lActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jb0ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        if(check())
        {  counter++;}
        current++;
        jb4.setSelected(true);
        set();
        if(current==9)
        {
            jButton1.setEnabled(false);
            jButton2.setText("Result");

        }

    }

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        count++;
        if(current!=9){
            if(count==1){
                jButton4.setVisible(true);
                m[y++]=current;}
            if(count==2){
                jButton5.setVisible(true);
                m[y++]=current;
            }
            if(count==3){
                jButton7.setVisible(true);
                m[y++]=current;
            }
            if(count==4){
                jButton8.setVisible(true);
                m[y++]=current;
            }
            if(count==5){
                jButton9.setVisible(true);
                m[y++]=current;}
            if(count==6){
                jButton10.setVisible(true);
                m[y++]=current;}
            if(count==7){
                jButton11.setVisible(true);
                m[y++]=current;}
            if(count==8){
                jButton12.setVisible(true);
                m[y++]=current;}
            if(count==9){
                jButton13.setVisible(true);
                m[y++]=current;}
        }
        if(current==9)
        {
            messageField.setVisible(true);
            resultDisplay.setVisible(true);
            message.setVisible(true);
            message.setSize(300,300);
            resultDisplay.setText("no. of correct answers:"+counter);

        }

    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {

        now=current;
        current=m[0];
        set();

    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        now=current;
        current=m[1];
        set();

    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        now=current;
        current=m[2];
        set();
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        now=current;
        current=m[3];
        set();
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        now=current;
        current=m[4];
        set();
    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
        now=current;
        current=m[5];
        set();

    }

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
        now=current;
        current=m[6];
        set();
    }

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
        now=current;
        current=m[7];
        set();
    }

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
        now=current;
        current=m[8];
        set();
    }

    private void messageFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }
    void mySettings(){
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jb4.setSelected(true);
        jb4.setVisible(false);
        message.setVisible(false);


    }

    Boolean check(){
        if(current==0)
            return jb1.isSelected();
        if(current==1)
            return jb2.isSelected();
        if(current==2)
            return jb3.isSelected();
        if(current==3)
            return jb0.isSelected();
        if(current==4)
            return jb2.isSelected();
        if(current==5)
            return jb2.isSelected();
        if(current==6)
            return jb1.isSelected();
        if(current==7)
            return jb3.isSelected();
        if(current==8)
            return jb1.isSelected();
        if(current==9)
            return jb2.isSelected();
        return false;


    }
    void set(){


        if(current==0)
        {
            l.setText("Que1: Which one among these is not a datatype");
            jb0.setText("int");jb1.setText("Float");jb2.setText("boolean");jb3.setText("char");
        }
        if(current==1)
        {
            l.setText("Que2: Which class is available to all the class automatically");
            jb0.setText("Swing");jb1.setText("Applet");jb2.setText("Object");jb3.setText("ActionEvent");
        }
        if(current==2)
        {
            l.setText("Que3:which method is used to add components in swing");
            jb0.setText("modify");jb1.setText("insert");jb2.setText("edit");jb3.setText("add");
        }
        if(current==3)
        {
            l.setText("Que4: String class is defined in which package");
            jb0.setText("lang");jb1.setText("Swing");jb2.setText("Applet");jb3.setText("awt");
        }
        if(current==4)
        {
            l.setText("Que5: Which team is going to win AMOC competition");
            jb0.setText("code monks");jb1.setText("coolguys");jb2.setText("codeNinjas");jb3.setText("terminators");
        }
        if(current==5)
        {
            l.setText("Que6: Which one among these is not a keyword");
            jb0.setText("class");jb1.setText("int");jb2.setText("get");jb3.setText("if");
        }
        if(current==6)
        {
            l.setText("Que7: Which one among these is not a class ");
            jb0.setText("Swing");jb1.setText("Actionperformed");jb2.setText("ActionEvent");jb3.setText("Button");
        }
        if(current==7)
        {
            l.setText("Que8: which one among these is not a function of Object class");
            jb0.setText("toString");jb1.setText("finalize");jb2.setText("equals");jb3.setText("getDocumentBase");
        }
        if(current==8)
        {
            l.setText("Que9: which function is not present in Applet class");
            jb0.setText("init");jb1.setText("main");jb2.setText("start");jb3.setText("destroy");
        }
        if(current==9)
        {
            l.setText("Que10: Which one among these is not a valid component");
            jb0.setText("JButton");jb1.setText("JList");jb2.setText("JButtonGroup");jb3.setText("JTextArea");
        }


    }

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new project1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup bookMarkGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jb0;
    private javax.swing.JRadioButton jb1;
    private javax.swing.JRadioButton jb2;
    private javax.swing.JRadioButton jb3;
    private javax.swing.JRadioButton jb4;
    private javax.swing.ButtonGroup jbg;
    private javax.swing.JTextField l;
    private javax.swing.JDialog message;
    private javax.swing.JTextField messageField;
    private javax.swing.JLabel resultDisplay;

}
