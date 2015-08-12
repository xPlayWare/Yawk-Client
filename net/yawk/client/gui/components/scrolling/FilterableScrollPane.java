package net.yawk.client.gui.components.scrolling;

import java.util.ArrayList;
import java.util.List;

import net.yawk.client.gui.Component;
import net.yawk.client.gui.IPanel;
import net.yawk.client.gui.components.selectors.SelectorButton;

public class FilterableScrollPane extends ScrollPane{
	
	protected List<SelectorButton> componentsPool = new ArrayList<SelectorButton>();
	
	public FilterableScrollPane(IPanel win, int height) {
		super(win, height);
	}

	public void addFilterableComponent(SelectorButton c) {
		this.componentsPool.add(c);
		super.addComponent(c);
	}

	public void applyFilter(String filter){
		
		components.clear();
		
		for(SelectorButton selectorButton : componentsPool){
			if(selectorButton.getStaticText().contains(filter)){
				components.add(selectorButton);
			}
		}
	}
}
