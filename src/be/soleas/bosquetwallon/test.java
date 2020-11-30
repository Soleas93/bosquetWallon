package be.soleas.bosquetwallon;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import be.soleas.bosquetwallon.model.logic.invoicing.payment.PaymentSepa;
import be.soleas.bosquetwallon.model.logic.scheduling.DateTimeLength;
import be.soleas.bosquetwallon.model.logic.scheduling.TimeLength;

public class test {

	public static void main(String[] args) {
		PaymentSepa sepa = new PaymentSepa();
		
		System.out.println("communication : "+sepa.GetCommunication());
		
		LocalDateTime begin = LocalDateTime.of(2020, 11, 25, 12, 0);
		LocalDateTime end = LocalDateTime.of(2020, 11, 27, 12, 0);
		
		TimeLength schedule;
		try {
			schedule = new DateTimeLength(begin, end);
			int numOfDays = (int) schedule.GetBeginDate().until(schedule.GetEndDate(), ChronoUnit.DAYS);
			System.out.println("Num of days : "+numOfDays);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		// TODO Auto-generated method stub

	}

}
