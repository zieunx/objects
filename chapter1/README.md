# 1. 객체 설계


### 티켓 판매 애플리케이션 구현하기

소극장에서 관람객이 초대장을 티켓으로 교환하여 관람하는 경우와 현금 구매하여 티켓으로 관람하는 경우에 맞춰 객체를 설계해 보았다.

### 무엇이 문제인가?

로버트 마틴이 말한 모든 소프트웨어 모듈의 세 가지 목적

1. 실행 중에 제대로 동작하는 것 
2. 변경을 위해 존재
3. 코드를 읽는 사람과 의사소통 하는 것

2번과 3번 사항의 목적은 만족시키지 못한다.



#### 1. 예상을 빗나가는 코드

 * 관람객과 판매원이 소극장에 수동적이다.
 * 소극장의 '입장' 메소드는 여러가지 객체들의 세부사항을 한번에 기억하고 있어야 한다.

이해 가능한 코드란, 그 동작이 우리의 예상에서 크게 벗어나지 않는 코드다. 현재 코드는 우리의 상식에서 벗어나고 있기 때문에 코드를 읽는 사람과 제대로 의사소통 하지 못한다.

#### 2. 변경에 취약한 코드

* 각 코드들은 특정 상황에 종속적인 상태 (예: 관람객은 가방을 가지고 있다.)
* 상황이 바뀌면 연결된 모든 코드들이 수정되어야 한다.

-> `의존성` 과 관련된 문제다.

​	의존성은 객체가 변경될 때, 그 객체에게 의존하는 다른 객체도 함께 변경될 수 있음을 내포한다.



우리의 목표는 객체 사의의 의존성을 `최소화` 하는 것이다. 불필요한 의존성은 제거해야 한다.



객체 사이의 의존성이 강한 경우 `결합도가 높다`  라고 말한다. 



따라서 `설계의 목표`는 **객체 사이의 결합도를 낮춰 변경이 용이한 설계를 만드는 것**이다.


