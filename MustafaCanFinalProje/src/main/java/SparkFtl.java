import static spark.Spark.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import spark.*;
import spark.template.freemarker.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SparkFtl {


	
public static void main(String[] args) throws SQLException {

        List<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
        //ogrenciler.add(new Ogrenci("Ogrenci Bir", "On Lisans", "MYO","","",""));
        //ogrenciler.add(new Ogrenci("Ogrenci Iki", "On Lisans", "MYO","","",""));
        //ogrenciler.add(new Ogrenci("Ogrenci Uc",  "On Lisans", "MYO","","","asd"));
        
         //setPort(12345);
        
        FreeMarkerRoute ogrencilerGet = new FreeMarkerRoute("/ogrenciler") {
            public Object handle(Request req, Response resp) {
                Map<String, Object> attributes = new HashMap<>();
                attributes.put("ogrenciler", ogrenciler);
                
                return new ModelAndView(attributes, "ogrenciler2.ftl"); // resources'daki ftl
                
            }
        };
        get(ogrencilerGet);
        
        FreeMarkerRoute anasayfa = new FreeMarkerRoute("/anasayfa") {
            public Object handle(Request req, Response resp) {
                Map<String, Object> attributes = new HashMap<>();
                attributes.put("ogrenciler", ogrenciler);
                
                return new ModelAndView(attributes, "anasayfa.ftl"); // resources'daki ftl
            }
        };
        get(anasayfa);
        
        
        FreeMarkerRoute ogrenciDetay = new FreeMarkerRoute("/ogrencidetay") {
            public Object handle(Request req, Response resp) {
                Map<String, Object> attributes = new HashMap<>();
                attributes.put("ogrenciler", ogrenciler);
                return new ModelAndView(attributes, "ogrenciDetay.ftl"); // resources'daki ftl
            }
        };
        get(ogrenciDetay);
           
        FreeMarkerRoute ogrenciekleGet = new FreeMarkerRoute("/ogrenciekle") {
            public Object handle(Request req, Response resp) {
                return new ModelAndView(null, "ogrenciekle2.ftl"); // resources'daki ftl
            }
        };
        get(ogrenciekleGet);
        
        FreeMarkerRoute ogrencieklePost = new FreeMarkerRoute("/ogrenciekle") {
        	
            public Object handle(Request istek, Response cevap) {
                
            	String adSoyad = istek.queryParams("adSoyad");
                String ogrenciTipi = istek.queryParams("ogrenciTipi");
                String bolum = istek.queryParams("bolum");
                String ogrenciYas = istek.queryParams("ogrenciYas");
                String ogrenciBasariliDers = istek.queryParams("ogrenciBasariliDers");
                String ogrenciBasarisizDers = istek.queryParams("ogrenciBasarisizDers");
                
                ogrenciler.add(new Ogrenci(adSoyad, ogrenciTipi, bolum,ogrenciYas,ogrenciBasariliDers,ogrenciBasarisizDers));

                // belirtilen uri'ye yonlendir.
                cevap.redirect("/ogrenciler");
                return null;
            }
        };
        post(ogrencieklePost);
        
        FreeMarkerRoute ogrenciGoruntule = new FreeMarkerRoute("/ogrenci/:ogrencino") {
            public Object handle(Request req, Response resp) {
                String ogrenciNo = req.params("ogrencino");
                
                // Ogrenciyi bul
                Ogrenci bulunan = null;
                
                Map<String, Object> attributes = new HashMap<>();
                attributes.put("ogrenci", bulunan);
                
                return new ModelAndView(attributes, "ogrenci.ftl");
            }
        };
        get(ogrenciGoruntule);
        
        FreeMarkerRoute ogrenciSil = new FreeMarkerRoute("/ogrencisil/:ogrencino") {
            public Object handle(Request req, Response resp) {
                String ogrenciNo = req.params("ogrencino");
                
                // Ogrenciyi bul
                Ogrenci bulunan = null;
                ogrenciler.remove(bulunan);
                
                Map<String, Object> attributes = new HashMap<>();
                attributes.put("ogrenci", bulunan);
                
                // belirtilen uri'ye yonlendir.
                resp.redirect("/ogrenciler");
                return null;
            }
        };
        get(ogrenciSil);
    }

}


	
	
