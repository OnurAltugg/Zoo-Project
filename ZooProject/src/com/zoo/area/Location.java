package com.zoo.area;

import java.util.Random;

public class Location {
	
	private int rowPosition;
	private int columnPosition;
	
	public Location() {
		Random random = new Random();
		setRowPosition(random.nextInt(500));
		setColumnPosition(random.nextInt(500));
	}

	public int getRowPosition() {
		return rowPosition;
	}

	public void setRowPosition(int rowPosition) {
		this.rowPosition = rowPosition;
	}

	public int getColumnPosition() {
		return columnPosition;
	}

	public void setColumnPosition(int columnPosition) {
		this.columnPosition = columnPosition;
	}
	
}
