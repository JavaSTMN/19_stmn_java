package exercice2;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Node {
	final List<Node> children;
	final String name;
	
	public Node(String name) {
		this.name = name;
		children = new ArrayList<>();
	}
	
	public void addChild(Node child) {
		children.add(child);
	}
	
	public void addChildren(Node[] children) {
		this.children.addAll(Arrays.asList(children));
	}
	
	public Node getChild(int index) {
		return children.get(index);
	}
	
	public int getNbChildren() {
		return children.size();
	}
	
	public String toString() {
		return name;
	}
	
	/**
	 * Serialize this object as a JSON string.
	 * JSON will look something like this:
	 * {
	 *   "name" : "theName",
	 *   "children" : []
	 * }
	 * @return
	 */
	public String serialize() {
		if (getNbChildren() == 0) {
			return MessageFormat.format("'{' \"name\" : \"{0}\", \"children\" : [] '}'", name);
		}
		
		ArrayList<String> childrenJson = new ArrayList<String>();
		for (Node child:children) {
			childrenJson.add(child.serialize());
		}
		String json = MessageFormat.format("'{' \"name\" : \"{0}\", \"children\" : [{1}] '}'", name, String.join(",", childrenJson));
		
		return json;
	}
}
