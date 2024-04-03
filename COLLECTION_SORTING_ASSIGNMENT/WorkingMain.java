package collectionandsortingassignment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class WorkingMain {
	
	//objects of customer class
	Customer cust1 = new Customer(1l, "Stefan Walker", 1);
	Customer cust2 = new Customer(2l, "Daija Von", 1);
	Customer cust3 = new Customer(3l, "Ariane Rodriguez", 1);
	Customer cust4 = new Customer(4l, "Marques Nikolaus", 2);
	Customer cust5 = new Customer(5l, "Rachelle Greenfelder", 0);
	Customer cust6 = new Customer(6l, "Larissa White", 2);
	Customer cust7 = new Customer(7l, "Fae Heidenreich", 1);
	Customer cust8 = new Customer(8l, "Dino Will", 2);
	Customer cust9 = new Customer(9l, "Eloy Stroman", 1);
	Customer cust10 = new Customer(10l, "Brisa O'Connell", 1);
	
	//objects of product class
	Product prod1 = new Product(1l, "omnis quod consequatur", "Games", 184.83);
	Product prod2 = new Product(2l, "vel libero suscipit", "Toys", 12.66);
	Product prod3 = new Product(3l, "non nemo iure", "Grocery", 498.02);
	Product prod4 = new Product(4l, "voluptatem voluptas aspernatur", "Toys", 536.80);
	Product prod5 = new Product(5l, "animi cum rem", "Games", 458.20);
	Product prod6 = new Product(6l, "dolorem porro debitis", "Toys", 146.52);
	Product prod7 = new Product(7l, "aspernatur rerum qui", "Books", 656.42);
	Product prod8 = new Product(8l, "deleniti earum et", "Baby", 41.46);
	Product prod9 = new Product(9l, "voluptas ut quidem", "Books", 697.57);
	Product prod10 = new Product(10l, "eos sed debitis", "Baby", 366.90);
	Product prod11 = new Product(11l, "laudantium sit nihil", "Toys", 95.50);
	Product prod12 = new Product(12l, "ut perferendis corporis", "Grocery", 302.19);
	Product prod13 = new Product(13l, "sint voluptatem ut", "Toys", 295.37);
	Product prod14= new Product(14l, "quos sunt ipsam", "Grocery", 534.64);
	Product prod15 = new Product(15l, "qui illo error", "Baby", 623.58);
	Product prod16 = new Product(16l, "aut ex ducimus", "Books", 551.39);
	Product prod17 = new Product(17l, "accusamus repellendus minus", "Books", 240.58);
	Product prod18 = new Product(18l, "aut accusamus quia", "Baby", 881.38);
	Product prod19 = new Product(19l, "doloremque incidunt sed", "Games", 988.49);
	Product prod20 = new Product(20l, "libero omnis velit", "Baby", 177.61);
	Product prod21 = new Product(21l, "consectetur cupiditate sunt", "Toys", 95.46);
	Product prod22 = new Product(22l, "itaque ea qui", "Baby", 677.78);
	Product prod23 = new Product(23l, "non et nulla", "Grocery", 70.49);
	Product prod24 = new Product(24l, "veniam consequatur et", "Books", 893.44);
	Product prod25 = new Product(25l, "magnam adipisci voluptate", "Grocery", 366.13);
	Product prod26 = new Product(26l, "reiciendis consequuntur placeat", "Toys", 359.27);
	Product prod27 = new Product(27l, "dolores ipsum sit", "Toys", 786.99);
	Product prod28 = new Product(28l, "ut hic tempore", "Toys", 316.09);
	Product prod29 = new Product(29l, "quas quis deserunt", "Toys", 772.78);
	Product prod30 = new Product(30l, "excepturi nesciunt accusantium", "Toys", 911.46);
	
	//objects of order class
	Order order1 =new Order(1l, LocalDate.of(2021,2,28), LocalDate.of(2021,3,8), "NEW", 5l);
	Order order2 =new Order(2l, LocalDate.of(2021,2,28), LocalDate.of(2021,3,5), "NEW", 3l);
	Order order3 =new Order(3l, LocalDate.of(2021,4,10), LocalDate.of(2021,4,18), "DELIVERED", 5l);
	Order order4 =new Order(4l, LocalDate.of(2021,3,22), LocalDate.of(2021,3,27), "PENDING", 3l);
	Order order5 =new Order(5l, LocalDate.of(2021,3,4), LocalDate.of(2021,3,12), "NEW", 1l);
	Order order6 =new Order(6l, LocalDate.of(2021,3,30), LocalDate.of(2021,4,7), "DELIVERED", 9l);
	Order order7 =new Order(7l, LocalDate.of(2021,3,5), LocalDate.of(2021,3,9), "PENDING", 8l);
	Order order8 =new Order(8l, LocalDate.of(2021,3,27), LocalDate.of(2021,4,5), "NEW", 4l);
	Order order9 =new Order(9l, LocalDate.of(2021,4,14), LocalDate.of(2021,4,18), "NEW", 10l);
	Order order10 =new Order(10l, LocalDate.of(2021,3,10), LocalDate.of(2021,3,19), "NEW", 8l);
	Order order11=new Order(11l, LocalDate.of(2021,4,1), LocalDate.of(2021,4,4), "DELIVERED", 1l);
	Order order12 =new Order(12l, LocalDate.of(2021,2,24), LocalDate.of(2021,2,28), "PENDING", 5l);
	Order order13 =new Order(13l, LocalDate.of(2021,3,15), LocalDate.of(2021,3,21), "NEW", 5l);
	Order order14 =new Order(14l, LocalDate.of(2021,3,30), LocalDate.of(2021,4,7), "PENDING", 4l);
	Order order15 =new Order(15l, LocalDate.of(2021,3,13), LocalDate.of(2021,3,14), "DELIVERED", 5l);
	Order order16 =new Order(16l, LocalDate.of(2021,3,13), LocalDate.of(2021,3,21), "NEW", 1l);
	Order order17 =new Order(17l, LocalDate.of(2021,3,31), LocalDate.of(2021,3,31), "DELIVERED", 6l);
	Order order18 =new Order(18l, LocalDate.of(2021,3,25), LocalDate.of(2021,3,31), "PENDING", 9l);
	Order order19 =new Order(19l, LocalDate.of(2021,2,28), LocalDate.of(2021,3,9), "DELIVERED", 9l);
	Order order20 =new Order(20l, LocalDate.of(2021,3,23), LocalDate.of(2021,3,30), "NEW", 5l);
	Order order21 =new Order(21l, LocalDate.of(2021,3,19), LocalDate.of(2021,3,24), "DELIVERED", 9l);
	Order order22 =new Order(22l, LocalDate.of(2021,2,27), LocalDate.of(2021,3,1), "NEW", 5l);
	Order order23 =new Order(23l, LocalDate.of(2021,4,19), LocalDate.of(2021,4,24), "PENDING", 4l);
	Order order24 =new Order(24l, LocalDate.of(2021,3,24), LocalDate.of(2021,3,24), "DELIVERED", 1l);
	Order order25 =new Order(25l, LocalDate.of(2021,3,3), LocalDate.of(2021,3,10), "NEW", 1l);
	Order order26 =new Order(26l, LocalDate.of(2021,3,17), LocalDate.of(2021,3,26), "NEW", 10l);
	Order order27 =new Order(27l, LocalDate.of(2021,3,20), LocalDate.of(2021,3,25), "NEW", 1l);
	Order order28 =new Order(28l, LocalDate.of(2021,4,9), LocalDate.of(2021,4,16), "DELIVERED", 2l);
	Order order29 =new Order(29l, LocalDate.of(2021,4,6), LocalDate.of(2021,4,8), "PENDING", 1l);
	Order order30 =new Order(30l, LocalDate.of(2021,4,19), LocalDate.of(2021,4,20), "DELIVERED", 1l);
	Order order31 =new Order(31l, LocalDate.of(2021,3,3), LocalDate.of(2021,3,4), "NEW", 3l);
	Order order32 =new Order(32l, LocalDate.of(2021,3,15), LocalDate.of(2021,3,24), "DELIVERED", 2l);
	Order order33 =new Order(33l, LocalDate.of(2021,4,18), LocalDate.of(2021,4,24), "PENDING", 1l);
	Order order34 =new Order(34l, LocalDate.of(2021,3,28), LocalDate.of(2021,3,28), "NEW", 6l);
	Order order35 =new Order(35l, LocalDate.of(2021,3,15), LocalDate.of(2021,3,17), "NEW", 1l);
	Order order36 =new Order(36l, LocalDate.of(2021,3,4), LocalDate.of(2021,3,8), "DELIVERED", 2l);
	Order order37 =new Order(37l, LocalDate.of(2021,3,18), LocalDate.of(2021,3,25), "NEW", 8l);
	Order order38 =new Order(38l, LocalDate.of(2021,4,11), LocalDate.of(2021,4,20), "NEW", 8l);
	Order order39 =new Order(39l, LocalDate.of(2021,4,12), LocalDate.of(2021,4,17), "NEW", 9l);
	Order order40 =new Order(40l, LocalDate.of(2021,3,12), LocalDate.of(2021,3,12), "PENDING", 3l);
	Order order41 =new Order(41l, LocalDate.of(2021,2,24), LocalDate.of(2021,2,26), "NEW", 5l);
	Order order42 =new Order(42l, LocalDate.of(2021,4,8), LocalDate.of(2021,4,14), "DELIVERED", 9l);
	Order order43 =new Order(43l, LocalDate.of(2021,3,3), LocalDate.of(2021,3,11), "NEW", 3l);
	Order order44 =new Order(44l, LocalDate.of(2021,3,12), LocalDate.of(2021,3,14), "DELIVERED", 4l);
	Order order45 =new Order(45l, LocalDate.of(2021,4,1), LocalDate.of(2021,4,6), "DELIVERED", 1l);
	Order order46 =new Order(46l, LocalDate.of(2021,3,16), LocalDate.of(2021,3,22), "NEW", 10l);
	Order order47 =new Order(47l, LocalDate.of(2021,4,7), LocalDate.of(2021,4,12), "PENDING", 2l);
	Order order48 =new Order(48l, LocalDate.of(2021,4,5), LocalDate.of(2021,4,6), "NEW", 2l);
	Order order49 =new Order(49l, LocalDate.of(2021,4,10), LocalDate.of(2021,4,13), "NEW", 7l);
	Order order50 =new Order(50l, LocalDate.of(2021,3,18), LocalDate.of(2021,3,21), "NEW", 9l);
	
	//creating prodList
	
	//Set<Product> prodList = new TreeSet<Product>();
	//prodList.add(prod1);
	
	List<Product> prodList = new ArrayList<Product>();
	//prodList.add(prod1);


}
