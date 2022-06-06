function submit() {
  var ten = document.getElementById("ten").value;
  var diem = document.getElementById("diem").value;
  var diaChi = document.getElementById("diaChi").value;
  if ("" == ten) {
    document.getElementById("errorTenKh").innerText = "*Bat buoc";
  }
  if ("" == diem) {
    document.getElementById("errorDiem").innerText = "*Bat buoc";
  }
  if ("" == diaChi) {
    document.getElementById("errorDiaChi").innerText = "*Bat buoc";
  }
}
