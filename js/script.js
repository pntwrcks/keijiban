var star="★";

for(var i =1; i <= 5; i++){
    document.write(star);
}

  document.write("<br>");
  document.write("<br>");



for(i = 0; i <2; i++){
    for(j = 0; j <= 2; j++){
        document.write("★");
        if(j== 2){
            document.write("<br>");
        }
    }
}

  document.write("<br>");

for(i = 0; i <2; i++){
    for(j = 0; j <= 4; j++){
        document.write("☆");
        if(j== 4){
            document.write("<br>");
        }
    }
}
　　
　　document.write("<br>");




for(i = 0; i <4; i++){
    for(j = 0; j <= 4; j++){
        document.write("★");
        if(j== 4){
            document.write("<br>");
        }
    }
}

document.write("<br>");
document.write("<br>");


for(i = 0; i <3; i++){
    for(j = 0; j <= 0; j++){
        document.write("★"+ "☆"+"★");
        if(j== 0){
            document.write("<br>");
        }
    }
}


  document.write("<br>");

for(i = 0; i <4; i++){
    for(j = 0; j <= 0; j++){
        document.write("★"+"☆"+"★"+"☆"+"★");
        
                       
     if(j== 0){
            document.write("<br>");
        }
    }
}

document.write("<br>");
  document.write("<br>");


for(var i=1; i<=5; i++){
    for(var a=1;a<=i; a++){
     document.write("★");   
    }
document.write("<br>");
}