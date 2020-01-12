function register() {
  var user = {
    name : $("#name").val(),
    password : $("#name").val()
  }
  console.log(user);
  post("../account/register", user, function(v) {
    console.log(v);
    alert("添加用户成功");
  });
}