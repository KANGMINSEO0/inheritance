package com.ohgiraffers.section01.extend;

public class RacingCar extends Car {

    public RacingCar() {
        System.out.println("RacingCar 클래스 기본 생성자 호출됨...");
    }
    @Override
    public void run() {
        System.out.println("레이싱카가 전속력으로 질주합니다!!!!!!!!!!");
    }

    @Override
    public void soundHorn() {
        System.out.println("레이싱카는 경적을 울리지 않습니다. (조용.....)");
    } // 레이싱카는 경적이 없기때문에 레이싱카 클래스에서는 무의미한 기능

    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춥니다.");
    }
}
