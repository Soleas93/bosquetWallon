package be.soleas.bosquetwallon.model.logic.show;

import java.util.*;


/**
 * 
 */
public class Configuration implements IModel, Cloneable {
	
	private String title;
	
	private List<Category> categories = new ArrayList<Category>();
	private boolean isModel = true;

	/**
	 * Default constructor
	 */
	public Configuration(String title, List<Category> categories, boolean isModel) {
		SetTitle(title);
		SetCategories(categories);
		this.isModel = isModel;
	}
	
	public Configuration(String title, List<Category> categories) {
		this(title, categories, true);
	}
	
	private void SetTitle(String title) {
		this.title = title;
	}
	
	public String GetTitle() {
		return title;
	}
	
	public void AddCategory(Category category) {
		categories.add(category);
	}
	
	public void RemoveCategory(Category category) {
		if(categories.contains(category))
			categories.remove(category);
	}

	public List<Category> GetCategories() {
		return categories;
	}

	private void SetCategories(List<Category> categories) {
		this.categories = categories;
	}

	@Override
	public boolean IsModel() {
		return isModel;
	}
	
	@Override
	public Object clone() {
		Configuration c = null;
		try {
			c = (Configuration) super.clone();
		}catch(CloneNotSupportedException cose) {
			cose.printStackTrace(System.err);
		}
		
		c.isModel = false;
		c.SetTitle(new String(title));
		
		for(Category cat : categories)			
			c.AddCategory((Category)cat.clone());
		
		return c;
	}


}