var fillColor = [80, 204, 55];
var highlightColor = [255, 255, 255];

function setup() {
  createCanvas(400, 400);
  noStroke();
}

function draw() {
  var numCircles = 6;

  for (var i = numCircles; i > 1; i--) {
    var radius = i * 7;

    if (mouseX > 100 && mouseX < 300) {
      fill(highlightColor);
    } else {
      fill(fillColor);
    }

    ellipse(mouseX, mouseY, radius, radius);
  }
}

function mousePressed() {
  // Perubahan warna fill ketika mouse ditekan (opsional)
  fillColor = [random(255), random(255), random(255)];
  highlightColor = [random(255), random(255), random(255)];
}
