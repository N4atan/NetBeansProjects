/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ClonePokemon;

import javax.swing.BorderFactory;

/**
 *
 * @author gabri
 */
public class TelaTeste extends javax.swing.JFrame {

	/**
	 * Creates new form TelaTeste
	 */
	public TelaTeste() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        DialogueTxtArea = new javax.swing.JTextArea();
        BtnConversar = new javax.swing.JButton();
        BtnAvancar = new javax.swing.JButton();
        BtnInteracao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rota 1");
        setBackground(new java.awt.Color(253, 253, 253));
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(684, 492));
        setResizable(false);
        setSize(new java.awt.Dimension(684, 492));
        getContentPane().setLayout(null);

        jScrollPane2.setToolTipText("");
        jScrollPane2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        DialogueTxtArea.setEditable(false);
        DialogueTxtArea.setColumns(20);
        DialogueTxtArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DialogueTxtArea.setLineWrap(true);
        DialogueTxtArea.setRows(5);
        DialogueTxtArea.setWrapStyleWord(true);
        DialogueTxtArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Narrador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        DialogueTxtArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DialogueTxtArea.setFocusable(false);
        jScrollPane2.setViewportView(DialogueTxtArea);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 260, 660, 152);

        BtnConversar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnConversar.setText("Conversar");
        BtnConversar.setBorder(null);
        BtnConversar.setBorderPainted(false);
        BtnConversar.setFocusPainted(false);
        BtnConversar.setFocusable(false);
        BtnConversar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConversarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnConversar);
        BtnConversar.setBounds(10, 420, 100, 30);
        BtnConversar.setVisible(false);

        BtnAvancar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnAvancar.setText("Continuar Caminhando");
        BtnAvancar.setBorder(null);
        BtnAvancar.setBorderPainted(false);
        BtnAvancar.setFocusPainted(false);
        BtnAvancar.setFocusable(false);
        BtnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAvancarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAvancar);
        BtnAvancar.setBounds(140, 420, 160, 30);
        BtnAvancar.setVisible(false);

        BtnInteracao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnInteracao.setText("...");
        BtnInteracao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnInteracao.setBorderPainted(false);
        BtnInteracao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnInteracao.setFocusable(false);
        BtnInteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInteracaoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnInteracao);
        BtnInteracao.setBounds(580, 420, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\gabri\\OneDrive\\Documentos\\NetBeansProjects\\ClonePokemon\\app\\src\\images\\pokemon_anime_kanto_region_route_1_by_nepheskhaim_dgwzvvh-fullview.png")); // NOI18N
        jLabel1.setFocusable(false);
        jLabel1.setMaximumSize(new java.awt.Dimension(680, 500));
        jLabel1.setMinimumSize(new java.awt.Dimension(680, 500));
        jLabel1.setName(""); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(680, 500));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-400, -60, 1220, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

	public int stage = 0;
    private void BtnConversarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConversarActionPerformed
        // TODO add your handling code here:
		DialogueTxtArea.setBorder(BorderFactory.createTitledBorder("Treinador Douglas"));
		DialogueTxtArea.setText(rota1.interactWithNpc2());
		
		BtnAvancar.setVisible(false);
		BtnConversar.setVisible(false);
		BtnInteracao.setVisible(true);
		
		stage = 1;
    }//GEN-LAST:event_BtnConversarActionPerformed

    private void BtnInteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInteracaoActionPerformed
        // TODO add your handling code here:
        switch(stage) {
            case 0:
            String texto0 = rota1.leavingPallet2();
            if(!texto0.equals("END")) {
                DialogueTxtArea.setText(texto0);

                if(texto0.startsWith("Voce tem 2 opcoes")){
                    BtnAvancar.setVisible(true);
                    BtnConversar.setVisible(true);
                    BtnInteracao.setVisible(false);
                }
            }
            break;

            case 1:
            DialogueTxtArea.setBorder(BorderFactory.createTitledBorder("Narrador"));
            String texto1 = rota1.showEnding2();

            if(!texto1.equals("END")){
                DialogueTxtArea.setText(texto1);
            }

            break;
        }

    }//GEN-LAST:event_BtnInteracaoActionPerformed

    private void BtnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAvancarActionPerformed
        // TODO add your handling code here:
        BtnConversar.setVisible(false);
        BtnInteracao.setVisible(false);

        String texto = rota1.initializationBattle2();

        if(!texto.equals("END")) {
            DialogueTxtArea.setText(texto);

        } else {
            //Logica de batalha
            TelaBatalha telaBatalha = new TelaBatalha();
            this.dispose();
            telaBatalha.setVisible(true);

            stage = 1;
        }

    }//GEN-LAST:event_BtnAvancarActionPerformed

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
				if ("Dark Metal".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(TelaTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TelaTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TelaTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaTeste().setVisible(true);
			}
		});
		
		
	}
	
	
	public Rota1 rota1 = new Rota1();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAvancar;
    private javax.swing.JButton BtnConversar;
    private javax.swing.JButton BtnInteracao;
    private javax.swing.JTextArea DialogueTxtArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}