package org.zefiro.algoritmi.liste;

import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractListModel;

public class PlaylistListModel extends AbstractListModel {

	List<String> righe;
	
	Playlist p;
	
	public PlaylistListModel() {
		righe = new ArrayList<>();
		p = new Playlist();
		p.getPlaylist();
	}
	
	@Override
	public int getSize() {

		return p.getPlaylist().size();
	}

	@Override
	public Object getElementAt(int index) {

		return righe.get(index);
	}

	public void insert(Canzone canzone) {
		
		String element = p.addCanzone(canzone);
		if(element != "") {
			righe.add(element);
			fireContentsChanged(this, 0, getSize()-1);
		}
	}
	

	
	public void clearAll() {
		righe.clear();
		
		fireContentsChanged(this, 0, getSize()-1);
	}
	
	
}
