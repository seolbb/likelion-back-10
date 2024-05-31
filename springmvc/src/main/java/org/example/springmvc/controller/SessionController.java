package org.example.springmvc.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
//@SessionAttributes("visitCount2")
public class SessionController {
    // HttpSesion을 직접 이용한 예  -> 더 직관적이고 간단하다.
    @GetMapping("/visit2")
    public String trackVisit(HttpSession session){
        // 세션으로부터 방문 횟수를 얻어온다. -> 모델에 넣어두면 방문 횟수는 계속 1이 된다.
        Integer visitCount = (Integer) session.getAttribute("visitCount");

        if(visitCount == null){
            visitCount = 0;
        }
        visitCount++;
        session.setAttribute("visitCount", visitCount);

        return "visit2";
    }

    // @SessionAttributes 애노테이션 사용------------------
    // visitCount2 초기값을 설정하는 메소드
//    @ModelAttribute("visitCount2")
//    public Integer initVisitCount2(){
//        return 0;
//    }
//
//    // SessionAttributes 에다가 visitCount2 라는 키값으로 사용을 할것이다.
//    // @ModelAttribute 를 사용해서 값을 꺼내온다. session.getAttribute("visitCount) 와 동일한 코드
//    @GetMapping("/visit2")
//    public String trackVisit(@ModelAttribute("visitCount2") Integer visitCount2, Model model){
//        visitCount2++;
//        model.addAttribute("visitCount2", visitCount2);
//
//        return "visit2";
//    }

    // 세션 초기화
//    @GetMapping("resetVisit")
//    public String resetVisit(SessionStatus status){
//        status.setComplete();
//        return "redirect:/visit2";
//    }

    // 특정 세션 초기화
    @GetMapping("resetVisit")
    public String resetVisit(HttpSession session){
        // 세션객체에서 해당하는 속성만 삭제
        session.removeAttribute("visitCount");  // 이걸 사용하려면 @ModelAttrobute, @SessionAttributes 아닌 HttpSession를 사용해야 한다!
        return "redirect:/visit2";
    }



}
