package com.softserve.museum.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.softserve.museum.service.ExhibitService;


@Controller
@RequestMapping(path = "/exhibits")
public class ExhibitsController {

    @Autowired
    private ExhibitService exhibitService;


    
    @GetMapping()
    public String onExhibits() {
        return "exhibits/exhibits";
    }

    @GetMapping("/all")
    public ModelAndView all() {
        return new ModelAndView("exhibits/exhibitsAll", "exhibits", exhibitService.listExhibits());
    }

    
    @GetMapping("/author")
    public String byAuthor() {
        return "exhibits/exhibitsByAuthor";
    }

    
    @PostMapping("/author")
    public String byAuthorPost(@RequestParam("authorName") String author, RedirectAttributes model) {
        model.addAttribute("author", author);
        return "redirect:/exhibits/author/{author}";
    }
    

    @GetMapping("/author/{author}")
    public ModelAndView byAuthorResult(@PathVariable("author") String author) {
        ModelAndView model = new ModelAndView("exhibits/exhibitsByAuthorResult");
        model.addObject("author", author);
        model.addObject("exhibits", exhibitService.findExhibitsByAuthor(author));
        return model;
    }

    @GetMapping("/material")
    public String byMaterial() {
        return "exhibits/exhibitsByMaterial";
    }
   
    @PostMapping("/material")
    public String byMaterialPost(@RequestParam("material") String material, RedirectAttributes model) {
        model.addAttribute("material", material);
        return "redirect:/exhibits/material/{material}";
    }
    
    @GetMapping("/material/{material}")
    public ModelAndView byMaterialResult(@PathVariable("material") String material) {
        ModelAndView model = new ModelAndView("exhibits/exhibitsByMaterialResult");
        model.addObject("material", material);
        model.addObject("exhibits", exhibitService.findExhibitsByMaterial(material));
        return model;
    }

    @GetMapping("/technique")
    public String byTechnique() {
        return "exhibits/exhibitsByTechnique";
    }
   
    @PostMapping("/technique")
    public String byTechniquePost(@RequestParam("technique") String technique, RedirectAttributes model) {
        model.addAttribute("technique", technique);
        return "redirect:/exhibits/technique/{technique}";
    }
   
    @GetMapping("/technique/{technique}")
    public ModelAndView byTechniqueResult(@PathVariable("technique") String technique) {
        ModelAndView model = new ModelAndView("exhibits/exhibitsByTechniqueResult");
        model.addObject("technique", technique);
        model.addObject("exhibits", exhibitService.findExhibitsByTechnique(technique));
        return model;
    }
    @GetMapping("/worker")
    public String byWorker() {
        return "exhibits/exhibitsByWorker";
    }
   
    @PostMapping("/worker")
    public String byWorkerPost(@RequestParam("worker") String worker, RedirectAttributes model) {
        model.addAttribute("worker", worker);
        return "redirect:/exhibits/worker/{worker}";
    }
   
    @GetMapping("/worker/{worker}")
    public ModelAndView byWorkerResult(@PathVariable("worker") String worker) {
        ModelAndView model = new ModelAndView("exhibits/exhibitsByWorkerResult");
        model.addObject("worker", worker);
        model.addObject("exhibits", exhibitService.findExhibitsByWorker(worker));
        return model;
    }
    
    @GetMapping("/hall")
    public String byHall() {
        return "exhibits/exhibitsByHall";
    }
   
    @PostMapping("/hall")
    public String byHallPost(@RequestParam("hall") String hall, RedirectAttributes model) {
        model.addAttribute("hall", hall);
        return "redirect:/exhibits/hall/{hall}";
    }
   
    @GetMapping("/hall/{hall}")
    public ModelAndView byHallResult(@PathVariable("hall") String hall) {
        ModelAndView model = new ModelAndView("exhibits/exhibitsByHallResult");
        model.addObject("hall", hall);
        model.addObject("exhibits", exhibitService.findExhibitsByHall(hall));
        return model;
    }
    

}