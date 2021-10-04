let canvas = document.querySelector("canvas");
let ctx = canvas.getContext("2d");

/** Choix du rayon du cercle */
let radius = canvas.height / 2;
/** Placement du centre du cercle dans le canvas */
ctx.translate(radius, radius);
/** Le cercle va occuper 90% du carré */
radius = radius * 0.9;
drawClock();

function drawClock() {
  drawFace(ctx, radius);
  drawNumber(ctx, radius);
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

    ctx.font = radius * 0.15 + "px arial";
    ctx.textBaseline = "middle";
    ctx.textAlign = "center";
    
    for(num = 1; num < 13; num++) {
        ang = num * Math.PI / 6;
        ctx.rotate(ang);
        ctx.translate(0, -radius * 0.85);
        ctx.rotate(-ang);
        ctx.fillText(num.toString(), 0, 0);
        ctx.rotate(ang);
        ctx.translate(0, radius * 0.85);
        ctx.rotate(-ang);
      }
      
}