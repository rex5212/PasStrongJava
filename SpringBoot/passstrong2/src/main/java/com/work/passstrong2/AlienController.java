package com.work.passstrong2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlienController {

    @Autowired
    AlienRepo repo;

    @RequestMapping("")
    public ModelAndView Aliens(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("aliens");

        return mv;
    }

    @RequestMapping("initAlien")
    public ModelAndView baseAlienPage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("alienOptions");

        return mv;
    }

    @RequestMapping("addAlien")
    public ModelAndView addAlien(Alien alien){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("alienOptions");
        repo.save(alien);

        return mv;
    }

    @RequestMapping("getAllAlien")
    public ModelAndView AllAlien(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("getAll");

//        Iterable<Alien> iterable = repo.findAll();
//        List<Alien> datas = new ArrayList<>();
//        iterable.forEach(datas::add);
//        List data = datas;

        String data = repo.findAll().toString();

        mv.addObject(data);

        return mv;
    }

    @RequestMapping("showOneAlien")
    public ModelAndView showAlien(@RequestParam int aid){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("show");

        Alien data = repo.findById(aid).orElse(null);
        mv.addObject("data", data);

        return mv;
    }

    @RequestMapping("updateAlien")
    public ModelAndView updateAlien(Alien alien){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("alienOptions");

        return mv;
    }

    @RequestMapping("deleteAlien")
    public ModelAndView deleteAlien(@RequestParam int aid){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("alienOptions");

        repo.deleteById(aid);
        return mv;
    }

    @RequestMapping("deleteAllAlien")
    public ModelAndView deleteAllAlien(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("alienOptions");

        repo.deleteAll();
        return mv;
    }

}
