package Behavioral.Strategy;

import Behavioral.Strategy.strategies.MaxStrategy;
import Behavioral.Strategy.strategies.MinStrategy;
import Behavioral.Strategy.strategies.RandomStrategy;

public class Program {

    public static void main(String[] args) {
        Context ctx = new Context(10, 20, 5, 30, 17, 47, 28, 36);
        ctx.setStrategy(new MinStrategy()).execute();
        ctx.setStrategy(new MaxStrategy()).execute();
        ctx.setStrategy(new RandomStrategy()).execute();
    }

}
