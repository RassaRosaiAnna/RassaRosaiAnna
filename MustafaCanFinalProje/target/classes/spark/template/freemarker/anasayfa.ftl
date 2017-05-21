<html>

<head>
<

</head>

<body>

<div id="header">

	<ul id="headerMenu">
		<li><a href="anasayfa">Anasayfa</li></a>
		<li><a href="ogrenciler">Öğrenci Ekle</li></a>
		<li><a href="ogrenciler">Öğrenci Sil</li></a>
		<li><a href="ogrenciler">Öğrenci Listele</li></a>
		<li><a href="ogrencidetay">Öğrenci Detay</li></a>
		
	</ul>

</div>

<div class="main">
<h1>BURASI MAİN :) </h1>


 <table style="width:500" table align="center" >
  
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


</div>

<div class="footer">

Design By © 2017 Mustafa Can Yılmaz

</div>


</body>

<style>
body{
	background-color:white;


}
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


#header{
	width:%100;
	height:37px;
	background-color:#666666;
}	

#headerMenu {
	
    margin: 0px;
    padding: 0px;
    list-style-type: none;

}

#headerMenu li {
	

    float: left;
    width: 150px;
    position: relative;

}

#headerMenu a {

    font-family: "Times New Roman", Times, serif;

    font-size: 16px;

    color: #FFFFFF;

    text-decoration: none;

    background-color: #7e7370;

    display: block;

    padding-top: 5px;

    padding-right: 5px;

    border: 1px solid #00CCFF;

    text-align: center;

    line-height: 30px;

    margin-right: 2px;

}

#headerMenu a:hover {

    background-color: #0099FF;

}
.main{
	
	width:%100;
	height:400px;
	background-color:#0099FF;
}

.footer{
	width:%100;
	height:30px;
	background-color:#f33333;
	text-align:center;
	font-family:verdana;
	font-size:20px;
}

</style>



</html>