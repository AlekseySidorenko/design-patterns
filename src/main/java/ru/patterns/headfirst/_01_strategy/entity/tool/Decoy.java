package ru.patterns.headfirst._01_strategy.entity.tool;

import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.patterns.headfirst._01_strategy.entity.behavior.quack.QuackBehavior;

@Setter
@NoArgsConstructor
public class Decoy {
    QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

}
