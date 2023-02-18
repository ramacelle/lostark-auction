package org.example.main;

import org.example.main.controller.Controller;
import org.example.main.model.Item;
import org.example.main.repository.Repository;
import org.example.main.service.Service;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        // TODO: 이 프로그램이 어떤것을 해야하는지 정의를 합니다.

        // 1. lostark에서 aution에 검색을 합니다.
        // 1-1. 검색으로 목록을 불러옵니다.
        // 1-2. 목록을 가져와서 하나의 auction item으로 파싱합니다.

        // 2. 내가 구매하려는 제품인지 확인합니다.
        // 2-1. 내가 구매하려는 설정의 조건에 부합한지 확인합니다.

        // 3. 조건에 부합하는 아이템들을 구매합니다.
        // 3-1. 로스트아크 홈페이지에 구매요청을 보냅니다.

        // 4. 정상적으로 구매가 완려가 되었으면 sms나 이메일로 알림을 보내줍니다.

        // code pattern임. 외우기
        // App -> Controller -> Service -> Repository
        // App -> process그 자체를 의미합니다.
        // Controller -> 어떤 액션을 하면 좋을지 선택을 의미합니다. 사용자의 입력값에 대한 검증과 어떤 응답으로 답할지 정합니다.
        // Service -> 어떤 로직을 수행할지 고릅니다. 로직의 입력이 올바른지 확인합니다ㅣ. 로직의 결과를 정돈해서 보냅니다.
        // Repository -> 데이터를 어떻게 가져올지 정의합니다/ 데이터를 어떻게 줄지 정의합니다.
        // Model

        Repository repository = new Repository("https://naver.com");
        Service service = new Service(repository);
        Controller controller = new Controller(service);

        ArrayList<Item> list = controller.search("모자");
        ArrayList<Item> checkedList = controller.checkItem(list);
        ArrayList<String> messages = controller.buying(checkedList);
        String result = controller.notice(messages);

        System.out.println(result);

        System.exit(0);
    }
}
