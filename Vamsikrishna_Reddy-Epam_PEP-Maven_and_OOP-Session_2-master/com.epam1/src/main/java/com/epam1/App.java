package com.epam1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "New year's Gifts!\n" );
        Thread.sleep(2000);
    
        Child alice = new Child("Alice");
        Child bob = new Child("Bob");

        System.out.println( "Created two children Alice and Bob.\n" );
        
        alice.addChocolate(new Chocolate(50,150,"Red"));
        alice.addChocolate(new Chocolate(5,50,"Blue"));
        alice.addChocolate(new Chocolate(100,500,"Yellow"));
        
        bob.addChocolate(new Chocolate(200,190,"Green"));
        bob.addChocolate(new Chocolate(45,90,"Pink"));
        bob.addChocolate(new Chocolate(160,40,"Brown"));
        
        alice.addSweet(new Sweet(23,95,"lemon"));
        alice.addSweet(new Sweet(63,85,"orange"));
        alice.addSweet(new Sweet(33,34,"apple"));

        bob.addSweet(new Sweet(35,68,"berry"));
        bob.addSweet(new Sweet(46,95,"rose"));
        bob.addSweet(new Sweet(13,85,"mango"));
        
        
        System.out.println( "Giving 3 chocolates and 3 candies to Alice and Bob each...\n" );
        Thread.sleep(2000);
        
        System.out.println( "Done." );

        System.out.println( "\nAlice Sweets-\n" );
        Thread.sleep(500);
        for(Sweet sweet:alice.getSweets()) {
            System.out.println( sweet.getName()+" of weight "+sweet.getWeight()+"g having sweetness "+sweet.getSweetness() );
        }
        
        System.out.println( "\nAlice Chocolates-\n" );
        Thread.sleep(500);
        for(Chocolate chocolate:alice.getChocolates()) {
            System.out.println( chocolate.getName()+" of weight "+chocolate.getWeight()+"g having sweetness "+chocolate.getSweetness() );
        }
        
        System.out.println( "\nBob Sweets-\n" );
        Thread.sleep(500);
        for(Sweet sweet:bob.getSweets()) {
            System.out.println( sweet.getName()+" of weight "+sweet.getWeight()+"g having sweetness "+sweet.getSweetness() );
        }
        
        System.out.println( "\nBob Chocolates-\n" );
        Thread.sleep(500);
        for(Chocolate chocolate:bob.getChocolates()) {
            System.out.println( chocolate.getName()+" of weight "+chocolate.getWeight()+"g having sweetness "+chocolate.getSweetness() );
        }
        
        System.out.println("Calculating total weight of chocolates...\n");
        Thread.sleep(2000);
        
        System.out.println("Alice has "+ alice.getTotalGiftWeight() +" grams of gifts in total.");
        System.out.println("Bob has "+ bob.getTotalGiftWeight() +" grams of gifts in total.");
        
        System.out.println("\nBob wants to sort his Chocolates by sweetness...\n");
        Thread.sleep(2000);
        
        System.out.println("Done.");
        
        bob.sortChocolatesBySweetness();
        
        System.out.println( "\nBob Chocolates-" );
        for(Chocolate chocolate:bob.getChocolates()) {
            System.out.println( chocolate.getName()+" of weight "+chocolate.getWeight()+"g having sweetness "+chocolate.getSweetness() );
        }
        
        System.out.println( "\nAlice wants to find lemon in her sweets-" );
        System.out.println( "searching...\n" );
        Thread.sleep(2000);
        System.out.println( alice.findSweetInSweets("lemon")?"Found":"Not Found" );
        
        System.out.println( "\nAlice wants to find mango in her sweets-" );
        System.out.println( "searching...\n" );
        Thread.sleep(1000);
        System.out.println( alice.findSweetInSweets("mango")?"Found":"Not Found" );
        
        System.out.println( "\nAlice wants to find apple in her sweets-" );
        System.out.println( "searching...\n" );
        Thread.sleep(3000);
        System.out.println( alice.findSweetInSweets("apple")?"Found":"Not Found" );

        
        System.out.println("\nBye World!");
            
    }
}
