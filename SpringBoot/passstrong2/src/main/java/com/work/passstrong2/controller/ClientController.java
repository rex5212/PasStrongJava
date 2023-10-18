package com.work.passstrong2.controller;

import com.work.passstrong2.model.entities.Client;
import com.work.passstrong2.model.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor // See what Do
@RequestMapping("")
public class ClientController {

    @Autowired
    ClientRepository repo;

    @GetMapping
    public String showAll(){
        return repo.findAll().toString();
    }
    @GetMapping("/{id}")
    public Optional<Client> get(@PathVariable("id") int id){
        return repo.findById(id);
    }

    @PostMapping
    public String createClient(){
        return "";
    }

    @PutMapping
    public String updateClient(){
        return "";
    }
    @DeleteMapping("/{id}")
    public String deleteClient(){
        return "";
    }

//    public ModelAndView Aliens(){
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("aliens");
//
//        return mv;
//    }
//
//    @RequestMapping("initAlien")
//    public ModelAndView baseAlienPage(){
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("alienOptions");
//
//        return mv;
//    }
//
//    @RequestMapping("addAlien")
//    public ModelAndView addAlien(Client client){
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("alienOptions");
//        repo.save(client);
//
//        return mv;
//    }
//
//    @RequestMapping("getAllAlien")
//    public ModelAndView AllAlien(){
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("getAll");
//
////        Iterable<Alien> iterable = repo.findAll();
////        List<Alien> datas = new ArrayList<>();
////        iterable.forEach(datas::add);
////        List data = datas;
//
//        String data = repo.findAll().toString();
//
//        mv.addObject(data);
//
//        return mv;
//    }
//
//    @RequestMapping("showOneAlien")
//    public ModelAndView showAlien(@RequestParam int aid){
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("show");
//
//        Client data = repo.findById(aid).orElse(null);
//        mv.addObject("data", data);
//
//        return mv;
//    }
//
//    @RequestMapping("updateAlien")
//    public ModelAndView updateAlien(Client client){
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("alienOptions");
//
//        return mv;
//    }
//
//    @RequestMapping("deleteAlien")
//    public ModelAndView deleteAlien(@RequestParam int aid){
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("alienOptions");
//
//        repo.deleteById(aid);
//        return mv;
//    }
//
//    @RequestMapping("deleteAllAlien")
//    public ModelAndView deleteAllAlien(){
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("alienOptions");
//
//        repo.deleteAll();
//        return mv;
//    }

}
