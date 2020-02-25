document.write("<br>");
function menseki(hannkei,π=3.14){
return hannkei*hannkei*π;
}

document.write(menseki(5));
document.write("<br>");
document.write(menseki(7));
document.write("<br>");
document.write(menseki(10));
document.write("<br>");

function totalPrice(ninnzuu, ninnzuu2, otona=500, kodomo=200) {
  return (ninnzuu*otona + ninnzuu2*kodomo + "円です。");
}

document.write(totalPrice(2,4));
document.write("<br>");
document.write(totalPrice(1,5));
document.write("<br>");
document.write(totalPrice(3,7));
document.write("<br>");

