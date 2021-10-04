let canvas = document.querySelector("canvas");
let ctx = canvas.getContext("2d");

/** Choix du rayon du cercle */
let radius = canvas.height / 2;
/** Placement du centre du cercle dans le canvas */
ctx.translate(radius, radius);
/** Le cercle va occuper 90% du carré */
radius = radius * 0.9;
setInterval(drawClock,1000);

function drawClock() {
  drawFace(ctx, radius);
  drawNumber(ctx, radius);
  drawTime(ctx, radius);
}

function drawFace(ctx, radius) {
  let grad;

  /** Création du cercle externe */
  ctx.beginPath();
  ctx.arc(0, 0, radius, 0, 2 * Math.PI);
  ctx.strokeStyle = "black";
  ctx.stroke();

  /** Création de l'emplacement pour les chiffresS */
  grad = ctx.createRadialGradient(0, 0, radius * 0.95, 0, 0, radius * 1.05);
  grad.addColorStop(0, "#333");
  grad.addColorStop(0.5, "white");
  grad.addColorStop(1, "#333");
  ctx.strokeStyle = grad;
  ctx.lineWidth = radius * 0.1;
  ctx.stroke();

  /** Creation du point central */
  ctx.beginPath();
  ctx.arc(0, 0, radius * 0.015, 0, 2 * Math.PI);
  ctx.fillStyle = "#333";
  ctx.fill();
}

function drawNumber(ctx, radius) {
  let num;
  let ang;

  /** Définition de la police içi 15% du rayon */
  ctx.font = radius * 0.15 + "px arial";
  /** On aligne le texte au milieu et centré */
  ctx.textBaseline = "middle";
  ctx.textAlign = "center";

  /** On place les chiffre sur le cadran (12 nombres) içi à 85% du rayon et tourné (PI / 6) */
  for (num = 1; num < 13; num++) {
    ang = num * Math.PI / 6;
    /** Rotation du chiffre */
    ctx.rotate(ang);
    /** Mets le chiffre à une certaine distance du centre */
    ctx.translate(0, -radius * 0.85);
    /** Le chiffre à une certaine distance du centre execute une rotation inverse pour se remettre droit */
    ctx.rotate(-ang);
    /** Affiche le chiffre */
    ctx.fillText(num.toString(), 0, 0);
    /** Retour au point d'origine */
    ctx.rotate(ang);
    ctx.translate(0, radius * 0.85);
    ctx.rotate(-ang);
  }
}

function drawTime(ctx, radius){
  let now = new Date();
  let hour = now.getHours();
  let minute = now.getMinutes();
  let second = now.getSeconds();
  //hour
  hour = hour%12;
  hour = (hour*Math.PI/6)+(minute*Math.PI/(6*60))+(second*Math.PI/(360*60));
  drawHand(ctx, hour, radius*0.5, radius*0.07);
  //minute
  minute = (minute*Math.PI/30)+(second*Math.PI/(30*60));
  drawHand(ctx, minute, radius*0.8, radius*0.07);
  // second
  second = (second*Math.PI/30);
  drawHand(ctx, second, radius*0.9, radius*0.02);
}

function drawHand(ctx, pos, length, width) {
  ctx.beginPath();
  ctx.lineWidth = width;
  ctx.lineCap = "round";
  ctx.moveTo(0,0);
  ctx.rotate(pos);
  ctx.lineTo(0, -length);
  ctx.stroke();
  ctx.rotate(-pos);
}
