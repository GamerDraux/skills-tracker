package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsTrackerControllers {
    @GetMapping
    public static String mainPage(){
        return "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn.  Here" +
                "    is the list!</h2>" +
                "<ol>" +
                "    <li>Java</li>" +
                "    <li>JavaScript</li>" +
                "    <li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    public static String form(){
        return"<body>" +
                "<form method = 'post' action = " +
                "'/results'>" +
                "<p>Name:</p>" +
                "<input type='text' name='name'>" +
                "<p>My favorite language</p>" +
                "<select name='first'>" +
                "<option value='java'>java</option>" +
                "<option value='javascript'>JavaScript" +
                "</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<p>My Second Favorite Language<p>" +
                "<select name='second'>" +
                "<option value='java'>java</option>" +
                "<option value='javascript'>JavaScript" +
                "</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<p>My third favorite language</p>" +
                "<select name='third'>" +
                "<option value='java'>java</option>" +
                "<option value='javascript'>JavaScript" +
                "</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<input type='submit'>" +
                "</body>";
    }

    @PostMapping("/results")
    public static String renderFormResults(@RequestParam String name, String first, String second, String third){
        return "<body>" +
                "<table>" +
                "<tr>" +
                "<th>"+name+"</th>" +
                "</tr>" +
                "<tr>" +
                "<td>" +first+"</td>" +
                "</tr>" +
                "<tr>" +
                "<td>"+second+"</td>" +
                "</tr>" +
                "<tr>"+
                "<td>"+third+"</td>" +
                "</tr>" +
                "</table>" +
                "</body>";
    }
}
