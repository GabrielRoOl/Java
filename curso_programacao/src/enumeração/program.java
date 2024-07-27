package enumeração;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entitiesProduct.Order;
import entitiesProduct.OrderStatus;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Order order = new Order(180, new Date(), OrderStatus.PEDING_PAYMENT);

		System.out.println(order);
		
		// Converter String em Enum
		
		 OrderStatus os1 = OrderStatus.DELIVERED;
		 OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
	
		 System.out.println(os1);
		 System.out.println(os2);
	}
 
}
