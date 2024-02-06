package com.ohgiraffers.section01.extend;

public class Car {

    private boolean runningStatus; // private로 제한되어있어서 달리는 상태에 대한 것을 상속받은 메소드에서는 사용할 수 없음

    public Car() {
        System.out.println("Car 클래스의 기본 생성자 호출됨...");
    }

    public void run() {
        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }

    public void soundHorn() {

        if(isRunning()) {
            System.out.println("빵! 빵!");
        } else {
            System.out.println("주행중이 아닌 상태에는 경적을 울릴 수 없습니다.");
        }
    }

    protected boolean isRunning() {

        return runningStatus;
    }

    public void stop() {

        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }
}
