function handlerForm() {
  var tenKhachHang = document.getElementById("tenKhachHang").value;
  if (tenKhachHang == "") {
    document.getElementById("errorTenKhachHang").innerText =
      "ban chua nhap ten";
  } else {
    alert("submit thanh cong");
  }
}
function fillDropdown() {
  var theLoai = document.getElementById("theLoai").value;
  document.getElementById("donGia").setAttribute("value", theLoai);
}

function soLuong() {
  var soluong = document.getElementById("soluong").value;
  var donGia = document.getElementById("donGia").value;
  console.log(soluong);
  document.getElementById("thanhtien").setAttribute("value", donGia * soluong);
}
