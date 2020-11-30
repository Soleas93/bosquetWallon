package be.soleas.bosquetwallon.model.data;

import java.sql.Connection;

public class OracleDaoFactory extends DaoFactory{
	private static final Connection connection = DriverORACLE.getInstance();
	
	public static final Connection Connect() {
		return connection;
	}
		 
	@Override
	public Dao<Classe> getClasseDAO() {
		// TODO Auto-generated method stub
		return null;
	}

}
