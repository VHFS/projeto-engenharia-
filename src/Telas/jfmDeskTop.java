/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

/**
 *
 * @author aluno
 */
public class jfmDeskTop extends javax.swing.JFrame {

    /**
     * Creates new form jfmDeskTop
     */
    public jfmDeskTop() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Desktop = new javax.swing.JDesktopPane();
        BarraMenuDesktop = new javax.swing.JMenuBar();
        Bibliotecaria = new javax.swing.JMenu();
        CadastroLivro = new javax.swing.JMenuItem();
        Emprestimos = new javax.swing.JMenuItem();
        Aluno = new javax.swing.JMenu();
        PesquisarLivro = new javax.swing.JMenuItem();
        MinhasReservas = new javax.swing.JMenuItem();
        ListaDeFavoritos = new javax.swing.JMenuItem();
        MinhasMultas = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );

        Bibliotecaria.setText("Bibliotecaria ");

        CadastroLivro.setText("Cadastrar Livros");
        CadastroLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroLivroActionPerformed(evt);
            }
        });
        Bibliotecaria.add(CadastroLivro);

        Emprestimos.setText("Emprestimos");
        Bibliotecaria.add(Emprestimos);

        BarraMenuDesktop.add(Bibliotecaria);

        Aluno.setText("Aluno");

        PesquisarLivro.setText("Pesquisar Livros");
        PesquisarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarLivroActionPerformed(evt);
            }
        });
        Aluno.add(PesquisarLivro);

        MinhasReservas.setText("Minhas Reservas");
        MinhasReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinhasReservasActionPerformed(evt);
            }
        });
        Aluno.add(MinhasReservas);

        ListaDeFavoritos.setText("Lista de Favoritos");
        ListaDeFavoritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaDeFavoritosActionPerformed(evt);
            }
        });
        Aluno.add(ListaDeFavoritos);

        MinhasMultas.setText("Minhas Multas");
        MinhasMultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinhasMultasActionPerformed(evt);
            }
        });
        Aluno.add(MinhasMultas);

        BarraMenuDesktop.add(Aluno);

        setJMenuBar(BarraMenuDesktop);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastroLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroLivroActionPerformed
        // TODO add your handling code here:                                
        TelaCadastroLivro tela = new TelaCadastroLivro();
        
        tela.setVisible(true);
        Desktop.add (tela);
    }//GEN-LAST:event_CadastroLivroActionPerformed

    private void PesquisarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarLivroActionPerformed
        // TODO add your handling code here:
        
              TelaPesquisarLivros tela = new TelaPesquisarLivros();
        
        tela.setVisible(true);
        Desktop.add (tela);
        
    }//GEN-LAST:event_PesquisarLivroActionPerformed

    private void ListaDeFavoritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaDeFavoritosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaDeFavoritosActionPerformed

    private void MinhasReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinhasReservasActionPerformed

         TelaMinhasReservas tela= new TelaMinhasReservas();
        
          tela.setVisible(true);
        Desktop.add (tela);
// TODO add your handling code here:
    }//GEN-LAST:event_MinhasReservasActionPerformed

    private void MinhasMultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinhasMultasActionPerformed
 
        TelaMinhasMultas tela;
        
        tela = new TelaMinhasMultas();
        tela.setVisible(true);
        Desktop.add (tela);        
// TODO add your handling code here:
    }//GEN-LAST:event_MinhasMultasActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(jfmDeskTop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfmDeskTop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfmDeskTop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfmDeskTop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfmDeskTop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Aluno;
    private javax.swing.JMenuBar BarraMenuDesktop;
    private javax.swing.JMenu Bibliotecaria;
    private javax.swing.JMenuItem CadastroLivro;
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem Emprestimos;
    private javax.swing.JMenuItem ListaDeFavoritos;
    private javax.swing.JMenuItem MinhasMultas;
    private javax.swing.JMenuItem MinhasReservas;
    private javax.swing.JMenuItem PesquisarLivro;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
