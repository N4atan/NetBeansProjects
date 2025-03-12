/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExpenseManager.model;

/**
 *
 * @author NATANGABRIELWILDNERD
 */
public class Cost {
	private String title;
	private String description;
	private String category;
	private double price;
	private String date;

	public Cost(String title, String description, String category, double price, String date) {
		this.title = title;
		this.description = description;
		this.category = category;
		this.price = price;
		this.date = date;
	}
	
	

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	public String getDate() {
		return date;
	}
	
	
}
