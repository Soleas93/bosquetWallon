package be.soleas.bosquetwallon.model.data.oracle;

import be.soleas.bosquetwallon.model.data.interfaces.UserDao;
import be.soleas.bosquetwallon.model.logic.user.User;

public class OracleUserDao implements UserDao{

	@Override
	public boolean Create(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User Read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User Read(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean Update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Delete(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
