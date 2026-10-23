package org.designPattern;

import org.designPattern.ObserverPattern.YoutubeChannel;
import org.designPattern.ObserverPattern.YoutubeChannelImpl;
import org.designPattern.ObserverPattern.YoutubeSubscriber;
import org.designPattern.SnakeGame.FoodItems.FoodFactory;
import org.designPattern.SnakeGame.FoodItems.FoodItem;
import org.designPattern.SnakeGame.Movement.HumanMovement;
import org.designPattern.SnakeGame.SnakeGameController;
import org.designPattern.StatePattern.TrafficeLightContext;
import org.designPattern.Strategy.CreditCard;
import org.designPattern.Strategy.DebitCard;
import org.designPattern.Strategy.PaymentProcessor;
import org.designPattern.Strategy.Upi;
import org.designPattern.TickTacToe.Players.HumanPlayer;
import org.designPattern.TickTacToe.Players.PlayerStrategy;
import org.designPattern.TickTacToe.TicTacToeGame;
import org.designPattern.factory.*;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        HumanMovement humanMovement = new HumanMovement();

        ArrayList<FoodItem> foodItemList = new ArrayList<>(List.of(FoodFactory.createFood(new int[]{1, 2}, ""),
                FoodFactory.createFood(new int[]{1, 2}, ""),
                FoodFactory.createFood(new int[]{1, 2}, ""),
                FoodFactory.createFood(new int[]{1, 2}, ""),
                FoodFactory.createFood(new int[]{1, 2}, "")));

        SnakeGameController game =new SnakeGameController(10, 10, foodItemList, humanMovement);

        System.out.println("===== SNAKE GAME =====");
        System.out.println(
                "Controls: W (Up), S (Down), A (Left), D (Right), Q (Quit)");
        System.out.println("Eat food to grow your snake and increase your score.");
        System.out.println("Don't hit the walls or bite yourself!");
        System.out.println("=======================");


//        YoutubeChannelImpl yt = new YoutubeChannelImpl();
//        YoutubeSubscriber subscriber1 = new YoutubeSubscriber("John");
//        YoutubeSubscriber subscriber2 = new YoutubeSubscriber("Alice");
//        yt.addSubscriber(subscriber1);
//        yt.addSubscriber(subscriber2);
//        yt.uploadVideo("Design Patterns in Java");

//        PlayerStrategy playerXStrategy = new HumanPlayer("Player X");
//        PlayerStrategy playerOStrategy = new HumanPlayer("Player O");
//        TicTacToeGame game = new TicTacToeGame(playerXStrategy, playerOStrategy, 3, 3);
//        game.play();


//        CreditCard creditCard=new CreditCard();
//        DebitCard debitCard = new DebitCard();
//        Upi upi=new Upi();
//
//        Vehicle v1 = VehicleFactory.getVehicle("CAR");
//        v1.start();
//        v1.stop();
//        PaymentProcessor paymentProcessed=new PaymentProcessor(creditCard);
//        paymentProcessed.processPayment();
//        paymentProcessed.setPaymentMethod(debitCard);
//        paymentProcessed.processPayment();
//        paymentProcessed.setPaymentMethod(upi);
//        paymentProcessed.processPayment();
//        TrafficeLightContext context=new TrafficeLightContext();
//        context.next();
//        context.next();
//        context.next();
//        context.next();

    }
}