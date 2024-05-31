package org.example.springmvc.controller;

import org.example.springmvc.domain.Item;
import org.example.springmvc.domain.Product;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ExamController {
    @GetMapping("/guest/{name}")
    public String guest(@PathVariable String name){ // PathVariable로 가져온 값({name})을 name에 넣어준다.
        System.out.println(name);
        return "redirect:/datetime";
    }

    @GetMapping("/datetime")
    public String showDateTime(Model model) {
        // 날짜 및 시간 데이터
        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        LocalTime time = LocalTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));

        // 모델에 데이터 추가
        model.addAttribute("currentDate", date);
        model.addAttribute("currentDateTime", dateTime);
        model.addAttribute("currentTime", time);
        model.addAttribute("currentZonedDateTime", zonedDateTime);

        return "datetime"; // Thymeleaf 템플릿 이름
    }
    @GetMapping("/list")
    public String showList(Model model) {
        List<String> items = Arrays.asList("Item 1", "Item 2", "Item 3", "Item 4", "Item 5",
                "Item 6", "Item 7", "Item 8", "Item 9", "Item 10");
        model.addAttribute("items", items);
        return "list";
    }
    @GetMapping("/welcome")
    public String welcome(Model model){
        model.addAttribute("welocmeMsg","환영합니다^^  spring MVC를 이용해 보겠습니다.");

        List<Item> items = Arrays.asList(
                new Item("pen",3000),
                new Item("notebook",50000),
                new Item("cup",2500)
        );

        model.addAttribute("itemList", items);

        return "welcome";
    }

    private List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "Apple", 1.20),
            new Product(2, "Banana", 0.75),
            new Product(3, "Cherry", 2.05)
    ));
    // Product 를 적절히 정의하고,

    //url =  /products   요청하면 응답되도록 메서드를 정의하세요.
    @GetMapping("/products")
    public String products(Model model){
        model.addAttribute("products",products);
        return "productList";
    }

    //products 를 이용해서 상품 목록이 출력되도록 템플릿을 작성해 주세요.
    // 상품리스트는  상품명 - 가격   이 출력되도록 작성해주세요.
    // (footer도 잘 나오게해주세요.)


    @GetMapping("/example")
    public String showExam(Model model){
        model.addAttribute("username", "carami");
        model.addAttribute("isAdmin",false);
        model.addAttribute("languages", new String[]{"English", "Spanish","German"});

        return "exam";
    }


    //http://localhost/users   사용자 목록을 출력하세요.
    //사용자목록에서 사용자,  관리자여부
    // --  이 값을 메시지프로퍼티를 이용해서 출력하도록 작성
    //Controller나 메서드명은 원하는대로 작성하셔도 좋습니다.





}
