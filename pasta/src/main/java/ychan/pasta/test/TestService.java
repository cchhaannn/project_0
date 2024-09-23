package ychan.pasta.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestService {
    @Autowired
    private TestRepository testRepository;

    public TestEntity saveTest(String testColumn) {
        TestEntity testEntity = new TestEntity();
        testEntity.setTestColumn("testSuccess");
        testEntity.setTestColumn2(testColumn);
        return testRepository.save(testEntity);
    }
}
