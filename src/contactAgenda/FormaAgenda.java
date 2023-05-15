package contactAgenda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class FormaAgenda extends javax.swing.JFrame {

    private DefaultListModel<persoanaContact> model = new DefaultListModel<persoanaContact>();
    private List<persoanaContact> contacte = new ArrayList<>();

    private Comparator<persoanaContact> filtruNume = (p1, p2) -> p1.getNume().compareToIgnoreCase(p2.getNume());

    /*private String[] contacte = {"Romel Burcea, 0769991082, 21.10.1999", "Ozana Vilceanu, 0725432908, 22.09.1998"};*/
    public FormaAgenda() {
        initComponents();

        setListaContacte();
        listaContacte.setModel(model);

        facemListaContacte(contacte);

        /*adaugaContacteInitiale();*/
        btnStergeContact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int idx = listaContacte.getSelectedIndex();
                if (idx >= 0) {
                    model.remove(idx);
                } else {
                    JOptionPane.showMessageDialog(null, "nu ai selectat nimic");
                }
            }

        });
        /// Aici am incercat o metoda de filtru ce gasea un contact doar pe baza primei litere
        /// nu si pe o litera din continut, de aceea am renuntat

        /*tfFiltruContacte.getDocument().addDocumentListener(new DocumentListener() { 
            public void insertUpdate(DocumentEvent e) {
                filter();
            }

            public void removeUpdate(DocumentEvent e) {
                filter();
            }

            public void changeUpdate(DocumentEvent e) {
            }

            private void filter() {
                String filter = tfFiltruContacte.getText();
                filterModel((DefaultListModel) listaContacte.getModel(), filter);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });*/
 /*public void filterModel(DefaultListModel model, String filter) {
        for (String s : contacte) {
            if (!s.startsWith(filter)) {
                if (model.contains(s)) {
                    model.removeElement(s);
                }
            } else {
                if (!model.contains(s)) {
                    model.addElement(s);
                }
            }
        }
    }*/
    }

    private void facemListaContacte(List<persoanaContact> om) {
        model.clear();
        for (persoanaContact c : contacte) {
            model.addElement(c);
        }
    }

    private void setListaContacte() {
        contacte.add(new persoanaContact("Vilceanu","Ozana ","22.09.1998 ","0769999120"));
        contacte.add(new persoanaContact("Ioan", "Maria ", "27.06.2007 ", "0253210476"));
        contacte.add(new persoanaContact("Burcea", "Romel ", "21.10.1999 ", "0769991082"));
        contacte.add(new persoanaContact("Ionica", "Suru ", "27.06.2007 ", "02532104234"));

    }

    /*private Comparator<persoanaContact> getComparator(){
        
    }
    
    private void filtrati(){
        List<persoanaContact> individ = new ArrayList<>();
        String filtru = tfFiltruContacte.getText().trim();
        for(persoanaContact cp : contacte){
            if(cp.filtru(filtru)){
                individ.add(cp);
            }
        }
        
        Comparator<persoanaContact> comparator = getComparator();
        Collections.sort(individ, comparator);
        
        facemListaContacte(individ);
        
        
    }
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        btnAdaugaContact = new javax.swing.JButton();
        btnStergeContact = new javax.swing.JButton();
        btnEditeazaContact = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaContacte = new javax.swing.JList<>();
        tfNume = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfFiltruContacte = new javax.swing.JTextField();
        tfPrenume = new javax.swing.JTextField();
        tfNrTel = new javax.swing.JTextField();
        tfDataNasterii = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfModifica = new javax.swing.JTextField();
        jrNume = new javax.swing.JRadioButton();
        jrFix = new javax.swing.JRadioButton();
        jrMobil = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAdaugaContact.setBackground(new java.awt.Color(51, 204, 0));
        btnAdaugaContact.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAdaugaContact.setText("Adauga Contact");
        btnAdaugaContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdaugaContactActionPerformed(evt);
            }
        });

        btnStergeContact.setBackground(new java.awt.Color(255, 51, 51));
        btnStergeContact.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnStergeContact.setText("Sterge Contact");

        btnEditeazaContact.setBackground(new java.awt.Color(255, 102, 0));
        btnEditeazaContact.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnEditeazaContact.setText("Editeaza Contact");
        btnEditeazaContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditeazaContactActionPerformed(evt);
            }
        });

        listaContacte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaContacteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaContacte);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Filtrare text:");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        tfFiltruContacte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfFiltruContacteKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NUME");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PRENUME");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NUMAR TELEFON");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DATA NASTERII");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        tfModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfModificaActionPerformed(evt);
            }
        });

        jrNume.setText("Dupa Nume");
        jrNume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrNumeActionPerformed(evt);
            }
        });

        jrFix.setText("Dupa NrFix");
        jrFix.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrFixItemStateChanged(evt);
            }
        });
        jrFix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrFixActionPerformed(evt);
            }
        });

        jrMobil.setText("Dupa NrMobil");
        jrMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrMobilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnStergeContact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEditeazaContact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAdaugaContact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfNume, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                            .addComponent(tfPrenume)))
                                    .addComponent(tfModifica))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfDataNasterii, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(tfNrTel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfFiltruContacte, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(jrNume, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jrFix)
                        .addGap(18, 18, 18)
                        .addComponent(jrMobil)
                        .addContainerGap(267, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFiltruContacte, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrNume, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrFix, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdaugaContact, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNume, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPrenume, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDataNasterii, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNrTel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditeazaContact, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfModifica))
                .addGap(18, 18, 18)
                .addComponent(btnStergeContact, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdaugaContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdaugaContactActionPerformed
        String Nume = tfNume.getText().trim();
        String Prenume = tfPrenume.getText().trim();
        String DataNasterii = tfDataNasterii.getText().trim();
        String nrTel = tfNrTel.getText().trim();
        if (Nume.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lipseste numele");
            return;
        } else {
            if (Nume.length() <= 2) {
                JOptionPane.showMessageDialog(null, "Numele este prea scurt");
                return;
            }
        }
        if (Prenume.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lipseste prenumele");
            return;
        } else {
            if (Prenume.length() <= 2) {
                JOptionPane.showMessageDialog(null, "Prenumele este prea scurt");
                return;
            }
        }
        if (DataNasterii.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lipseste data nasterii");
            return;
        }
        if (nrTel.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lipseste numarul de telefon");
            return;
        } else {
            if (nrTel.length() != 10) {
                JOptionPane.showMessageDialog(null, "Telefonul nu respecta formatul telefonic din Romania");
                return;
            }
        }

        persoanaContact pc = new persoanaContact(Nume, Prenume, DataNasterii, nrTel);
        contacte.add(pc);

        facemListaContacte(contacte);
    }//GEN-LAST:event_btnAdaugaContactActionPerformed

    private void btnEditeazaContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditeazaContactActionPerformed
        if (btnEditeazaContact.getText().equals("Editeaza Contact")) {
            btnEditeazaContact.setText("Schimba");
            tfModifica.setText(listaContacte.getSelectedValue().toString());
        } else {
            btnEditeazaContact.setText("Editeaza Contact");
            int index = listaContacte.getSelectedIndex();
            String[] abc = tfModifica.getText().split(",");
            persoanaContact ppc = model.getElementAt(index);
            ppc.setNume(abc[0].split(" ")[0]);
            ppc.setPrenume(abc[0].split(" ")[1]);
            ppc.setDataNasterii(abc[1]);
            ppc.setNrTel(abc[2]);
            model.setElementAt(ppc, index);
        }
    }//GEN-LAST:event_btnEditeazaContactActionPerformed

    private void tfModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfModificaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfModificaActionPerformed

    private void tfFiltruContacteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFiltruContacteKeyReleased
        schimbaListaContacte();

    }//GEN-LAST:event_tfFiltruContacteKeyReleased

    private void jrNumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrNumeActionPerformed
        Comparator<persoanaContact> comp = filtruNume;
        Collections.sort(contacte, comp);
        facemListaContacte(contacte);

    }//GEN-LAST:event_jrNumeActionPerformed

    /*private void searchFilter(String searchTerm){
        DefaultListModel filteredItems = new DefaultListModel();
        List<persoanaContact> filtrati = new ArrayList<>();
        
        
    }
     */
    private Comparator<persoanaContact> getComp() {
        Comparator<persoanaContact> comp = null;
        if (jrNume.isSelected()) {
            comp = filtruNume;
        }

        return comp;
    }

    private void schimbaListaContacte() {
        model.clear();
        List<persoanaContact> pers = new ArrayList<>();
        String filtru = tfFiltruContacte.getText().trim();
        for (persoanaContact ss : contacte) {
            if (ss.filtru(filtru)) {
                model.addElement(ss);
            }
        }

    }
    private void jrFixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrFixActionPerformed
        model.clear();
        List<persoanaContact> nrfixe = new ArrayList<>();
        for (persoanaContact d : contacte) {
            if (d.getNrTel().startsWith("02")) {
                model.addElement(d);
            }

        }

        /*Stream<persoanaContact> s = contacte.stream().filter(fix -> fix.getNrTel().startsWith("02"));
       Collectors.to
         */

    }//GEN-LAST:event_jrFixActionPerformed

    private void jrFixItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrFixItemStateChanged


    }//GEN-LAST:event_jrFixItemStateChanged

    private void jrMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrMobilActionPerformed
        model.clear();
        List<persoanaContact> nrmobile = new ArrayList<>();
        for (persoanaContact pp : contacte) {
            if (pp.getNrTel().startsWith("07")) {
                model.addElement(pp);
            }
        }

    }//GEN-LAST:event_jrMobilActionPerformed

    private void listaContacteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaContacteMouseClicked

    }//GEN-LAST:event_listaContacteMouseClicked

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
            java.util.logging.Logger.getLogger(FormaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormaAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdaugaContact;
    private javax.swing.JButton btnEditeazaContact;
    private javax.swing.JButton btnStergeContact;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrFix;
    private javax.swing.JRadioButton jrMobil;
    private javax.swing.JRadioButton jrNume;
    private javax.swing.JList<persoanaContact> listaContacte;
    private javax.swing.JTextField tfDataNasterii;
    private javax.swing.JTextField tfFiltruContacte;
    private javax.swing.JTextField tfModifica;
    private javax.swing.JTextField tfNrTel;
    private javax.swing.JTextField tfNume;
    private javax.swing.JTextField tfPrenume;
    // End of variables declaration//GEN-END:variables
}
