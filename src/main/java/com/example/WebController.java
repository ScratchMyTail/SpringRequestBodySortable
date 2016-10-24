package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by christerhansen on 24.10.2016.
 */
@Controller
public class WebController {
    @RequestMapping(path ="/", method = RequestMethod.GET)
    public String hello(ModelMap map){
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person("Ola", "Nordmann", 0));
        personArrayList.add(new Person("Kari", "Nordmann", 1));
        personArrayList.add(new Person("Hans", "Nordmann", 2));
        personArrayList.add(new Person("Guri", "Nordmann", 3));

        map.addAttribute("liste", personArrayList);

        return "hello";
    }

    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public @ResponseBody String save(@RequestBody List<Person> personList){
        for(Person person : personList){
            System.out.println(person.getSortering()+" - "+person.getFornavn());
            repository.save(person);
        }
        return "saved";
    }
}