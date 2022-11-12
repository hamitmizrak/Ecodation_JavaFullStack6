//alert("merhabalar")

//console
//console.log("console log")

//alert
//alert("deneme1")
//window.alert("alert1")

//
//document.write("document data")

// double quotes: çift tırnak ("")
// single quotes: tek tırnak ('')
// backtick : tek tırnak (``)

//var (Global)
//let(Local) ES6
//const(Local) ES6 
// var _$degiskenAdi88=44;
// console.log(_$degiskenAdi88)
// /*
// Değişken adları: kullanma
// sayıyla başlama
// _ve $ haricinde özel bir simgeyi kabul etmiyor
// kelimeler arasında tire kullanma
// */

// var value1=44;
// console.log(typeof value1)

// var value2=44.5656;
// console.log(typeof value2)

// var value3="JavaScript öğreniyorum";
// console.log(typeof value3)

// var value4=false;
// console.log(typeof value4)

// var value5=[]; //dizi
// console.log(typeof value5)

// var value6={}; //object
// console.log(typeof value6)

// //undefined
// let data;
// console.log(data)

//+ - * / % x++ y-- ++X
// let x1=10;
// const x2=3;

// var x3=x1+x2;
// console.log(x3);

// var x4=x1-x2;
// console.log(x4);

// var x5=x1*x2;
// console.log(x5);

// var x6=x1/x2;
// console.log(x6);

// var x7=x1%x2;
// console.log(x7);

// kullanıcıdan veri almak
//NOT: prompt sonucu bir string'tir
//Eğer bize prompt gelen bir sayı lazım olursa biz bunu cast etmeliyiz
// let userData=prompt("Lütfen birşeyler yazınız");
// console.log(userData)

//CAST:
//String ==> Number
// //Number ==> String
// let value1 = "14";
// console.log(typeof value1)

// value1 = Number(typeof value1);
// console.log(typeof value1)

// let value2 = 2;
// let result = value1 / value2;
// console.log(result);

// //NaN: Not a Number: sayı değildir


// //Infinity: bir sayı/0 bölemezsiniz
// console.log(4/0)

// //isNaN eğer false bu bir sayıdır
// console.log(isNaN("asdf"))

// // //undefined
// // let data;
// // console.log(data)

// //new:  null:  zero:

// console.log("1.satır")
// console.log("2.satır")
// console.log("3.satır\n4.satır")
//escape character ==> \n

//break:döngüyü kırmak
//return:metotu kırmak
//continue:1 kereye mahsus es geç sonra döngüye devam et
// console.log(Math.min(2, 9, 8, -1555))
// console.log(Math.max(2, 9, 8, -1555))
// console.log(Math.abs(-44))
// console.log(Math.pow(2, 5))
// console.log(2 ** 5)
// console.log(Math.sqrt(16))

// console.log(Math.floor(2.9))//alt tabana
// console.log(Math.ceil(2.1))//üst taban
// console.log(Math.round(5.5))
// console.log(Math.round(5.4))
// console.log(Math.sin(45))


// console.log(Math.ceil(Math.random() * 10 + 1))

//////////////////////////////////////////////////////////////////////////////////////

//ÖDEV 1
// Kullanıcıdan aldığımız 2 tane sayıyı toplayan JS algorithm ?
// 4işlem toplama çıkarma çarpma bölme
// let number1,number2,sum=0;
// number1=Number(prompt("Lütfen 1.sayıyı giriniz"));
// number2=Number(prompt("Lütfen 2.sayıyı giriniz"));
// sum=number1+number2;
// console.log(sum);


////ÖDEV 2
// Math Ödev
// Kullanıcıda tarafından aldığımız 2 tane sayının
// s1-) Bu sayılardan en küçüğü nedir ?
// s2-) Bu sayılardan en büyüğü nedir ?
// s3-) Bu sayılardan en büyüğü karekökü nedir ?
// s4-) Bu sayılardan en büyüğü karekökünün üste yuvarlıyalım nedir ?
// s5-) Bu sayılardan en küçüğü mutlak değeri nedir ?
// s6-) Bu sayılardan en küçüğü alt taban en büyüğü üst taban şeklinde üstünü alalım

//////////////////////////////////////////////////////////////////////////////////////
//SAYI
// let number1 = 14;
// console.log(typeof number1);
// //let sayi; :undefined
// //14/0      :Infinity
// //14/"asd"  :NaN

// let number2 = 14.531983;
// console.log(number2.toFixed(2))

// //bilimsel gösterim
// let bilimsel = 13E-4;
// console.log(bilimsel)

// //Binary(0-1)
// let binaryNumber = 0b010101010;
// console.log(binaryNumber);

// //Octal(8) (0-1-2-3-4-5-6-7)
// let octalNumber = 07562;
// console.log(octalNumber);

// //Decimal(10) (0-1-2-3-4-5-6-7-8-9)
// let decimalNumber = 1010;
// console.log(decimalNumber);

// //Hexedecimal(16) (0-1-2-3-4-5-6-7-8-9-A-B-C-D-E-F)
// let hexDecimalNumber = 0xfff;
// console.log(hexDecimalNumber);

//////////////////////////////////////////////////////////////////////////////////////

//String
let vocabulary = "javame JAvaSCript java JAvaSCript";
document.write(vocabulary + "<br/>");
document.write(vocabulary.length + "<br/>");
document.write(vocabulary.trim().length + "<br/>");

document.write(vocabulary.toLowerCase() + "<br/>");
document.write(vocabulary.toUpperCase() + "<br/>");

document.write(vocabulary.startsWith("J") + "<br/>");
document.write(vocabulary.endsWith(" ") + "<br/>");

document.write(vocabulary.toLowerCase().concat("sona ekle") + "<br/>");

document.write(vocabulary.replace(vocabulary,"değiştirdim") + "<br/>");

document.write(vocabulary.substring(1) + "<br/>");
document.write(vocabulary.substring(1,4) + "<br/>"); //1<=Kelime<=4-1

document.write(vocabulary.indexOf("JAvaSCript") + "<br/>"); //1<=Kelime<=4-1
document.write(vocabulary.lastIndexOf("JAvaSCript") + "<br/>"); //1<=Kelime<=4-1

document.write(vocabulary.charAt(0) + "<br/>"); 

//ÖDEV-3
// kullanıcı tarafından girilen bir kelimenin (prompt)
//S-1) Kaç karakterlidir ?
//S-2) boşluklar alınarak Kaç karakterlidir ? (trim)
//S-3) bütün kelimeyi küçük harfle göstermek ? 
//S-4) bütün kelimeyi büyük harfle göstermek ?
//S-5) ilk harf nedir  ? (charAT)
//S-6) girdiğiniz kelime java ile başlıyor mu  ?
//S-7) girdiğiniz kelimenin sonuna "-ben js öğreniyorum"   ?
//S-8) girdiğiniz 0 ile 4 arasındaki indexi ekranda gösterin   ?
//S-9) Kullanıcıdan alınan başka bir kelimeyle birinci olan kelimeyle yer değiştirmek ?



