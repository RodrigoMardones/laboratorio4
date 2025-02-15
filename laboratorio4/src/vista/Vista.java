/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import java.util.Collections;
import modelo.repository.Repository;
// liberías de vistas secundarias
import vista.vistaAddFile;
import vista.VistaCommit;
import vista.VistaInit;
// librerias extras
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author rodrigomardones
 */
public class Vista extends javax.swing.JFrame {
    Repository git;
    /**
     * Creates new form Vista
     */
    public Vista() {
        this.git = new Repository();
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

        jButton1 = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        initButton = new javax.swing.JButton();
        addFileButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        pullButton = new javax.swing.JButton();
        commitButton = new javax.swing.JButton();
        pushButton = new javax.swing.JButton();
        statusWorkspace = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        statusIndex = new javax.swing.JButton();
        statusLocal = new javax.swing.JButton();
        statusRemote = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        generalList = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        initButton.setText("Init");
        initButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initButtonActionPerformed(evt);
            }
        });

        addFileButton.setText("nuevo Archivo");
        addFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFileButtonActionPerformed(evt);
            }
        });

        addButton.setText("add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        pullButton.setText("pull");
        pullButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pullButtonActionPerformed(evt);
            }
        });

        commitButton.setText("commit");
        commitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commitButtonActionPerformed(evt);
            }
        });

        pushButton.setText("push");
        pushButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pushButtonActionPerformed(evt);
            }
        });

        statusWorkspace.setText("status workspace");
        statusWorkspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusWorkspaceActionPerformed(evt);
            }
        });

        jLabel1.setText("Laboratorio 4 GIT");

        statusIndex.setText("Status Index");
        statusIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusIndexActionPerformed(evt);
            }
        });

        statusLocal.setText("status Local");
        statusLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusLocalActionPerformed(evt);
            }
        });

        statusRemote.setText("status Remote");
        statusRemote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusRemoteActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(generalList);

        jLabel2.setText("Consola de información");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(initButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addFileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pullButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(commitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pushButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)))
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(statusWorkspace)
                        .addGap(26, 26, 26)
                        .addComponent(statusIndex)
                        .addGap(27, 27, 27)
                        .addComponent(statusLocal)
                        .addGap(18, 18, 18)
                        .addComponent(statusRemote)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusWorkspace)
                    .addComponent(statusIndex)
                    .addComponent(statusLocal)
                    .addComponent(statusRemote))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(initButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(commitButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addFileButton)
                            .addComponent(pullButton)
                            .addComponent(pushButton))
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /***
     * descrip: funcion que ejecuta el git init de nuestro flujo
     * @param evt evento asociado al click del boton
     * @return void
     */
    private void initButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initButtonActionPerformed

        VistaInit view = new VistaInit();
        view.show();
        view.git = this.git;      
    }//GEN-LAST:event_initButtonActionPerformed
    
    // ----------------------- eventos por boton ----------------------------
    /**
     * descrip: funcion que ejecuta git add de nuestro flujo
     * @param evt evento asociado al click del boton
     * @return void
     */
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if(!this.isActive()){
            JOptionPane.showMessageDialog(null, "repositorio no iniciado !");
            return;
        }
        System.out.println("add button clicked");
        String response = git.gitAdd();
        JOptionPane.showMessageDialog(null, response);
        
    }//GEN-LAST:event_addButtonActionPerformed
    /**
     * descrip: funcion que muestra en pantalla el status del workspace
     * @param evt evento asociado al click del boton
     * @return void
     */
    private void statusWorkspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusWorkspaceActionPerformed
        if(!this.isActive()){
            JOptionPane.showMessageDialog(null, "repositorio no iniciado !");
            return;
        }
        generalList.clearSelection();
        List<String> status = this.git.statusWorkingDirectory();
        String[] info = new String[status.size()];
        generalList.setListData(status.toArray(info));
    }//GEN-LAST:event_statusWorkspaceActionPerformed
    /**
     * descrip funcion que crear un commit en nuestro flujo de trabajo
     * @param evt evento asociado al click del bootn
     * @return void
     */
    private void commitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commitButtonActionPerformed
        if(!this.isActive()){
            JOptionPane.showMessageDialog(null, "repositorio no iniciado !");
            return;
        }
        System.out.println("commit button clicked");
        VistaCommit view = new VistaCommit();
        view.setVisible(true);
        view.git = this.git;
        this.git.gitStatus();
    }//GEN-LAST:event_commitButtonActionPerformed
    /**
     * descrip: funcion que nos permite agregar un archivo al workspace
     * @param evt evento asociado al click del boton
     * @return void
     */
    private void addFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFileButtonActionPerformed
        if(!this.isActive()){
            JOptionPane.showMessageDialog(null, "repositorio no iniciado !");
            return;
        }
        System.out.println("addFile button clicked");
        vistaAddFile view = new vistaAddFile();
        view.setVisible(true);
        view.git = this.git;
    }//GEN-LAST:event_addFileButtonActionPerformed
    /**
     * descrip: funcion que permite realizar el pull de nuestros commits en el flujo de trabajo
     * @param evt evento asociado al click del boton
     * @return void
     */
    private void pullButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pullButtonActionPerformed
        if(!this.isActive()){
            JOptionPane.showMessageDialog(null, "repositorio no iniciado !");
            return;
        }
        System.out.println("pull button clicked");
        String response = this.git.gitPull();
        JOptionPane.showMessageDialog(null, response);
    }//GEN-LAST:event_pullButtonActionPerformed
    
    /**
     * descrip: funcion que permite realizar el push de nuestros commits en el flujo de trabajo
     * @param evt evento asociado al click del boton
     * @return void
     */
    private void pushButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pushButtonActionPerformed
        if(!this.isActive()){
            JOptionPane.showMessageDialog(null, "repositorio no iniciado !");
            return;
        }
        System.out.println("push button clicked");
        String response = this.git.gitPush();
        JOptionPane.showMessageDialog(null, response);
    }//GEN-LAST:event_pushButtonActionPerformed
    
    /**
     * descrip: funcion que permite revisar el status del IndexZone de nuestro flujo de trabajo
     * @param evt evento asociado al click del boton
     * @return void
     */
    private void statusIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusIndexActionPerformed
        
        if(!this.isActive()){
            JOptionPane.showMessageDialog(null, "repositorio no iniciado !");
            return;
        }
        generalList.clearSelection();
        List<String> status = this.git.statusIndex();
        String[] info = new String[status.size()];
        generalList.setListData(status.toArray(info));
            
    }//GEN-LAST:event_statusIndexActionPerformed

    /**
     * descrip: funcion que permite mostrar el status de nuestro Local Repository 
     * @param evt evento asociado al click del boton
     * @return void
     */
    private void statusLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusLocalActionPerformed
        if(!this.isActive()){
            JOptionPane.showMessageDialog(null, "repositorio no iniciado !");
            return;
        }
        generalList.clearSelection();
        List<String> status = this.git.statusLocal();
        if(status.size() > 2){
            status = status.subList(status.size() - 3, status.size());
        }
        Collections.reverse(status);
        String[] info = new String[status.size()];
        generalList.setListData(status.toArray(info));   
    }//GEN-LAST:event_statusLocalActionPerformed


    /**
     * descrip: funcion que permite mostrar el status de nuestro Remote Repository
     * @param evt evento asociado al click del boton
     * @return void
     */
    private void statusRemoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusRemoteActionPerformed
        if(!this.isActive()){
            JOptionPane.showMessageDialog(null, "repositorio no iniciado !");
            return;
        }
        generalList.clearSelection();
        List<String> status = this.git.statusRemote();
        if(status.size() > 2 ){
            status = status.subList(status.size() - 3, status.size());
        }
        Collections.reverse(status);
        String[] info = new String[status.size()];
        generalList.setListData(status.toArray(info));   
    }//GEN-LAST:event_statusRemoteActionPerformed

    /**
     * funcion que nos dice el estado de nuestro git asociado al nombre
     * @return boolean
     */
    public boolean isActive(){
        return this.git.repoName != null;          
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton addFileButton;
    private javax.swing.JButton commitButton;
    private javax.swing.JList<String> generalList;
    private javax.swing.JButton initButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton pullButton;
    private javax.swing.JButton pushButton;
    private javax.swing.JButton statusIndex;
    private javax.swing.JButton statusLocal;
    private javax.swing.JButton statusRemote;
    private javax.swing.JButton statusWorkspace;
    // End of variables declaration//GEN-END:variables
}