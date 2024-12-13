package main;
import java.util.*;
public class AppendData {
	
	public <T> void append(ArrayList<T> array , T item) {
		if(item == null) throw new IllegalArgumentException("Item cannot be null");
		array.add(item);
	}
	
	
	
}
