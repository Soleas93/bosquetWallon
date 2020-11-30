package be.soleas.bosquetwallon.model.data.interfaces;

import be.soleas.bosquetwallon.model.logic.user.User;

public interface UserDao {
	
	public boolean Create(User user);
	
	public User Read(int id);
	
	public User Read(String username);
	
	public boolean Update(User user);
	
	public boolean Delete(User user);
	

}
