/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.folderheirachy;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cliftonb
 */
public class FileNode {

	private File f;

	public FileNode(File f){
		this.f = f;
	}

	public File getFile(){
		return f;
	}

	public String toString(){
		return f.getName();
	}

	public void openDirectory(){

		Desktop d = Desktop.getDesktop();
		try {
			d.open(f);
		} catch (IOException ex) {
			Logger.getLogger(FileNode.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}

