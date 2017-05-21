<html>
	<head>
	
	</head>
	<body>
	
	<style>
	table, th, td {
    border: 1px solid black;
}
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
}

th, td {
    padding: 15px;
}


th {
    text-align: left;
}

table {
    border-spacing: 5px;
}
li{
list-style:none;
}

	
	</style>
	
	<table style="width:500">
  
  <tr>
    <th>Ad Soyad</th>
    <th>Bölüm</th> 
    <th>Öğrenci Tipi</th>
    <th>Öğrenci Detayı</th>
    
  </tr>
  
		 <ul>
		 	  <!-- for(Ogrenci ogrenci : ogrenciler ) { -->
		 	  
			  <#list ogrenciler as ogrenci>
				<tr>
			  	<th><li>${ogrenci.ogrenciAdAl()}</li></th>
			  	<th><li>${ogrenci.ogrenciBolumAl()}</li></th>
			  	<th><li>${ogrenci.ogrenciTipAl()}</li></th>
			  	<th><a href="ogrencidetay"> Öğrenci Detayı </a></th>
			  	
			  </tr>
			  </#list>
			  
			  
			  <!-- } -->
			 
		</ul>
  
</table>
	
	
	</body>
	
</html>




  