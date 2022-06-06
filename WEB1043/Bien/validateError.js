function submit() {
  alert(document.getElementById("nhapTen").value);
  if (document.getElementById("nhapTen").value == "") {
    error.innerText = "ban chua nhap";
    document.getElementById("error").innerText = "ban chua nhap ten";
  } else {
    document.getElementById("error").innerText = "ban da nhap ten";
  }
}
