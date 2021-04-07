/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.folderheirachy;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Cliftonb
 */
public class UIMain extends javax.swing.JFrame {

	/**
	 * Creates new form UIMain
	 */
	public UIMain(File file) {
		initComponents();
		//logoPanel.setImage(new ImageIcon("images/logo.jpg").getImage());

		fileTreePanel1.init(file);
		setLocationRelativeTo(null);

		FrameDragListener f = new FrameDragListener(this);
		HeaderPanel.addMouseListener(f);
		HeaderPanel.addMouseMotionListener(f);


		URL url = getClass().getResource("images/logoR.jpeg");
		System.out.println("Url: " + url);
		Image scaled = new javax.swing.ImageIcon(url).getImage().getScaledInstance(60, 51, Image.SCALE_DEFAULT);
		ImageIcon logoIcon = new javax.swing.ImageIcon(scaled);
                logo.setIcon(logoIcon); // NOI18N

		
		
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                HeaderPanel = new javax.swing.JPanel();
                ExitLabel = new javax.swing.JLabel();
                companyLabel = new javax.swing.JLabel();
                logo = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                fileTreePanel1 = new com.mycompany.folderheirachy.FileTreePanel();
                buttonPanel = new javax.swing.JPanel();
                expandFrameworkButton = new javax.swing.JButton();
                expandAllButton = new javax.swing.JButton();
                CollapseAllButton = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBackground(new java.awt.Color(51, 51, 51));
                setForeground(new java.awt.Color(51, 51, 51));
                setUndecorated(true);
                setResizable(false);

                HeaderPanel.setBackground(new java.awt.Color(255, 255, 255));
                HeaderPanel.setForeground(new java.awt.Color(102, 102, 102));

                ExitLabel.setBackground(new java.awt.Color(255, 255, 255));
                ExitLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                ExitLabel.setForeground(new java.awt.Color(102, 102, 102));
                ExitLabel.setText("X");
                ExitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                ExitLabelMouseClicked(evt);
                        }
                });

                companyLabel.setBackground(new java.awt.Color(255, 255, 255));
                companyLabel.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
                companyLabel.setText("Project Viewer");

                javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
                HeaderPanel.setLayout(HeaderPanelLayout);
                HeaderPanelLayout.setHorizontalGroup(
                        HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(HeaderPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(companyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ExitLabel)
                                .addGap(15, 15, 15))
                );
                HeaderPanelLayout.setVerticalGroup(
                        HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(HeaderPanelLayout.createSequentialGroup()
                                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(HeaderPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ExitLabel)
                                                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(HeaderPanelLayout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(companyLabel)))
                                .addContainerGap(12, Short.MAX_VALUE))
                );

                jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
                jScrollPane1.setBorder(null);
                jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

                fileTreePanel1.setBackground(new java.awt.Color(255, 255, 255));
                jScrollPane1.setViewportView(fileTreePanel1);

                buttonPanel.setBackground(new java.awt.Color(255, 255, 255));
                buttonPanel.setLayout(new java.awt.GridLayout(1, 0));

                expandFrameworkButton.setText("Expand framework");
                expandFrameworkButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                expandFrameworkButtonActionPerformed(evt);
                        }
                });
                buttonPanel.add(expandFrameworkButton);

                expandAllButton.setText("Expand all");
                expandAllButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                expandAllButtonActionPerformed(evt);
                        }
                });
                buttonPanel.add(expandAllButton);

                CollapseAllButton.setText("Collapse all");
                CollapseAllButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                CollapseAllButtonActionPerformed(evt);
                        }
                });
                buttonPanel.add(CollapseAllButton);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1)
                        .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void ExitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabelMouseClicked
                // TODO add your handling code here:
		System.exit(0);
        }//GEN-LAST:event_ExitLabelMouseClicked

        private void expandFrameworkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expandFrameworkButtonActionPerformed
                // TODO add your handling code here:
		fileTreePanel1.expandFirstChildren();
        }//GEN-LAST:event_expandFrameworkButtonActionPerformed

        private void expandAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expandAllButtonActionPerformed
                // TODO add your handling code here:
		fileTreePanel1.expandTree();
        }//GEN-LAST:event_expandAllButtonActionPerformed

        private void CollapseAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CollapseAllButtonActionPerformed
                // TODO add your handling code here:
		fileTreePanel1.collapseTree();
        }//GEN-LAST:event_CollapseAllButtonActionPerformed

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
			java.util.logging.Logger.getLogger(UIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(UIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(UIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(UIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				String filePath = args[0];
				//String filePath = "C:\\Users\\Cliftonb\\Downloads";
				new UIMain(new File(filePath)).setVisible(true);
			}
		});
	}

	public static class FrameDragListener extends MouseAdapter {

		private final JFrame frame;
		private Point mouseDownCompCoords = null;

		public FrameDragListener(JFrame frame) {
		    this.frame = frame;
		}

		public void mouseReleased(MouseEvent e) {
		    mouseDownCompCoords = null;
		}

		public void mousePressed(MouseEvent e) {
		    mouseDownCompCoords = e.getPoint();
		}

		public void mouseDragged(MouseEvent e) {
		    Point currCoords = e.getLocationOnScreen();
		    frame.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
		}
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton CollapseAllButton;
        private javax.swing.JLabel ExitLabel;
        private javax.swing.JPanel HeaderPanel;
        private javax.swing.JPanel buttonPanel;
        private javax.swing.JLabel companyLabel;
        private javax.swing.JButton expandAllButton;
        private javax.swing.JButton expandFrameworkButton;
        private com.mycompany.folderheirachy.FileTreePanel fileTreePanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel logo;
        // End of variables declaration//GEN-END:variables
}