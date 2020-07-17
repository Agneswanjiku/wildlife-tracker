import models.*;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static spark.Spark.*;

public class App {

    public static void main(String[] args) {
        staticFileLocation("/public");
        ProcessBuilder process = new ProcessBuilder();
        Integer port;

        // This tells our app that if Heroku sets a port for us, we need to use that port.
        // Otherwise, if they do not, continue using port 4567.

        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 4567;
        }

        port(port);
        get("/",(req,res)->{
            Map<String,Object>model = new HashMap<>();
            return new ModelAndView(model,"index.hbs");
        },new HandlebarsTemplateEngine());

        get("/new/sighting",(req,res)->{
            Map<String, Object> model = new HashMap<>();
            model.put("locations", Location.all());
            model.put("animals", Animals.all());
            model.put("rangers", Ranger.all());
            return new ModelAndView(model,"Sightingform.hbs");
        },new HandlebarsTemplateEngine());

        post("/new/sighting", App::handle, new HandlebarsTemplateEngine());


        get("/new/endangered",(req,res)->{
            Map<String, Object> model = new HashMap<>();
            model.put("locations", Location.all());
            model.put("enAnimals", EndangeredAnimal.getAll());
            model.put("rangers",Ranger.all());
            return new ModelAndView(model,"EndangeredSighting.hbs");
        },new HandlebarsTemplateEngine());

        post("/new/endangered",(req,res)->{
            Map<String,Object>model = new HashMap<>();
            String rangerName = req.queryParams("rangerName");
            String location = req.queryParams("locationName");
            int animalId = Integer.parseInt(req.queryParams("animalId"));
            String health = req.queryParams("health");
            String age = req.queryParams("age");
            String type = null;
            Sighting newSighting =  new Sighting(rangerName,location,animalId,type,health,age);
            newSighting.save();
            res.redirect("/animals");
            return null;
        }, new HandlebarsTemplateEngine());


        get("/new/animal",(req,res)->{
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model,"AnimalForm.hbs");
        },new HandlebarsTemplateEngine());

        post("/new/animal",(req,res)->{
            Map<String, Object> model = new HashMap<>();
            String animalName = req.queryParams("animalName");
            Animals animal = new Animals(animalName);
            animal.save();
            res.redirect("/animals");
            return null;

        },new HandlebarsTemplateEngine());


        get("/new/endangeredAnimal",(req,res)->{
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model,"EndangeredForm.hbs");
        },new HandlebarsTemplateEngine());

        post("/new/endangeredAnimal",(req,res)->{
            Map<String, Object> model = new HashMap<>();
            String animalName = req.queryParams("animalName");
            String health = req.queryParams("health");
            String age = req.queryParams("age");
            EndangeredAnimal animal = new EndangeredAnimal(animalName,health,age);
            animal.save();
            res.redirect("/endangeredAnimals");
            return null;

        },new HandlebarsTemplateEngine());




        get("/Rangers",(req,res)->{
            Map<String,Object>model = new HashMap<>();
            model.put("Rangers",Ranger.all());
            return new ModelAndView(model,"Rangers.hbs");
        }, new HandlebarsTemplateEngine());

        get("/Locations",(req,res)->{
            Map<String,Object>model = new HashMap<>();
            model.put("Locations", Location.all());
            return new ModelAndView(model,"locationList.hbs");
        }, new HandlebarsTemplateEngine());

        get("/animals",(req,res)->{
            Map<String,Object>model = new HashMap<>();
            model.put("animals", Animals.all());
            return new ModelAndView(model,"AnimalDetails.hbs");
        }, new HandlebarsTemplateEngine());





        get("/endangeredAnimals",(req,res)->{
            Map<String,Object>model = new HashMap<>();
            model.put("animals", EndangeredAnimal.getAll());
            return new ModelAndView(model,"EndangeredDetails.hbs");
        }, new HandlebarsTemplateEngine());

        get("/sightings",(req,res)->{
            Map<String,Object>model = new HashMap<>();
            Properties thirdSighting = null;
//            model.put("sightings",Sighting.all(thirdSighting.save(2)));
            return new ModelAndView(model,"SightingDetails.hbs");
        }, new HandlebarsTemplateEngine());


    }


    private static ModelAndView handle(Request req, Response res) {
        Map<String, Object> model = new HashMap<>();
        String rangerName = req.queryParams("rangerName");
        String location = req.queryParams("locationName");
        int animalId = Integer.parseInt(req.queryParams("animalId"));
//        String type = models.Animals.find(animalId).getType();
        Sighting newSighting = new Sighting(rangerName, location, animalId);
        newSighting.save();
        res.redirect("/sightings");
        return null;
    }
}