
public class project1 extends javax.swing.JFrame {
    int counter=0,current=0;


    public project1() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jbg = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        l = new javax.swing.JTextField();
        jb0 = new javax.swing.JRadioButton();
        jb1 = new javax.swing.JRadioButton();
        jb2 = new javax.swing.JRadioButton();
        jb3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton3.setText("jButton3");

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("online test on java");

        l.setEditable(false);
        l.setText("which of the following is used to add components in swing class?");
        l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lActionPerformed(evt);
            }
        });

        jbg.add(jb0);
        jb0.setText("add(component)");
        jb0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb0ActionPerformed(evt);
            }
        });

        jbg.add(jb1);
        jb1.setText("edit(component)");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        jbg.add(jb2);
        jb2.setText("insert(component)");

        jbg.add(jb3);
        jb3.setText("new(component)");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jb2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jb3))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton1)
                                                                        .addComponent(jb0))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jb1)
                                                                        .addComponent(jButton2))))
                                                .addGap(94, 94, 94))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jb1)
                                        .addComponent(jb0))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jb3)
                                        .addComponent(jb2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void lActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jb0ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(check())
            counter++;
        current++;
        set();


    }

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
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
        //if(current==0)

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jb0;
    private javax.swing.JRadioButton jb1;
    private javax.swing.JRadioButton jb2;
    private javax.swing.JRadioButton jb3;
    private javax.swing.ButtonGroup jbg;
    private javax.swing.JTextField l;
    // End of variables declaration                   
}


