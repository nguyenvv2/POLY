// khai báo biến
/*
khai báo biến: 
var tên_biến = value;
let tên_biến = value;
const tên_biến = value;

nhập từ bàn phím : prompt("Mòi bạn nhập")
chú ý prompt luôn nhập kiểu dữ liệu là string
ví dụ x = prompt(); (giả định nhập x = 2)
typeof a => string


check kiểu dữ liệu của biến:
check kiểu dữ liệu của biến dùng typeof
kiểm tra 1 biến có phải số hay không dùng isNaN. isNaN trả ra false khi biến có giá trị 
là số hoặc string số ví dụ false khi biến có giá trị là 2 hoặc "2". Ngược lại trả ra true
vd: var a = 2;
typeof a => Number
isNaN(a) => false
var b = "2";
typeof b => string
isNaN(b) => false
var c = "Nguyen";
typeof c => string
isNaN(c) => true

toán tử + :
string + number => string
number + number => number
string số + number => string (ví dụ "2"+2 = 22)

Switch - case:
  switch (input) {
    case 1:
      alert("Day la thang 1");
      break;
    case 2:
      alert("Day la thang 2");
      break;
    default:
      break;
  }
kiểu dữ liệu: 
number
string
undefine :
ví dụ : var a;
typeof a => undefine
null :
ví dụ var x = null;
typeof x => null

in ra màn hình : document.write("Giá trị muốn in");

- Hàm có kiểu trả về
var n = prompt("Nhap vao n ");
function tinhTongN(n) {
  var tong = 0;
  for (let i = 0; i < Number(n); i++) {
    tong += i;
  }
  return tong;
}
var tongN = tinhTongN(n);
document.write(tongN);

- Hàm không có kiểu trả về
function tinhTong(a, b) {
  var tong = Number(a) + Number(b);
  if (tong > 5) {
    document.write("Tong a +b > 5");
  } else {
    document.write("Tong 2 so <5");
  }
}
 Sử lý sự kiện click
function checkButton(x) {
  if (x == 1) {
    alert("da click button 1");
  } else {
    alert("da click button 2");
  }
}
*/
