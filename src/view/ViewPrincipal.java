/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;



import com.apple.eawt.*;
import control.ClienteControl;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.swing.ImageIcon;
import model.dao.Conexao;
import model.domain.Cliente;
import model.domain.OrdemDeServico;
import model.domain.Produto;
//55
import model.domain.Veiculo;

/**
 *
 * @author eduardo
 * @version 3
 */
public class ViewPrincipal extends javax.swing.JFrame {//implements ActionListener{
    

        
        
ClienteControl clienteClontrol = new ClienteControl();
 ClienteView clienteView = new ClienteView();
 NovaOsView novaOsView = new NovaOsView();
  
    /**
     *
     */
    /**
     * Creates new form MenuView
     */
    public ViewPrincipal() {
        
        initComponents();
     SetIcon();
            //Define que a view sempre carregue como maximizada.
        setExtendedState(MAXIMIZED_BOTH);

        dpnCorpo.add(novaOsView = new NovaOsView(this));
        dpnCorpo.add(clienteView = new ClienteView(this));
  lblOperadorNome.setText("Modo Teste");
    }    public ViewPrincipal(String usuario) {
        this();
        lblOperadorNome.setText(usuario);
 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dpnCorpo = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        lblOperador = new javax.swing.JLabel();
        lblOperadorNome = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        cadastrosMenu = new javax.swing.JMenu();
        clienteMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dpnCorpo.setAutoscrolls(true);
        dpnCorpo.setMaximumSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout dpnCorpoLayout = new javax.swing.GroupLayout(dpnCorpo);
        dpnCorpo.setLayout(dpnCorpoLayout);
        dpnCorpoLayout.setHorizontalGroup(
            dpnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        dpnCorpoLayout.setVerticalGroup(
            dpnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(dpnCorpo);

        jToolBar1.setFloatable(false);
        jToolBar1.setAutoscrolls(true);

        lblOperador.setText("Operador: ");
        jToolBar1.add(lblOperador);
        jToolBar1.add(lblOperadorNome);

        cadastrosMenu.setMnemonic('f');
        cadastrosMenu.setText("Cadastros");

        clienteMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pessoa(32).png"))); // NOI18N
        clienteMenuItem.setMnemonic('o');
        clienteMenuItem.setText("Cliente");
        clienteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteMenuItemActionPerformed(evt);
            }
        });
        cadastrosMenu.add(clienteMenuItem);
        cadastrosMenu.add(jSeparator1);
        cadastrosMenu.add(jSeparator2);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Sair");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        cadastrosMenu.add(exitMenuItem);

        menuBar.add(cadastrosMenu);

        jMenu1.setText("Ordem de Servicos");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem1.setText("Nova O.S.");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Ordem de servicos aberta");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("jMenuItem3");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("jMenuItem4");
        jMenu1.add(jMenuItem4);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void clienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteMenuItemActionPerformed
    if (!clienteView.isVisible()){
        LimparDesktop();
    //           this.dpnCorpo.setMinimumSize(clienteView.getMinimumSize());
//        this.dpnCorpo.add(clienteView);
        clienteView.setVisible(true);
        try {
            clienteView.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
           
          //   ClienteView clienteView = new ClienteView();
      // this.dpnCorpo.setMinimumSize(clienteView.getMinimumSize());
      //  this.dpnCorpo.add(clienteView);
      //  clienteView.setVisible(true);
        
    }//GEN-LAST:event_clienteMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
 if (!novaOsView.isVisible()) {
            LimparDesktop();
            novaOsView.setVisible(true);
            try {
            novaOsView.setMaximum(true);  
      //  this.desktopPane.setMinimumSize(novaOsView.getMinimumSize());
        //this.desktopPane.add(novaOsView);
       // novaOsView.setVisible(true);
       EntityManager entityManager =  Conexao.getEntityManager();
 OrdemDeServico  os = new OrdemDeServico();
 Produto produtos = new Produto();
 produtos.getProdutoId();
entityManager.find(Veiculo.class, 1);
os.setOsVeiculoId(entityManager.find(Veiculo.class, 1));
os.setOsClienteId(entityManager.find(Cliente.class, 1));
//os.setProdutos(new ArrayList<ItemVenda>((Collection<? extends ItemVenda>) produtos));
//os.setProdutos((List<ItemVenda>) entityManager.find(Produto.class, 1));
//os.setOsId(WIDTH);
//os.setProdutos((List<ItemVenda>) entityManager.find(Produto.class, 2));
os.setProblema("teste");
os.setObservacao("tes");
entityManager.getTransaction().begin();
 
 

entityManager.getTransaction().commit();
entityManager.close();
        System.out.println("view.MenuView.jMenuItem1ActionPerformed()"+entityManager.toString());
        } catch (PropertyVetoException ex) {
               Logger.getLogger(NovaOsView.class.getName()).log(Level.SEVERE, null, ex);
            
        }} 
    }//GEN-LAST:event_jMenuItem1ActionPerformed
 private void SetIcon() {
       
        setIconImage(new ImageIcon(getClass().getResource("/Imagens/os21.png")).getImage());
        Application.getApplication().setDockIconImage(
            new ImageIcon(getClass().getResource("/Imagens/os21.png")).getImage());
    } 
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
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             //         SetIcon s = new SetIcon();
    //    s.setVisible(true);
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu cadastrosMenu;
    private javax.swing.JMenuItem clienteMenuItem;
    private javax.swing.JDesktopPane dpnCorpo;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblOperador;
    private javax.swing.JLabel lblOperadorNome;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

   
public final void LimparDesktop() {
        novaOsView.setVisible(false);
        clienteView.setVisible(false);
      //  viewFinanceiro.setVisible(false);
      //  viewPainelControle.setVisible(false);
     //   viewRelatorios.setVisible(false);
     //   viewVendas.setVisible(false);
    //    viewVisaoGeral.setVisible(false);
    }
 


}
