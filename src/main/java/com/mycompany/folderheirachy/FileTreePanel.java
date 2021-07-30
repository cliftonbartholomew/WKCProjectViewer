/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.folderheirachy;

import java.awt.FlowLayout;
import java.io.File;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
//test comment 2

/**
 *
 * @author Cliftonb
 */
public class FileTreePanel extends JPanel {

	private JTree tree;

	public FileTreePanel() {
	}

	public void init(File f) {
		FileNode root = new FileNode(f);
		DefaultMutableTreeNode top = new DefaultMutableTreeNode(root);
		createNodes(top);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		tree = new JTree(top);
		//hide the root node to only display the contents.
		//tree.setRootVisible(false);
		tree.addTreeSelectionListener(new TreeSelectionListener() {
			@Override
			public void valueChanged(TreeSelectionEvent e) {
				DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
				FileNode nodeInfo = (FileNode) node.getUserObject();
				nodeInfo.openDirectory();

			}
		});

		tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		add(tree);

	}

	private void createNodes(DefaultMutableTreeNode top) {
		FileNode current = (FileNode) top.getUserObject();
		if (current.getFile().isDirectory()) {
			for (File f : current.getFile().listFiles()) {
				FileNode fn = new FileNode(f);
				DefaultMutableTreeNode dmtn = new DefaultMutableTreeNode(fn);
				top.add(dmtn);
				createNodes(dmtn);
			}
		}
	}

	public void expandTree() {
		for (int i = 0; i < tree.getRowCount(); i++) {
			tree.expandRow(i);
		}
	}

	public void collapseTree() {
		int count = tree.getRowCount();
		for (int i = count; i > 0; i--) {
			tree.collapseRow(i);
		}
	}

	public void expandFirstChildren() {
		int count = tree.getRowCount();
		for (int i = count; i >= 0; i--) {
			tree.expandRow(i);
		}

	}

}
