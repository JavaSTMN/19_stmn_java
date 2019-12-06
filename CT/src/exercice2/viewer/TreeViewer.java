package exercice2.viewer;

import java.io.FileReader;

import javax.swing.JTree;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class TreeViewer extends JTree {
	public TreeViewer(ITree model) {
		super(new TreeModel() {
			
			ITree tree = model;
			
			@Override
			public void valueForPathChanged(TreePath path, Object newValue) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void removeTreeModelListener(TreeModelListener l) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean isLeaf(Object node) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Object getRoot() {
				// TODO Auto-generated method stub
				return tree.getRoot();
			}
			
			@Override
			public int getIndexOfChild(Object parent, Object child) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getChildCount(Object parent) {
				// TODO Auto-generated method stub
				return tree.getChildCount(parent);
			}
			
			@Override
			public Object getChild(Object parent, int index) {
				// TODO Auto-generated method stub
				return tree.getChild(parent, index);
			}
			
			@Override
			public void addTreeModelListener(TreeModelListener l) {
				// TODO Auto-generated method stub
				
			}
			
			public String serialize(FileReader reader) {
				return "C'est ici que je voulais écrire le code de récupération du JSON, de sa lecture et de la création d'objets à partir de celui-ci pour ensuite gérer l'affichage.";
			}
		});
	}
}
