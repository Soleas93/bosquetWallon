package be.soleas.bosquetwallon.model.data;

import be.soleas.bosquetwallon.model.data.interfaces.*;

public abstract class DaoFactory {
	
	public abstract UserDao GetUserDAO(); //Interface
	
	//User, Person, Booking, InvoiceDetail, Show, (Performance), Configuration, (Category), Shipping, Ticket, Payment
	
	public static DaoFactory GetFactory(DaoType type){
		switch(type){
		case ORACLE:
			return new OracleDaoFactory();
		default:
			return null;
		}
	}
}
