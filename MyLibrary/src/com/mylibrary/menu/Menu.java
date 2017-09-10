package com.mylibrary.menu;

public class Menu {
	
	public static void showMainMenu(){
		System.out.println("Library's menu:\n");
		System.out.println("0   -    add printed production\n");
		System.out.println("1   -    find printed production\n");
		System.out.println("2   -    show printed production\n");	
		System.out.println("3   -    exit\n");				
	}
	
	public static void showAddingMenu(){
		System.out.println("0   -    add book\n");
		System.out.println("1   -    add newspaper\n");
		System.out.println("2   -    add magazine\n");	
		System.out.println("3   -    back to the main menu\n");
		System.out.println("4   -    exit\n");
	}
	
	public static void showClosingMenu(){
		System.out.println("0   -    back to the main menu\n");
		System.out.println("1   -    exit\n");
	}
	
	public static void showAfterSearchingMenu(){
		System.out.println("0   -    back to previous menu\n");
		System.out.println("1   -    back to the main menu\n");
		System.out.println("2   -    exit\n");
	}
	
	public static void showAfterAddingMenu(){
		System.out.println("0   -    back to previous menu\n");
		System.out.println("1   -    back to the main menu\n");
		System.out.println("2   -    exit\n");
	}
	
	public static void showSeekingMenu(){
		System.out.println("0   -    find book\n");
		System.out.println("1   -    find newspaper\n");
		System.out.println("2   -    find magazine\n");	
		System.out.println("3   -    back to the main menu\n");
		System.out.println("4   -    exit\n");
	}
	
	public static void showSeekingOptionsForBook(){
		System.out.println("0   -    find by name\n");
		System.out.println("1   -    find by author\n");
		System.out.println("2   -    find by genre\n");	
		System.out.println("3   -    find by publishing office\n");	
		System.out.println("4   -    find by language\n");
		System.out.println("5   -    back to previous menu\n");
		System.out.println("6   -    back to the main menu\n");
		System.out.println("7   -    exit\n");
	}
	
	public static void showSeekingOptionsForMassMedia(){
		System.out.println("0   -    find by name\n");
		System.out.println("1   -    find by date of issue\n");
		System.out.println("2   -    find by number of issue\n");	
		System.out.println("3   -    find by language\n");
		System.out.println("4   -    back to previous menu\n");
		System.out.println("5   -    back to the main menu\n");
		System.out.println("6   -    exit\n");
	}
	
	public static void showMenuToSeeAllPrintedProduction(){
		System.out.println("0   -    show all books\n");
		System.out.println("1   -    show all newspapers\n");
		System.out.println("2   -    show all magazines\n");
		System.out.println("3   -    show everything\n");
		System.out.println("4   -    back to the main menu\n");
		System.out.println("5   -    exit\n");
	}
	
	public static void showDisplayingOptionsForBooks(){
		System.out.println("0   -    sort by name\n");
		System.out.println("1   -    sort by author\n");
		System.out.println("2   -    sort by genre\n");	
		System.out.println("3   -    sort by publishing office\n");	
		System.out.println("4   -    sort by language\n");
		System.out.println("5   -    back to previous menu\n");
		System.out.println("6   -    back to the main menu\n");
		System.out.println("7   -    exit\n");
	}
	
	public static void showDisplayingOptionsForMassMedia(){
		System.out.println("0   -    sort by name\n");
		System.out.println("1   -    sort by date of issue\n");
		System.out.println("2   -    sort by number of issue\n");	
		System.out.println("3   -    sort by language\n");
		System.out.println("4   -    back to previous menu\n");
		System.out.println("5   -    back to the main menu\n");
		System.out.println("6   -    exit\n");
	}
	
	public static void showMenuAfterDisplayingAllPrintedProduction(){
		System.out.println("0   -    read by number\n");
		System.out.println("1   -    remove by number\n");
		System.out.println("2   -    back to previous menu\n");
		System.out.println("3   -    back to the main menu\n");
		System.out.println("4   -    exit\n");
	}

}
