package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Order order1 = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		System.out.println(order1);

		OrderStatus order2 = OrderStatus.DELIVERED;
		OrderStatus order3 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(order2);
		System.out.println(order3);
		
	}

}
