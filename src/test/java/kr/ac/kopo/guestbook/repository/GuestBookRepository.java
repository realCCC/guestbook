package kr.ac.kopo.guestbook.repository;

import kr.ac.kopo.guestbook.entity.Guestbook;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class GuestBookRepository {
    @Autowired
    private GuestbookRepository guestbookRepository;

    @Test
    public void insertDummies(){
        IntStream.rangeClosed(1, 300).forEach(i ->{ //1이상 300이하
            Guestbook guestbook = Guestbook.builder()
                    .title("Title..." + i)
                    .content("Content..."+i)
                    .writer("user" + (i % 10)) // 우선순위 높이기위해 ()씀
                    .build();
            System.out.println(guestbookRepository.save(guestbook));
        });
    }
}
