# Spring Data JPA Test Code(@After, save, findAll)

```java
@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanUp(){
        postsRepository.deleteAll();
    }

   @Test
    public void 게시글저장_불러오기(){
        //given
        String title = "테스트 게시글";
        String content = "테스트 본문";

        postsRepository.save(Posts.builder().title(title).content(content).author("jsy950601@gmail.com").build());

        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);

    }
}
```

#### .save
- 테이블에서 insert/update 쿼리 실행 
- pk값이 있으면 update, 없으면 insert 쿼리가 실행 

#### .findAll
- 데이블에 있는 모든 데이터를 조회해오는 메소드. 

#### @SpringBootTest
- 별다른 설정없이 해당 어노테이션 사용하면 H2데이터베이스를 자동으로 실행해준다. 

#### @After 
- Junit에서 단위테스트가 끝날 때마다 수행되는 메소드 지정 
- 보통 테스트 전에 테스트간의 데이터 침범을 막기 위해 사용한다.
- 여러개의 테스트가 동시에 실행되면 테스트용 디비H2에 데이터가 그대로 남아있어서 다음 테스트가 실패할 수 있따.  
