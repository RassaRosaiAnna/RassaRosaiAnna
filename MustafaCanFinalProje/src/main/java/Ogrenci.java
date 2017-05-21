
public class Ogrenci {

	public String adSoyad;
	public String bolum;
	public String ogrenciTipi;
	public String ogrenciYas;
	public String ogrenciBasariliDers;
	public String ogrenciBasarisizDers;
	
	public Ogrenci(String adSoyad, String ogrenciTipi, 
			String bolum,String ogrenciYas, String ogrenciBasariliDers,String ogrenciBasarisizDers){
		this.adSoyad = adSoyad;
		this.bolum = bolum;
		this.ogrenciTipi = ogrenciTipi;
		
		this.ogrenciYas = ogrenciYas;
		this.ogrenciBasariliDers = ogrenciBasariliDers;
		this.ogrenciBasarisizDers = ogrenciBasarisizDers;
		
		
	}
	
	public String ogrenciBilgileriAl() {
		return this.adSoyad + " - " + this.bolum + " - " + this.ogrenciTipi;
	};
	
	public String ogrenciDetayiniAl(){
		
		return this.adSoyad + " - " +  this.ogrenciYas  + " - " +  this.ogrenciBasariliDers  + " - " +  this.ogrenciBasarisizDers;
		
	}
	public String ogrenciAdAl(){
		return this.adSoyad;
	}
	public String ogrenciTipAl(){
		return this.ogrenciTipi;
	}
	public String ogrenciBolumAl(){
		return this.bolum;
	}
	public String ogrenciYasAl(){
		return this.ogrenciYas;
	}
	public String ogrenciBasariliDersAl(){
		return this.ogrenciBasariliDers;
	}
	public String ogrenciBasarisizDersAl(){
		return this.ogrenciBasarisizDers;
	}
	
	public String ogrenciBilgileriAl(boolean ekstraBilgi) {
		return "";
	}
	
	
}
