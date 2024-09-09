package com.samwei12.dp.structural.adapter.hunters;

/**
 * 我们无法直接调用他的 hunt 方法，就需要一个适配器
 *
 * @author samwei12
 * @date 2024/9/9
 */
public class WildDogLionAdapter implements Lion {
    private final WildDog wildDog;

    public WildDogLionAdapter(WildDog wildDog) {
        this.wildDog = wildDog;
    }

    @Override
    public void roar() {
        wildDog.bark();
    }

    public static void main(String[] args) {
        Hunter hunter = new Hunter();
        hunter.hunt(new WildDogLionAdapter(new WildDog()));
    }
}
