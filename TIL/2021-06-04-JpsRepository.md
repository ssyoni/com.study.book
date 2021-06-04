# JpaRepository

JpaRepository란 ? Dao 라 불리는 DB Layer 접근자.

Jpa 에서는 Repository 라고 부름. 인터페이스로 생성. 

1. 인터페이스 생성 후 
2. JpaRepository<Entity 클래스, PK타입> 상속

기본적인 CRUD 메소드가 자동으로 생성된다. 

<br/>

!! 주의할 점 !!
> Entity 클래스와 기본 Entity Repository 는 함께 휘치해야 한다. 

둘은 아주 밀접한 관계. Entity 클래스는 기본 Repository 없이 제대로 역할을 할 수 없다. 

