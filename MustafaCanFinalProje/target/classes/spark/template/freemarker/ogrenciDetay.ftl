<html>

<head>

</head>

<body>
<ul>
		 	  <!-- for(Ogrenci ogrenci : ogrenciler ) { -->
		 	  
			  <#list ogrenciler as ogrenci>
			
			  	<li>${ogrenci.ogrenciDetayiniAl()}</li>
			  
			  </#list>
			  
			  
			  <!-- } -->
			  
			  <a href="/ogrenciekle">Ogrenci Ekle</a>
		</ul>



</body>


</html>