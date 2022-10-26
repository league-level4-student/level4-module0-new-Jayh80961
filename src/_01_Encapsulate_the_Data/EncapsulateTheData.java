package _01_Encapsulate_the_Data;

public class EncapsulateTheData {

	// 1. Encapsulate all the members.
	private int itemsReceived;
	private Object memberObj;
	private double degreesTurned;
	private String nomenclature;
	// 2. Implement the setter restrictions described above each member variable.

	// 3. Pass all the JUnit tests.
	
	/* 
	 * All negative arguments should set itemsReceived to 0.
	 */

	
	public void setItemsReceived(int randomPositiveNum) {
		if(randomPositiveNum<0) {
			this.itemsReceived = 0;
		}
		else {
			this.itemsReceived = randomPositiveNum;
		}
	}
	public Integer getItemsReceived() {
		return itemsReceived;
	}
	
	/*
	 * degreesTurned must be locked between 0.0 and 360.0 inclusive.
	 * 
	 * All parameters outside this range should set degreesTurned to the nearest
	 * bound.
	 */


	public void setDegreesTurned(double randomPositiveNum) {
		if(randomPositiveNum>360) {
			this.itemsReceived = 360;
		}
		else if(randomPositiveNum<0) {
			this.itemsReceived = 0;
		}
		else {
			this.degreesTurned = randomPositiveNum;
		}
	}
	public Double getDegreesTurned() {
		return degreesTurned;
	}
	/*
	 * nomenclature must not contain an empty String.
	 * 
	 * An empty String parameter should set nomenclature to a String with a single
	 * space.
	 */

	
	public void setNomenclature(String randomString) {
		if(randomString.isBlank()) {
			this.nomenclature = " ";
		}
		else {
			this.nomenclature = randomString;
		}
	}
	public Object getNomenclature() {
		return nomenclature;
	}
	/*
	 * memberObj must not be a String.
	 * 
	 * A String parameter should set memberObj to a new Object();
	 * 
	 * Hint: Use the instanceof operator.
	 * 
	 * Example:
	 * 
	 * Robot rob = new Robot();
	 * 
	 * System.out.println(rob instanceof Robot); // prints true
	 * 
	 * System.out.println(rob instanceof Random); //prints false
	 */


	public void setMemberObj(Object randomObject) {
		if(!(randomObject instanceof String)) {
			this.memberObj = randomObject;
		}
	}
	public Object getMemberObj() {
		return memberObj;
	}
	
}
