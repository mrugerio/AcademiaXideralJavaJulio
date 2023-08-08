package com.curso.v1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

enum TypeTran{
	GROCERY, DEBIT, CREDIT
}


class Transaction {
	private int id;
	private int value;
	private TypeTran type;
	
	public Transaction(int id, int value, TypeTran type) {
		this.id = id;
		this.value = value;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public TypeTran getType() {
		return type;
	}

	public void setType(TypeTran type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", value=" + value + ", type=" + type + "]";
	}
	
}

public class Principal {

	public static void main(String[] args) {
		
		Transaction t1 = new Transaction(1,100,TypeTran.DEBIT);
		Transaction t3 = new Transaction(3,80,TypeTran.GROCERY);
		Transaction t6 = new Transaction(6,120,TypeTran.GROCERY);
		Transaction t7 = new Transaction(7,40,TypeTran.CREDIT);
		Transaction t10 = new Transaction(10,50,TypeTran.GROCERY);
		
		List<Transaction> listaTran = new ArrayList<>();
		listaTran.add(t1);
		listaTran.add(t3);
		listaTran.add(t6);
		listaTran.add(t7);
		listaTran.add(t10);

		
//		long res = listaTran.stream()
//		.filter(t -> t.type == TypeTran.GROCERY)
//		.peek(System.out::println)
//		.count();
//		
//		System.out.println(res);
		
		List<Integer> listaEnteros = listaTran.stream()
		.filter(t -> t.getType() == TypeTran.GROCERY)
		//.peek(System.out::println)
		.sorted(Comparator.comparing(Transaction::getValue).reversed())
		//.peek(System.out::println)
		.map(Transaction::getId)
		.collect(Collectors.toList());
		
		System.out.println(listaEnteros);
	}

}

