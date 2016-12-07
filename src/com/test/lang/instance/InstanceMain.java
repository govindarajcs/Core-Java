package com.test.lang.instance;

public class InstanceMain {

	public static void main(String[] args) {
		InstanceEntity entity = new InstanceEntity("RAJ", 1);
		InstanceEntity entity1 = new InstanceEntity("RAJ", 1);
		InstanceEntity entity2 = null;
		
		System.out.println(entity.equals(entity1));
		System.out.println(entity.equals(entity2));
		System.out.println(entity2 instanceof InstanceEntity); // instance of to null is always false.

	}

}
