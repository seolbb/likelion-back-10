package org.example.friendexam.controller;

import lombok.RequiredArgsConstructor;
import org.example.friendexam.domain.Friend;
import org.example.friendexam.service.FriendService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
@RequestMapping("/friends")
public class FriendController {
    private final FriendService friendService;

    // 친구 목록 전체 조회
//    @GetMapping
//    public String friends(Model model) {
//        Iterable<Friend> friends = friendService.findAllFriends();
//        model.addAttribute("friends", friends);
//        return "friends/list";
//    }

    // 친구 목록 페이징 처리
    @GetMapping
    public String friends(Model model, @RequestParam(defaultValue = "1")int page, @RequestParam(defaultValue = "5") int size) { // 페이지 번호가 없다면 기본 1로 설정, 한페이지에 몇개를 보여줄건지 : size 디폴트로 5
        Pageable pageable = PageRequest.of(page -1 , size);
        Page<Friend> friends = friendService.findAllFriends(pageable);
        model.addAttribute("friends", friends);
        model.addAttribute("currentPage", page);
        return "friends/list";
    }

    // 친구 등록
    @GetMapping("/add")
    public String addForm(Model model){
        model.addAttribute("friend", new Friend());
        return "friends/form";
    }

    @PostMapping("/add")
    public String addFriend(@ModelAttribute Friend friend, RedirectAttributes redirectAttributes){
        friendService.saveFriend(friend);
        redirectAttributes.addFlashAttribute("message", "친구등록 성공!");
        return "redirect:/friends";
    }

    // 친구 상세 페이지
    // localhost/friend/1
    @GetMapping("/{id}")
    public String detailFriend(@PathVariable Long id, Model model){
        Friend friend = friendService.findFriendById(id);
        model.addAttribute("friend", friend);
        return "friends/detail";
    }

    // 친구 정보 삭제
    @GetMapping("/delete/{id}")
    public String deleteFriend(@PathVariable Long id){
        friendService.deleteFriendById(id);
        return "redirect:/friends";
    }

    // 친구 정보 수정
    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model){
        model.addAttribute("friend", friendService.findFriendById(id));
        return "friends/edit";
    }


    @PostMapping("/edit")
    public String editFriend(@ModelAttribute Friend friend){    // 여기에는 RedirectAttributes를 넣으니까 에러가 난다...왜지....
        friendService.saveFriend(friend);
        return "redirect:/friends";
    }
}