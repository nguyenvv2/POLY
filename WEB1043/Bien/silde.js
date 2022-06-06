var anhAr = ["anh0.jpg", "anh1.jpg", "anh2.jpg"];
console.log(anhAr.length);
var currentIndex = 0;

setInterval(function () {
  if (currentIndex < anhAr.length - 1) {
    currentIndex++;
    document.getElementById("slide").src = anhAr[currentIndex];
  } else {
    currentIndex = 0;
    document.getElementById("slide").src = anhAr[currentIndex];
  }
}, 1000);

// function next() {
//   if (currentIndex < anhAr.length - 1) {
//     currentIndex++;
//     document.getElementById("slide").src = anhAr[currentIndex];
//   }
// }
// function back() {
//   if (currentIndex > 0) {
//     currentIndex--;
//     document.getElementById("slide").src = anhAr[currentIndex];
//   }
// }
