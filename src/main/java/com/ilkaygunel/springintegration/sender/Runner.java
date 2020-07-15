package com.ilkaygunel.springintegration.sender;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import com.ilkaygunel.domain.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

	private final RabbitTemplate rabbitTemplate;

	public Runner(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	@Override
	public void run(String... args) throws Exception {

		Product book = new Book();
		Product perfume = new Perfume();

		LineItem l1 = new LineItem();
		l1.setProduct(book);
		l1.setQty(2);

		System.out.println("Sending first order, two Books & three Perfumes");
		LineItem l2 = new LineItem();
		l2.setProduct(perfume);
		l2.setQty(3);

		ArrayList<LineItem> lineItems1 = new ArrayList<LineItem>();
		lineItems1.add(l1);
		lineItems1.add(l2);

		Order order1 = new Order();
		order1.setId("1001");
		order1.setItems(lineItems1);

		rabbitTemplate.convertAndSend(SenderConfiguration.topicExchangeName, "orders.1", order1);

		TimeUnit.SECONDS.sleep(5);

		System.out.println("Sending second order, five books & two Perfumes");
		LineItem l3 = new LineItem();
		l3.setProduct(book);
		l3.setQty(5);

		LineItem l4 = new LineItem();
		l4.setProduct(perfume);
		l4.setQty(2);

		ArrayList<LineItem> lineItems2 = new ArrayList<LineItem>();
		lineItems2.add(l3);
		lineItems2.add(l4);

		Order order2 = new Order();
		order2.setId("1002");
		order2.setItems(lineItems2);

		rabbitTemplate.convertAndSend(SenderConfiguration.topicExchangeName, "orders.2", order2);
	}
}
