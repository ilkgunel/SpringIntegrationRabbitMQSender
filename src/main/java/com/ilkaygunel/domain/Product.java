package com.ilkaygunel.domain;

import java.io.Serializable;

public class Product implements Serializable {
	char type;
	int price;

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
