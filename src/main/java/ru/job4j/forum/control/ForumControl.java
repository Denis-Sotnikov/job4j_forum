package ru.job4j.forum.control;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.job4j.forum.service.ForumService;

@Controller
public class ForumControl {
    private final ForumService posts;

    public ForumControl(ForumService posts) {
        this.posts = posts;
    }

////    @ModelAttribute Accident accident
//    @PostMapping("/save")
//    public String save(@RequestParam("rIds") List<String> rules) { //,@ModelAttribute Accident accident) {
////        serviceHbm.saveOr(accident, rules);
////        springData.save(accident, rules);
//        return "redirect:/";
//    }

    @GetMapping("/edit")
    public String editPost(Model model) {
        model.addAttribute("posts", posts.getAll());
        return "post/edit";
    }

    @GetMapping("/create")
    public String createPost(Model model) {
        model.addAttribute("posts", posts.getAll());
        return "post/create";
    }

    @GetMapping("/topics/create")
    public String createTopic(Model model) {
        model.addAttribute("posts", posts.getAll());
        return "topics/create";
    }

    @GetMapping("/topics/edit")
    public String editTopic(Model model) {
        model.addAttribute("posts", posts.getAll());
        return "topics/edit";
    }


}

