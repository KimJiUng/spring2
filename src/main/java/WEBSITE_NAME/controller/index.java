package WEBSITE_NAME.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // @Controller : 컨트롤 어노테이션 [MVC 중에 C에 해당하는 데이터 주입]
public class index {
    // @WebServlet("/") <---------> @GetMapping("/")
    @GetMapping("/")    // @GetMapping : URL 매핑 어노테이션 [클라이언트가 요청한 URL과 연결]
    public String index(Model model) {  // 해당 메소드는 URL과 매핑되면 실행되는 메소드
        model.addAttribute("data","java데이터");
        return "main";  // html 파일명 // 타임리프 사용할 경우의
        // 클라이언트가 localhost:8081 요청시 spring에 controller내에서 매핑 URL 찾기
        // 찾은 매핑된 메소드 실행되면서 HTML 파일명 반환
    }
    // http 요청 메소드
        // @GetMapping("/")
        // @PostMapping("/")
    @GetMapping("/getdata")
    @ResponseBody
    public String getdata(){
        return "java데이터";
    }
}
