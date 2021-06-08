# JPA Auditing 사용하기 

JPA Auditing? ORM 기술인 JPA를 사용하여 도메인을 관리할 경우 공통으로 가지고있는 필드나 컬럼들이 존재하는데, 대표적으로 생성일자, 수정일자가 있다. 

이는 코드의 중복을 야기하기 때문에 비효율적임. 

이를 자동화해주는것이 JPA Auditing

<br/>

1. BaseTimeEntity 클래스 파일 생성 
```java
@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {

    @CreatedDate
    private LocalDateTime createDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;
}

```

BaseTimeEntity를 상속받으면 Entity들 createdDate, modifiedDate 필드가 자동으로 생성된다. 

- @MappedSuperclass : JPA Entity 들이 BaseTimeEntity 를 상속할 경우 필드들도 컬럼으로 인식하도록 한다. 
- @EntityListener(AuditingEntityListener.class) : BaseTimeEntity클래스에 Auditing 기능을 포함시킨다. 
- @CreateDate : Entity 가 생성되어서 저장될 때 시간이 자동저장 된다. 
- @LastModifiedDate : 조회한 Entity의 값을 변경할 때 시간이 자동 저장된다. 

<br/>

2 . Entity 클래스가 BaseTimeEntity를 상속받도록 변경한다. 
```java
@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {
    ...
}
```

<br/>

3 . Application 클래스에 JPA A<br/>uditing 어노테이션들을 모두 활성화할 수 있도록 하는 어노테이션을 추가한다. 
```java

@EnableJpaAuditing // JPA Auditing 활성화 
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}

```
